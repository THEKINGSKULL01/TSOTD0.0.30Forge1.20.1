package net.thekingskull01.tsotd.enchantment;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.thekingskull01.tsotd.TSOTD;

public class AutoSmeltEnchantment extends Enchantment {
    public AutoSmeltEnchantment(EquipmentSlot... slots) {
        super(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, slots);
    }

    @Override
    protected boolean checkCompatibility(Enchantment ench) {
        if (ench == Enchantments.SILK_TOUCH)
            return false;
        if (ench == ModEnchantments.AUTO_SMELTING.get())
            return false;
        return true;
    }

    @Override
    public boolean canApplyAtEnchantingTable( ItemStack stack) {
        return stack.getItem() instanceof HoeItem;
    }
    @Override
    public boolean isTradeable() {
        return false;
    }
}