package net.thekingskull01.tsotd.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
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
                .add(ModItems.Takichirum_Helmet.get(),
                ModItems.Dark_Crystal_Helmet.get(),
                ModItems.Light_Crystal_Helmet.get(),

                ModItems.Takichirum_Chestplate.get(),
                ModItems.Dark_Crystal_Chestplate.get(),
                ModItems.Light_Crystal_Chestplate.get(),

                ModItems.Takichirum_Leggings.get(),
                ModItems.Dark_Crystal_Leggings.get(),
                ModItems.Light_Crystal_Leggings.get(),

                ModItems.Takichirum_Boots.get(),
                ModItems.Dark_Crystal_Boots.get(),
                ModItems.Light_Crystal_Boots.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.Zomblie_Log.get().asItem())
                .add(ModBlocks.Zomblie_Wood.get().asItem())
                .add(ModBlocks.Stripped_Zomblie_Log.get().asItem())
                .add(ModBlocks.Stripped_Zomblie_Wood.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.Zomblie_Planks.get().asItem());



    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
