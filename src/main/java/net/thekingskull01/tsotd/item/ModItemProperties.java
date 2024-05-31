package net.thekingskull01.tsotd.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.thekingskull01.tsotd.TSOTD;

public class ModItemProperties {
    public static void  addCustomItemProperties() {
        ItemProperties.register(ModItems.Dark_Crystal_Memory_Orb.get(), new ResourceLocation(TSOTD.MOD_ID, "on"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f : 0f);
        ItemProperties.register(ModItems.Light_Crystal_Memory_Orb.get(), new ResourceLocation(TSOTD.MOD_ID, "on"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f : 0f);
    }



}
