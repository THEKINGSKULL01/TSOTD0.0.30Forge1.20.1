package net.thekingskull01.tsotd.enchantment.helper;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;

import java.util.UUID;

public class ReacherEnchantmentHelper {
    private static final AttributeModifier reachEnchantmentLv1 = new AttributeModifier(UUID.fromString("9964fc09-999f-47a5-bf38-76f714fb447c"), "reachEnchantmentLv1", 1, AttributeModifier.Operation.ADDITION);
    private static final AttributeModifier reachEnchantmentLv2 = new AttributeModifier(UUID.fromString("3b027877-2a5d-4ca2-bbbc-1dfff5386c12"), "reachEnchantmentLv2", 2, AttributeModifier.Operation.ADDITION);
    private static final AttributeModifier reachEnchantmentLv3 = new AttributeModifier(UUID.fromString("cc16cf93-9913-4026-8722-d5232c27bdee"), "reachEnchantmentLv3", 3, AttributeModifier.Operation.ADDITION);

    public static void execute(LivingEquipmentChangeEvent event) {
        if (event.getSlot().equals(EquipmentSlot.MAINHAND)) {
            final AttributeInstance attributeInstance = event.getEntity().getAttributes().getInstance(ForgeMod.BLOCK_REACH.get());

            if (attributeInstance != null && event.getTo().getEnchantmentTags().getAsString().contains("{id:\"tsotd:reacher\",lvl:1s}") && !attributeInstance.hasModifier(reachEnchantmentLv1)) {
                attributeInstance.addPermanentModifier(reachEnchantmentLv1);
            }

            if (attributeInstance != null && event.getFrom().getEnchantmentTags().getAsString().contains("{id:\"tsotd:reacher\",lvl:1s}") && attributeInstance.hasModifier(reachEnchantmentLv1)) {
                attributeInstance.removePermanentModifier(reachEnchantmentLv1.getId());
            }

            if (attributeInstance != null && event.getTo().getEnchantmentTags().getAsString().contains("{id:\"tsotd:reacher\",lvl:2s}") && !attributeInstance.hasModifier(reachEnchantmentLv2)) {
                attributeInstance.addPermanentModifier(reachEnchantmentLv2);
            }

            if (attributeInstance != null && event.getFrom().getEnchantmentTags().getAsString().contains("{id:\"tsotd:reacher\",lvl:2s}") && attributeInstance.hasModifier(reachEnchantmentLv2)) {
                attributeInstance.removePermanentModifier(reachEnchantmentLv2.getId());
            }

            if (attributeInstance != null && event.getTo().getEnchantmentTags().getAsString().contains("{id:\"tsotd:reacher\",lvl:3s}") && !attributeInstance.hasModifier(reachEnchantmentLv3)) {
                attributeInstance.addPermanentModifier(reachEnchantmentLv3);
            }

            if (attributeInstance != null && event.getFrom().getEnchantmentTags().getAsString().contains("{id:\"tsotd:reacher\",lvl:3s}") && attributeInstance.hasModifier(reachEnchantmentLv3)) {
                attributeInstance.removePermanentModifier(reachEnchantmentLv3.getId());
            }
        }
    }
}