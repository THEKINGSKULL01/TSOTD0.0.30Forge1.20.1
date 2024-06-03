package net.thekingskull01.tsotd.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.enchantment.ModEnchantments;
import net.thekingskull01.tsotd.enchantment.helper.LifeStealerEnchantmentHelper;
import net.thekingskull01.tsotd.enchantment.helper.ReacherEnchantmentHelper;
import net.thekingskull01.tsotd.item.ModItems;
import net.thekingskull01.tsotd.item.custom.HammerItem;
import net.thekingskull01.tsotd.villager.ModVillagers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Mod.EventBusSubscriber(modid = TSOTD.MOD_ID)
public class ModEvents {

    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if (mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer) {
            BlockPos initalBlockPos = event.getPos();
            if (HARVESTED_BLOCKS.contains(initalBlockPos)) {
                return;
            }

            for (BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initalBlockPos, serverPlayer)) {
                if (pos == initalBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                // Have to add them to a Set otherwise, the same code right here will get called for each block!
                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

    @SubscribeEvent
    public static void onEntityAttacked(LivingHurtEvent event) {
        if (event != null && event.getEntity() != null) {
            LifeStealerEnchantmentHelper.execute(event.getSource().getEntity());
        }
    }


    @SubscribeEvent
    public static void onEquipmentChange(LivingEquipmentChangeEvent event) {
        ReacherEnchantmentHelper.execute(event);
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.Takichirum_Maintainer.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            ItemStack stack = new ItemStack(ModBlocks.Dancing_Flower_Leaf.get(), 1);
            int villagerLevel = 1;


            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIRT, 32),
                    new ItemStack(Items.NETHERITE_SCRAP, 1), 10, 1, 0.005f
            ));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.STONE, 32),
                    new ItemStack(Items.NETHERITE_SCRAP, 1), 10, 20, 0.01f
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 32),
                    new ItemStack(Items.NETHERITE_SCRAP, 1), 10, 20, 0.015f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    new ItemStack(Items.NETHERITE_SCRAP, 1), 10, 50, 2f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.LIFE_STEALER.get(), 1)), 10, 50, 2f
            ));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 24),
                    new ItemStack(Items.NETHERITE_SCRAP, 8),
                    new ItemStack(ModBlocks.Dancing_Flower_Leaf.get(), 1), 10, 100, 1f
            ));
        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();
        ItemStack stack = new ItemStack(ModBlocks.Dancing_Flower_Leaf.get(), 1);
        int villagerLevel = 5;

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 48),
                new ItemStack(Items.NETHERITE_SCRAP, 1), 4, 25, 0.05f
        ));

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 48),
                new ItemStack(Items.NETHERITE_SCRAP, 16),
                new ItemStack(ModBlocks.Dancing_Flower_Leaf.get(), 1), 10, 15, 0.06f
        ));
    }
}


