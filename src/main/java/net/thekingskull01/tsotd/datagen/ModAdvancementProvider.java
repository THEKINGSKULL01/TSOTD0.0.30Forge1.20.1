package net.thekingskull01.tsotd.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {


        Advancement rootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.Crystallized_Coal.get()),
                        Component.literal("Getting started"), Component.literal("Why is this shiny? AND HOT! OUCH!"),
                        new ResourceLocation(TSOTD.MOD_ID, "textures/block/takichirum_block.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_crystalized_coal", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Crystallized_Coal.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "crystalized_coal"), existingFileHelper);

        Advancement darkCrystalDetector = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.Dark_Crystal_Detector.get()),
                        Component.literal("Searching the Darkness"), Component.literal("The Dark side you shall go?"),
                        null, FrameType.GOAL,
                        true, true, false))
                .parent(rootAdvancement)
                .addCriterion("has_dark_crystal_detector", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Dark_Crystal_Detector.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "dark_crystal_detector"), existingFileHelper);


        Advancement lightCrystalDetector = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.Light_Crystal_Detector.get()),
                        Component.literal("Raise into the light"), Component.literal("So, into the Light?"),
                        null, FrameType.GOAL,
                        true,true,false))
                .parent(rootAdvancement)
                .addCriterion("has_light_crystal_detector", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Light_Crystal_Detector.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "light_crystal_detector"), existingFileHelper);


        Advancement takichirumSeeds = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.Takichirum_Seeds.get()),
                        Component.literal("The start"), Component.literal("The Ending is now finally beginning"),
                        null, FrameType.TASK,
                        true,true,false))
                .parent(darkCrystalDetector)
                .parent(lightCrystalDetector)
                .addCriterion("has_takichirum_seeds", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Seeds.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "takichirum_seeds"), existingFileHelper);


        Advancement takichirumIngot = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.Takichirum_Ingot.get()),
                        Component.literal("That's hard!"), Component.literal("Its so heavy! What is this?"),
                        null, FrameType.TASK,
                        true,true,false))
                .parent(takichirumSeeds)
                .addCriterion("has_takichirum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Ingot.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "takichirum_ingot"), existingFileHelper);

        Advancement takichirumBlock = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.Takichirum_Block.get()),
                        Component.literal("Why is it so hard??"), Component.literal("ITS CRUSHING ME! HALP!"),
                        null, FrameType.TASK,
                        true,true,false))
                .parent(takichirumIngot)
                .addCriterion("has_takichirum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Ingot.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "takichirum_ingot"), existingFileHelper);


        Advancement takichirumPaxel = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.Takichirum_Paxel.get()),
                        Component.literal("Dig them all!"), Component.literal("Almost everything at once!?"),
                        null, FrameType.TASK,
                        true,true,false))
                .parent(takichirumIngot)
                .addCriterion("has_takichirum_paxel", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Paxel.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "takichirum_paxel"), existingFileHelper);


        Advancement takichirumHammer = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.Takichirum_Hammer.get()),
                        Component.literal("Such a bore"), Component.literal("ITS HAMMER TIME! OHH YEAH!"),
                        null, FrameType.TASK,
                        true,true,false))
                .parent(takichirumIngot)
                .addCriterion("has_takichirum_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Hammer.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "takichirum_hammer"), existingFileHelper);


        Advancement takichirumFullArmorSet = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.Takichirum_Block.get()),
                        Component.literal("The Source Of The Darkness"), Component.literal("The End is closer than you think.. Possibly?"),
                        null, FrameType.GOAL,
                        true,true,false))
                .parent(takichirumIngot)
                .addCriterion("has_full_takichirum_helment",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Helmet.get()))
                .addCriterion("has_full_takichirum_chestplate",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Chestplate.get()))
                .addCriterion("has_full_takichirum_leggings",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Leggings.get()))
                .addCriterion("has_full_takichirum_boots",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.Takichirum_Boots.get()))
                .save(saver, new ResourceLocation(TSOTD.MOD_ID, "full_takichirum_armor"), existingFileHelper);


    }
}
