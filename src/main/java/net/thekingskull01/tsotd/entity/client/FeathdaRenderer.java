package net.thekingskull01.tsotd.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.custom.FeathdaEntity;
import net.thekingskull01.tsotd.entity.custom.SculvortEntity;
import net.thekingskull01.tsotd.entity.layers.ModModelLayers;

public class FeathdaRenderer extends MobRenderer<FeathdaEntity, FeathdaModel<FeathdaEntity>> {
    private static final ResourceLocation FEATHDA_LOCATION = new ResourceLocation(TSOTD.MOD_ID, "textures/entity/feathda_ver1.png");

    public FeathdaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FeathdaModel<>(pContext.bakeLayer(ModModelLayers.FEATHDA_LAYER)), 1.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(FeathdaEntity feathdaEntity) {
        return FEATHDA_LOCATION;
    }

    @Override
    public void render(FeathdaEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.scale(3f, 3f, 3f);
        if (pEntity.isBaby()){
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
