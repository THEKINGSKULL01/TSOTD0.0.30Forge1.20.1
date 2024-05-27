package net.thekingskull01.tsotd.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DARK_CRYSTAL_STEAK = new FoodProperties.Builder()
            .nutrition(12).saturationMod(1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 2), 1)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 300, 1), 0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 3), 1)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 18000, 3), 1).build();


    public static final FoodProperties LIGHT_CRYSTAL_STEAK = new FoodProperties.Builder()
            .nutrition(12).saturationMod(1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 2), 1)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 300, 1), 0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 3), 1)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 18000, 3), 1).build();

}