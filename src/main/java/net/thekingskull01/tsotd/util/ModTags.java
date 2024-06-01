package net.thekingskull01.tsotd.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.thekingskull01.tsotd.TSOTD;

public class ModTags {


    public static class Blocks {

        public static final TagKey<Block> DARK_CRYSTAL_DETECTOR_VALUABLES = tag("dark_crystal_detector_valuables");
        public static final TagKey<Block> LIGHT_CRYSTAL_DETECTOR_VALUABLES = tag("light_crystal_detector_valuables");


        public static final TagKey<Block> NEEDS_DARK_CRYSTAL_TOOL = tag("needs_dark_crystal_tool");
        public static final TagKey<Block> NEEDS_LIGHT_CRYSTAL_TOOL = tag("needs_light_crystal_tool");
        public static final TagKey<Block> NEEDS_TAKICHIRUM_TOOL = tag("needs_takichirum_tool");


        public static final TagKey<Block> PAXEL_MINEABLE = tag("mineable/paxel");


        public static final TagKey<Block> HAMMER_MINEABLE = tag("mineable/hammer");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TSOTD.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }


    public static class Items {



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TSOTD.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
