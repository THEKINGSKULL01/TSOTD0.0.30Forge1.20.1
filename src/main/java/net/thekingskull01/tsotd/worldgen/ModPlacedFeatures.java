package net.thekingskull01.tsotd.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ZOMBLIE_PLACED_KEY = registerKey("zomblie_placed");

    public static final ResourceKey<PlacedFeature> CRYSTALIZED_COAL_ORE_PLACED_KEY = registerKey("nether_crystalized_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> DARK_CRYSTAL_ORE_PLACED_KEY = registerKey("end_dark_crystal_ore_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_CRYSTAL_ORE_PLACED_KEY = registerKey("end_light_crystal_ore_placed")
            ;
    public static final ResourceKey<PlacedFeature> DANCING_FLOWER_LEAF_PLACED_KEY = registerKey("end_dancing_flower_leaf_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ZOMBLIE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZOMBLIE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.01f, 0),
                        ModBlocks.Zomblie_Sapling.get()));

        register(context, CRYSTALIZED_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_CRYSTALIZED_COAL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

        register(context, DARK_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_DARK_CRYSTAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(2,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-128), VerticalAnchor.absolute(128))));
        register(context, LIGHT_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_LIGHT_CRYSTAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(2,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-128), VerticalAnchor.absolute(128))));

        register(context, DANCING_FLOWER_LEAF_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DANCING_FLOWER_LEAF_KEY),
                List.of(RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(TSOTD.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}