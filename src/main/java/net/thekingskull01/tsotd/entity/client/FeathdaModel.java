package net.thekingskull01.tsotd.entity.client;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.thekingskull01.tsotd.entity.animations.ModAnimationDefinitions;
import net.thekingskull01.tsotd.entity.custom.FeathdaEntity;

public class FeathdaModel<T extends FeathdaEntity> extends HierarchicalModel<T> {
		// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
		private final ModelPart feathda;
		private final ModelPart head;

	public FeathdaModel(ModelPart root) {
		this.feathda = root.getChild("feathda");
		this.head = feathda.getChild("body").getChild("torso").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition feathda = partdefinition.addOrReplaceChild("feathda", CubeListBuilder.create(), PartPose.offset(0.0F, 20.9167F, -2.375F));

		PartDefinition body = feathda.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(23, 14).addBox(-2.0F, -6.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 12).addBox(-2.0F, -4.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(19, 12).addBox(-2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 11).addBox(-1.0F, -4.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(17, 11).addBox(-1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(17, 11).addBox(-1.0F, -6.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(19, 8).addBox(-1.0F, -7.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 11).addBox(0.0F, -4.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(17, 11).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(17, 11).addBox(0.0F, -6.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(19, 8).addBox(0.0F, -7.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 12).addBox(1.0F, -4.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(19, 12).addBox(1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(23, 14).addBox(1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0833F, 2.375F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(19, 8).addBox(-0.9949F, 0.6292F, -1.9397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(26, 3).addBox(-0.9949F, -0.3708F, -1.9397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 6).addBox(-0.4949F, 0.8792F, -2.6897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 8).addBox(0.0051F, 0.6292F, -1.9397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 3).addBox(0.0051F, -0.3708F, -1.9397F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0051F, -8.1292F, -4.0603F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 7).addBox(0.1124F, -0.3355F, -0.5198F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.6953F, -1.16F, 0.7003F, 0.77F, -0.7896F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 7).addBox(-0.0895F, -0.3215F, -0.5133F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.6953F, -1.16F, 0.7003F, -0.77F, 0.7896F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 5).addBox(0.1124F, -0.3355F, -0.5198F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.6953F, -0.41F, 0.3408F, 0.392F, -0.992F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 5).addBox(-0.0895F, -0.3215F, -0.5133F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.6953F, -0.41F, 0.3408F, -0.392F, 0.992F));

		PartDefinition rightear = head.addOrReplaceChild("rightear", CubeListBuilder.create(), PartPose.offset(-1.1453F, -0.241F, 1.1603F));

		PartDefinition cube_r5 = rightear.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0667F, -0.5667F, 0.3F, 0.1741F, -0.1321F, 1.0356F));

		PartDefinition cube_r6 = rightear.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(4, 2).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1833F, 0.6583F, 0.3F, 0.2182F, 0.0F, 0.3927F));

		PartDefinition cube_r7 = rightear.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 1).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1167F, -0.0917F, -0.6F, 0.2182F, 0.0F, 0.3927F));

		PartDefinition leftear = head.addOrReplaceChild("leftear", CubeListBuilder.create(), PartPose.offset(1.1306F, -0.266F, 1.2901F));

		PartDefinition cube_r8 = leftear.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, -0.4667F, -0.2298F, 0.1741F, 0.1321F, -1.0356F));

		PartDefinition cube_r9 = leftear.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2081F, 0.7333F, -0.0048F, 0.2182F, 0.0F, -0.3927F));

		PartDefinition cube_r10 = leftear.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 1).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0669F, 0.0333F, -1.2298F, 0.2182F, 0.0F, -0.3927F));

		PartDefinition neckfluff1 = head.addOrReplaceChild("neckfluff1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neckfluff1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1137F, -0.4077F, 1.5603F, 0.1741F, 0.1321F, -1.0356F));

		PartDefinition cube_r12 = neckfluff1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(3, 16).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0786F, -0.4827F, 2.0603F, 0.1741F, -0.1321F, 1.0356F));

		PartDefinition neckfluff2 = head.addOrReplaceChild("neckfluff2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neckfluff2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 12).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1137F, 0.2673F, 1.5603F, 0.1741F, 0.1321F, -1.0356F));

		PartDefinition cube_r14 = neckfluff2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 12).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0786F, 0.1923F, 2.0603F, 0.1741F, -0.1321F, 1.0356F));

		PartDefinition rightwing = torso.addOrReplaceChild("rightwing", CubeListBuilder.create().texOffs(4, -1).addBox(-0.1125F, -1.0812F, -2.25F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(6, -5).addBox(-0.1125F, -0.0812F, -3.25F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(6, -6).addBox(-0.1125F, 0.9188F, -2.25F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3108F, -4.9938F, -0.75F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r15 = rightwing.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(4, -2).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3375F, -1.2562F, 0.75F, 0.0F, 0.0F, 1.1781F));

		PartDefinition leftwing = torso.addOrReplaceChild("leftwing", CubeListBuilder.create().texOffs(0, -6).addBox(0.1125F, 0.9188F, -2.25F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, -5).addBox(0.1125F, -0.0812F, -3.25F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, -1).addBox(0.1125F, -1.0812F, -2.25F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3108F, -4.9938F, -0.75F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r16 = leftwing.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, -2).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3375F, -1.2562F, 0.75F, 0.0F, 0.0F, -1.1781F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -3.8869F, 4.0F));

		PartDefinition righttail1 = tail.addOrReplaceChild("righttail1", CubeListBuilder.create(), PartPose.offset(-0.9962F, -0.125F, -0.25F));

		PartDefinition cube_r17 = righttail1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(6, 3).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3788F, 0.9119F, -4.75F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r18 = righttail1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 5).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0038F, 0.0119F, -4.75F, 0.0F, 0.0F, 0.3927F));

		PartDefinition lefttail2 = tail.addOrReplaceChild("lefttail2", CubeListBuilder.create(), PartPose.offset(0.9962F, -0.125F, -0.25F));

		PartDefinition cube_r19 = lefttail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1875F, 0.45F, -1.25F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r20 = lefttail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1875F, -0.45F, -1.25F, 0.0F, 0.0F, -0.3927F));

		PartDefinition middletail = tail.addOrReplaceChild("middletail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1259F, -0.4323F));

		PartDefinition cube_r21 = middletail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0119F, -5.25F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r22 = middletail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 4).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.9119F, -5.25F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r23 = middletail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(6, 6).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1913F, -0.45F, -1.75F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r24 = middletail.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1837F, 0.45F, -1.75F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rightleg = body.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(3, 13).addBox(-0.5F, 0.7F, 0.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-0.5F, -2.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-0.5F, -1.25F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(-0.5F, 0.75F, -1.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(-0.5F, 0.75F, 1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(-1.5F, 0.75F, -0.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 2.3833F, -0.025F));

		PartDefinition leftleg = body.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.7F, 0.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-0.5F, -2.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-0.5F, -1.25F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(-1.5F, 0.75F, -0.6F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(-0.5F, 0.75F, -1.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 0).addBox(-0.5F, 0.75F, 1.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 2.3833F, -0.025F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}


		@Override
	public void setupAnim(FeathdaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animateWalk(ModAnimationDefinitions.FeathdaModelAnimation.walking, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.FeathdaModelAnimation.idle, ageInTicks, 1f);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);
		this.animate(entity.sitAnimationState, ModAnimationDefinitions.FeathdaModelAnimation.sit, ageInTicks, 1f);
	}

	private void applyHeadRotation(FeathdaEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		feathda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return feathda;
	}
}