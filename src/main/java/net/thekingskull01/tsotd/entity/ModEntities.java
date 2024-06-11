package net.thekingskull01.tsotd.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.custom.SculvortEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TSOTD.MOD_ID);

    public static final RegistryObject<EntityType<SculvortEntity>> Sculvort =
            ENTITY_TYPES.register("sculvort", () -> EntityType.Builder.of(SculvortEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("sculvort"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
