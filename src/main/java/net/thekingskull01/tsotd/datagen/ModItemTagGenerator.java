package net.thekingskull01.tsotd.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, TSOTD.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //Helmets
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Mochirium_Helmet.get(),
                ModItems.Dark_Crystal_Helmet.get(),
                ModItems.Light_Crystal_Helmet.get(),

                ModItems.Mochirium_Chestplate.get(),
                ModItems.Dark_Crystal_Chestplate.get(),
                ModItems.Light_Crystal_Chestplate.get(),

                ModItems.Mochirium_Leggings.get(),
                ModItems.Dark_Crystal_Leggings.get(),
                ModItems.Light_Crystal_Leggings.get(),

                ModItems.Mochirium_Boots.get(),
                ModItems.Dark_Crystal_Boots.get(),
                ModItems.Light_Crystal_Boots.get());



    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
