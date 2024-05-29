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
        simpleItem(ModItems.Ultimate_Ingot);

        simpleItem(ModItems.Dark_Crystal);
        simpleItem(ModItems.Light_Crystal);

        simpleItem(ModItems.Dark_Stick);
        simpleItem(ModItems.Light_Stick);

        //Items
        simpleItem(ModItems.Dark_Crystal_Detector);
        simpleItem(ModItems.Light_Crystal_Detector);

        //Food
        simpleItem(ModItems.Dark_Crystal_Steak);
        simpleItem(ModItems.Light_Crystal_Steak);

        //Buttons
        buttonItem(ModBlocks.Dark_Crystal_Button, ModBlocks.Dark_Crystal_Block);
        buttonItem(ModBlocks.Light_Crystal_Button, ModBlocks.Light_Crystal_Block);
        buttonItem(ModBlocks.Coal_Crystal_Button, ModBlocks.Coal_Crystal_Block);

        //Walls
        wallItem(ModBlocks.Dark_Crystal_Wall, ModBlocks.Dark_Crystal_Block);
        wallItem(ModBlocks.Light_Crystal_Wall, ModBlocks.Light_Crystal_Block);
        wallItem(ModBlocks.Coal_Crystal_Wall, ModBlocks.Coal_Crystal_Block);

        //Fences
        fenceItem(ModBlocks.Coal_Crystal_Fence, ModBlocks.Coal_Crystal_Block);
        fenceItem(ModBlocks.Dark_Crystal_Fence, ModBlocks.Dark_Crystal_Block);
        fenceItem(ModBlocks.Light_Crystal_Fence, ModBlocks.Light_Crystal_Block);

        //Doors

        simpleBlockItem(ModBlocks.Dark_Crystal_Door);
        simpleBlockItem(ModBlocks.Light_Crystal_Door);
        simpleBlockItem(ModBlocks.Coal_Crystal_Door);

        //Swords

        handheldItem(ModItems.Ultimate_Sword);
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

        //Paxel

        handheldItem(ModItems.Ultimate_Paxel);

        //Hammer

        handheldItem(ModItems.Ultimate_Hammer);




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
