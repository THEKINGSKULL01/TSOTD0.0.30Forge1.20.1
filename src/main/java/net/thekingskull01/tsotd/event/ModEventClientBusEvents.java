package net.thekingskull01.tsotd.event;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.entity.ModBlockEntitys;
import net.thekingskull01.tsotd.block.entity.renderer.TakichirumWorkbenchBERenderer;
import net.thekingskull01.tsotd.particle.ModParticles;
import net.thekingskull01.tsotd.particle.TakichirumParticles;

@Mod.EventBusSubscriber(modid = TSOTD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void  registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.Takichirum_Particles.get(), TakichirumParticles.Provider::new);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntitys.TAKICHIRUM_WORKBENCH_BE.get(),
                TakichirumWorkbenchBERenderer::new);
    }

}
