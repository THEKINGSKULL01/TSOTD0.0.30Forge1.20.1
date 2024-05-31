package net.thekingskull01.tsotd.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.custom.*;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TSOTD.MOD_ID);

            //Minerals

    public static final RegistryObject<Item> Dark_Crystal = ITEMS.register("dark_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal = ITEMS.register("light_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Takichirum_Ingot = ITEMS.register("takichirum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Crystallized_Coal = ITEMS.register("crystallized_coal",
            () -> new FuelItem(new Item.Properties(), 8000));


    //Armor, Armor, Armor, Armor, Armor, Armor, Armor, Armor, Armor, Armor

    public static final RegistryObject<Item> Dark_Crystal_Helmet = ITEMS.register("dark_crystal_helmet",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Helmet = ITEMS.register("light_crystal_helmet",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Takichirum_Helmet = ITEMS.register("takichirum_helmet",
            () -> new ModArmorItem(ModArmorMaterials.TAKICHIRUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> Dark_Crystal_Chestplate = ITEMS.register("dark_crystal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Chestplate = ITEMS.register("light_crystal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Takichirum_Chestplate = ITEMS.register("takichirum_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.TAKICHIRUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> Dark_Crystal_Leggings = ITEMS.register("dark_crystal_leggings",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Leggings = ITEMS.register("light_crystal_leggings",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Takichirum_Leggings = ITEMS.register("takichirum_leggings",
            () -> new ModArmorItem(ModArmorMaterials.TAKICHIRUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> Dark_Crystal_Boots = ITEMS.register("dark_crystal_boots",
            () -> new ArmorItem(ModArmorMaterials.DARK_CRYSTAL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> Light_Crystal_Boots = ITEMS.register("light_crystal_boots",
            () -> new ArmorItem(ModArmorMaterials.LIGHT_CRYSTAL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> Takichirum_Boots = ITEMS.register("takichirum_boots",
            () -> new ModArmorItem(ModArmorMaterials.TAKICHIRUM, ArmorItem.Type.BOOTS, new Item.Properties()));


            //Detectors

    public static final RegistryObject<Item> Dark_Crystal_Detector = ITEMS.register("dark_crystal_detector",
            () -> new DarkCrystalDetectorItem(new Item.Properties().durability(256)));
    public static final RegistryObject<Item> Light_Crystal_Detector = ITEMS.register("light_crystal_detector",
            () -> new LightCrystalDetectorItem(new Item.Properties().durability(256)));

            //Swords

    public static final RegistryObject<Item> Takichirum_Sword = ITEMS.register("takichirum_sword",
            () -> new TakichirumSwordItem(ModToolTiers.TAKICHIRUM, 3,1F, new Item.Properties()));

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

    public static final RegistryObject<Item> Takichirum_Paxel = ITEMS.register("takichirum_paxel",
            () -> new PaxelItem(ModToolTiers.TAKICHIRUM, 2, 4F, new Item.Properties()));

            //Hammers

    public static final RegistryObject<Item> Takichirum_Hammer = ITEMS.register("takichirum_hammer",
            () -> new HammerItem(ModToolTiers.TAKICHIRUM, 2, 4F, new Item.Properties()));

            //Food

    public static final RegistryObject<Item> Dark_Crystal_Steak = ITEMS.register("dark_crystal_steak",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CRYSTAL_STEAK)));
    public static final RegistryObject<Item> Light_Crystal_Steak = ITEMS.register("light_crystal_steak",
            () -> new Item(new Item.Properties().food(ModFoods.LIGHT_CRYSTAL_STEAK)));

            //Horse armor

    public static final RegistryObject<Item> Dark_Crystal_Horse_Armor = ITEMS.register("dark_crystal_horse_armor",
            () -> new HorseArmorItem(16, new ResourceLocation(TSOTD.MOD_ID,"textures/entity/horse/armor/horse_armor_dark_crystal.png"), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> Light_Crystal_Horse_Armor = ITEMS.register("light_crystal_horse_armor",
            () -> new HorseArmorItem(16, new ResourceLocation(TSOTD.MOD_ID,"textures/entity/horse/armor/horse_armor_light_crystal.png"), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> Takichirum_Horse_Armor = ITEMS.register("takichirum_horse_armor",
            () -> new HorseArmorItem(18, new ResourceLocation(TSOTD.MOD_ID,"textures/entity/horse/armor/horse_armor_takichirum.png"), new Item.Properties().stacksTo(1)));

            //Misc
    public static final RegistryObject<Item> Dark_Stick = ITEMS.register("dark_stick",
            () -> new FuelItem(new Item.Properties(), 2000));
    public static final RegistryObject<Item> Light_Stick = ITEMS.register("light_stick",
            () -> new FuelItem(new Item.Properties(), 2000));

            //DataTablet

    public static final RegistryObject<Item> Dark_Crystal_Memory_Orb = ITEMS.register("dark_crystal_memory_orb",
            () -> new DataTabletItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> Light_Crystal_Memory_Orb = ITEMS.register("light_crystal_memory_orb",
            () -> new DataTabletItem(new Item.Properties().stacksTo(1)));

            //Seeds

    public static final RegistryObject<Item> Takichirum_Seeds = ITEMS.register("takichirum_seeds",
            () -> new ItemNameBlockItem(ModBlocks.Takichirum_Crop.get(), new Item.Properties()));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }




}
