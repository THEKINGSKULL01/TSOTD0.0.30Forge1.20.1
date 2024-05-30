package net.thekingskull01.tsotd.item.custom;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.thekingskull01.tsotd.block.ModBlocks;
import net.thekingskull01.tsotd.item.ModItems;
import net.thekingskull01.tsotd.util.InventoryUtil;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DarkCrystalDetectorItem extends Item {

    private static final List<Block> VALUABLE_BLOCKS = List.of(ModBlocks.Dark_Crystal_Ore.get());

    public DarkCrystalDetectorItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        if(context.getLevel().isClientSide)return InteractionResult.SUCCESS;
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();


        //x radius, looks in 2x1 chunks
        for(int x = -16; x < 16; x++){
            //z radius, looks in 1x2 chunks
            for(int z = -16; z < 16; z++){
                //y radius, looks in x2xz2xy256
                ChunkAccess access = context.getLevel().getChunkAt(pos);
                //y hight, going negative for y = -64 is better as it'll allow you to search for the thing you want, even if your blow it
                for(int y = -64; y <= 64; y++){
                    BlockPos checkPos = pos.offset(x,-y,z);
                    BlockState state = access.getBlockState(checkPos);
                    if(isValuableBlock(state)){
                        //Hurt the Item
                        context.getItemInHand().hurtAndBreak(1, player, _player -> _player.broadcastBreakEvent(_player.getUsedItemHand()));
                        //Output text to Player
                        player.sendSystemMessage(Component.literal("Found " + I18n.get(state.getBlock().getDescriptionId()) + " at " +
                                "(y = " + checkPos.getY() + ")"));
                        //DataTablet stuffs
                        if (InventoryUtil.hasPlayerStackInInventory(player, ModItems.Dark_Crystal_Data_Tablet.get())) {
                            addDataToDataTablet(player, pos.offset(x,-y,z), state.getBlock());
                        }
                        return InteractionResult.SUCCESS;
                    }
                }
            }
        }

        //x radius, looks in 2x1 chunks
        for(int x = -32; x < 32; x++){
            //z radius, looks in 1x2 chunks
            for(int z = -32; z < 32; z++){
                //y radius, looks in x2xz2xy256
                BlockPos positionClicked = context.getClickedPos();
                //y hight, going negative for y = -128 is better as it'll allow you to search for the thing you want, even if your blow it
                for(int y = -128; y <= 128; y++){
                    BlockPos checkPos = pos.offset(x,-y,z);
                    BlockState state = context.getLevel().getBlockState(checkPos);
                    if(isValuableBlock(state)){
                        //Hurt the Item
                        context.getItemInHand().hurtAndBreak(1, player, _player -> _player.broadcastBreakEvent(_player.getUsedItemHand()));
                        //Output text to Player
                        player.sendSystemMessage(Component.literal("Found traces of Dark Crystals nearby?"));
                        //Finish up
                        return InteractionResult.SUCCESS;
                    }
                }
            }
        }
        player.sendSystemMessage(Component.literal("No Dark Crystals in sight!"));
        context.getItemInHand().hurtAndBreak(1, player, _player -> _player.broadcastBreakEvent(_player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    private void addDataToDataTablet(Player player, BlockPos offset, Block block) {

        ItemStack dataTablet = player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, ModItems.Dark_Crystal_Data_Tablet.get()));

        CompoundTag data = new CompoundTag();
        data.putString("tsotd.found_ore", "Found " + I18n.get(block.getDescriptionId()) + " at " + "(y = " + checkPos.getY() + ")");

        dataTablet.setTag(data);



    }

    private boolean isValuableBlock(BlockState state) {
        return VALUABLE_BLOCKS.stream().anyMatch(state::is);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tsotd.dark_crystal_detector.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}