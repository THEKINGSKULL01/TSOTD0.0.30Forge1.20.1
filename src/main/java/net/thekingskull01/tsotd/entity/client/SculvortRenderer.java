package net.thekingskull01.tsotd.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.custom.SculvortEntity;
import net.thekingskull01.tsotd.entity.layers.ModModelLayers;

public class SculvortRenderer extends MobRenderer<SculvortEntity, SculvortModel<SculvortEntity>> {
    private static final ResourceLocation SCULVORT_LOCATION = new ResourceLocation(TSOTD.MOD_ID, "textures/entity/sculvort.png");

    public SculvortRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SculvortModel<>(pContext.bakeLayer(ModModelLayers.SCULVORT_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(SculvortEntity sculvortEntity) {
        return SCULVORT_LOCATION;
    }

    @Override
    public void render(SculvortEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()){
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
