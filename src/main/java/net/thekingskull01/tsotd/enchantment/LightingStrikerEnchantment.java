package net.thekingskull01.tsotd.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class LightingStrikerEnchantment extends Enchantment {
    protected LightingStrikerEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level().isClientSide()) {
            ServerLevel level = ((ServerLevel) pAttacker.level());
            BlockPos position= pTarget.blockPosition();

            if (pLevel == 1) {
                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);
            }

            if (pLevel == 2) {
                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(level, (ItemStack) null, null, position,
                        MobSpawnType.TRIGGERED, true, true);
            }
        }





        super.doPostAttack(pAttacker, pTarget, pLevel);



    }

    @Override
    public int getMaxLevel() {
        return 2;
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


