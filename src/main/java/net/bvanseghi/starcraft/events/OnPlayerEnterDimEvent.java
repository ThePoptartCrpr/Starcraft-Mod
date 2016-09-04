package net.bvanseghi.starcraft.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.bvanseghi.starcraft.achievement.Achievements;

public class OnPlayerEnterDimEvent {
	
	
	
	@SubscribeEvent
	public void onEnterChar(PlayerEvent.PlayerChangedDimensionEvent e) {
		if (e.toDim == 2) {
			e.player.addStat(Achievements.achievementEnterChar, 1);
			// add sound here
		}
	}
	
	
	@SubscribeEvent
	public void onEnterShakuras(PlayerEvent.PlayerChangedDimensionEvent e) {
		if (e.toDim == 3) {
			e.player.addStat(Achievements.achievementEnterShakuras, 1);
			// add sound here
		}
	}
}
