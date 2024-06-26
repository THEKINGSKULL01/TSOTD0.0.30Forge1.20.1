package net.thekingskull01.tsotd.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thekingskull01.tsotd.TSOTD;
import net.thekingskull01.tsotd.block.custom.*;
import net.thekingskull01.tsotd.item.ModItems;
import net.thekingskull01.tsotd.item.custom.CrystalizedCoalBlock;
import net.thekingskull01.tsotd.util.ModWoodTypes;
import net.thekingskull01.tsotd.worldgen.tree.ZomblieTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TSOTD.MOD_ID);


    //Mineral Blocks, Mineral Blocks, Mineral Blocks, Mineral Blocks

    public static final RegistryObject<Block> Coal_Crystal_Block = registerBlock("coal_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(4)));
    public static final RegistryObject<Block> Green_Crystal_Block = registerBlock("green_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Dark_Crystal_Block = registerBlock("dark_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Light_Crystal_Block = registerBlock("light_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Block = registerBlock("darkened_light_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> Takichirum_Block = registerBlock("takichirum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).sound(SoundType.ANCIENT_DEBRIS)));

    //Wood Blocks, Wood Blocks, Wood Blocks, Wood Blocks, Wood Blocks

    public static final RegistryObject<Block> Zomblie_Log = registerBlock("zomblie_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM)));
    public static final RegistryObject<Block> Zomblie_Wood = registerBlock("zomblie_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE)));
    public static final RegistryObject<Block> Stripped_Zomblie_Log = registerBlock("stripped_zomblie_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_STEM)));
    public static final RegistryObject<Block> Stripped_Zomblie_Wood = registerBlock("stripped_zomblie_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE)));

    public static final RegistryObject<Block> Zomblie_Sapling = registerBlock("zomblie_sapling",
            () -> new ModSaplingBlock(new ZomblieTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> Zomblie_Planks = registerBlock("zomblie_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> Zomblie_Leaves = registerBlock("zomblie_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    //Signs, Signs, Signs, Signs, Signs, Signs, Signs, Signs

    public static final RegistryObject<Block> Zomblie_Sign = BLOCKS.register("zomblie_sign",
            () -> new ModStandingSign(BlockBehaviour.Properties.copy(Blocks.WARPED_SIGN), ModWoodTypes.ZOMBLIE));
    public static final RegistryObject<Block> Zomblie_Wall_Sign = BLOCKS.register("zomblie_wall_sign",
            () -> new ModWallSign(BlockBehaviour.Properties.copy(Blocks.WARPED_WALL_SIGN), ModWoodTypes.ZOMBLIE));

    public static final RegistryObject<Block> Zomblie_Hanging_Sign = BLOCKS.register("zomblie_hanging_sign",
            () -> new ModHangingSign(BlockBehaviour.Properties.copy(Blocks.WARPED_HANGING_SIGN), ModWoodTypes.ZOMBLIE));
    public static final RegistryObject<Block> Zomblie_Wall_Hanging_Sign = BLOCKS.register("zomblie_wall_hanging_sign",
            () -> new ModWallHangingSign(BlockBehaviour.Properties.copy(Blocks.WARPED_WALL_HANGING_SIGN), ModWoodTypes.ZOMBLIE));

    //Lamps, Lamps, Lamps, Lamps, Lamps, Lamps, Lamps

    public static final RegistryObject<Block> Crystal_Lamp = registerBlock("crystal_lamp",
            () -> new CrystalLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).mapColor(MapColor.COLOR_GRAY)
                    .lightLevel(state -> state.getValue(CrystalLampBlock.LIT) || state.getValue(CrystalLampBlock.CLICKED) ? 15 : 0)));

    //WorkBenches

    public static final RegistryObject<Block> Takichirum_Workbench = registerBlock("takichirum_workbench",
            () -> new TakichirumWorkBenchBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE).noOcclusion()));


    //Ores, Ores, Ores, Ores, Ores, Ores, Ores

    public static final RegistryObject<Block> Dark_Crystal_Ore = registerBlock("dark_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(7f).requiresCorrectToolForDrops(), UniformInt.of(8, 16)));
    public static final RegistryObject<Block> Light_Crystal_Ore = registerBlock("light_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(7f).requiresCorrectToolForDrops(), UniformInt.of(8, 16)));
    public static final RegistryObject<Block> Coal_Crystal_Ore = registerBlock("coal_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(8, 16)));

    //Stairs, Stairs, Stairs, Stairs, Stairs

    public static final RegistryObject<Block> Dark_Crystal_Stairs = registerBlock("dark_crystal_stairs",
            () -> new StairBlock(() -> ModBlocks.Dark_Crystal_Block.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Light_Crystal_Stairs = registerBlock("light_crystal_stairs",
            () -> new StairBlock(() -> ModBlocks.Light_Crystal_Block.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Coal_Crystal_Stairs = registerBlock("coal_crystal_stairs",
            () -> new StairBlock(() -> ModBlocks.Coal_Crystal_Block.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Stairs = registerBlock("darkened_light_crystal_stairs",
            () -> new StairBlock(() -> ModBlocks.Darkened_Light_Crystal_Block.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //Slabs, Slabs, Slabs, Slabs, Slabs, Slabs

    public static final RegistryObject<Block> Dark_Crystal_Slab = registerBlock("dark_crystal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Light_Crystal_Slab = registerBlock("light_crystal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Coal_Crystal_Slab = registerBlock("coal_crystal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Slab = registerBlock("darkened_light_crystal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //Buttons, Buttons, Buttons, Buttons, Buttons

    public static final RegistryObject<Block> Dark_Crystal_Button = registerBlock("dark_crystal_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> Light_Crystal_Button = registerBlock("light_crystal_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> Coal_Crystal_Button = registerBlock("coal_crystal_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.STONE), BlockSetType.STONE, 30, true));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Button = registerBlock("darkened_light_crystal_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK), BlockSetType.STONE, 30, true));

    //Pressure Plates, Pressure Plates, Pressure Plates

    public static final RegistryObject<Block> Dark_Crystal_Pressure_Plate = registerBlock("dark_crystal_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> Light_Crystal_Pressure_Plate = registerBlock("light_crystal_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> Coal_Crystal_Pressure_Plate = registerBlock("coal_crystal_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Pressure_Plate = registerBlock("darkened_light_crystal_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),
                    BlockSetType.STONE));

    //Walls, Walls, Walls, Walls, Walls, Walls, Walls

    public static final RegistryObject<Block> Dark_Crystal_Wall = registerBlock("dark_crystal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> Light_Crystal_Wall = registerBlock("light_crystal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> Coal_Crystal_Wall = registerBlock("coal_crystal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Wall = registerBlock("darkened_light_crystal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //Fence, Fence, Fence, Fence, Fence, Fence, Fence

    public static final RegistryObject<Block> Dark_Crystal_Fence = registerBlock("dark_crystal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> Light_Crystal_Fence = registerBlock("light_crystal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> Coal_Crystal_Fence = registerBlock("coal_crystal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Fence = registerBlock("darkened_light_crystal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //Gates, Gates, Gates, Gates, Gates, Gates, Gates

    public static final RegistryObject<Block> Dark_Crystal_Fence_Gate = registerBlock("dark_crystal_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> Light_Crystal_Fence_Gate = registerBlock("light_crystal_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> Coal_Crystal_Fence_Gate = registerBlock("coal_crystal_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> Darkened_Light_Crystal_Fence_Gate = registerBlock("darkened_light_crystal_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Doors, Doors, Doors, Doors, Doors, Doors, Doors, Doors

    public static final RegistryObject<Block> Dark_Crystal_Door = registerBlock("dark_crystal_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), BlockSetType.WARPED));
    public static final RegistryObject<Block> Light_Crystal_Door = registerBlock("light_crystal_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), BlockSetType.WARPED));
    public static final RegistryObject<Block> Coal_Crystal_Door = registerBlock("coal_crystal_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK), BlockSetType.CHERRY));

    //Trapdoors, Trapdoors, Trapdoors, Trapdoors, Trapdoors

    public static final RegistryObject<Block> Dark_Crystal_Trapdoor = registerBlock("dark_crystal_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion(), BlockSetType.WARPED));
    public static final RegistryObject<Block> Light_Crystal_Trapdoor = registerBlock("light_crystal_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion(), BlockSetType.WARPED));
    public static final RegistryObject<Block> Coal_Crystal_Trapdoor = registerBlock("coal_crystal_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion(), BlockSetType.CHERRY));

    //Crops, Crops, Crops, Crops, Crops, Crops, Crops, Crops, Crops

    public static final RegistryObject<Block> Takichirum_Crop = BLOCKS.register("takichirum_crop",
            () -> new TakichirumCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion().randomTicks()));


    //Flowers, Flowers, Flowers, Flowers, Flowers, Flowers, Flowers

    public static final RegistryObject<Block> Dancing_Flower_Leaf = registerBlock("dancing_flower_leaf",
            () -> new ModFlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 6, BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> Potted_Dancing_Flower_Leaf = BLOCKS.register("potted_dancing_flower_leaf",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.Dancing_Flower_Leaf,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    //Fluids, Fluids, Fluids, Fluids, Fluids, Fluids, Fluids, Fluids

    //public static final RegistryObject<LiquidBlock> Glowstone_Fluid = BLOCKS.register("glowstone_fluid",
    //        () -> new LiquidBlock(ModFluids.SOURCE_GLOWSTONE_FLUID, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    //Extra, Dont touch


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        switch (name) {

        //reminder to self, dupe to add more fuel block sources
            case "coal_crystal_block":
                return ModItems.ITEMS.register(name, () -> new CrystalizedCoalBlock(block.get(), new Item.Properties()));



            default:
                return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

        }

    }
}