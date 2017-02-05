package net.bvanseghi.starcraft.tileentity;

import net.bvanseghi.starcraft.blocks.BlockMovingLightSource;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityMovingLightSource extends TileEntity implements ITickable
{
    public EntityPlayer thePlayer;
    
    public TileEntityMovingLightSource()
    {
        // after constructing the tile entity instance, remember to call 
        // the setPlayer() method.

    }
    
    @Override
	public void update() {
		 // check if player has moved away from the tile entity
        EntityPlayer thePlayer = worldObj.getClosestPlayer(
              getPos().getX()+0.5D, 
              getPos().getY()+0.5D, 
              getPos().getZ()+0.5D, 
              2.0D, false);
        if (thePlayer == null)
        {
            if (worldObj.getBlockState(getPos()).getBlock() == 
                  ModBlocks.BLOCKMOVINGLIGHTSOURCE)
            {
                worldObj.setBlockToAir(getPos());
            }
        }
        else if (thePlayer.getHeldItemMainhand().getItem() != null 
              && !BlockMovingLightSource.isLightEmittingItem(
                    thePlayer.getHeldItemMainhand().getItem()))
        {
            if (worldObj.getBlockState(getPos()).getBlock() == 
                  ModBlocks.BLOCKMOVINGLIGHTSOURCE)
            {
                worldObj.setBlockToAir(getPos());
            }            
        }
	}
    
    /**
     * This controls whether the tile entity gets replaced whenever the block state 
     * is changed. Normally only want this when block actually is replaced.
     */
    @Override
    public boolean shouldRefresh(
          World world, 
          BlockPos pos, 
          IBlockState oldState, 
          IBlockState newSate)
    {
        return (oldState.getBlock() != newSate.getBlock());
    }
    
    public void setPlayer(EntityPlayer parPlayer)
    {
        thePlayer = parPlayer;
    }
}