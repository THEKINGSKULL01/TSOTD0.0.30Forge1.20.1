package net.thekingskull01.tsotd.datagen.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.recipe.TakichirumCreationRecipe;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class TakichirumCreationRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final Ingredient left_slot;
    private final Ingredient middle_slot;
    private final Ingredient right_slot;
    private final int count;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public TakichirumCreationRecipeBuilder(ItemLike left_slot, ItemLike middle_slot, ItemLike right_slot, ItemLike result, int count) {
        this.left_slot = Ingredient.of(left_slot);
        this.middle_slot = Ingredient.of(middle_slot);
        this.right_slot = Ingredient.of(right_slot);
        this.result = result.asItem();
        this.count = count;
    }

    @Override
    public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
        this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String pGroupName) {
        return this;
    }

    @Override
    public Item getResult() {
        return result;
    }

    @Override
    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipeId) {
        this.advancement.parent(new ResourceLocation("recipes/root"))
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId))
                .rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);

        pFinishedRecipeConsumer.accept(new Result(pRecipeId, this.result, this.count, this.left_slot, this.middle_slot, this.right_slot,
                this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/" + pRecipeId.getPath())));

    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final Ingredient left_slot;
        private final Ingredient middle_slot;
        private final Ingredient right_slot;
        private final int count;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, Item pResult, int pCount, Ingredient left_slot, Ingredient middle_slot, Ingredient right_slot, Advancement.Builder pAdvancement, ResourceLocation pAdvancementId) {
            this.id = pId;
            this.result = pResult;
            this.left_slot = left_slot;
            this.middle_slot = middle_slot;
            this.right_slot = right_slot;
            this.count = pCount;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(left_slot.toJson());
            jsonArray.add(middle_slot.toJson());
            jsonArray.add(right_slot.toJson());

            pJson.add("ingredients", jsonArray);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
            if (this.count > 1) {
                jsonObject.addProperty("count", this.count);
            }

            pJson.add("output", jsonObject);
        }

        @Override
        public ResourceLocation getId() {
            return new ResourceLocation(TSOTD.MOD_ID,
                    ForgeRegistries.ITEMS.getKey(this.result).getPath() + "_from_takichirum_creation");
        }

        @Override
        public RecipeSerializer<?> getType() {
            return TakichirumCreationRecipe.Serializer.INSTANCE;
        }

        @javax.annotation.Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @javax.annotation.Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}