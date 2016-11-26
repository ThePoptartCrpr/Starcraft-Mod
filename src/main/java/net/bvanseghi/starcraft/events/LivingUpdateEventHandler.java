package net.bvanseghi.starcraft.events;

import net.bvanseghi.starcraft.armour.ArmourGhostBoots;
import net.bvanseghi.starcraft.armour.ArmourGhostChestplate;
import net.bvanseghi.starcraft.armour.ArmourGhostHelmet;
import net.bvanseghi.starcraft.armour.ArmourGhostLeggings;
import net.bvanseghi.starcraft.entity.EntityDarkTemplar;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
//import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class LivingUpdateEventHandler {
	private static EntityPlayer player;
	
	@SubscribeEvent
	public static void onLivingUpdate(LivingUpdateEvent event) {
		if(event.getEntity() instanceof EntityPlayer) {
			player = (EntityPlayer) event.getEntity();
			
			try {
				if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmourGhostHelmet && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmourGhostChestplate && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmourGhostLeggings && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmourGhostBoots) {
					player.setInvisible(true);
				} else {
					player.setInvisible(false);
				}
			} catch(NullPointerException e) {
				player.setInvisible(false);
			}
		} else if(event.getEntity() instanceof EntityDarkTemplar && !StarcraftConfig.dTempVis) {
			event.getEntity().setInvisible(true);
		}
	}
}
