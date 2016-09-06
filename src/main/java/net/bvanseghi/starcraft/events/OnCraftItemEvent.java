package net.bvanseghi.starcraft.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.bvanseghi.starcraft.achievement.Achievements;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.item.ItemStack;

public class OnCraftItemEvent {
	
	@SubscribeEvent
	public void onPsiBladeFocuserObtained(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual((new ItemStack(ModItems.psiBladeFocuserUncharged)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuser, 1);
			// add sound here
		}
	}
	
	@SubscribeEvent
	public void onDarkPsiBladeFocuserObtained(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual((new ItemStack(ModItems.darkPsiBladeFocuserUncharged)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}
	}
	
	@SubscribeEvent
	public void onWarpBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual((new ItemStack(ModWeapons.warpBlade)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}
	}
	
	@SubscribeEvent
	public void onDarkWarpBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual((new ItemStack(ModWeapons.darkWarpBlade)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}
	}
	
	
	@SubscribeEvent
	public void onPsiBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual((new ItemStack(ModWeapons.psiBlade)))) {
			e.player.addStat(Achievements.achievementGetPsiBlade, 1);
			// add sound here
		}
	}
	
	@SubscribeEvent
	public void onDarkPsiBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual((new ItemStack(ModWeapons.darkPsiBlade)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeDark, 1);
			// add sound here
		}
	}
	
	
	@SubscribeEvent
	public void onC14GaussRifleObtained(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual(new ItemStack(ModItems.C14GaussRifle))) {
			e.player.addStat(Achievements.achievementGetC14GaussRifle, 1);
			// add sound here
		}
	}
	
	
	
}
