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
	public void onC14GaussRifleObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.C14GaussRifle))) {
			e.player.addStat(Achievements.achievementGetC14GaussRifle, 1);
			// add sound here
		}
	}
	
	@SubscribeEvent
	public void onPsiBladeObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModWeapons.psiBlade))) {
			e.player.addStat(Achievements.achievementGetPsiBlade, 1);
			// add sound here
		}
	}
	
	
}
