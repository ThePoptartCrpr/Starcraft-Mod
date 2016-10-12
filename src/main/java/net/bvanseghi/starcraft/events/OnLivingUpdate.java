package net.bvanseghi.starcraft.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.bvanseghi.starcraft.armour.ArmourGhostBoots;
import net.bvanseghi.starcraft.armour.ArmourGhostChestplate;
import net.bvanseghi.starcraft.armour.ArmourGhostHelmet;
import net.bvanseghi.starcraft.armour.ArmourGhostLeggings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

//Because there's no "put on/take off armor" event yet, and ItemArmor#onArmorTick didn't show promise :(
public class OnLivingUpdate {
	private EntityPlayer player;

	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event) {
		if(event.entityLiving instanceof EntityPlayer) {
			player = (EntityPlayer) event.entityLiving;
			
			//Longest if statement I've ever written o_O
			if(player.inventory.armorItemInSlot(0).getItem() instanceof ArmourGhostHelmet && player.inventory.armorItemInSlot(1).getItem() instanceof ArmourGhostChestplate && player.inventory.armorItemInSlot(2).getItem() instanceof ArmourGhostLeggings && player.inventory.armorItemInSlot(3).getItem() instanceof ArmourGhostBoots) {
				player.setInvisible(true);
			} else {
				player.setInvisible(false);
			}
		}
		
		//TODO: strenuously test this to ensure that it doesn't interfere with potions, spectator mode, etc.
	}
}
