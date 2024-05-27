package net.thekingskull01.tsotd.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.thekingskull01.tsotd.TSOTD;

import javax.swing.text.html.HTML;

public class ModTags {


    public static class Blocks {

        public static final TagKey<Block> DARK_CRYSTAL_DETECTOR_VALUABLES = tag("dark_crystal_detector_valuables");
        public static final TagKey<Block> LIGHT_CRYSTAL_DETECTOR_VALUABLES = tag("light_crystal_detector_valuables");

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
