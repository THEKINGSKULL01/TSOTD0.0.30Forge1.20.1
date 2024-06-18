package net.thekingskull01.tsotd.entity.custom.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.thekingskull01.tsotd.entity.ModEntities;

public class RedCrystalScytheProjectileEntity extends ScytheProjectile {
    public RedCrystalScytheProjectileEntity(Level pLevel, LivingEntity pShooter, ItemStack pStack) {
        super(pLevel, pShooter, pStack, ModEntities.RED_CRYSTAL_SCYTHE.get());
    }

    public RedCrystalScytheProjectileEntity(EntityType<RedCrystalScytheProjectileEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public float damage() {
        return 5F;
    }
}
