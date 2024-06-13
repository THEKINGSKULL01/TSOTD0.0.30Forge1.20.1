package net.thekingskull01.tsotd.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.layers.ModModelLayers;
import net.thekingskull01.tsotd.entity.models.DiamondScytheModel;
import net.thekingskull01.tsotd.entity.models.DiamondSpearModel;


@Mod.EventBusSubscriber(modid = TSOTD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EntityLayerRegisterEvent {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){

        //Spears
        //event.registerLayerDefinition(ModModelLayers.WOODEN_SPEAR, SpearWithoutGuardModel::createLayer);
        //event.registerLayerDefinition(ModModelLayers.STONE_SPEAR, SpearWithoutGuardModel::createLayer);
        //event.registerLayerDefinition(ModModelLayers.IRON_SPEAR, SpearWithGuardModel::createLayer);
        //event.registerLayerDefinition(ModModelLayers.GOLD_SPEAR, SpearWithGuardModel::createLayer);
        event.registerLayerDefinition(ModModelLayers.DIAMOND_SPEAR_LAYER, DiamondSpearModel::createBodyLayer);
        //event.registerLayerDefinition(ModModelLayers.NETHERITE_SPEAR, SpearWithGuardModel::createLayer);

        //Scythes
        event.registerLayerDefinition(ModModelLayers.DIAMOND_SCYTHE_LAYER, DiamondScytheModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.RED_CRYSTAL_SCYTHE_LAYER, DiamondScytheModel::createBodyLayer);

    }
}
