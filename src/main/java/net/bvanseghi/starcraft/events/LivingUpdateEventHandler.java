package net.bvanseghi.starcraft.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.bvanseghi.starcraft.armour.ArmourGhostBoots;
import net.bvanseghi.starcraft.armour.ArmourGhostChestplate;
import net.bvanseghi.starcraft.armour.ArmourGhostHelmet;
import net.bvanseghi.starcraft.armour.ArmourGhostLeggings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class LivingUpdateEventHandler {
	private EntityPlayer player;

	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event) {
		if(event.entity instanceof EntityPlayer) {
			player = (EntityPlayer) event.entity;
			
			try {
				if(player.getCurrentArmor(0).getItem() instanceof ArmourGhostBoots && player.getCurrentArmor(1).getItem() instanceof ArmourGhostLeggings && player.getCurrentArmor(2).getItem() instanceof ArmourGhostChestplate && player.getCurrentArmor(3).getItem() instanceof ArmourGhostHelmet) {
					setInvis(true);
				} else {
					setInvis(false);
				}
			} catch(NullPointerException e) {
				setInvis(false);
			}
		}
	}
	
	private void setInvis(boolean invisible) {
		player.setInvisible(invisible);
	}
}
