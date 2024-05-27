package net.thekingskull01.tsotd.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;

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

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        //Blocks to items

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
                .unlockedBy("has_crystal_coal",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Dark_Crystal.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Light_Crystal_Block.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.Light_Crystal.get())
                .unlockedBy("has_crystal_coal",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Light_Crystal.get()).build()))
                .save(consumer);

        //Items to blocks

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

        //Raw items to Items

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Light_Crystal_Detector.get())
                .pattern("1  ")
                .pattern(" 23")
                .pattern(" 32")
                .define('1', ModItems.Light_Crystal.get())
                .define('2', Items.STICK)
                .define('3', Items.ENDER_EYE)
                .unlockedBy("has_light_crystal_detector",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Light_Crystal_Detector.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Dark_Crystal_Detector.get())
                .pattern("1  ")
                .pattern(" 23")
                .pattern(" 32")
                .define('1', ModItems.Dark_Crystal.get())
                .define('2', Items.STICK)
                .define('3', Items.ENDER_EYE)
                .unlockedBy("has_dark_crystal_detector",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Dark_Crystal_Detector.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Dark_Crystal_Steak.get())
                .pattern("12")
                .pattern("21")
                .define('1', ModItems.Dark_Crystal_Steak.get())
                .define('2', Items.COOKED_BEEF)
                .unlockedBy("has_dark_crystal_steak",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Dark_Crystal_Steak.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Light_Crystal_Steak.get())
                .pattern("21")
                .pattern("12")
                .define('1', ModItems.Light_Crystal_Steak.get())
                .define('2', Items.COOKED_BEEF)
                .unlockedBy("has_light_crystal_steak",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.Light_Crystal_Steak.get()).build()))
                .save(consumer);

        //Smelting Items



        //Smelting Blocks

        oreBlasting(consumer, Dark_Crystal_Smeltables, RecipeCategory.MISC, ModItems.Dark_Crystal.get(), 4.0F, 300, "dark_crystal");
        oreBlasting(consumer, Light_Crystal_Smeltables, RecipeCategory.MISC, ModItems.Light_Crystal.get(), 4.0F, 300, "light_crystal");


    }

}
