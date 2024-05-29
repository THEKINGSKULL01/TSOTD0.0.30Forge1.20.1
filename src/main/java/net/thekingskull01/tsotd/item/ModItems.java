package net.thekingskull01.tsotd.item;

import net.minecraft.world.item.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.item.custom.*;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TSOTD.MOD_ID);

            //Minerals

    public static final RegistryObject<Item> Dark_Crystal = ITEMS.register("dark_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal = ITEMS.register("light_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Ultimate_Ingot = ITEMS.register("ultimate_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Crystallized_Coal = ITEMS.register("crystallized_coal",
            () -> new FuelItem(new Item.Properties(), 8000));


    //Armor, Armor, Armor, Armor, Armor, Armor, Armor, Armor, Armor, Armor

    public static final RegistryObject<Item> Dark_Crystal_Helmet = ITEMS.register("dark_crystal_helmet",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Helmet = ITEMS.register("light_crystal_helmet",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Ultimate_Helmet = ITEMS.register("ultimate_helmet",
            () -> new ArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> Dark_Crystal_Chestplate = ITEMS.register("dark_crystal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Chestplate = ITEMS.register("light_crystal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Ultimate_Chestplate = ITEMS.register("ultimate_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> Dark_Crystal_Leggings = ITEMS.register("dark_crystal_leggings",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Leggings = ITEMS.register("light_crystal_leggings",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Ultimate_Leggings = ITEMS.register("ultimate_leggings",
            () -> new ArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> Dark_Crystal_Boots = ITEMS.register("dark_crystal_boots",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Boots = ITEMS.register("light_crystal_boots",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> Ultimate_Boots = ITEMS.register("ultimate_boots",
            () -> new ArmorItem(ModArmorMaterials.ULTIMATE, ArmorItem.Type.BOOTS, new Item.Properties()));


            //Tools, Tools, Tools, Tools, Tools, Tools, Tools

    public static final RegistryObject<Item> Dark_Crystal_Detector = ITEMS.register("dark_crystal_detector",
            () -> new DarkCrystalDetectorItem(new Item.Properties().durability(256)));
    public static final RegistryObject<Item> Light_Crystal_Detector = ITEMS.register("light_crystal_detector",
            () -> new LightCrystalDetectorItem(new Item.Properties().durability(256)));

            //Swords

    public static final RegistryObject<Item> Ultimate_Sword = ITEMS.register("ultimate_sword",
            () -> new UlimateSwordItem(ModToolTiers.ULTIMATE, 3,1F, new Item.Properties()));

    public static final RegistryObject<Item> Dark_Crystal_Sword = ITEMS.register("dark_crystal_sword",
            () -> new SwordItem(ModToolTiers.DARK_CRYSTAL, 8,0.6F, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Sword = ITEMS.register("light_crystal_sword",
            () -> new SwordItem(ModToolTiers.LIGHT_CRYSTAL, 8,0.6F, new Item.Properties()));

            //Pickaxes

    public static final RegistryObject<Item> Dark_Crystal_Pickaxe = ITEMS.register("dark_crystal_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DARK_CRYSTAL,2, 4F, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Pickaxe = ITEMS.register("light_crystal_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LIGHT_CRYSTAL,2, 4F, new Item.Properties()));

            //Shovels

    public static final RegistryObject<Item> Dark_Crystal_Shovel = ITEMS.register("dark_crystal_shovel",
            () -> new ShovelItem(ModToolTiers.DARK_CRYSTAL,2.5F, 5, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Shovel = ITEMS.register("light_crystal_shovel",
            () -> new ShovelItem(ModToolTiers.LIGHT_CRYSTAL, 2.5F, 5, new Item.Properties()));

            //Axe

    public static final RegistryObject<Item> Dark_Crystal_Axe = ITEMS.register("dark_crystal_axe",
            () -> new AxeItem(ModToolTiers.DARK_CRYSTAL,6, 4F, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Axe = ITEMS.register("light_crystal_axe",
            () -> new AxeItem(ModToolTiers.LIGHT_CRYSTAL, 6, 4F, new Item.Properties()));

            //Hoes

    public static final RegistryObject<Item> Dark_Crystal_Hoe = ITEMS.register("dark_crystal_hoe",
            () -> new HoeItem(ModToolTiers.DARK_CRYSTAL,1, 3, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Hoe = ITEMS.register("light_crystal_hoe",
            () -> new HoeItem(ModToolTiers.LIGHT_CRYSTAL, 1, 3, new Item.Properties()));

            //Paxel

    public static final RegistryObject<Item> Ultimate_Paxel = ITEMS.register("ultimate_paxel",
            () -> new PaxelItem(ModToolTiers.ULTIMATE, 2, 4F, new Item.Properties()));

            //Hammers

    public static final RegistryObject<Item> Ultimate_Hammer = ITEMS.register("ultimate_hammer",
            () -> new HammerItem(ModToolTiers.ULTIMATE, 2, 4F, new Item.Properties()));

            //Food

    public static final RegistryObject<Item> Dark_Crystal_Steak = ITEMS.register("dark_crystal_steak",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CRYSTAL_STEAK)));
    public static final RegistryObject<Item> Light_Crystal_Steak = ITEMS.register("light_crystal_steak",
            () -> new Item(new Item.Properties().food(ModFoods.LIGHT_CRYSTAL_STEAK)));

            //Misc
            public static final RegistryObject<Item> Dark_Stick = ITEMS.register("dark_stick",
                    () -> new FuelItem(new Item.Properties(), 2000));
            public static final RegistryObject<Item> Light_Stick = ITEMS.register("light_stick",
                    () -> new FuelItem(new Item.Properties(), 2000));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
