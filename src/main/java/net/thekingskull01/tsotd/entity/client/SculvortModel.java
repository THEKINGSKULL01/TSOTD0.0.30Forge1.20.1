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
import net.thekingskull01.tsotd.entity.custom.SculvortEntity;

public class SculvortModel<T extends SculvortEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart sculvort;
	private final ModelPart head;

	public SculvortModel(ModelPart root) {
		this.sculvort = root.getChild("sculvort");
		this.head = sculvort.getChild("body").getChild("torso").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition sculvort = partdefinition.addOrReplaceChild("sculvort", CubeListBuilder.create(), PartPose.offset(3.0F, 24.0F, -3.0F));

		PartDefinition body = sculvort.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-3.0F, -9.25F, 3.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 5).addBox(-3.0F, 5.25F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, 6.5F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -3.75F, -1.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r3 = torso.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -7.25F, -1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r4 = torso.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.25F, -2.0F, -1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r5 = torso.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 3.75F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r6 = torso.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, -6.5F, -1.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r7 = torso.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.25F, 2.0F, -1.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.1464F, 0.0429F, 0.1464F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 1).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1867F, 0.5537F, -0.1945F));

		PartDefinition crystals = body.addOrReplaceChild("crystals", CubeListBuilder.create(), PartPose.offset(0.0F, 9.25F, 0.0F));

		PartDefinition crystal1 = crystals.addOrReplaceChild("crystal1", CubeListBuilder.create(), PartPose.offset(-1.7881F, -12.182F, -0.1896F));

		PartDefinition cube_r9 = crystal1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 1).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6395F, -1.0799F, -2.4063F));

		PartDefinition crystal2 = crystals.addOrReplaceChild("crystal2", CubeListBuilder.create(), PartPose.offset(1.4619F, -12.182F, 0.8104F));

		PartDefinition cube_r10 = crystal2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8368F, 0.6199F, 2.3033F));

		PartDefinition crystal3 = crystals.addOrReplaceChild("crystal3", CubeListBuilder.create(), PartPose.offset(3.4619F, -9.182F, -0.1896F));

		PartDefinition cube_r11 = crystal3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6577F, 0.6193F, -0.2207F));

		PartDefinition crystal4 = crystals.addOrReplaceChild("crystal4", CubeListBuilder.create(), PartPose.offset(1.4619F, -6.182F, 0.8104F));

		PartDefinition cube_r12 = crystal4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 1).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0266F, -0.1906F, -0.5716F));

		PartDefinition crystal5 = crystals.addOrReplaceChild("crystal5", CubeListBuilder.create(), PartPose.offset(-1.7881F, -6.182F, -0.1896F));

		PartDefinition cube_r13 = crystal5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.1599F, -0.3482F, -2.9364F));

		PartDefinition crystal6 = crystals.addOrReplaceChild("crystal6", CubeListBuilder.create(), PartPose.offset(-3.0381F, -9.182F, 0.8104F));

		PartDefinition cube_r14 = crystal6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1863F, 0.3677F, -2.0365F));

		PartDefinition frleg = body.addOrReplaceChild("frleg", CubeListBuilder.create().texOffs(16, 4).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 7.75F, -3.0F));

		PartDefinition fleg = body.addOrReplaceChild("fleg", CubeListBuilder.create().texOffs(16, 4).mirror().addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 7.4815F, -2.9979F));

		PartDefinition brleg = body.addOrReplaceChild("brleg", CubeListBuilder.create().texOffs(16, 4).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 7.5F, 3.0F));

		PartDefinition blleg = body.addOrReplaceChild("blleg", CubeListBuilder.create().texOffs(16, 4).mirror().addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 7.75F, 3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(SculvortEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.SculvortModelAnimation.walking, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.SculvortModelAnimation.idle, ageInTicks, 1f);
		this.animate(entity.attackAnimationState, ModAnimationDefinitions.SculvortModelAnimation.attack, ageInTicks, 1f);
	}

	private void applyHeadRotation(SculvortEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		sculvort.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return sculvort;
	}
}