package net.bvanseghi.starcraft.events;

import net.bvanseghi.starcraft.entity.EntityDarkTemplar;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class LivingUpdateEventHandler {
	private static EntityPlayer player;
//	private static Iterable<ItemStack> armor;
	
	@SubscribeEvent
	public static void onLivingUpdate(LivingUpdateEvent event) {
		if(event.getEntity() instanceof EntityPlayer) {
			player = (EntityPlayer) event.getEntity();
//			armor = player.getArmorInventoryList();
			
			try {
				//FIXME: find a new way to pull this off
//				if(player.getCurrentArmor(0).getItem() instanceof ArmourGhostBoots && player.getCurrentArmor(1).getItem() instanceof ArmourGhostLeggings && player.getCurrentArmor(2).getItem() instanceof ArmourGhostChestplate && player.getCurrentArmor(3).getItem() instanceof ArmourGhostHelmet) {
//					player.setInvisible(true);
//				} else {
//					player.setInvisible(false);
//				}
			} catch(NullPointerException e) {
				player.setInvisible(false);
			}
		} else if(event.getEntity() instanceof EntityDarkTemplar && !StarcraftConfig.dTempVis) {
			event.getEntity().setInvisible(true);
		}
	}
}
