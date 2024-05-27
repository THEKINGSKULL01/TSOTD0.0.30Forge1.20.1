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

                        //Items

                        output.accept(ModItems.Dark_Crystal.get());
                        output.accept(ModItems.Light_Crystal.get());
                        output.accept(ModItems.Crystallized_Coal.get());

                        //Blocks

                        output.accept(ModBlocks.Dark_Crystal_Block.get());
                        output.accept(ModBlocks.Light_Crystal_Block.get());
                        output.accept(ModBlocks.Coal_Crystal_Block.get());

                        //Ores

                        output.accept(ModBlocks.Dark_Crystal_Ore.get());
                        output.accept(ModBlocks.Light_Crystal_Ore.get());
                        output.accept(ModBlocks.Coal_Crystal_Ore.get());

                        //Tools

                        output.accept(ModItems.Dark_Crystal_Detector.get());
                        output.accept(ModItems.Light_Crystal_Detector.get());

                        //Food

                        output.accept(ModItems.Dark_Crystal_Steak.get());
                        output.accept(ModItems.Light_Crystal_Steak.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
