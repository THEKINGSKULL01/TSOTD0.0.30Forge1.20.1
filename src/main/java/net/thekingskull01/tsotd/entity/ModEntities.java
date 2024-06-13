package net.thekingskull01.tsotd.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.custom.FeathdaEntity;
import net.thekingskull01.tsotd.entity.custom.SculvortEntity;
import net.thekingskull01.tsotd.entity.custom.entities.DiamondScytheProjectileEntity;
import net.thekingskull01.tsotd.entity.custom.entities.DiamondSpearProjectileEntity;
import net.thekingskull01.tsotd.entity.custom.entities.RedCrystalScytheProjectileEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TSOTD.MOD_ID);

    public static final RegistryObject<EntityType<SculvortEntity>> Sculvort =
            ENTITY_TYPES.register("sculvort", () -> EntityType.Builder.of(SculvortEntity::new, MobCategory.CREATURE)
                    .sized(0.75f, 0.75f).build("sculvort"));

    public static final RegistryObject<EntityType<FeathdaEntity>> Feathda =
            ENTITY_TYPES.register("feathda", () -> EntityType.Builder.of(FeathdaEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("feathda"));

    public static RegistryObject<EntityType<DiamondSpearProjectileEntity>> DIAMOND_SPEAR =
            ENTITY_TYPES.register("diamond_spear" , ()-> EntityType.Builder.
                            <DiamondSpearProjectileEntity>of(DiamondSpearProjectileEntity::new , MobCategory.MISC)
                    .sized(0.35f , 0.35f).build("diamond_spear"));

    public static RegistryObject<EntityType<DiamondScytheProjectileEntity>> DIAMOND_SCYTHE =
            ENTITY_TYPES.register("diamond_scythe" , ()-> EntityType.Builder.
                            <DiamondScytheProjectileEntity>of(DiamondScytheProjectileEntity::new , MobCategory.MISC)
                    .sized(0.35f , 0.35f).build("diamond_scythe"));

    public static RegistryObject<EntityType<RedCrystalScytheProjectileEntity>> RED_CRYSTAL_SCYTHE =
            ENTITY_TYPES.register("red_crystal_scythe" , ()-> EntityType.Builder.
                            <RedCrystalScytheProjectileEntity>of(RedCrystalScytheProjectileEntity::new , MobCategory.MISC)
                    .sized(0.35f , 0.35f).build("red_crystal_scythe"));




    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
