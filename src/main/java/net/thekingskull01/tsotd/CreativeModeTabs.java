package net.thekingskull01.tsotd;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;

public class CreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TSOTD.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TSOTD_TAB = CREATIVE_MODE_TABS.register("tsotd_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Dark_Crystal.get()))
                    .title(Component.translatable("creative.tsotd_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Tools

                        output.accept(ModItems.Dark_Crystal_Detector.get());
                        output.accept(ModItems.Light_Crystal_Detector.get());

                        //Tablets

                        output.accept(ModItems.Dark_Crystal_Memory_Orb.get());
                        output.accept(ModItems.Light_Crystal_Memory_Orb.get());

                        //Spears

                        output.accept(ModItems.DIAMOND_SPEAR.get());

                        //Scythes

                        output.accept(ModItems.DIAMOND_SCYTHE.get());
                        output.accept(ModItems.RED_CRYSTAL_SCYTHE.get());

                        //Swords

                        output.accept(ModItems.Dark_Crystal_Sword.get());
                        output.accept(ModItems.Light_Crystal_Sword.get());
                        output.accept(ModItems.Takichirum_Sword.get());

                        //Shields

                        output.accept(ModItems.Takichirum_Shield.get());

                        //Bows

                        output.accept(ModItems.Dark_Crystal_Bow.get());
                        output.accept(ModItems.Light_Crystal_Bow.get());

                        //Paxel

                        output.accept(ModItems.Takichirum_Paxel.get());

                        //Hammer

                        output.accept(ModItems.Takichirum_Hammer.get());

                        //Pickaxes

                        output.accept(ModItems.Dark_Crystal_Pickaxe.get());
                        output.accept(ModItems.Light_Crystal_Pickaxe.get());

                        //Shovels

                        output.accept(ModItems.Dark_Crystal_Shovel.get());
                        output.accept(ModItems.Light_Crystal_Shovel.get());

                        //Axes

                        output.accept(ModItems.Dark_Crystal_Axe.get());
                        output.accept(ModItems.Light_Crystal_Axe.get());

                        //Hoes

                        output.accept(ModItems.Dark_Crystal_Hoe.get());
                        output.accept(ModItems.Light_Crystal_Hoe.get());

                        //DarkCrystal Armor

                        output.accept(ModItems.Dark_Crystal_Helmet.get());
                        output.accept(ModItems.Dark_Crystal_Chestplate.get());
                        output.accept(ModItems.Dark_Crystal_Leggings.get());
                        output.accept(ModItems.Dark_Crystal_Boots.get());

                        //Light Crystal Armor

                        output.accept(ModItems.Light_Crystal_Helmet.get());
                        output.accept(ModItems.Light_Crystal_Chestplate.get());
                        output.accept(ModItems.Light_Crystal_Leggings.get());
                        output.accept(ModItems.Light_Crystal_Boots.get());


                        //Mo~chirium Armor

                        output.accept(ModItems.Takichirum_Helmet.get());
                        output.accept(ModItems.Takichirum_Chestplate.get());
                        output.accept(ModItems.Takichirum_Leggings.get());
                        output.accept(ModItems.Takichirum_Boots.get());

                        //HorseArmor

                        output.accept(ModItems.Light_Crystal_Horse_Armor.get());
                        output.accept(ModItems.Dark_Crystal_Horse_Armor.get());
                        output.accept(ModItems.Takichirum_Horse_Armor.get());

                        //Minerals

                        output.accept(ModItems.Crystallized_Coal.get());
                        output.accept(ModItems.Yellow_Crystal.get());
                        output.accept(ModItems.Red_Crystal.get());
                        output.accept(ModItems.Purple_Crystal.get());
                        output.accept(ModItems.Blue_Crystal.get());
                        output.accept(ModItems.LightBlue_Crystal.get());
                        output.accept(ModItems.Green_Crystal.get());
                        output.accept(ModItems.Dark_Crystal.get());
                        output.accept(ModItems.Light_Crystal.get());
                        output.accept(ModItems.Darkened_Light_Crystal.get());
                        output.accept(ModItems.Takichirum_Ingot.get());

                        //Workbenches
                        output.accept(ModBlocks.Takichirum_Workbench.get());


                        //Ores

                        output.accept(ModBlocks.Dark_Crystal_Ore.get());
                        output.accept(ModBlocks.Light_Crystal_Ore.get());
                        output.accept(ModBlocks.Coal_Crystal_Ore.get());

                        //Blocks

                        output.accept(ModBlocks.Coal_Crystal_Block.get());
                        output.accept(ModBlocks.Green_Crystal_Block.get());
                        output.accept(ModBlocks.Dark_Crystal_Block.get());
                        output.accept(ModBlocks.Light_Crystal_Block.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Block.get());
                        output.accept(ModBlocks.Takichirum_Block.get());

                        //WoodBlocks

                        output.accept(ModBlocks.Zomblie_Sapling.get());

                        output.accept(ModBlocks.Zomblie_Log.get());

                        output.accept(ModBlocks.Zomblie_Wood.get());

                        output.accept(ModBlocks.Stripped_Zomblie_Log.get());

                        output.accept(ModBlocks.Stripped_Zomblie_Wood.get());

                        output.accept(ModBlocks.Zomblie_Planks.get());

                        output.accept(ModBlocks.Zomblie_Leaves.get());

                        //Signs

                        output.accept(ModItems.Zomblie_Sign.get());
                        output.accept(ModItems.Zomblie_Hanging_Sign.get());

                        //Lamps

                        output.accept(ModBlocks.Crystal_Lamp.get());

                        //Liquid

                        output.accept(ModItems.Glowstone_Fluid_Bucket.get());

                        //Stairs

                        output.accept(ModBlocks.Dark_Crystal_Stairs.get());
                        output.accept(ModBlocks.Light_Crystal_Stairs.get());
                        output.accept(ModBlocks.Coal_Crystal_Stairs.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Stairs.get());

                        //Slabs

                        output.accept(ModBlocks.Dark_Crystal_Slab.get());
                        output.accept(ModBlocks.Light_Crystal_Slab.get());
                        output.accept(ModBlocks.Coal_Crystal_Slab.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Slab.get());

                        //Buttons

                        output.accept(ModBlocks.Dark_Crystal_Button.get());
                        output.accept(ModBlocks.Light_Crystal_Button.get());
                        output.accept(ModBlocks.Coal_Crystal_Button.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Button.get());

                        //PressurePlates

                        output.accept(ModBlocks.Dark_Crystal_Pressure_Plate.get());
                        output.accept(ModBlocks.Light_Crystal_Pressure_Plate.get());
                        output.accept(ModBlocks.Coal_Crystal_Pressure_Plate.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Pressure_Plate.get());

                        //Walls

                        output.accept(ModBlocks.Dark_Crystal_Wall.get());
                        output.accept(ModBlocks.Light_Crystal_Wall.get());
                        output.accept(ModBlocks.Coal_Crystal_Wall.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Wall.get());

                        //Fences

                        output.accept(ModBlocks.Dark_Crystal_Fence.get());
                        output.accept(ModBlocks.Light_Crystal_Fence.get());
                        output.accept(ModBlocks.Coal_Crystal_Fence.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Fence.get());

                        //FenceGates

                        output.accept(ModBlocks.Dark_Crystal_Fence_Gate.get());
                        output.accept(ModBlocks.Light_Crystal_Fence_Gate.get());
                        output.accept(ModBlocks.Coal_Crystal_Fence_Gate.get());
                        output.accept(ModBlocks.Darkened_Light_Crystal_Fence_Gate.get());

                        //Doors

                        output.accept(ModBlocks.Dark_Crystal_Door.get());
                        output.accept(ModBlocks.Light_Crystal_Door.get());
                        output.accept(ModBlocks.Coal_Crystal_Door.get());

                        //Trapdoors

                        output.accept(ModBlocks.Dark_Crystal_Trapdoor.get());
                        output.accept(ModBlocks.Light_Crystal_Trapdoor.get());
                        output.accept(ModBlocks.Coal_Crystal_Trapdoor.get());

                        //Items

                        output.accept(ModItems.Dark_Stick.get());
                        output.accept(ModItems.Light_Stick.get());

                        //Food

                        output.accept(ModItems.Dark_Crystal_Steak.get());
                        output.accept(ModItems.Light_Crystal_Steak.get());

                        //Seeds

                        output.accept(ModItems.Takichirum_Seeds.get());

                        //Flowers

                        output.accept(ModBlocks.Dancing_Flower_Leaf.get());

                        //Eggs

                        output.accept(ModItems.Sculvort_Spawn_Egg.get());
                        output.accept(ModItems.Feathda_Spawn_Egg.get());



                        //Enchants

                        //output.accept((ItemLike) ModEnchantments.AUTO_SMELTING.get());
                        //output.accept((ItemLike) ModEnchantments.LIFE_STEALER.get());
                        //output.accept((ItemLike) ModEnchantments.REACHER.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
