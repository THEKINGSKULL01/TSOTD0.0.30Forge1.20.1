package net.thekingskull01.tsotd.datagen.custom;

//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import net.minecraft.advancements.Advancement;
//import net.minecraft.advancements.AdvancementRewards;
//import net.minecraft.advancements.CriterionTriggerInstance;
//import net.minecraft.advancements.RequirementsStrategy;
//import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.data.recipes.RecipeBuilder;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraft.world.level.ItemLike;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.thekingskull01.tsotd.TSOTD;
//import net.thekingskull01.tsotd.recipe.TakichirumCreationRecipe;
//
//import javax.annotation.Nullable;
//import java.util.function.Consumer;
//
//public class backup2 implements RecipeBuilder {
//    private final Item result;
//    private final Ingredient ingredient1;
//    private final Ingredient ingredient2;
//    private final Ingredient ingredient3;
//    private final int count;
//    private final Advancement.Builder advancement = Advancement.Builder.advancement();
//
//    public backup2(ItemLike left_slot, ItemLike middle_slot, ItemLike right_slot, ItemLike result, int count) {
//        this.ingredient1 = Ingredient.of(left_slot);
//        this.ingredient2 = Ingredient.of(middle_slot);
//        this.ingredient3 = Ingredient.of(right_slot);
//        this.result = result.asItem();
//        this.count = count;
//    }
//
//    @Override
//    public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
//        this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
//        return this;
//    }
//
//    @Override
//    public RecipeBuilder group(@Nullable String pGroupName) {
//        return this;
//    }
//
//    @Override
//    public Item getResult() {
//        return result;
//    }
//
//    @Override
//    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipeId) {
//        this.advancement.parent(new ResourceLocation("recipes/root"))
//                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId))
//                .rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);
//
//        pFinishedRecipeConsumer.accept(new Result(pRecipeId, this.result, this.count, this.ingredient1, this.ingredient2, this.ingredient3,
//                this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/"
//                + pRecipeId.getPath())));
//    }
//
//    public static class Result implements FinishedRecipe {
//        private final ResourceLocation id;
//        private final Item result;
//        private final Ingredient ingredient1;
//        private final Ingredient ingredient2;
//        private final Ingredient ingredient3;
//        private final int count;
//        private final Advancement.Builder advancement;
//        private final ResourceLocation advancementId;
//
//        public Result(ResourceLocation pId, Item pResult, int pCount, Ingredient left_slot,
//                      Ingredient middle_slot, Ingredient right_slot, Advancement.Builder pAdvancement, ResourceLocation pAdvancementId) {
//            this.id = pId;
//            this.result = pResult;
//            this.count = pCount;
//            this.ingredient1 = left_slot;
//            this.ingredient2 = middle_slot;
//            this.ingredient3 = right_slot;
//            this.advancement = pAdvancement;
//            this.advancementId = pAdvancementId;
//        }
//
//        @Override
//        public void serializeRecipeData(JsonObject pJson) {
//            JsonArray jsonArray = new JsonArray();
//            jsonArray.add(ingredient1.toJson());
//            jsonArray.add(ingredient2.toJson());
//            jsonArray.add(ingredient3.toJson());
//
//            pJson.add("ingredients", jsonArray);
//            JsonObject jsonObject = new JsonObject();
//            jsonObject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
//            if (this.count > 1) {
//                jsonObject.addProperty("count", this.count);
//            }
//
//            pJson.add("output", jsonObject);
//        }
//
//        @Override
//        public ResourceLocation getId() {
//            return new ResourceLocation(TSOTD.MOD_ID,
//                    ForgeRegistries.ITEMS.getKey(this.result).getPath() + "_from_takichirum_creation");
//        }
//
//        @Override
//        public RecipeSerializer<?> getType() {
//            return TakichirumCreationRecipe.Serializer.INSTANCE;
//        }
//
//        @Nullable
//        public JsonObject serializeAdvancement() {
//            return this.advancement.serializeToJson();
//        }
//
//        @Nullable
//        public ResourceLocation getAdvancementId() {
//            return this.advancementId;
//        }
//    }
//}
//