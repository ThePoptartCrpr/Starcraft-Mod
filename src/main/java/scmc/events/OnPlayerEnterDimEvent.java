package scmc.events;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import scmc.achievement.Achievements;

@EventBusSubscriber
public class OnPlayerEnterDimEvent {

	@SubscribeEvent
	public static void onEnterChar(PlayerEvent.PlayerChangedDimensionEvent e) {
		if(e.toDim == 2) {
			e.player.addStat(Achievements.achievementEnterChar, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onEnterShakuras(PlayerEvent.PlayerChangedDimensionEvent e) {
		if(e.toDim == 3) {
			e.player.addStat(Achievements.achievementEnterShakuras, 1);
			// add sound here
		}
	}
}