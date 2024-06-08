package net.thekingskull01.tsotd.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.thekingskull01.tsotd.TSOTD;

public class ModWoodTypes {
    public static final WoodType ZOMBLIE = WoodType.register(new WoodType(TSOTD.MOD_ID + ":zomblie", BlockSetType.WARPED));
}
