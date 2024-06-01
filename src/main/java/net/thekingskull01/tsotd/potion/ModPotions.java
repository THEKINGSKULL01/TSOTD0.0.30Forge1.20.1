package net.thekingskull01.tsotd.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.effect.ModEffects;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, TSOTD.MOD_ID);

        public static final RegistryObject<Potion> SLIMEY_POTION = POTIONS.register("tsotd_slimey_potion",
                () -> new Potion(new MobEffectInstance(ModEffects.Slimey_Effect.get(), 4800, 0)));

        public static void register(IEventBus eventBus) {
            POTIONS.register(eventBus);
        }

}
