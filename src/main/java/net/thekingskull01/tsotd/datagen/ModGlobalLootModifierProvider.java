package net.thekingskull01.tsotd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.enchantment.ModEnchantments;
import net.thekingskull01.tsotd.item.ModItems;
import net.thekingskull01.tsotd.loot.AddItemModifer;

import java.util.Iterator;
import java.util.List;

import static net.minecraft.world.item.enchantment.EnchantmentHelper.selectEnchantment;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, TSOTD.MOD_ID);
    }



    @Override
    protected void start() {

        //Block to Item
        add("takichirum_seeds_from_dancing_flower_leaf", new AddItemModifer(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.Dancing_Flower_Leaf.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()}, ModItems.Takichirum_Seeds.get()));


        //Chest enchantments

        add("lifestealer_enchantment_from_desert_pyramid", new AddItemModifer(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()},
                new ItemStack(EnchantedBookItem.createForEnchantment(
                        new EnchantmentInstance(ModEnchantments.LIFE_STEALER.get(), 1)).getItem()).getItem()));

        add("lifestealer_enchantment_from_jungle_temple", new AddItemModifer(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build()},
                new ItemStack(EnchantedBookItem.createForEnchantment(
                        new EnchantmentInstance(ModEnchantments.LIFE_STEALER.get(), 1)).getItem()).getItem()));
    }




    //private static ItemStack lifeStealer() {
    //    ItemStack lifeStealer = new ItemStack(EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.LIFE_STEALER.get(), 1)));
//
    //    return lifeStealer;
    //}

    //public static ItemStack enchantItem(RandomSource pRandom, ItemStack pStack, int pLevel, boolean pAllowTreasure) {
    //    List<EnchantmentInstance> list = selectEnchantment(pRandom, pStack, pLevel, pAllowTreasure);
    //    boolean flag = pStack.is(Items.BOOK);
    //    if (flag) {
    //        pStack = new ItemStack(Items.ENCHANTED_BOOK);
    //    }
//
    //    Iterator var6 = list.iterator();
//
    //    while(var6.hasNext()) {
    //        EnchantmentInstance enchantmentinstance = (EnchantmentInstance)var6.next();
    //        if (flag) {
    //            EnchantedBookItem.addEnchantment(pStack, enchantmentinstance);
    //        } else {
    //            pStack.enchant(enchantmentinstance.enchantment, enchantmentinstance.level);
    //        }
    //    }
//
    //    return pStack;
    //}



}

