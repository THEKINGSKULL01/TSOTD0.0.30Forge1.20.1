package net.thekingskull01.event;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.enchantment.helper.LifeStealerEnchantmentHelper;
import net.thekingskull01.tsotd.enchantment.helper.ReacherEnchantmentHelper;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(modid = TSOTD.MOD_ID)
public class ModEvents {

    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();
    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();



    }
    @SubscribeEvent
    public static void onEntityAttacked( LivingHurtEvent event) {
        if (event != null && event.getEntity() != null) {
            LifeStealerEnchantmentHelper.execute(event.getSource().getEntity());
        }
    }

    @SubscribeEvent
    public static void onEquipmentChange(LivingEquipmentChangeEvent event) {
        ReacherEnchantmentHelper.execute(event);
    }



}
