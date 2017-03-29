package scmc.events;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import scmc.blocks.BlockMovingLightSource;
import scmc.blocks.ModBlocks;

@EventBusSubscriber
public class PlayerTickEventHandler {
	
	@SubscribeEvent(receiveCanceled = true)
	public void onPlayerTick(PlayerTickEvent event)
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
	                          ModBlocks.BLOCK_MOVING_LIGHT_SOURCE.getDefaultState());
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
	                                ModBlocks.BLOCK_MOVING_LIGHT_SOURCE.getDefaultState());
	                }
	            }
	        }
	    }
	}
}
