package net.thekingskull01.tsotd.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TSOTD.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ModTags.Blocks.DARK_CRYSTAL_DETECTOR_VALUABLES)
                .add(ModBlocks.Dark_Crystal_Ore.get());
        this.tag(ModTags.Blocks.LIGHT_CRYSTAL_DETECTOR_VALUABLES)
                .add(ModBlocks.Light_Crystal_Ore.get());

        //Mineable with pickaxe

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.Dark_Crystal_Ore.get(),
                        ModBlocks.Dark_Crystal_Block.get(),
                        ModBlocks.Light_Crystal_Ore.get(),
                        ModBlocks.Light_Crystal_Block.get(),
                        ModBlocks.Coal_Crystal_Ore.get(),
                        ModBlocks.Coal_Crystal_Block.get());

        //Netherite tools

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.Dark_Crystal_Ore.get(),
                        ModBlocks.Dark_Crystal_Block.get(),
                        ModBlocks.Light_Crystal_Ore.get(),
                        ModBlocks.Light_Crystal_Block.get(),
                        ModBlocks.Coal_Crystal_Ore.get(),
                        ModBlocks.Coal_Crystal_Block.get());


        //mineable with axe

        //mineable with shovel

        //mineable with hoe

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
