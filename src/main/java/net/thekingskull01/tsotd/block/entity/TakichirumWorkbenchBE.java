package net.thekingskull01.tsotd.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.thekingskull01.tsotd.block.custom.TakichirumWorkBenchBlock;
import net.thekingskull01.tsotd.fluid.ModFluids;
import net.thekingskull01.tsotd.item.ModItems;
import net.thekingskull01.tsotd.recipe.TakichirumCreationRecipe;
import net.thekingskull01.tsotd.screen.TakichirumWorkbenchMenu;
import net.thekingskull01.tsotd.util.InventoryDirectionEntry;
import net.thekingskull01.tsotd.util.InventoryDirectionWrapper;
import net.thekingskull01.tsotd.util.ModEnergyStorage;
import net.thekingskull01.tsotd.util.WrappedHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class TakichirumWorkbenchBE extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(6) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(),getBlockState(),getBlockState(), 3);
            }
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 0, 1, 2, 3, 4 -> true;
                //case 3 -> stack.getItem() == ModItems.Darkened_Light_Crystal.get(); //   Energy
                //case 4 -> stack.getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).isPresent(); //   Fluid
                case 5 -> false; //   Output
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    private static final int LEFT_INPUT_SLOT = 0;
    private static final int MIDDLE_INPUT_SLOT = 1;
    private static final int RIGHT_INPUT_SLOT = 2;
    private static final int ENERGY_INPUT_SLOT = 3;
    private static final int FLUID_SLOT = 4;
    private static final int OUTPUT_SLOT = 5;
    
    
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            new InventoryDirectionWrapper(itemHandler,
                    new InventoryDirectionEntry(Direction.DOWN, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.UP, FLUID_SLOT, true),
                    new InventoryDirectionEntry(Direction.SOUTH, ENERGY_INPUT_SLOT, true),
                    new InventoryDirectionEntry(Direction.NORTH, MIDDLE_INPUT_SLOT, true),
                    new InventoryDirectionEntry(Direction.EAST, RIGHT_INPUT_SLOT, true),
                    new InventoryDirectionEntry(Direction.WEST, LEFT_INPUT_SLOT, true)).directionsMap;

    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();
    private LazyOptional<IFluidHandler> lazyFluidHandler = LazyOptional.empty();



    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;

    
    private final ModEnergyStorage ENERGY_STORAGE = createEnergyStorage();
    private final FluidTank FLUID_TANK = createFluidTank();

    private FluidTank createFluidTank() {
        return new FluidTank(150000) {
            @Override
            protected void onContentsChanged() {
                setChanged();
                if (!level.isClientSide()) {
                    level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
                }
            }

            @Override
            public boolean isFluidValid(FluidStack stack) {
                return stack.getFluid() == ModFluids.GLOWSTONE.FLUID.get();
            }
        };
    }

    private ModEnergyStorage createEnergyStorage() {
        return new ModEnergyStorage(150000, 750) {
            @Override
            public void onEnergyChanged() {
                setChanged();
                getLevel().sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        };
    }

    public ItemStack getRenderStack() {
        ItemStack stack = itemHandler.getStackInSlot(OUTPUT_SLOT);

        if (stack.isEmpty()) {
            stack = itemHandler.getStackInSlot(MIDDLE_INPUT_SLOT);
        }
        return stack;
    }


    public TakichirumWorkbenchBE(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.TAKICHIRUM_WORKBENCH_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> TakichirumWorkbenchBE.this.progress;
                    case 1 -> TakichirumWorkbenchBE.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> TakichirumWorkbenchBE.this.progress = pValue;
                    case 1 -> TakichirumWorkbenchBE.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }


    public IEnergyStorage getEnergyStorage() {
        return this.ENERGY_STORAGE;
    }

    public FluidStack getFluid() {
        return FLUID_TANK.getFluid();
    }


    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Takichirum Workbench");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new TakichirumWorkbenchMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ENERGY) {
            return lazyEnergyHandler.cast();
        }

        if (cap == ForgeCapabilities.FLUID_HANDLER) {
            return lazyFluidHandler.cast();
        }

        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            if (side == null) {
                return lazyItemHandler.cast();
            }

            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(TakichirumWorkBenchBlock.FACING);

                if (side == Direction.DOWN ||side == Direction.UP) {
                    return directionWrappedHandlerMap.get(side).cast();
                }

                return switch (localDir){
                    default -> directionWrappedHandlerMap.get(side.getOpposite()).cast();
                    case EAST -> directionWrappedHandlerMap.get(side.getClockWise()).cast();
                    case SOUTH -> directionWrappedHandlerMap.get(side).cast();
                    case WEST -> directionWrappedHandlerMap.get(side.getCounterClockWise()).cast();
                };


            }

        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyEnergyHandler = LazyOptional.of(() -> ENERGY_STORAGE);
        lazyFluidHandler = LazyOptional.of(() -> FLUID_TANK);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyEnergyHandler.invalidate();
        lazyFluidHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("takichirum_workbench_progress", progress);
        pTag.putInt("energy", ENERGY_STORAGE.getEnergyStored());
        pTag = FLUID_TANK.writeToNBT(pTag);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
        progress = pTag.getInt("takichirum_workbench_progress");
        ENERGY_STORAGE.setEnergy(pTag.getInt("energy"));
        FLUID_TANK.readFromNBT(pTag);
    }

    public void tick(Level level, BlockPos pPos, BlockState pState) {

        fillUpOnEnergy(); //This is pretty much a "placeholder" for getting energy though pipes/wires/duct/anything similar
        fillupOnFluid();

        if (isOutputSlotEmptyOrReceivable() && hasRecipe()) {
            increaseCraftingProcess();
            extractEnergy();
            setChanged(level, pPos, pState);

            if (hasProgressFinished()) {
                craftItem();
                extractFluid();
                resetProgress();
            }

        } else {
            resetProgress();
        }
    }

    private void extractFluid() {
        this.FLUID_TANK.drain(1000, IFluidHandler.FluidAction.EXECUTE);
    }

    private void fillupOnFluid() {
        if (hasFluidSourceInSlot(FLUID_SLOT)) {
            transferItemFluidToTank(FLUID_SLOT);
        }
    }

    private void transferItemFluidToTank(int fluidSlot) {
        this.itemHandler.getStackInSlot(fluidSlot).getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).ifPresent(iFluidHandlerItem -> {
            int drainAmount = Math.min(this.FLUID_TANK.getSpace(), 1000);

            FluidStack stack = iFluidHandlerItem.drain(drainAmount, IFluidHandler.FluidAction.SIMULATE);
            if (stack.getFluid() == ModFluids.GLOWSTONE.FLUID.get()) {
                stack = iFluidHandlerItem.drain(drainAmount, IFluidHandler.FluidAction.EXECUTE);
                fillTankWithFluid(stack, iFluidHandlerItem.getContainer());
            }
        });
    }

    private void fillTankWithFluid(FluidStack stack, ItemStack container) {
        this.FLUID_TANK.fill(new FluidStack(stack.getFluid(), stack.getAmount()), IFluidHandler.FluidAction.EXECUTE);

        this.itemHandler.extractItem(FLUID_SLOT, 1, false);
        this.itemHandler.insertItem(FLUID_SLOT, container, false);
    }

    private boolean hasFluidSourceInSlot(int fluidSlot) {
        return this.itemHandler.getStackInSlot(fluidSlot).getCount() > 0 &&
                this.itemHandler.getStackInSlot(fluidSlot).getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).isPresent();
    }

    private void extractEnergy() {
        this.ENERGY_STORAGE.extractEnergy( 100, false); //The transfer of energy from the item
    }

    private void fillUpOnEnergy() {
        if (hasEnergyItemInSlot(ENERGY_INPUT_SLOT)) {
            this.ENERGY_STORAGE.receiveEnergy(3200, false); //Will suck the energy the number of times thats there
        }
    }

    private boolean hasEnergyItemInSlot(int energyInputSlot) {
        return !this.itemHandler.getStackInSlot(energyInputSlot).isEmpty() &&
                this.itemHandler.getStackInSlot(energyInputSlot).getItem() == ModItems.Darkened_Light_Crystal.get();
    }

    private void craftItem() {
        Optional<TakichirumCreationRecipe> recipe = getCurrentRecipe();
        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());
        this.itemHandler.extractItem(LEFT_INPUT_SLOT, 1, false);
        this.itemHandler.extractItem(MIDDLE_INPUT_SLOT, 1, false);
        this.itemHandler.extractItem(RIGHT_INPUT_SLOT, 1, false);

        this.itemHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(resultItem.getItem(),
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + resultItem.getCount()));
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private boolean hasProgressFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProcess() {
        this.progress++;
    }

    private boolean hasRecipe() {
        Optional<TakichirumCreationRecipe> recipe = getCurrentRecipe();

        if (recipe.isEmpty()) {
            return false;
        }
        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());

        return canInsertAmountIntoOutputSlot(resultItem.getCount())
                && canInsertItemIntoOutputSlot(resultItem.getItem()) && hasEnoughEnergyToCraft()
                && hasEnoughFluidToCraft();
    }

    private boolean hasEnoughFluidToCraft() {
        return this.FLUID_TANK.getFluidAmount() >= 1000;
    }

    private boolean hasEnoughEnergyToCraft() {
        return this.ENERGY_STORAGE.getEnergyStored() >= 100 * maxProgress; //The transfer from when the item is being crafted
    }

    private Optional<TakichirumCreationRecipe> getCurrentRecipe() {
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i = 0; i < this.itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }
        return this.level.getRecipeManager().getRecipeFor(TakichirumCreationRecipe.Type.INSTANCE, inventory, level);

    }

    private boolean canInsertItemIntoOutputSlot(Item item) {

        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() || this.itemHandler.getStackInSlot(OUTPUT_SLOT).is(item);

    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize() >= this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + count;
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() ||
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() < this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize();
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);

    }

    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        super.onDataPacket(net, pkt);
    }


}
