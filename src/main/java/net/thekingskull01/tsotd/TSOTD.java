package net.thekingskull01.tsotd ;

import com.mojang.logging.LogUtils;
import net.kaupenjoe.mccourse.potion.BetterBrewingRecipe;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.block.entity.ModBlockEntities;
import net.thekingskull01.tsotd.effect.ModEffects;
import net.thekingskull01.tsotd.enchantment.ModEnchantments;
import net.thekingskull01.tsotd.entity.ModEntities;
import net.thekingskull01.tsotd.entity.client.SculvortRenderer;
import net.thekingskull01.tsotd.fluid.ModFluids;
import net.thekingskull01.tsotd.item.ModItemProperties;
import net.thekingskull01.tsotd.item.ModItems;
import net.thekingskull01.tsotd.loot.ModLootModifers;
import net.thekingskull01.tsotd.painting.ModPaintings;
import net.thekingskull01.tsotd.particle.ModParticles;
import net.thekingskull01.tsotd.potion.ModPotions;
import net.thekingskull01.tsotd.recipe.ModRecipes;
import net.thekingskull01.tsotd.screen.ModMenuTypes;
import net.thekingskull01.tsotd.screen.TakichirumWorkbenchScreen;
import net.thekingskull01.tsotd.util.ModWoodTypes;
import net.thekingskull01.tsotd.villager.ModVillagers;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(TSOTD.MOD_ID)
public class TSOTD {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "tsotd";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public TSOTD() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEnchantments.register(modEventBus);

        ModLootModifers.register(modEventBus);
        ModPaintings.register(modEventBus);

        ModEffects.register(modEventBus);

        ModPotions.register(modEventBus);

        ModVillagers.register(modEventBus);


        ModParticles.register(modEventBus);


        ModFluids.RECIPE_SERIALIZERS.register(modEventBus);
        ModFluids.BLOCKS.register(modEventBus);
        ModFluids.ITEMS.register(modEventBus);
        ModFluids.FLUIDTYPES.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);
        ModFluids.ENTITY_TYPES.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        ModEntities.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.Takichirum_Seeds.get(), 2.0f);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.Dancing_Flower_Leaf.get(), 1.0f);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.Dancing_Flower_Leaf.getId(),ModBlocks.Potted_Dancing_Flower_Leaf);
        });

        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMEY_POTION.get()));

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                Sheets.addWoodType(ModWoodTypes.ZOMBLIE);

                ModItemProperties.addCustomItemProperties();

                ItemBlockRenderTypes.setRenderLayer(ModFluids.GLOWSTONE.FLUID.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.GLOWSTONE.FLUID_FLOW.get(), RenderType.translucent());

                MenuScreens.register(ModMenuTypes.TAKICHIRUM_WORKBENCH_MENU.get(), TakichirumWorkbenchScreen::new);

                EntityRenderers.register(ModEntities.Sculvort.get(), SculvortRenderer::new);

            });

        }
    }
}
