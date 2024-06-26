package net.thekingskull01.tsotd.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.util.ModTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TSOTD.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        this.tag(ModTags.Blocks.NEEDS_STRUCTURED_COMBAT_TOOL);


        this.tag(ModTags.Blocks.DARK_CRYSTAL_DETECTOR_VALUABLES)
                .add(ModBlocks.Dark_Crystal_Ore.get());
        this.tag(ModTags.Blocks.LIGHT_CRYSTAL_DETECTOR_VALUABLES)
                .add(ModBlocks.Light_Crystal_Ore.get());

        //Mineable with pickaxe

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)

                //Blocks

                .add(ModBlocks.Dark_Crystal_Ore.get(),
                        ModBlocks.Dark_Crystal_Block.get(),
                        ModBlocks.Light_Crystal_Ore.get(),
                        ModBlocks.Light_Crystal_Block.get(),
                        ModBlocks.Coal_Crystal_Ore.get(),
                        ModBlocks.Coal_Crystal_Block.get(),
                        ModBlocks.Green_Crystal_Block.get(),

                //Slab

                        ModBlocks.Dark_Crystal_Slab.get(),
                        ModBlocks.Light_Crystal_Slab.get(),
                        ModBlocks.Coal_Crystal_Slab.get(),
                //Stairs

                        ModBlocks.Dark_Crystal_Stairs.get(),
                        ModBlocks.Light_Crystal_Stairs.get(),
                        ModBlocks.Coal_Crystal_Stairs.get());


        //Takichirum Paxel
        //this.tag(ModTags.Blocks.PAXEL_MINEABLE).addTags(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.MINEABLE_WITH_AXE, BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.MINEABLE_WITH_HOE)
        //        .add(ModBlocks.Green_Crystal_Block.get());



        //Takichirum Hammer
        //this.tag(ModTags.Blocks.HAMMER_MINEABLE).addTags(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.MINEABLE_WITH_SHOVEL)
        //        .add(ModBlocks.Green_Crystal_Block.get());



        //Dark Crystal Tool
        //this.tag(ModTags.Blocks.NEEDS_DARK_CRYSTAL_TOOL).addTags(BlockTags.MINEABLE_WITH_PICKAXE);



        ////Light Crystal Tool
        //this.tag(ModTags.Blocks.NEEDS_LIGHT_CRYSTAL_TOOL).addTags(BlockTags.MINEABLE_WITH_PICKAXE);

        //Netherite tool

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)

                //Blocks

                .add(ModBlocks.Dark_Crystal_Ore.get(),
                        ModBlocks.Dark_Crystal_Block.get(),
                        ModBlocks.Light_Crystal_Ore.get(),
                        ModBlocks.Light_Crystal_Block.get(),
                        ModBlocks.Coal_Crystal_Ore.get(),
                        ModBlocks.Coal_Crystal_Block.get(),
                        ModBlocks.Green_Crystal_Block.get(),

                //Slab

                        ModBlocks.Dark_Crystal_Slab.get(),
                        ModBlocks.Light_Crystal_Slab.get(),
                        ModBlocks.Coal_Crystal_Slab.get(),

                //Stairs

                        ModBlocks.Dark_Crystal_Stairs.get(),
                        ModBlocks.Light_Crystal_Stairs.get(),
                        ModBlocks.Coal_Crystal_Stairs.get());


        //mineable with axe

        //mineable with shovel

        //mineable with hoe


        //fences/walls/gates
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.Dark_Crystal_Wall.get())
                .add(ModBlocks.Light_Crystal_Wall.get())
                .add(ModBlocks.Coal_Crystal_Wall.get())
                .add(ModBlocks.Darkened_Light_Crystal_Wall.get());
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.Dark_Crystal_Fence.get())
                .add(ModBlocks.Light_Crystal_Fence.get())
                .add(ModBlocks.Coal_Crystal_Fence.get())
                .add(ModBlocks.Darkened_Light_Crystal_Fence.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.Dark_Crystal_Fence_Gate.get())
                .add(ModBlocks.Light_Crystal_Fence_Gate.get())
                .add(ModBlocks.Coal_Crystal_Fence_Gate.get())
                .add(ModBlocks.Darkened_Light_Crystal_Fence_Gate.get());

        //Logs That burn

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.Zomblie_Log.get())
                .add(ModBlocks.Zomblie_Wood.get())
                .add(ModBlocks.Stripped_Zomblie_Log.get())
                .add(ModBlocks.Stripped_Zomblie_Wood.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.Zomblie_Planks.get());



    }


    @Override
    public String getName() {
        return "Block Tags";
    }
}
