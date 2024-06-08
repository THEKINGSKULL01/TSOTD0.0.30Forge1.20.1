package net.thekingskull01.tsotd.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.thekingskull01.tsotd.block.entity.ModSignBE;

public class ModWallHangingSign extends WallHangingSignBlock {
    public ModWallHangingSign(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ModSignBE(pos, state);
    }
}
