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
//import java.util.List;
//import java.util.function.Consumer;
//
//public class backup implements RecipeBuilder {
//    private final Item result;
//    private final List<Ingredient> ingredients;
//    private final int count;
//    private final Advancement.Builder advancement = Advancement.Builder.advancement();
//
//    public backup(List<ItemLike> ingredients, ItemLike result, int count) {
//        this.ingredients = ingredients.stream().map(Ingredient::of).toList();
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
//        pFinishedRecipeConsumer.accept(new Result(pRecipeId, this.result, this.count, this.ingredients,
//                this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/"
//                + pRecipeId.getPath())));
//    }
//
//    public static class Result implements FinishedRecipe {
//        private final ResourceLocation id;
//        private final Item result;
//        private final List<Ingredient> ingredients;
//        private final int count;
//        private final Advancement.Builder advancement;
//        private final ResourceLocation advancementId;
//
//        public Result(ResourceLocation pId, Item pResult, int pCount, List<Ingredient> ingredients, Advancement.Builder pAdvancement,
//                      ResourceLocation pAdvancementId) {
//            this.id = pId;
//            this.result = pResult;
//            this.count = pCount;
//            this.ingredients = ingredients;
//            this.advancement = pAdvancement;
//            this.advancementId = pAdvancementId;
//        }
//
//        @Override
//        public void serializeRecipeData(JsonObject pJson) {
//            JsonArray jsonarray = new JsonArray();
//            for (Ingredient ingredient : ingredients) {
//                jsonarray.add(ingredient.toJson());
//                jsonarray.add(ingredient.toJson());
//                jsonarray.add(ingredient.toJson());
//            }
//            pJson.add("ingredients", jsonarray);
//            pJson.add("ingredients", jsonarray);
//            pJson.add("ingredients", jsonarray);
//
//            JsonObject jsonobject = new JsonObject();
//            jsonobject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
//            if (this.count > 1) {
//                jsonobject.addProperty("count", this.count);
//            }
//
//            pJson.add("output", jsonobject);
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