package net.thekingskull01.tsotd.entity.custom.entities;


import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.thekingskull01.tsotd.entity.ModEntities;

public class DiamondScytheProjectileEntity extends ScytheProjectile {
    public DiamondScytheProjectileEntity(Level pLevel, LivingEntity pShooter, ItemStack pStack) {
        super(pLevel, pShooter, pStack, ModEntities.DIAMOND_SCYTHE.get());
    }
    public DiamondScytheProjectileEntity(EntityType<DiamondScytheProjectileEntity> entityType, Level level) {
        super(entityType, level);
    }
    @Override
    public float damage() {
        return 14f;
    }
}