package scmc.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
// import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scmc.entity.EntityDarkTemplar;
import scmc.items.armour.ArmourGhostBoots;
import scmc.items.armour.ArmourGhostChestplate;
import scmc.items.armour.ArmourGhostHelmet;
import scmc.items.armour.ArmourGhostLeggings;
import scmc.lib.StarcraftConfig;

@EventBusSubscriber
public class LivingUpdateEventHandler {

	private static EntityPlayer player;

	@SubscribeEvent
	public static void onLivingUpdate(LivingUpdateEvent event) {
		if(event.getEntity() instanceof EntityPlayer) {
			player = (EntityPlayer) event.getEntity();

			try {
				if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmourGhostHelmet
						&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmourGhostChestplate
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmourGhostLeggings
						&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmourGhostBoots) {
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
