package net.thekingskull01.tsotd.entity.custom;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.thekingskull01.tsotd.entity.ai.SculvortAttackGoal;

public class SculvortEntity extends Zombie {
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(SculvortEntity.class, EntityDataSerializers.BOOLEAN);

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;

    public SculvortEntity(EntityType<? extends Zombie> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(1, new SculvortAttackGoal(this, 1.0D, true));

        //this.goalSelector.addGoal(1, new FollowParentGoal(this, 1.1d));

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, false));

        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, IronGolem.class, false));

        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0d));

        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8f));

        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));


    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes().add(
                Attributes.MAX_HEALTH, 300D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.7)
                .add(Attributes.ATTACK_DAMAGE, 10D)
                 .add(Attributes.ATTACK_KNOCKBACK, 5D)
                .add(Attributes.ATTACK_SPEED, 0.4D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.5D)
                .add(Attributes.FOLLOW_RANGE, 32D)
                .add(Attributes.ATTACK_KNOCKBACK, 0.7D)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE, 0.05D);
    }

    //@Nullable
    //@Override
    //public AgeableMob getBreedOffspring(ServerLevel pLevel) {
    //    return ModEntities.Sculvort.get().create(pLevel);
    //}
//
    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
//
        if (this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 80; //Always length in ticks in animation
            attackAnimationState.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout;
        }
//
        if (!this.isAttacking()) {
            attackAnimationState.stop();
        }
    }

    protected void updateWalkAnimation(float v) {
        float f;
        if (this.getPose() == Pose.STANDING) {
            f = Math.min(v * 6.0F, 1.0F);
        } else {
            f = 0.0F;
        }

        this.walkAnimation.update(f, 0.2F);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    public void setAttacking(Boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }

    public boolean isAttacking() {
        return this.entityData.get(ATTACKING);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, true);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CONDUIT_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.SHULKER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.WITHER_DEATH;
    }

    @Override
    protected SoundEvent getStepSound() {
        return SoundEvents.IRON_GOLEM_STEP;
    }
}
