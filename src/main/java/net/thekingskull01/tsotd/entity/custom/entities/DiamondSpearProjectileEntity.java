package net.thekingskull01.tsotd.entity.custom.entities;


import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.thekingskull01.tsotd.entity.ModEntities;

public class DiamondSpearProjectileEntity extends SpearProjectileEntity {
    public DiamondSpearProjectileEntity(Level pLevel, LivingEntity pShooter, ItemStack pStack) {
        super(pLevel, pShooter, pStack, ModEntities.DIAMOND_SPEAR.get());
    }
    public DiamondSpearProjectileEntity(EntityType<DiamondSpearProjectileEntity> entityType, Level level) {
        super(entityType, level);
    }
    @Override
    public float damage() {
        return 11f;
    }
}
