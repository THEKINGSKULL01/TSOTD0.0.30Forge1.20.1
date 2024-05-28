package net.thekingskull01.tsotd.item;

import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.item.custom.DarkCrystalDetectorItem;
import net.thekingskull01.tsotd.item.custom.LightCrystalDetectorItem;
import net.thekingskull01.tsotd.item.custom.FuelItem;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TSOTD.MOD_ID);

            //Menials

    public static final RegistryObject<Item> Dark_Crystal = ITEMS.register("dark_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal = ITEMS.register("light_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Crystallized_Coal = ITEMS.register("crystallized_coal",
            () -> new FuelItem(new Item.Properties(), 8000));


            //tools

    public static final RegistryObject<Item> Dark_Crystal_Detector = ITEMS.register("dark_crystal_detector",
            () -> new DarkCrystalDetectorItem(new Item.Properties().durability(256)));
    public static final RegistryObject<Item> Light_Crystal_Detector = ITEMS.register("light_crystal_detector",
            () -> new LightCrystalDetectorItem(new Item.Properties().durability(256)));

            //Food

    public static final RegistryObject<Item> Dark_Crystal_Steak = ITEMS.register("dark_crystal_steak",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CRYSTAL_STEAK)));
    public static final RegistryObject<Item> Light_Crystal_Steak = ITEMS.register("light_crystal_steak",
            () -> new Item(new Item.Properties().food(ModFoods.LIGHT_CRYSTAL_STEAK)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
