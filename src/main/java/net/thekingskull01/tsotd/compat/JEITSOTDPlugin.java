package net.thekingskull01.tsotd.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.recipe.TakichirumCreationRecipe;
import net.thekingskull01.tsotd.screen.TakichirumWorkbenchScreen;

import java.util.List;

@JeiPlugin
public class JEITSOTDPlugin implements IModPlugin {



    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(TSOTD.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new TakichirumWorkbenchRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<TakichirumCreationRecipe> takichirumCreations = recipeManager.getAllRecipesFor(TakichirumCreationRecipe.Type.INSTANCE);
        registration.addRecipes(TakichirumWorkbenchRecipeCategory.TAKICHIRUM_CREATION_TYPE, takichirumCreations);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(TakichirumWorkbenchScreen.class, 60, 30, 20,30, TakichirumWorkbenchRecipeCategory.TAKICHIRUM_CREATION_TYPE);
    }
}
