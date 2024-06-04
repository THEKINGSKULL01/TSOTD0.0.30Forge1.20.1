package net.thekingskull01.tsotd.datagen;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.fluid.ModFluids;

public class ModFluidTagsProvider extends FluidTagsProvider {

    //tag for fluids that interact with lava the same way water does because they consist mostly of water
    public static TagKey<Fluid> WATERY = FluidTags.create(new ResourceLocation(TSOTD.MOD_ID, "watery"));

    public ModFluidTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TSOTD.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        for (ModFluids.FluidStuff fluid : ModFluids.fluidList) {
            tag(FluidTags.create(new ResourceLocation(TSOTD.MOD_ID, fluid.name))).add(fluid.FLUID.get()).add(fluid.FLUID_FLOW.get());
        }
        tag(WATERY)
                //.addTag(FluidTags.WATER)
                .add(ModFluids.GLOWSTONE.FLUID.get());
                //.add(FunkyFluidsResources.OOBLECK.FLUID_FLOW.get())
                //.add(FunkyFluidsResources.MELONADE.FLUID.get())
                //.add(FunkyFluidsResources.MELONADE.FLUID_FLOW.get())
                //.add(FunkyFluidsResources.REDSTONE_SUSPENSION.FLUID.get())
                //.add(FunkyFluidsResources.REDSTONE_SUSPENSION.FLUID_FLOW.get());
    }
}