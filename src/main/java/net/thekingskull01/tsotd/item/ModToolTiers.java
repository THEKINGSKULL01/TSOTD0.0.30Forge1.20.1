package net.thekingskull01.tsotd.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8f, 3.0f, 10 , ModTags.Blocks.NEEDS_STRUCTURED_COMBAT_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(TSOTD.MOD_ID, "diamond"), List.of(Tiers.IRON), List.of());

    //public static final Tier NETHERITE = TierSortingRegistry.registerTier(
    //        new ForgeTier(4, 2031, 9f, 4.0f, 15 , ModTags.Blocks.NEEDS_STRUCTURED_COMBAT_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    //        new ResourceLocation(TSOTD.MOD_ID, "netherite"), List.of(Tiers.DIAMOND), List.of());

    //public static final Tier YELLOW_CRYSTAL = TierSortingRegistry.registerTier(
    //        new ForgeTier(5, 3000, 11f, 5.0f, 17,
    //                ModTags.Blocks.NEEDS_YELLOW_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Yellow_Crystal.get())),
    //        new ResourceLocation(TSOTD.MOD_ID, "yellow_crystal"), List.of(Tiers.NETHERITE), List.of());
//
    public static final Tier RED_CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(6, 4000, 14f, 6.0f, 19,
                    ModTags.Blocks.NEEDS_STRUCTURED_COMBAT_TOOL, () -> Ingredient.of(ModItems.Red_Crystal.get())),
            new ResourceLocation(TSOTD.MOD_ID, "red_crystal"), List.of(Tiers.NETHERITE), List.of());

    //public static final Tier PURPLE_CRYSTAL = TierSortingRegistry.registerTier(
    //        new ForgeTier(7, 5000, 18f, 7.0f, 21,
    //                ModTags.Blocks.NEEDS_PURPLE_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Purple_Crystal.get())),
    //        new ResourceLocation(TSOTD.MOD_ID, "purple_crystal"), List.of(Tiers.NETHERITE), List.of());
//
    //public static final Tier BLUE_CRYSTAL = TierSortingRegistry.registerTier(
    //        new ForgeTier(8, 6000, 24f, 8.0f, 23,
    //                ModTags.Blocks.NEEDS_BLUE_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Blue_Crystal.get())),
    //        new ResourceLocation(TSOTD.MOD_ID, "blue_crystal"), List.of(Tiers.NETHERITE), List.of());
//
    //public static final Tier LIGHT_BLUE_CRYSTAL = TierSortingRegistry.registerTier(
    //        new ForgeTier(9, 7000, 27f, 9.0f, 25,
    //                ModTags.Blocks.NEEDS_LIGHT_BLUE_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.LightBlue_Crystal.get())),
    //        new ResourceLocation(TSOTD.MOD_ID, "light_blue_crystal"), List.of(Tiers.NETHERITE), List.of());
//
    //public static final Tier GREEN_CRYSTAL = TierSortingRegistry.registerTier(
    //        new ForgeTier(10, 8000, 32f, 10.0f, 27,
    //                ModTags.Blocks.NEEDS_GREEN_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Green_Crystal.get())),
    //        new ResourceLocation(TSOTD.MOD_ID, "green_crystal"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier DARK_CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(11, 9000, 35f, 12.0f, 30,
                    ModTags.Blocks.NEEDS_DARK_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Dark_Crystal.get())),
            new ResourceLocation(TSOTD.MOD_ID, "dark_crystal"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier LIGHT_CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(11, 9000, 35f, 12.0f, 30,
                    ModTags.Blocks.NEEDS_LIGHT_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Light_Crystal.get())),
            new ResourceLocation(TSOTD.MOD_ID, "light_crystal"), List.of(Tiers.NETHERITE), List.of());

    //public static final Tier DARKENED_LIGHT_CRYSTAL = TierSortingRegistry.registerTier(
    //        new ForgeTier(12, 10000, 40f, 14.0f, 40,
    //                ModTags.Blocks.NEEDS_DARKENED_LIGHT_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.Darkened_Light_Crystal.get())),
    //        new ResourceLocation(TSOTD.MOD_ID, "darkened_light_crystal"), List.of(Tiers.NETHERITE), List.of());


    public static final Tier TAKICHIRUM = TierSortingRegistry.registerTier(
            new ForgeTier(13, 15000, 50f, 16f, 50,
                    ModTags.Blocks.NEEDS_TAKICHIRUM_TOOL, () -> Ingredient.of(ModItems.Takichirum_Ingot.get())),
            new ResourceLocation(TSOTD.MOD_ID, "takichirum"), List.of(ModToolTiers.DARK_CRYSTAL), List.of());
}

