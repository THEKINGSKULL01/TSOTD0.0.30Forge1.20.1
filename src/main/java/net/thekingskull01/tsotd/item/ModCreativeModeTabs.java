package net.thekingskull01.tsotd.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TSOTD.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TSOTD_TAB = CREATIVE_MODE_TABS.register("tsotd_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Dark_Crystal.get()))
                    .title(Component.translatable("creative.tsotd_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Tools

                        output.accept(ModItems.Dark_Crystal_Detector.get());
                        output.accept(ModItems.Light_Crystal_Detector.get());

                        //Swords

                        output.accept(ModItems.Dark_Crystal_Sword.get());
                        output.accept(ModItems.Light_Crystal_Sword.get());

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

                        //Minerals

                        output.accept(ModItems.Dark_Crystal.get());
                        output.accept(ModItems.Light_Crystal.get());
                        output.accept(ModItems.Crystallized_Coal.get());

                        //Ores

                        output.accept(ModBlocks.Dark_Crystal_Ore.get());
                        output.accept(ModBlocks.Light_Crystal_Ore.get());
                        output.accept(ModBlocks.Coal_Crystal_Ore.get());

                        //Blocks

                        output.accept(ModBlocks.Dark_Crystal_Block.get());
                        output.accept(ModBlocks.Light_Crystal_Block.get());
                        output.accept(ModBlocks.Coal_Crystal_Block.get());

                        //Stairs

                        output.accept(ModBlocks.Dark_Crystal_Stairs.get());
                        output.accept(ModBlocks.Light_Crystal_Stairs.get());
                        output.accept(ModBlocks.Coal_Crystal_Stairs.get());

                        //Slabs

                        output.accept(ModBlocks.Dark_Crystal_Slab.get());
                        output.accept(ModBlocks.Light_Crystal_Slab.get());
                        output.accept(ModBlocks.Coal_Crystal_Slab.get());

                        //Buttons

                        output.accept(ModBlocks.Dark_Crystal_Button.get());
                        output.accept(ModBlocks.Light_Crystal_Button.get());
                        output.accept(ModBlocks.Coal_Crystal_Button.get());

                        //PressurePlates

                        output.accept(ModBlocks.Dark_Crystal_Pressure_Plate.get());
                        output.accept(ModBlocks.Light_Crystal_Pressure_Plate.get());
                        output.accept(ModBlocks.Coal_Crystal_Pressure_Plate.get());

                        //Walls

                        output.accept(ModBlocks.Dark_Crystal_Wall.get());
                        output.accept(ModBlocks.Light_Crystal_Wall.get());
                        output.accept(ModBlocks.Coal_Crystal_Wall.get());

                        //Fences

                        output.accept(ModBlocks.Dark_Crystal_Fence.get());
                        output.accept(ModBlocks.Light_Crystal_Fence.get());
                        output.accept(ModBlocks.Coal_Crystal_Fence.get());

                        //FenceGates

                        output.accept(ModBlocks.Dark_Crystal_Fence_Gate.get());
                        output.accept(ModBlocks.Light_Crystal_Fence_Gate.get());
                        output.accept(ModBlocks.Coal_Crystal_Fence_Gate.get());

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
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
