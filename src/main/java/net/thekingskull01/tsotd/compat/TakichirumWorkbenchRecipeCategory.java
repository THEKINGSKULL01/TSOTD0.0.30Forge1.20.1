package net.thekingskull01.tsotd.compat;


import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.recipe.TakichirumCreationRecipe;

public class TakichirumWorkbenchRecipeCategory implements IRecipeCategory<TakichirumCreationRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(TSOTD.MOD_ID, "takichirum_creations");
    public static final ResourceLocation TEXTURE = new ResourceLocation(TSOTD.MOD_ID, "textures/gui/takichirum_workbench_gui.png");

    public static final RecipeType<TakichirumCreationRecipe> TAKICHIRUM_CREATION_TYPE = new RecipeType<>(UID, TakichirumCreationRecipe.class);


    private final IDrawable background;
    private final IDrawable icon;

    public TakichirumWorkbenchRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.Takichirum_Workbench.get()));
    }

    @Override
    public RecipeType<TakichirumCreationRecipe> getRecipeType() {
        return TAKICHIRUM_CREATION_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Takichi Workbench");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, TakichirumCreationRecipe recipe, IFocusGroup iFocusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 52, 30).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 12).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 108, 30).addIngredients(recipe.getIngredients().get(2));


        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 48).addItemStack(recipe.getResultItem(null));


    }
}
