package net.thekingskull01.tsotd.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TSOTD.MOD_ID);


            //blocks

    public static final RegistryObject<Block> Dark_Crystal_Block = registerBlock("dark_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Light_Crystal_Block = registerBlock("light_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Coal_Crystal_Block = registerBlock("coal_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.STONE)));


            //Ores

    public static final RegistryObject<Block> Dark_Crystal_Ore = registerBlock("dark_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(7f).requiresCorrectToolForDrops(), UniformInt.of(8,16)));
    public static final RegistryObject<Block> Light_Crystal_Ore = registerBlock("light_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(7f).requiresCorrectToolForDrops(), UniformInt.of(8,16)));
    public static final RegistryObject<Block> Coal_Crystal_Ore = registerBlock("coal_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(8,16)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
