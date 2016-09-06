package net.bvanseghi.starcraft.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.bvanseghi.starcraft.achievement.Achievements;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.item.ItemStack;

public class OnPickupItemEvent {

	@SubscribeEvent
	public void onMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.mineralShard))) {
			e.player.addStat(Achievements.achievementMinedMinerals, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public void onRichMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.richMineralShard))) {
			e.player.addStat(Achievements.achievementMinedRichMinerals, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public void onRawVespeneObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.vespene, 0, 3))) {
			e.player.addStat(Achievements.achievementMinedVespene, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public void onMasterPsiBladeObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModWeapons.masterPsiBlade))) {
			e.player.addStat(Achievements.achievementGetMasterPsiBlade, 1);
			// add sound here
		}
	}
	
}
