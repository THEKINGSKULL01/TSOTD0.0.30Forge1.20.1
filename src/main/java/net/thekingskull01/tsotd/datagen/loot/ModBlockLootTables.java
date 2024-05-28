package net.thekingskull01.tsotd.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {


    public ModBlockLootTables() {super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        //Blocks

        this.dropSelf(ModBlocks.Coal_Crystal_Block.get());
        this.dropSelf(ModBlocks.Dark_Crystal_Block.get());
        this.dropSelf(ModBlocks.Light_Crystal_Block.get());

        //Stairs

        this.dropSelf(ModBlocks.Coal_Crystal_Stairs.get());
        this.dropSelf(ModBlocks.Dark_Crystal_Stairs.get());
        this.dropSelf(ModBlocks.Light_Crystal_Stairs.get());

        //Slabs

        this.add(ModBlocks.Coal_Crystal_Slab.get(),
                block -> createSlabItemTable(ModBlocks.Coal_Crystal_Slab.get()));
        this.add(ModBlocks.Dark_Crystal_Slab.get(),
                block -> createSlabItemTable(ModBlocks.Dark_Crystal_Slab.get()));
        this.add(ModBlocks.Light_Crystal_Slab.get(),
                block -> createSlabItemTable(ModBlocks.Light_Crystal_Slab.get()));

        //Buttons

        this.dropSelf(ModBlocks.Coal_Crystal_Button.get());
        this.dropSelf(ModBlocks.Dark_Crystal_Button.get());
        this.dropSelf(ModBlocks.Light_Crystal_Button.get());

        //PressurePlates

        this.dropSelf(ModBlocks.Coal_Crystal_Pressure_Plate.get());
        this.dropSelf(ModBlocks.Dark_Crystal_Pressure_Plate.get());
        this.dropSelf(ModBlocks.Light_Crystal_Pressure_Plate.get());

        //Ores

        this.add(ModBlocks.Coal_Crystal_Ore.get(),
                block -> createCrystalCoalOreDrops(ModBlocks.Coal_Crystal_Ore.get(), ModItems.Crystallized_Coal.get()));
        this.add(ModBlocks.Dark_Crystal_Ore.get(),
                block -> createOreDrop1(ModBlocks.Dark_Crystal_Ore.get(), ModItems.Dark_Crystal.get()));
        this.add(ModBlocks.Light_Crystal_Ore.get(),
                block -> createOreDrop1(ModBlocks.Dark_Crystal_Ore.get(), ModItems.Dark_Crystal.get()));

    }

    protected LootTable.Builder createCrystalCoalOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock, (LootPoolEntryContainer.Builder)
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(Items.RAW_COPPER)
                                .apply(SetItemCountFunction.setCount(UniformGenerator
                                        .between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createOreDrop1(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock, (LootPoolEntryContainer.Builder)
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem)
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

