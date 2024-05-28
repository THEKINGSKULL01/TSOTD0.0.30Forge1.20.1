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
        simpleItem(ModItems.Crystallized_Coal);
        simpleItem(ModItems.Dark_Crystal);
        simpleItem(ModItems.Light_Crystal);
        simpleItem(ModItems.Dark_Crystal_Detector);
        simpleItem(ModItems.Light_Crystal_Detector);
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
        fenceItem(ModBlocks.Dark_Crystal_Fence, ModBlocks.Dark_Crystal_Block);
        fenceItem(ModBlocks.Light_Crystal_Fence, ModBlocks.Light_Crystal_Block);
        fenceItem(ModBlocks.Coal_Crystal_Fence, ModBlocks.Coal_Crystal_Block);

    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(TSOTD.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("fence", new ResourceLocation(TSOTD.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
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
