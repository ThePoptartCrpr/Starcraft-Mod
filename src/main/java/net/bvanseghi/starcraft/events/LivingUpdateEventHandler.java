package net.bvanseghi.starcraft.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.bvanseghi.starcraft.armour.ArmourGhostBoots;
import net.bvanseghi.starcraft.armour.ArmourGhostChestplate;
import net.bvanseghi.starcraft.armour.ArmourGhostHelmet;
import net.bvanseghi.starcraft.armour.ArmourGhostLeggings;
import net.bvanseghi.starcraft.entity.EntityDarkTemplar;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class LivingUpdateEventHandler {
	private EntityPlayer player;
	private EntityDarkTemplar dtentity;
	World world;
	
	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event) {
		if(event.entity instanceof EntityPlayer) {
			player = (EntityPlayer) event.entity;
			
			try {
				if(player.getCurrentArmor(0).getItem() instanceof ArmourGhostBoots && player.getCurrentArmor(1).getItem() instanceof ArmourGhostLeggings && player.getCurrentArmor(2).getItem() instanceof ArmourGhostChestplate && player.getCurrentArmor(3).getItem() instanceof ArmourGhostHelmet) {
					player.setInvisible(true);
				} else {
					player.setInvisible(false);
				}
			} catch(NullPointerException e) {
				player.setInvisible(false);
			}
		} /*else if(event.entity instanceof EntityDarkTemplar) {
			event.entity.setInvisible(true);
		}*/
	}
}
