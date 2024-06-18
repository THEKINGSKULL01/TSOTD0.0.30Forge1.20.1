package net.thekingskull01.tsotd.entity.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class DiamondSpearModel extends Model {
    private final ModelPart diamond_spear;

    public DiamondSpearModel(ModelPart root) {
        super(RenderType::entitySolid);
        this.diamond_spear = root.getChild("diamond_spear");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition diamond_spear = partdefinition.addOrReplaceChild("diamond_spear", CubeListBuilder.create().texOffs(28, 30).addBox(-1.0F, 7.0F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, 7.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, 7.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, 6.0F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 30).addBox(-1.0F, 6.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, 6.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, 5.0F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, 5.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, 5.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, 5.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(-1.0F, 4.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, 4.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, 4.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 30).addBox(-1.0F, 3.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, 3.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, 3.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(-1.0F, 2.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, 2.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, 2.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 30).addBox(-1.0F, 1.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, 1.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, 1.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(-1.0F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, 0.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 30).addBox(-1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, -1.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 28).addBox(-1.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 28).addBox(-1.0F, -3.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 28).addBox(-1.0F, -3.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 28).addBox(-1.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 28).addBox(-1.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 28).addBox(-1.0F, -4.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 28).addBox(-1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(-1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 28).addBox(-1.0F, -5.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 30).addBox(-1.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, -6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 30).addBox(-1.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 28).addBox(-1.0F, -8.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 28).addBox(-1.0F, -9.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 28).addBox(-1.0F, -9.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 28).addBox(-1.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 28).addBox(-1.0F, -10.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 28).addBox(-1.0F, -10.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 28).addBox(-1.0F, -10.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(-1.0F, -11.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 28).addBox(-1.0F, -11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(-1.0F, -11.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 30).addBox(-1.0F, -12.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 30).addBox(-1.0F, -12.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -12.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -12.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -12.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -11.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -11.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -10.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -10.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -9.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -9.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -10.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -11.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -13.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -13.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 30).addBox(-1.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -13.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-1.0F, -14.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -14.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -14.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-1.0F, -15.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -15.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -16.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-1.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -15.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -15.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-1.0F, -14.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 30).addBox(-1.0F, -14.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 26).addBox(-1.0F, -14.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -14.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 26).addBox(-1.0F, -15.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-1.0F, -15.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 26).addBox(-1.0F, -15.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -15.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 26).addBox(-1.0F, -16.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 26).addBox(-1.0F, -16.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 26).addBox(-1.0F, -16.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -16.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -16.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-1.0F, -17.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -17.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 26).addBox(-1.0F, -17.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 26).addBox(-1.0F, -17.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -17.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -18.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-1.0F, -18.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 26).addBox(-1.0F, -18.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -18.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 26).addBox(-1.0F, -19.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -19.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -19.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -19.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 26).addBox(-1.0F, -20.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -20.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -21.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 30).addBox(-1.0F, -21.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 30).addBox(-1.0F, -20.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }


    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        diamond_spear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
