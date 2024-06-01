package net.thekingskull01.tsotd.enchantment.helper;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.enchantment.ModEnchantments;

public class LifeStealerEnchantmentHelper {
    public static void execute( Entity sourceentity) {
        if (sourceentity == null)
            return;
        double rand;
        rand = Math.round(Math.random() * 10);
        if (EnchantmentHelper.getTagEnchantmentLevel(ModEnchantments.LIFE_STEALER.get(),
                (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1 && rand == 1) {
            if (sourceentity instanceof LivingEntity _entity) {
                _entity.setHealth(_entity.getHealth() + 2);
            }
        } else if (EnchantmentHelper.getTagEnchantmentLevel(ModEnchantments.LIFE_STEALER.get(),
                (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2 && rand < 3) {
            if (sourceentity instanceof LivingEntity _entity) {
                _entity.setHealth(_entity.getHealth() + 3);
            }
        } else if (EnchantmentHelper.getTagEnchantmentLevel(ModEnchantments.LIFE_STEALER.get(),
                (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3 && rand < 4) {
            if (sourceentity instanceof LivingEntity _entity) {
                _entity.setHealth(_entity.getHealth() + 4);
            }
        }
    }
}