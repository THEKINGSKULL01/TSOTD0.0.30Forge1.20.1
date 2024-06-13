package net.thekingskull01.tsotd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TSOTD.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        //Minerals
        simpleItem(ModItems.Crystallized_Coal);
        simpleItem(ModItems.Yellow_Crystal);
        simpleItem(ModItems.Red_Crystal);
        simpleItem(ModItems.Purple_Crystal);
        simpleItem(ModItems.Blue_Crystal);
        simpleItem(ModItems.LightBlue_Crystal);
        simpleItem(ModItems.Green_Crystal);
        simpleItem(ModItems.Dark_Crystal);
        simpleItem(ModItems.Light_Crystal);
        simpleItem(ModItems.Darkened_Light_Crystal);
        simpleItem(ModItems.Takichirum_Ingot);

        //Sappling

        saplingItem(ModBlocks.Zomblie_Sapling);

        //Signs

        simpleItem(ModItems.Zomblie_Sign);
        simpleItem(ModItems.Zomblie_Hanging_Sign);



        //Parts

        simpleItem(ModItems.Dark_Stick);
        simpleItem(ModItems.Light_Stick);

        //Detectors
        simpleItem(ModItems.Dark_Crystal_Detector);
        simpleItem(ModItems.Light_Crystal_Detector);


        //Food
        simpleItem(ModItems.Dark_Crystal_Steak);
        simpleItem(ModItems.Light_Crystal_Steak);

        //Buttons
        buttonItem(ModBlocks.Dark_Crystal_Button, ModBlocks.Dark_Crystal_Block);
        buttonItem(ModBlocks.Light_Crystal_Button, ModBlocks.Light_Crystal_Block);
        buttonItem(ModBlocks.Coal_Crystal_Button, ModBlocks.Coal_Crystal_Block);
        buttonItem(ModBlocks.Darkened_Light_Crystal_Button, ModBlocks.Darkened_Light_Crystal_Block);

        //Walls
        wallItem(ModBlocks.Dark_Crystal_Wall, ModBlocks.Dark_Crystal_Block);
        wallItem(ModBlocks.Light_Crystal_Wall, ModBlocks.Light_Crystal_Block);
        wallItem(ModBlocks.Coal_Crystal_Wall, ModBlocks.Coal_Crystal_Block);
        wallItem(ModBlocks.Darkened_Light_Crystal_Wall, ModBlocks.Darkened_Light_Crystal_Block);

        //Fences
        fenceItem(ModBlocks.Coal_Crystal_Fence, ModBlocks.Coal_Crystal_Block);
        fenceItem(ModBlocks.Dark_Crystal_Fence, ModBlocks.Dark_Crystal_Block);
        fenceItem(ModBlocks.Light_Crystal_Fence, ModBlocks.Light_Crystal_Block);
        fenceItem(ModBlocks.Darkened_Light_Crystal_Fence, ModBlocks.Darkened_Light_Crystal_Block);

        //Doors

        simpleBlockItem(ModBlocks.Dark_Crystal_Door);
        simpleBlockItem(ModBlocks.Light_Crystal_Door);
        simpleBlockItem(ModBlocks.Coal_Crystal_Door);

        //Swords

        handheldItem(ModItems.Dark_Crystal_Sword);
        handheldItem(ModItems.Light_Crystal_Sword);

        //Pickaxes

        handheldItem(ModItems.Dark_Crystal_Pickaxe);
        handheldItem(ModItems.Light_Crystal_Pickaxe);

        //Shovels

        handheldItem(ModItems.Dark_Crystal_Shovel);
        handheldItem(ModItems.Light_Crystal_Shovel);

        //Axes

        handheldItem(ModItems.Dark_Crystal_Axe);
        handheldItem(ModItems.Light_Crystal_Axe);

        //Hoes

        handheldItem(ModItems.Dark_Crystal_Hoe);
        handheldItem(ModItems.Light_Crystal_Hoe);


        //Hammer

        handheldItem(ModItems.Takichirum_Hammer);

        //Horse Armor

        simpleItem(ModItems.Takichirum_Horse_Armor);
        simpleItem(ModItems.Dark_Crystal_Horse_Armor);
        simpleItem(ModItems.Light_Crystal_Horse_Armor);

        //Seeds
        simpleItem(ModItems.Takichirum_Seeds);

        //Flowers
        simpleBlockItemBlockTexture(ModBlocks.Dancing_Flower_Leaf);

        //Workbenches
        complexBlock(ModBlocks.Takichirum_Workbench.get());

        //Workbenches
        simpleItem(ModItems.Glowstone_Fluid_Bucket);

        //Spawn eggs
        withExistingParent(ModItems.Sculvort_Spawn_Egg.getId().getPath(),mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.Feathda_Spawn_Egg.getId().getPath(),mcLoc("item/template_spawn_egg"));


    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TSOTD.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(TSOTD.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }


    private  ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TSOTD.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TSOTD.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TSOTD.MOD_ID,"block/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(TSOTD.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TSOTD.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


    //Button blockItem
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(TSOTD.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TSOTD.MOD_ID,"item/" + item.getId().getPath()));
    }

}
