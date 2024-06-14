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
public class DiamondScytheModel extends Model {
    private final ModelPart scythe;

    public DiamondScytheModel(ModelPart root) {
        super(RenderType::entitySolid);
        this.scythe = root;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(28, 30).addBox(-1.0F, -1.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -2.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 30).addBox(-1.0F, -2.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 30).addBox(-1.0F, -2.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 30).addBox(-1.0F, -3.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 30).addBox(-1.0F, -3.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 30).addBox(-1.0F, -3.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -3.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 30).addBox(-1.0F, -4.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -4.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -4.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 30).addBox(-1.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 30).addBox(-1.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-1.0F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 28).addBox(-1.0F, -7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(-1.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-1.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 28).addBox(-1.0F, -8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(-1.0F, -8.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-1.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 30).addBox(-1.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(-1.0F, -9.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 30).addBox(-1.0F, -10.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -10.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -10.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 30).addBox(-1.0F, -11.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -11.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 30).addBox(-1.0F, -12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-1.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 28).addBox(-1.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(-1.0F, -13.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-1.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 28).addBox(-1.0F, -14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(-1.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-1.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 30).addBox(-1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(-1.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -15.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 30).addBox(-1.0F, -16.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -16.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 30).addBox(-1.0F, -17.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -17.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -17.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 30).addBox(-1.0F, -18.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -18.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -18.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 30).addBox(-1.0F, -19.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -19.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -19.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 30).addBox(-1.0F, -20.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -20.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -19.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -19.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 30).addBox(-1.0F, -19.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -19.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -19.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -20.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -17.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -18.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -17.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -16.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -15.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -14.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -13.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -12.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -11.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -12.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -13.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -14.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -15.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -16.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -17.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -18.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -21.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -22.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -22.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -23.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -23.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -25.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -25.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -25.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -25.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -23.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -23.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -23.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -22.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -25.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -26.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -27.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -28.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -28.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -29.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -29.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -29.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -29.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -30.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -30.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -30.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -29.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -29.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -29.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -28.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -28.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -27.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -27.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -26.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -25.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -24.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -23.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -22.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -21.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 30).addBox(-1.0F, -20.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -20.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -14.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -13.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -15.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -15.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-1.0F, -16.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -15.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -16.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 30).addBox(-1.0F, -16.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 30).addBox(-1.0F, -17.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -17.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -18.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 30).addBox(-1.0F, -18.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -20.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -20.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -20.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -21.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -21.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -21.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -21.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -22.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -22.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -22.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -22.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -22.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -23.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -23.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -23.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -23.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -23.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -23.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -23.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -24.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -24.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -24.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -24.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -24.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(-1.0F, -24.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -24.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(-1.0F, -24.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -25.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -25.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -25.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 26).addBox(-1.0F, -25.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 22).addBox(-1.0F, -25.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(-1.0F, -25.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-1.0F, -25.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -25.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -25.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -25.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-1.0F, -26.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-1.0F, -26.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(-1.0F, -26.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(-1.0F, -26.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 22).addBox(-1.0F, -26.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 22).addBox(-1.0F, -26.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -26.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-1.0F, -26.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -26.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -26.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -26.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -26.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -26.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -26.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).addBox(-1.0F, -26.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).addBox(-1.0F, -26.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -26.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -25.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -24.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -24.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 24).addBox(-1.0F, -25.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -25.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -25.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -25.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -27.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(-1.0F, -27.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).addBox(-1.0F, -27.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).addBox(-1.0F, -27.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).addBox(-1.0F, -27.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(-1.0F, -27.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -27.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -27.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(-1.0F, -27.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(-1.0F, -27.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-1.0F, -27.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-1.0F, -27.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-1.0F, -27.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(-1.0F, -27.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-1.0F, -28.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -28.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -28.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -28.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(-1.0F, -28.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(-1.0F, -28.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -28.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -28.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -28.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -28.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -29.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -29.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(-1.0F, -29.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 30).addBox(-1.0F, -23.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-1.0F, -25.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 16).addBox(-1.0F, -26.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 16).addBox(-1.0F, -26.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 18).addBox(-1.0F, -26.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 20).addBox(-1.0F, -25.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 20).addBox(-1.0F, -24.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 12).addBox(-1.0F, -24.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 14).addBox(-1.0F, -24.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 8).addBox(-1.0F, -25.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 10).addBox(-1.0F, -25.0F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }



    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        scythe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}