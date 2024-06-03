package net.thekingskull01.tsotd.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation GLOWSTONE_STILL_RL = new ResourceLocation("block/glowstone_still");
    public static final ResourceLocation GLOWSTONE_FLOWING_RL = new ResourceLocation("block/glowstone_flow");
    public static final ResourceLocation GLOWSTONE_OVERLAY_RL = new ResourceLocation("block/glowstone_overlay");



    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TSOTD.MOD_ID);

    public static final RegistryObject<FluidType> GLOWSTONE_FLUID = registerFluidType("glowstone_liquid",
            new BaseFluidType(GLOWSTONE_STILL_RL, GLOWSTONE_FLOWING_RL, GLOWSTONE_OVERLAY_RL, 0xA1DAAF42,
                    new Vector3f(218f / 255f,175f / 255f,66f / 255f),
                    FluidType.Properties.create().lightLevel(15).supportsBoating(true).canSwim(false).canExtinguish(true).canDrown(true).density(3).viscosity(5)));

    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus );
    }
}
