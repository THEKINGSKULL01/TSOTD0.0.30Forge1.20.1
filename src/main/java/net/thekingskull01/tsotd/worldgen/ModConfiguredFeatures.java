package net.thekingskull01.tsotd.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ZOMBLIE_KEY = registerKey("zomblie");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {


        register(context, ZOMBLIE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.Zomblie_Log.get()),
                new ForkingTrunkPlacer(4, 3, 4),
                BlockStateProvider.simple(ModBlocks.Zomblie_Leaves.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(4, 2, 1)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(TSOTD.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}