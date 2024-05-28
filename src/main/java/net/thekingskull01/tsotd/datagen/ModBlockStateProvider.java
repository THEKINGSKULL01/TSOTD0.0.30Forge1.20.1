package net.thekingskull01.tsotd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TSOTD.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    blockWithItem(ModBlocks.Dark_Crystal_Ore);
    blockWithItem(ModBlocks.Light_Crystal_Ore);
    blockWithItem(ModBlocks.Coal_Crystal_Ore);

    blockWithItem(ModBlocks.Dark_Crystal_Block);
    blockWithItem(ModBlocks.Light_Crystal_Block);
    blockWithItem(ModBlocks.Coal_Crystal_Block);

    stairsBlock((StairBlock) ModBlocks.Dark_Crystal_Stairs.get(), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    stairsBlock((StairBlock) ModBlocks.Light_Crystal_Stairs.get(), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    stairsBlock((StairBlock) ModBlocks.Coal_Crystal_Stairs.get(), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

    slabBlock(((SlabBlock) ModBlocks.Dark_Crystal_Slab.get()), blockTexture(ModBlocks.Dark_Crystal_Block.get()), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    slabBlock(((SlabBlock) ModBlocks.Light_Crystal_Slab.get()), blockTexture(ModBlocks.Light_Crystal_Block.get()), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    slabBlock(((SlabBlock) ModBlocks.Coal_Crystal_Slab.get()), blockTexture(ModBlocks.Coal_Crystal_Block.get()), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
