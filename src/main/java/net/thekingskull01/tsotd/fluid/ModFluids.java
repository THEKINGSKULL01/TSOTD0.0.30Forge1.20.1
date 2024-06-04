package net.thekingskull01.tsotd.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;

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