package net.thekingskull01.tsotd.entity.client.spear;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.entity.custom.entities.DiamondSpearProjectileEntity;
import net.thekingskull01.tsotd.entity.layers.ModModelLayers;
import net.thekingskull01.tsotd.entity.models.DiamondSpearModel;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class DiamondSpearRenderer extends EntityRenderer<DiamondSpearProjectileEntity>{
    private final DiamondSpearModel model;
    public DiamondSpearRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.model = new DiamondSpearModel(pContext.bakeLayer(ModModelLayers.DIAMOND_SPEAR_LAYER));
    }

    @Override
    public void render(DiamondSpearProjectileEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.yRotO, pEntity.getYRot()) - 0.0F));
        pMatrixStack.mulPose(Axis.XP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.xRotO, pEntity.getXRot()) + 225.0F));
        VertexConsumer $$6 = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(pEntity)), false, false);
        this.model.renderToBuffer(pMatrixStack, $$6, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull DiamondSpearProjectileEntity diamondSpearProjectileEntity) {
        return new ResourceLocation(TSOTD.MOD_ID, "textures/item/spears/diamond_spear.png");
    }
}