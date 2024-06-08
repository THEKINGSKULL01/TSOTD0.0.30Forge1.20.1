package net.thekingskull01.tsotd.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.thekingskull01.tsotd.block.entity.ModHangingSignBE;

public class ModHangingSign extends CeilingHangingSignBlock {
    public ModHangingSign(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ModHangingSignBE(pos, state);
    }
}
