package net.thekingskull01.tsotd.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModSignBE extends SignBlockEntity {
    public ModSignBE(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOD_SIGN.get(), pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.MOD_SIGN.get();
    }
}
