package net.thekingskull01.tsotd.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.thekingskull01.tsotd.worldgen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class ZomblieTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return ModConfiguredFeatures.ZOMBLIE_KEY;
    }
}
