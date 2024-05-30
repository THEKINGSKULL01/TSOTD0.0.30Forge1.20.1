package net.thekingskull01.tsotd.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TSOTD.MOD_ID);

    public static final RegistryObject<Enchantment> LIGHTNING_STRIKER =
            ENCHANTMENTS.register("lightning_striker",
                    () -> new LightingStrikerEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON,
                            EquipmentSlot.MAINHAND));

    public static final RegistryObject<Enchantment> AUTO_SMELTING =
            ENCHANTMENTS.register("auto_smelting",
                    () -> new LightingStrikerEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.DIGGER,
                            EquipmentSlot.MAINHAND));


    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }

}
