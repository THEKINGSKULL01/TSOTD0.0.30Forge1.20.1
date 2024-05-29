package net.thekingskull01.tsotd.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier DARK_CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(11, 5000, 35f, 8f, 25,
                    ModTags.Blocks.NEEDS_DARK_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Dark_Crystal.get())),
            new ResourceLocation(TSOTD.MOD_ID, "dark_crystal"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier LIGHT_CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(11, 5000, 35f, 8f, 25,
                    ModTags.Blocks.NEEDS_LIGHT_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Light_Crystal.get())),
            new ResourceLocation(TSOTD.MOD_ID, "light_crystal"), List.of(Tiers.NETHERITE), List.of());
}

