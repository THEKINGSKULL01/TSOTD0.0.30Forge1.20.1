package net.thekingskull01.tsotd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
import net.thekingskull01.tsotd.loot.AddEnchantedItemModifier;
import net.thekingskull01.tsotd.loot.AddItemModifer;

import java.util.List;
import java.util.Set;


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



        //Jungle Chests

        this.add("enchanted_item_from_jungle_temple1", new AddEnchantedItemModifier(new LootItemCondition[]
                { new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                        LootItemRandomChanceCondition.randomChance(0.2f).build()},
                Items.ENCHANTED_BOOK, ModEnchantments.LIFE_STEALER.get(), 1));

        this.add("enchanted_item_from_jungle_temple2", new AddEnchantedItemModifier(new LootItemCondition[]
                { new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                        LootItemRandomChanceCondition.randomChance(0.15f).build() },
                Items.ENCHANTED_BOOK, ModEnchantments.LIFE_STEALER.get(), 2));

        this.add("enchanted_item_from_jungle_temple3", new AddEnchantedItemModifier(new LootItemCondition[]
                { new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                        LootItemRandomChanceCondition.randomChance(0.1f).build() },
                Items.ENCHANTED_BOOK, ModEnchantments.LIFE_STEALER.get(), 3));

        //Desert Chests

        this.add("enchanted_item_from_desert_pyramid1", new AddEnchantedItemModifier(new LootItemCondition[]
                { new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() },
                Items.ENCHANTED_BOOK, ModEnchantments.LIFE_STEALER.get(), 1));

        this.add("enchanted_item_from_desert_pyramid2", new AddEnchantedItemModifier(new LootItemCondition[]
                { new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                        LootItemRandomChanceCondition.randomChance(0.2f).build() },
                Items.ENCHANTED_BOOK, ModEnchantments.LIFE_STEALER.get(), 2));

        this.add("enchanted_item_from_desert_pyramid3", new AddEnchantedItemModifier(new LootItemCondition[]
                { new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                        LootItemRandomChanceCondition.randomChance(0.15f).build() },
                Items.ENCHANTED_BOOK, ModEnchantments.LIFE_STEALER.get(), 3));

    }

}

