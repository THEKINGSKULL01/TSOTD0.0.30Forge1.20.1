package net.thekingskull01.tsotd.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class ReacherEnchantment extends Enchantment {
    public ReacherEnchantment(EquipmentSlot... slots) {
        super(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, slots);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean checkCompatibility(Enchantment ench) {
        if (ench == Enchantments.BLOCK_FORTUNE)
            return false;
        if (ench == Enchantments.SILK_TOUCH)
            return false;
        if (ench == ModEnchantments.AUTO_SMELTING.get())
            return false;
        return true;
    }
}