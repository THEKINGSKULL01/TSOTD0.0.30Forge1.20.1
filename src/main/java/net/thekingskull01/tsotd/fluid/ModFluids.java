package net.thekingskull01.tsotd.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;

import java.util.Iterator;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TSOTD.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_GLOWSTONE_FLUID = FLUIDS.register("glowstone_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.GLOWSTONE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GLOWSTONE_FLUID = FLUIDS.register("flowing_glowstone_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GLOWSTONE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties GLOWSTONE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.GLOWSTONE_FLUID, SOURCE_GLOWSTONE_FLUID, FLOWING_GLOWSTONE_FLUID)
            .slopeFindDistance(1).levelDecreasePerBlock(1).block(ModBlocks.Glowstone_Fluid)
            .bucket(ModItems.Glowstone_Fluid_Bucket);



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
//public Vec3 getFlow(BlockGetter pBlockReader, BlockPos pPos, FluidState pFluidState) {
//    double d0 = 0.0;
//    double d1 = 0.0;
//    BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
//    Iterator var9 = Direction.Plane.HORIZONTAL.iterator();
//
//    while(var9.hasNext()) {
//        Direction direction = (Direction)var9.next();
//        blockpos$mutableblockpos.setWithOffset(pPos, direction);
//        FluidState fluidstate = pBlockReader.getFluidState(blockpos$mutableblockpos);
//        if (this.affectsFlow(fluidstate)) {
//            float f = fluidstate.getOwnHeight();
//            float f1 = 0.0F;
//            if (f == 0.0F) {
//                if (!pBlockReader.getBlockState(blockpos$mutableblockpos).blocksMotion()) {
//                    BlockPos blockpos = blockpos$mutableblockpos.below();
//                    FluidState fluidstate1 = pBlockReader.getFluidState(blockpos);
//                    if (this.affectsFlow(fluidstate1)) {
//                        f = fluidstate1.getOwnHeight();
//                        if (f > 0.0F) {
//                            f1 = pFluidState.getOwnHeight() - (f - 0.8888889F);
//                        }
//                    }
//                }
//            } else if (f > 0.0F) {
//                f1 = pFluidState.getOwnHeight() - f;
//            }
//
//            if (f1 != 0.0F) {
//                d0 += (double)((float)direction.getStepX() * f1);
//                d1 += (double)((float)direction.getStepZ() * f1);
//            }
//        }
//    }
//
//    Vec3 vec3 = new Vec3(d0, 0.0, d1);
//    if ((Boolean)pFluidState.getValue(FALLING)) {
//        Iterator var17 = Direction.Plane.HORIZONTAL.iterator();
//
//        Direction direction1;
//        do {
//            if (!var17.hasNext()) {
//                return vec3.normalize();
//            }
//
//            direction1 = (Direction)var17.next();
//            blockpos$mutableblockpos.setWithOffset(pPos, direction1);
//        } while(!this.isSolidFace(pBlockReader, blockpos$mutableblockpos, direction1) && !this.isSolidFace(pBlockReader, blockpos$mutableblockpos.above(), direction1));
//
//        vec3 = vec3.normalize().add(0.0, -6.0, 0.0);
//    }
//
//    return vec3.normalize();
//}