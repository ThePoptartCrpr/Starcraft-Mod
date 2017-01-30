package net.bvanseghi.starcraft.events;

import net.bvanseghi.starcraft.blocks.BlockMovingLightSource;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class PlayerTickEventHandler {
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(PlayerTickEvent event)
	{        
	    if (event.phase == TickEvent.Phase.START && !event.player.worldObj.isRemote)
	    {
	        if (event.player.getHeldItemMainhand() != null)
	        {
	            if (BlockMovingLightSource.isLightEmittingItem(
	                  event.player.getHeldItemMainhand().getItem()))
	            {
	                int blockX = MathHelper.floor_double(event.player.posX);
	                int blockY = MathHelper.floor_double(event.player.posY-0.2D - 
	                      event.player.getYOffset());
	                int blockZ = MathHelper.floor_double(event.player.posZ);
	                // place light at head level
	                BlockPos blockLocation = new BlockPos(blockX, blockY, blockZ).up();
	                if (event.player.worldObj.getBlockState(blockLocation).getBlock() == 
	                      Blocks.AIR)
	                {
	                    event.player.worldObj.setBlockState(
	                          blockLocation, 
	                          ModBlocks.BLOCKMOVINGLIGHTSOURCE.getDefaultState());
	                }
	                else if (event.player.worldObj.getBlockState(
	                      blockLocation.add(
	                            event.player.getLookVec().xCoord, 
	                            event.player.getLookVec().yCoord, 
	                            event.player.getLookVec().zCoord)).getBlock() == Blocks.AIR)
	                {
	                    event.player.worldObj.setBlockState(
	                          blockLocation.add(
	                                event.player.getLookVec().xCoord, 
	                                event.player.getLookVec().yCoord, 
	                                event.player.getLookVec().zCoord), 
	                                ModBlocks.BLOCKMOVINGLIGHTSOURCE.getDefaultState());
	                }
	            }else{
	            	
	            }
	        }else {
	        	
	        }
	    }
	}
	
}
