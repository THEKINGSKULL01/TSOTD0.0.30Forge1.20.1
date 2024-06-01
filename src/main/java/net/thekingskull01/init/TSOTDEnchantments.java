package net.thekingskull01.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.enchantment.AutoSmeltEnchantment;
import net.thekingskull01.tsotd.enchantment.LifeStealerEnchantment;
import net.thekingskull01.tsotd.enchantment.ReacherEnchantment;

public class TSOTDEnchantments {
    public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TSOTD.MOD_ID);
    public static final RegistryObject<Enchantment> AUTO_SMELT = REGISTRY.register("smelting_touch", AutoSmeltEnchantment::new);
    public static final RegistryObject<Enchantment> LIFE_STEALER = REGISTRY.register("life_steal", LifeStealerEnchantment::new);
    public static final RegistryObject<Enchantment> REACHER = REGISTRY.register("reach", ReacherEnchantment::new);
}