package scmc.events;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import scmc.achievement.Achievements;
import scmc.items.ModItems;
import scmc.items.weapons.ModWeapons;

@EventBusSubscriber
public class OnPickupItemEvent {

	@SubscribeEvent
	public static void onMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.mineralShard))) {
			e.player.addStat(Achievements.achievementMinedMinerals, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onRichMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.richMineralShard))) {
			e.player.addStat(Achievements.achievementMinedRichMinerals, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onRawVespeneObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.vespene, 0, 3))) {
			e.player.addStat(Achievements.achievementMinedVespene, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onMasterPsiBladeObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModWeapons.MASTER_PSI_BLADE))) {
			e.player.addStat(Achievements.achievementGetMasterPsiBlade, 1);
			// add sound here
		}
	}
}