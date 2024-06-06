package net.thekingskull01.tsotd.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;

public class ModBlockEntitys {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TSOTD.MOD_ID);

    public static final RegistryObject<BlockEntityType<TakichirumWorkbenchBE>> TAKICHIRUM_WORKBENCH_BE =
            BLOCK_ENTITIES.register("takichirum_workbench_be", () -> BlockEntityType.Builder.of(TakichirumWorkbenchBE::new,
                    ModBlocks.Takichirum_Workbench.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
