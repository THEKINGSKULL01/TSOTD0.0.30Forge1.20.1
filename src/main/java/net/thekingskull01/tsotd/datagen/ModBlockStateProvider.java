package net.thekingskull01.tsotd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.block.custom.CrystalLampBlock;
import net.thekingskull01.tsotd.block.custom.TakichirumCrop;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TSOTD.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Ores

    blockWithItem(ModBlocks.Dark_Crystal_Ore);
    blockWithItem(ModBlocks.Light_Crystal_Ore);
    blockWithItem(ModBlocks.Coal_Crystal_Ore);

        //Blocks

    blockWithItem(ModBlocks.Dark_Crystal_Block);
    blockWithItem(ModBlocks.Light_Crystal_Block);
    blockWithItem(ModBlocks.Coal_Crystal_Block);

        //Stairs

    stairsBlock((StairBlock) ModBlocks.Dark_Crystal_Stairs.get(), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    stairsBlock((StairBlock) ModBlocks.Light_Crystal_Stairs.get(), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    stairsBlock((StairBlock) ModBlocks.Coal_Crystal_Stairs.get(), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

        //Slabs

    slabBlock(((SlabBlock) ModBlocks.Dark_Crystal_Slab.get()), blockTexture(ModBlocks.Dark_Crystal_Block.get()), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    slabBlock(((SlabBlock) ModBlocks.Light_Crystal_Slab.get()), blockTexture(ModBlocks.Light_Crystal_Block.get()), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    slabBlock(((SlabBlock) ModBlocks.Coal_Crystal_Slab.get()), blockTexture(ModBlocks.Coal_Crystal_Block.get()), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

        //Button

    buttonBlock((ButtonBlock) ModBlocks.Dark_Crystal_Button.get(), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    buttonBlock((ButtonBlock) ModBlocks.Light_Crystal_Button.get(), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    buttonBlock((ButtonBlock) ModBlocks.Coal_Crystal_Button.get(), blockTexture(ModBlocks.Coal_Crystal_Block.get()));


        //PressurePlate

    pressurePlateBlock((PressurePlateBlock) ModBlocks.Dark_Crystal_Pressure_Plate.get(), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    pressurePlateBlock((PressurePlateBlock) ModBlocks.Light_Crystal_Pressure_Plate.get(), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    pressurePlateBlock((PressurePlateBlock) ModBlocks.Coal_Crystal_Pressure_Plate.get(), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

        //Walls

    wallBlock((WallBlock) ModBlocks.Dark_Crystal_Wall.get(), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    wallBlock((WallBlock) ModBlocks.Light_Crystal_Wall.get(), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    wallBlock((WallBlock) ModBlocks.Coal_Crystal_Wall.get(), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

        //Fences

    fenceBlock((FenceBlock) ModBlocks.Dark_Crystal_Fence.get(), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    fenceBlock((FenceBlock) ModBlocks.Light_Crystal_Fence.get(), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    fenceBlock((FenceBlock) ModBlocks.Coal_Crystal_Fence.get(), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

        //Fencegates

    fenceGateBlock((FenceGateBlock) ModBlocks.Dark_Crystal_Fence_Gate.get(), blockTexture(ModBlocks.Dark_Crystal_Block.get()));
    fenceGateBlock((FenceGateBlock) ModBlocks.Light_Crystal_Fence_Gate.get(), blockTexture(ModBlocks.Light_Crystal_Block.get()));
    fenceGateBlock((FenceGateBlock) ModBlocks.Coal_Crystal_Fence_Gate.get(), blockTexture(ModBlocks.Coal_Crystal_Block.get()));

        //Doors

        doorBlockWithRenderType((DoorBlock)ModBlocks.Dark_Crystal_Door.get(),
                modLoc("block/dark_crystal_door_bottom"),
                modLoc("block/dark_crystal_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)ModBlocks.Light_Crystal_Door.get(),
                modLoc("block/light_crystal_door_bottom"),
                modLoc("block/light_crystal_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)ModBlocks.Coal_Crystal_Door.get(),
                modLoc("block/coal_crystal_door_bottom"),
                modLoc("block/coal_crystal_door_top"), "cutout");

        //trapdoors

        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.Dark_Crystal_Trapdoor.get(),
                modLoc("block/dark_crystal_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.Light_Crystal_Trapdoor.get(),
                modLoc("block/light_crystal_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.Coal_Crystal_Trapdoor.get(),
                modLoc("block/coal_crystal_trapdoor"), true, "cutout");

        //Stairs blockItem

        blockItem(ModBlocks.Dark_Crystal_Stairs);
        blockItem(ModBlocks.Light_Crystal_Stairs);
        blockItem(ModBlocks.Coal_Crystal_Stairs);

        //Slab blockItem

        blockItem(ModBlocks.Dark_Crystal_Slab);
        blockItem(ModBlocks.Light_Crystal_Slab);
        blockItem(ModBlocks.Coal_Crystal_Slab);

        //Button "blockItem" is in the "Mod-Item-Model-Provider"

        //PressurePlate blockItem

        blockItem(ModBlocks.Dark_Crystal_Pressure_Plate);
        blockItem(ModBlocks.Light_Crystal_Pressure_Plate);
        blockItem(ModBlocks.Coal_Crystal_Pressure_Plate);

        //Walls are in ModItemModelProvider for the "blockItem"


        //Fences are in ModItemModelProvider for the "blockItem"

        //FenceGate

        blockItem(ModBlocks.Dark_Crystal_Fence_Gate);
        blockItem(ModBlocks.Light_Crystal_Fence_Gate);
        blockItem(ModBlocks.Coal_Crystal_Fence_Gate);

        //Doors are in ModItemModelProvider for the "blockItem"

        //Trapdoors

        blockItem(ModBlocks.Dark_Crystal_Trapdoor,"_bottom");
        blockItem(ModBlocks.Light_Crystal_Trapdoor,"_bottom");
        blockItem(ModBlocks.Coal_Crystal_Trapdoor,"_bottom");

        //Crops

        makeCrop(((TakichirumCrop) ModBlocks.Takichirum_Crop.get()), "takichirum_stage", "takichirum_stage");

        //Flowers

        simpleBlockWithItem(ModBlocks.Dancing_Flower_Leaf.get(), models().cross(blockTexture(ModBlocks.Dancing_Flower_Leaf.get()).getPath(),
                blockTexture(ModBlocks.Dancing_Flower_Leaf.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.Potted_Dancing_Flower_Leaf.get(), models().singleTexture("potted_dancing_flower_leaf",
                new ResourceLocation("flower_pot_cross"), "plant",blockTexture(ModBlocks.Dancing_Flower_Leaf.get())).renderType("cutout"));

        //Workbenches
        horizontalBlock(ModBlocks.Takichirum_Workbench.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/takichirum_workbench")));




        customLamp();
    }

    private void customLamp() {
        getVariantBuilder(ModBlocks.Crystal_Lamp.get()).forAllStates(state -> {
            if(state.getValue(CrystalLampBlock.LIT)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("crystal_lamp_on",
                        new ResourceLocation(TSOTD.MOD_ID, "block/" + "crystal_lamp_on")))};

            } else if (state.getValue(CrystalLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("crystal_lamp_on",
                        new ResourceLocation(TSOTD.MOD_ID, "block/" + "crystal_lamp_on")))};

            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("crystal_lamp_off",
                        new ResourceLocation(TSOTD.MOD_ID, "block/" + "crystal_lamp_off")))};
            }

        });

        simpleBlockItem(ModBlocks.Crystal_Lamp.get(), models().cubeAll("crystal_lamp_on",
                new ResourceLocation(TSOTD.MOD_ID, "block/" + "crystal_lamp_on")));
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TakichirumCrop) block).getAgeProperty()),
                new ResourceLocation(TSOTD.MOD_ID, "block/" + textureName + state.getValue(((TakichirumCrop) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("tsotd:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(),
                new ModelFile.UncheckedModelFile("tsotd:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}