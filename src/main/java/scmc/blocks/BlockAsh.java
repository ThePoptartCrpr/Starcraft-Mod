package scmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.metablocks.ModBlockLayered;
import scmc.lib.Reference;

/**
 * Ash block. Thin layer of ash that generates commonly on Char.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockAsh extends ModBlockLayered {

	public BlockAsh() {
		super(Material.CARPET);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ASH_CHAR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ASH_CHAR.getRegistryRL());
		setSoundType(SoundType.SAND);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	// No @Override because the super method is private
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
