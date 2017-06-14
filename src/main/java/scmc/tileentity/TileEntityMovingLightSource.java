package scmc.tileentity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.blocks.BlockMovingLightSource;
import scmc.blocks.ModBlocks;

public class TileEntityMovingLightSource extends TileEntity implements ITickable {
//	private EntityPlayer player;

	public TileEntityMovingLightSource(/*EntityPlayer player*/) {
//		setPlayer(player);
	}

//	public void setPlayer(EntityPlayer player) {
//		this.player = player;
//	}

	/**
	 * This controls whether the tile entity gets replaced whenever the block
	 * state is changed. Normally only want this when block actually is
	 * replaced.
	 */
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState) {
		return (oldState.getBlock() != newState.getBlock());
	}

	@Override
	public void update() {
		//Check if player has moved away from the tile entity
		EntityPlayer thePlayer = worldObj.getClosestPlayer(getPos().getX() + 0.5D, getPos().getY() + 0.5D, getPos().getZ() + 0.5D, 2.0D, false);
		if(thePlayer == null) {
			if(worldObj.getBlockState(getPos()).getBlock() == ModBlocks.BLOCK_MOVING_LIGHT_SOURCE) {
				worldObj.setBlockToAir(getPos());
			}
		} else if(thePlayer.getHeldItemMainhand().getItem() != null && !BlockMovingLightSource.isLightEmittingItem(thePlayer.getHeldItemMainhand().getItem())) {
			if(worldObj.getBlockState(getPos()).getBlock() == ModBlocks.BLOCK_MOVING_LIGHT_SOURCE) {
				worldObj.setBlockToAir(getPos());
			}
		}
	}
}