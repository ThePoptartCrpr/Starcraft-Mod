package ga.scmc.events;

import ga.scmc.entity.EntityDarkTemplar;
import ga.scmc.items.armor.ArmorGhostBoots;
import ga.scmc.items.armor.ArmorGhostChestplate;
import ga.scmc.items.armor.ArmorGhostHelmet;
import ga.scmc.items.armor.ArmorGhostLeggings;
import ga.scmc.lib.StarcraftConfig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
// import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class LivingUpdateEventHandler {

	@SubscribeEvent
	public static void onLivingUpdate(LivingUpdateEvent event) {
		if(event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();

			try {
				if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmorGhostHelmet
						&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmorGhostChestplate
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmorGhostLeggings
						&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorGhostBoots) {
					player.setInvisible(true);
				} else {
					player.setInvisible(false);
				}
			} catch(@SuppressWarnings("unused") NullPointerException e) {
				player.setInvisible(false);
			}
		} else if(event.getEntity() instanceof EntityDarkTemplar && !StarcraftConfig.BOOL_IS_DARK_TEMPLAR_VISIBLE) {
			event.getEntity().setInvisible(false);
		}
	}
}