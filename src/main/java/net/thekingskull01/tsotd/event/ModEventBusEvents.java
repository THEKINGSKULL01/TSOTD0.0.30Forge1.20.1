package net.thekingskull01.tsotd.event;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.ModEntities;
import net.thekingskull01.tsotd.entity.client.FeathdaModel;
import net.thekingskull01.tsotd.entity.client.SculvortModel;
import net.thekingskull01.tsotd.entity.custom.FeathdaEntity;
import net.thekingskull01.tsotd.entity.custom.SculvortEntity;
import net.thekingskull01.tsotd.entity.layers.ModModelLayers;

@Mod.EventBusSubscriber(modid = TSOTD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.SCULVORT_LAYER, SculvortModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.FEATHDA_LAYER, FeathdaModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.Sculvort.get(), SculvortEntity.createAttributes().build());
        event.put(ModEntities.Feathda.get(), FeathdaEntity.createAttributes().build());
    }
    @SubscribeEvent
    public static void registerSpawnPlacement(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.Sculvort.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.Feathda.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }
}
