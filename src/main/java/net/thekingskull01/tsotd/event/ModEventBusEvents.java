package net.thekingskull01.tsotd.event;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.ModEntities;
import net.thekingskull01.tsotd.entity.client.SculvortModel;
import net.thekingskull01.tsotd.entity.custom.SculvortEntity;
import net.thekingskull01.tsotd.entity.layers.ModModelLayers;

@Mod.EventBusSubscriber(modid = TSOTD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.SCULVORT_LAYER, SculvortModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.Sculvort.get(), SculvortEntity.createAttributes().build());
    }
}
