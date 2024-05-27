package net.thekingskull01.tsotd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
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



    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TSOTD.MOD_ID,"item/" + item.getId().getPath()));
    }

}
