package scmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.CreativeTab;
import scmc.lib.Reference;

//FIXME: find the source of the ash-makes-snow bug. it's probably due to a missing override
/**
 * Ash block. Thin layer of ash that generates commonly
 * on Char.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockAsh extends BlockSnow {
	public BlockAsh() {
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ASH_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ASH_C.getRegistryRL());
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}
    
	//No @Override because the super method is private
	/**
	 * checks what to drop based on the number of layers of ash
	 * @param world the world
	 * @param pos the position of the block
	 * @param state the state of the block
	 * @return
	 */
	private boolean checkAndDropBlock(World world, BlockPos pos, IBlockState state) {
        if(!canPlaceBlockAt(world, pos)) {
            world.setBlockToAir(pos);
            return false;
        } else {
            return true;
        }
    }
	
	/**
	 * detects a state change of a nearby block
	 * @param state the block state
	 * @param world the world
	 * @param pos the position of the block
	 * @param block the neighbour block
	 */
	@Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block) {
		checkAndDropBlock(world, pos, state);
	}
}