package net.thekingskull01.tsotd.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.datagen.custom.TakichirumCreationRecipeBuilder;
import net.thekingskull01.tsotd.fluid.ModFluids;
import net.thekingskull01.tsotd.item.ModItems;
import net.thekingskull01.tsotd.util.ConsumerWrapperBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> Dark_Crystal_Smeltables = List.of(
            ModBlocks.Dark_Crystal_Ore.get());
    private static final List<ItemLike> Light_Crystal_Smeltables = List.of(
            ModBlocks.Light_Crystal_Ore.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    private static final List<ItemLike> Dark_Crystal_Stone_Cutting = List.of(
            ModBlocks.Dark_Crystal_Slab.get(),
            ModBlocks.Dark_Crystal_Stairs.get(),
            ModBlocks.Dark_Crystal_Wall.get(),
            ModBlocks.Dark_Crystal_Fence.get(),
            ModBlocks.Dark_Crystal_Fence_Gate.get(),
            ModBlocks.Dark_Crystal_Door.get(),
            ModBlocks.Dark_Crystal_Trapdoor.get());

    private static final List<ItemLike> Light_Crystal_Stone_Cutting = List.of(
            ModBlocks.Light_Crystal_Slab.get(),
            ModBlocks.Light_Crystal_Stairs.get(),
            ModBlocks.Light_Crystal_Wall.get(),
            ModBlocks.Light_Crystal_Fence.get(),
            ModBlocks.Light_Crystal_Fence_Gate.get(),
            ModBlocks.Light_Crystal_Door.get(),
            ModBlocks.Light_Crystal_Trapdoor.get());

    private static final List<ItemLike> Darkened_Light_Crystal_Stone_Cutting = List.of(
            ModBlocks.Darkened_Light_Crystal_Slab.get(),
            ModBlocks.Darkened_Light_Crystal_Stairs.get(),
            ModBlocks.Darkened_Light_Crystal_Wall.get(),
            ModBlocks.Darkened_Light_Crystal_Fence.get(),
            ModBlocks.Darkened_Light_Crystal_Fence_Gate.get());

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        //Items to blocks

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Coal_Crystal_Block.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Crystallized_Coal.get())
                .unlockedBy("has_crystal_coal",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Crystallized_Coal.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Dark_Crystal_Block.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Dark_Crystal.get())
                .unlockedBy("has_dark_crystal",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Dark_Crystal.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Light_Crystal_Block.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Light_Crystal.get())
                .unlockedBy("has_light_crystal",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Light_Crystal.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Darkened_Light_Crystal_Block.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Darkened_Light_Crystal.get())
                .unlockedBy("has_darkened_light_crystal",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Darkened_Light_Crystal.get()).build()))
                .save(consumer, new ResourceLocation("tsotd:darkened_light_crystals_to_darken_light_crystal_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Darkened_Light_Crystal_Block.get())
                .pattern("121")
                .pattern("232")
                .pattern("121")
                .define('1', ModBlocks.Dark_Crystal_Block.get())
                .define('2', ModBlocks.Light_Crystal_Block.get())
                .define('3', Items.DRAGON_EGG)
                .unlockedBy("has_darkened_light_crystal", inventoryTrigger(ItemPredicate.Builder.item().of
                        (ModBlocks.Darkened_Light_Crystal_Block.get()).build()))
                .save(consumer, new ResourceLocation("tsotd:dragon_egg_dark_crystal_light_crystal_block_to_darken_light_crystal_block"));

        //Blocks to items

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Crystallized_Coal.get(), 9)
                .requires(ModBlocks.Coal_Crystal_Block.get())
                .unlockedBy("has_coal_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Coal_Crystal_Block.get()).build()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Dark_Crystal.get(), 9)
                .requires(ModBlocks.Dark_Crystal_Block.get())
                .unlockedBy("has_dark_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Dark_Crystal_Block.get()).build()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Light_Crystal.get(), 9)
                .requires(ModBlocks.Light_Crystal_Block.get())
                .unlockedBy("has_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Light_Crystal_Block.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Darkened_Light_Crystal.get(), 9)
                .requires(ModBlocks.Darkened_Light_Crystal_Block.get())
                .unlockedBy("has_darkened_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Darkened_Light_Crystal.get()).build()))
                .save(consumer);

        //Raw items to Items

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Light_Crystal_Detector.get())
                .pattern("1  ")
                .pattern(" 23")
                .pattern(" 32")
                .define('1', ModItems.Light_Crystal.get())
                .define('2', ModItems.Light_Stick.get())
                .define('3', Items.ENDER_EYE)
                .unlockedBy("has_light_crystal_detector",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Light_Crystal_Detector.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Dark_Crystal_Detector.get())
                .pattern("1  ")
                .pattern(" 23")
                .pattern(" 32")
                .define('1', ModItems.Dark_Crystal.get())
                .define('2', ModItems.Dark_Stick.get())
                .define('3', Items.ENDER_EYE)
                .unlockedBy("has_dark_crystal_detector",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Dark_Crystal_Detector.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Dark_Crystal_Steak.get())
                .pattern("12")
                .pattern("21")
                .define('1', ModBlocks.Dark_Crystal_Block.get())
                .define('2', Items.COOKED_BEEF)
                .unlockedBy("has_dark_crystal_steak",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Dark_Crystal_Steak.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Light_Crystal_Steak.get())
                .pattern("21")
                .pattern("12")
                .define('1', ModBlocks.Light_Crystal_Block.get())
                .define('2', Items.COOKED_BEEF)
                .unlockedBy("has_light_crystal_steak",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Light_Crystal_Steak.get()).build()))
                .save(consumer);

        //Fluid Recipes

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModFluids.GLOWSTONE.FLUID_BUCKET.get())
                .requires(Blocks.GLOWSTONE)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_item", has(Items.WATER_BUCKET))
                .save(ConsumerWrapperBuilder.wrap(ModFluids.CONSUMING_SHAPELESS.get()).build(consumer), getResource("glowstone_bucket"));

        //Smelting Items


        //Smelting Blocks

        oreBlasting(consumer, Dark_Crystal_Smeltables, RecipeCategory.MISC, ModItems.Dark_Crystal.get(), 4.0F, 300, "dark_crystal");
        oreBlasting(consumer, Light_Crystal_Smeltables, RecipeCategory.MISC, ModItems.Light_Crystal.get(), 4.0F, 300, "light_crystal");

        //Takichirum Workbench

        new TakichirumCreationRecipeBuilder(
                ModItems.Dark_Crystal.get(),
                Items.WITHER_ROSE,
                ModItems.Light_Crystal.get(),
                ModBlocks.Dancing_Flower_Leaf.get(), 1)
                .unlockedBy("has_dancing_flower_leaf", has(ModBlocks.Dancing_Flower_Leaf.get()))
                .save(consumer, new ResourceLocation("takichirum_seeds_from_crystals"));

        new TakichirumCreationRecipeBuilder(
                ModItems.Takichirum_Ingot.get(),
                ModBlocks.Darkened_Light_Crystal_Block.get(),
                Items.NETHERITE_INGOT,
                Blocks.NETHERITE_BLOCK, 1)
                .unlockedBy("has_darkened_light_crystal_block", has(ModBlocks.Darkened_Light_Crystal_Block.get()))
                .save(consumer, new ResourceLocation("takichirum_netherite_creation"));



        //StoneCutter

        //Stairs

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Dark_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Dark_Crystal_Stairs.get(),
                        4)
                .unlockedBy("has_dark_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Dark_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Light_Crystal_Stairs.get(),
                        4)
                .unlockedBy("has_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Light_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Coal_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Coal_Crystal_Stairs.get(),
                        4)
                .unlockedBy("has_coal_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Coal_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Darkened_Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Darkened_Light_Crystal_Stairs.get(),
                        4)
                .unlockedBy("has_darkened_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Darkened_Light_Crystal_Block.get()).build())).save(consumer);

        //Slabs

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Dark_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Dark_Crystal_Slab.get(),
                        2)
                .unlockedBy("has_dark_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Dark_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Light_Crystal_Slab.get(),
                        2)
                .unlockedBy("has_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Light_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Coal_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Coal_Crystal_Slab.get(),
                        2)
                .unlockedBy("has_coal_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Coal_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Darkened_Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Darkened_Light_Crystal_Slab.get(),
                        2)
                .unlockedBy("has_darkened_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Darkened_Light_Crystal_Block.get()).build())).save(consumer);

        //Walls

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Dark_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Dark_Crystal_Wall.get(),
                        6)
                .unlockedBy("has_dark_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Dark_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Light_Crystal_Wall.get(),
                        6)
                .unlockedBy("has_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Light_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Coal_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Coal_Crystal_Wall.get(),
                        6)
                .unlockedBy("has_coal_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Coal_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Darkened_Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Darkened_Light_Crystal_Wall.get(),
                        6)
                .unlockedBy("has_darkened_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Darkened_Light_Crystal_Block.get()).build())).save(consumer);
        //Fences

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Dark_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Dark_Crystal_Fence.get(),
                        4)
                .unlockedBy("has_dark_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Dark_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Light_Crystal_Fence.get(),
                        4)
                .unlockedBy("has_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Light_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Coal_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Coal_Crystal_Fence.get(),
                        4)
                .unlockedBy("has_coal_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Coal_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Darkened_Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Darkened_Light_Crystal_Fence.get(),
                        4)
                .unlockedBy("has_darkened_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Darkened_Light_Crystal_Block.get()).build())).save(consumer);

        //FenceGates

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Dark_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Dark_Crystal_Fence_Gate.get(),
                        2)
                .unlockedBy("has_dark_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Dark_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Light_Crystal_Fence_Gate.get(),
                        2)
                .unlockedBy("has_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Light_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Coal_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Coal_Crystal_Fence_Gate.get(),
                        2)
                .unlockedBy("has_coal_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Coal_Crystal_Block.get()).build())).save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.Darkened_Light_Crystal_Block.get()),
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.Darkened_Light_Crystal_Fence_Gate.get(),
                        2)
                .unlockedBy("has_darkened_light_crystal_block",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.Darkened_Light_Crystal_Block.get()).build())).save(consumer);


    }



    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                     float pExperience, int pCookingTime, String pGroup, String pRecipeName) {Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience,
                    pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer,
                    TSOTD.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

    public static SingleItemRecipeBuilder stonecutting(Ingredient pIngredient, RecipeCategory pCategory, ItemLike pResult) {
        return new SingleItemRecipeBuilder(pCategory, RecipeSerializer.STONECUTTER, pIngredient, pResult, 1);
    }

    public ResourceLocation getResource(String name) {
        return new ResourceLocation(TSOTD.MOD_ID, name);
    }


}
