package net.thekingskull01.tsotd.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.thekingskull01.tsotd.item.ModItems;

public class TakichirumCrop extends CropBlock {
    public static final int MAX_AGE = 6;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);

    public TakichirumCrop(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.Takichirum_Seeds.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, RandomSource random) {
        if (!worldIn.isAreaLoaded(pos, 1)) return; // Prevent loading unloaded chunks

        if (worldIn.getRawBrightness(pos, 0) >= 9) {
            int age = this.getAge(state);
            if (age < this.getMaxAge()) {
                float growthSpeed = getGrowthSpeed(worldIn, pos, state);

                // Adjust the base value here to control growth rate
                if (random.nextInt((int)(5.0F / growthSpeed) + 1) == 0) {
                    worldIn.setBlock(pos, this.getStateForAge(age + 1), 2);
                }
            }
        }
    }

    private float getGrowthSpeed(ServerLevel worldIn, BlockPos pos, BlockState state) {
        float growthSpeed = 1.0F;
        BlockPos blockpos = pos.below();

        for (int x = -1; x <= 1; ++x) {
            for (int z = -1; z <= 1; ++z) {
                float bonus = 0.0F;
                BlockState soil = worldIn.getBlockState(blockpos.offset(x, 0, z));

                if (soil.isFertile(worldIn, blockpos.offset(x, 0, z))) {
                    bonus = 1.0F;
                }

                if (x != 0 || z != 0) {
                    bonus /= 4.0F;
                }

                growthSpeed += bonus;
            }
        }

        return growthSpeed;
    }
}
