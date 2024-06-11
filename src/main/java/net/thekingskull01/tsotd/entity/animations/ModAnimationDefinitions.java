package net.thekingskull01.tsotd.entity.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ModAnimationDefinitions {
        // Save this class in your mod and generate all required imports

        /**
         * Made with Blockbench 4.10.3
         * Exported for Minecraft version 1.19 or later with Mojang mappings
         * @author Author
         */
        public class SculvortModelAnimation {
                public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(4.0F)
                        .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(-16.3249F, -58.6003F, 73.6751F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.875F, KeyframeAnimations.degreeVec(163.6751F, -58.6003F, -106.3249F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2917F, KeyframeAnimations.degreeVec(135.0F, 0.0F, -90.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(252.2357F, 34.9753F, 17.7643F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.degreeVec(220.6251F, -16.2799F, -15.0963F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.9583F, KeyframeAnimations.degreeVec(224.672F, -20.5126F, -102.0221F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2083F, KeyframeAnimations.degreeVec(183.7784F, -18.4781F, -166.0558F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2083F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-174.004F, -74.8341F, 121.7459F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-215.8158F, 28.463F, 106.3921F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.625F, KeyframeAnimations.degreeVec(-25.4709F, -29.385F, 387.7399F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.6667F, KeyframeAnimations.degreeVec(-289.6066F, -43.6667F, 253.9959F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(-409.586F, -52.9737F, 446.8117F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal6", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.75F, KeyframeAnimations.posVec(0.5F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5417F, KeyframeAnimations.posVec(-1.0F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.posVec(0.5F, 1.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0417F, KeyframeAnimations.posVec(-1.0F, 1.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.7083F, KeyframeAnimations.posVec(-1.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(-265.6251F, -16.2799F, 375.0963F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal1", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.posVec(-0.25F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2917F, KeyframeAnimations.posVec(0.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(-0.25F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.4167F, KeyframeAnimations.posVec(0.25F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -180.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -180.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal2", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5833F, KeyframeAnimations.posVec(-0.25F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.4167F, KeyframeAnimations.posVec(0.5F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.125F, KeyframeAnimations.posVec(0.25F, -1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7083F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2083F, KeyframeAnimations.posVec(0.75F, 0.31F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5417F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(-112.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.degreeVec(-144.0216F, -61.7777F, 50.5144F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.1667F, KeyframeAnimations.degreeVec(-16.1353F, 1.464F, -97.3035F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.75F, KeyframeAnimations.degreeVec(13.0868F, -38.2047F, 25.2947F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal3", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7917F, KeyframeAnimations.posVec(0.25F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5833F, KeyframeAnimations.posVec(0.5F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.posVec(0.25F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.1667F, KeyframeAnimations.posVec(-0.5F, 0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.degreeVec(94.8969F, 5.2762F, -49.1209F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.3333F, KeyframeAnimations.degreeVec(88.5447F, 31.8167F, 110.99F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0417F, KeyframeAnimations.degreeVec(7.9547F, -54.2514F, -15.257F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.9167F, KeyframeAnimations.degreeVec(157.3964F, -76.3417F, 148.2746F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.degreeVec(-14.5451F, 60.5336F, 45.5924F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal4", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7917F, KeyframeAnimations.posVec(0.75F, -1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(-0.5F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.posVec(0.75F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.3333F, KeyframeAnimations.posVec(0.0F, 1.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-97.0305F, -38.9763F, 5.2622F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.4583F, KeyframeAnimations.degreeVec(-5.8977F, 52.429F, -86.7465F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.3333F, KeyframeAnimations.degreeVec(247.1207F, 40.9223F, 250.5633F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.6667F, KeyframeAnimations.degreeVec(84.9919F, 15.6076F, 11.351F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal5", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7917F, KeyframeAnimations.posVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(-0.25F, 0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.posVec(0.25F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0833F, KeyframeAnimations.posVec(0.75F, 1.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .build();

                public static final AnimationDefinition walking = AnimationDefinition.Builder.withLength(4.0F).looping()
                        .addAnimation("frleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.75F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.75F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.75F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.75F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("frleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("brleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.2917F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.75F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2917F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.75F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7917F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.25F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("brleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.4583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("fleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.7917F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7917F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2917F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.75F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("fleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.4583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("blleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7083F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.7917F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7083F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.7917F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("blleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .build();

                public static final AnimationDefinition attack = AnimationDefinition.Builder.withLength(4.0F).looping()
                        .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(-16.3249F, -58.6003F, 73.6751F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.875F, KeyframeAnimations.degreeVec(163.6751F, -58.6003F, -106.3249F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2917F, KeyframeAnimations.degreeVec(135.0F, 0.0F, -90.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(252.2357F, 34.9753F, 17.7643F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.degreeVec(220.6251F, -16.2799F, -15.0963F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.9583F, KeyframeAnimations.degreeVec(224.672F, -20.5126F, -102.0221F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2083F, KeyframeAnimations.degreeVec(183.7784F, -18.4781F, -166.0558F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2083F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-174.004F, -74.8341F, 121.7459F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-215.8158F, 28.463F, 106.3921F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.625F, KeyframeAnimations.degreeVec(-25.4709F, -29.385F, 387.7399F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.6667F, KeyframeAnimations.degreeVec(-289.6066F, -43.6667F, 253.9959F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(-409.586F, -52.9737F, 446.8117F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal6", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(-265.6251F, -16.2799F, 375.0963F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal1", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -180.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -180.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal2", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5417F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(-112.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.degreeVec(-144.0216F, -61.7777F, 50.5144F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.1667F, KeyframeAnimations.degreeVec(-16.1353F, 1.464F, -97.3035F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.75F, KeyframeAnimations.degreeVec(13.0868F, -38.2047F, 25.2947F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal3", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.degreeVec(94.8969F, 5.2762F, -49.1209F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.3333F, KeyframeAnimations.degreeVec(88.5447F, 31.8167F, 110.99F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0417F, KeyframeAnimations.degreeVec(7.9547F, -54.2514F, -15.257F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.9167F, KeyframeAnimations.degreeVec(157.3964F, -76.3417F, 148.2746F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.degreeVec(-14.5451F, 60.5336F, 45.5924F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal4", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-97.0305F, -38.9763F, 5.2622F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.4583F, KeyframeAnimations.degreeVec(-5.8977F, 52.429F, -86.7465F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.3333F, KeyframeAnimations.degreeVec(247.1207F, 40.9223F, 250.5633F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.6667F, KeyframeAnimations.degreeVec(84.9919F, 15.6076F, 11.351F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("crystal5", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .build();
        }

        public class FeathdaModelAnimation {
                public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(6.0F).looping()
                        .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.7083F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.degreeVec(22.5F, -22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.degreeVec(21.1022F, -10.8868F, 4.8384F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.degreeVec(21.8064F, -17.8686F, 2.0083F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.degreeVec(21.1022F, -10.8868F, 4.8384F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("rightear", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.posVec(-0.5F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.posVec(-0.25F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.posVec(-0.5F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.posVec(-0.25F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftear", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.degreeVec(22.5F, 22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.degreeVec(22.6746F, 6.9262F, 2.8842F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftear", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.posVec(0.25F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("rightwing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 35.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("rightwing", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.posVec(-0.75F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.posVec(-0.25F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftwing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -35.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftwing", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.posVec(0.75F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.posVec(0.25F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("neckfluff1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.4167F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("neckfluff1", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("neckfluff1", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.4167F, KeyframeAnimations.scaleVec(1.0F, 1.8F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.7917F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("neckfluff2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("neckfluff2", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("neckfluff2", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.scaleVec(1.0F, 1.9F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("righttail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, -22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("righttail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.posVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("lefttail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.8333F, KeyframeAnimations.degreeVec(0.0F, 22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("lefttail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.8333F, KeyframeAnimations.posVec(1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("middletail", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("middletail", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 2.25F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("middletail", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.scaleVec(1.9F, 1.2F, 1.3F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.7083F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.degreeVec(22.5F, -22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.degreeVec(21.1022F, -10.8868F, 4.8384F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.degreeVec(21.8064F, -17.8686F, 2.0083F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.degreeVec(21.1022F, -10.8868F, 4.8384F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.posVec(-0.5F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.posVec(-0.25F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.posVec(-0.5F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.posVec(-0.25F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.degreeVec(22.5F, 22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.degreeVec(22.6746F, 6.9262F, 2.8842F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.9167F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.875F, KeyframeAnimations.posVec(0.25F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4167F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.4167F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.4167F, KeyframeAnimations.scaleVec(1.0F, 1.8F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.7917F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.2083F, KeyframeAnimations.scaleVec(1.0F, 1.9F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 35.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.posVec(-0.75F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.posVec(-0.25F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -35.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.2083F, KeyframeAnimations.posVec(0.75F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.4583F, KeyframeAnimations.posVec(0.25F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(4.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, -22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.1667F, KeyframeAnimations.posVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.8333F, KeyframeAnimations.degreeVec(0.0F, 22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.8333F, KeyframeAnimations.posVec(1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.5833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 2.25F, 0.25F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.9167F, KeyframeAnimations.scaleVec(1.9F, 1.2F, 1.3F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(3.375F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .build();

                public static final AnimationDefinition walking = AnimationDefinition.Builder.withLength(2.0F).looping()
                        .addAnimation("rightleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("rightleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.25F, -1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.25F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftleg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.25F, -1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.25F, -1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.25F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.25F, -1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .build();

                public static final AnimationDefinition sit = AnimationDefinition.Builder.withLength(2.0F).looping()
                        .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -2.5F, -0.75F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("rightleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("rightleg", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 0.2F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftleg", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("leftleg", new AnimationChannel(AnimationChannel.Targets.SCALE,
                                new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 0.2F, 1.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .addAnimation("undefined", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -2.5F, -1.0F), AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                        ))
                        .build();
        }

}
