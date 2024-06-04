package net.thekingskull01.tsotd.fluidtypes.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.FluidType;
import net.thekingskull01.tsotd.effect.ModEffects;
import net.thekingskull01.tsotd.fluidtypes.ModFluidTypes;
import net.thekingskull01.tsotd.util.FluidUtil;

public class GlowstoneFluidType extends ModFluidTypes {

    public GlowstoneFluidType(FluidType.Properties properties, TSOTDInfo info) {
        super(properties, info);
    }

    public boolean move(FluidState state, LivingEntity entity, Vec3 movementVector, double gravity) {
        entity.setOnGround(false);
        entity.setSwimming(false);
        entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1));
        entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 1200, 1));
        entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1));

        float f2 = 0.65f;
        float f3 = entity.onGround() ? f2 * 0.50F : 0.75F;
        Vec3 vec35 = entity.handleRelativeFrictionAndCalculateMovement(movementVector, f2);
        double d2 = vec35.y;
        if (entity.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
            d2 += (0.05D * (double)(entity.getEffect(MobEffects.MOVEMENT_SLOWDOWN).getAmplifier() + 1) - vec35.y) * 0.2D;
            entity.resetFallDistance();
        }

        if (entity.shouldDiscardFriction()) {
            vec35 = new Vec3(vec35.x, d2, vec35.z);
        } else {
            vec35 = new Vec3(vec35.x * (double)f3, d2 * (double)0.98F, vec35.z * (double)f3);
        }
        entity.setDeltaMovement(vec35);

        if (entity.isSprinting())
            FluidUtil.spawnSprintParticle(entity);
        return true;
    }
}
