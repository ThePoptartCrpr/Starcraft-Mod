package ga.scmc.events;

import ga.scmc.achievement.Achievements;
import ga.scmc.items.ModItems;
import ga.scmc.items.weapons.ModWeapons;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@EventBusSubscriber
public class OnPickupItemEvent {

	@SubscribeEvent
	public static void onMasterPsiBladeObtained(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModWeapons.MASTER_PSI_BLADE))) {
			e.player.addStat(Achievements.achievementGetMasterPsiBlade, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.MINERAL_SHARD))) {
			e.player.addStat(Achievements.achievementMinedMinerals, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onRawVespeneObtained(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.VESPENE, 0, 3))) {
			e.player.addStat(Achievements.achievementMinedVespene, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onRichMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.RICH_MINERAL_SHARD))) {
			e.player.addStat(Achievements.achievementMinedRichMinerals, 1);
			// add sound here
		}
	}
}