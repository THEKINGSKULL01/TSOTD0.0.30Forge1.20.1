package net.thekingskull01.tsotd.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ZOMBLIE_KEY = registerKey("zomblie");



    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CRYSTALIZED_COAL_ORE_KEY = registerKey("nether_crystalized_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DARK_CRYSTAL_ORE_KEY = registerKey("end_dark_crystal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LIGHT_CRYSTAL_ORE_KEY = registerKey("end_light_crystal_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DANCING_FLOWER_LEAF_KEY = registerKey("dancing_flower_leaf");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);


        register(context, ZOMBLIE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.Zomblie_Log.get()),
                new ForkingTrunkPlacer(4, 3, 4),
                BlockStateProvider.simple(ModBlocks.Zomblie_Leaves.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(4, 2, 1)).build());

        register(context, NETHER_CRYSTALIZED_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.Coal_Crystal_Ore.get().defaultBlockState(), 10));

        register(context, END_DARK_CRYSTAL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.Dark_Crystal_Ore.get().defaultBlockState(), 6));
        register(context, END_LIGHT_CRYSTAL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.Light_Crystal_Ore.get().defaultBlockState(), 6));

        register(context, DANCING_FLOWER_LEAF_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(26, 3,3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.Dancing_Flower_Leaf.get())))));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(TSOTD.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}