package net.thekingskull01.tsotd.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TSOTD.MOD_ID);

    public static final RegistryObject<RecipeSerializer<TakichirumCreationRecipe>> TAKICHIRUM_SEED_SERIALIZER =
            SERIALIZERS.register("takichirum_creation", ()  -> TakichirumCreationRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }


}
