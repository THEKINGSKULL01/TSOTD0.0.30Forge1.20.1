package net.thekingskull01.tsotd.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.thekingskull01.tsotd.TSOTD;

public class ModBiomeModifers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_ZOMBLIE = registerKey("add_tree_zomblie");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TREE_ZOMBLIE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ZOMBLIE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(TSOTD.MOD_ID, name));
    }
}