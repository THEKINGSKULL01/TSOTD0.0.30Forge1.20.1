package net.thekingskull01.tsotd.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, TSOTD.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, TSOTD.MOD_ID);

    public static final RegistryObject<PoiType> Takichirum_Maintainer_POI = POI_TYPES.register("takichirum_maintainer_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.Takichirum_Workbench.get().getStateDefinition().getPossibleStates()),
                    1, 1 ));

    public static final RegistryObject<VillagerProfession> Takichirum_Maintainer =
            VILLAGER_PROFESSIONS.register("takichirum_maintainer", () -> new VillagerProfession("takichirum_maintainer",
                    x -> x.get() == Takichirum_Maintainer_POI.get(), x -> x.get() == Takichirum_Maintainer_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.BEACON_POWER_SELECT));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
