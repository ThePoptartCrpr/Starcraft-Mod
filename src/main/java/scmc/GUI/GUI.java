package scmc.GUI;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class GUI extends Gui {
//	private static final int STATS_ICON_SIZE = 7; // size of individual icons (i.e hearts)
//	private static final int STATS_ICON_SPACING = STATS_ICON_SIZE + 10; // spacing between the icons
//	private static final int STATS_ICON_BASE_U = 10;
//	private static final int STATS_ICON_BASE_V = 95;
//	private static final int STATS_ICONS_PER_ROW = 8;

	//Draw stuff when XP bar is overlayed
	@SubscribeEvent
	public void onRenderXPBar(RenderGameOverlayEvent event) {

//		int xPos = 123; //X offset on screen
//		int yPos = 202; //Y offset on screen

		GL11.glColor4f(1F, 1F, 1F, 1F);
		GL11.glDisable(GL11.GL_LIGHTING); // Stuff
		// this.drawTexturedModalRect(xPos, yPos, STATS_ICON_BASE_U,
		// STATS_ICON_BASE_V, STATS_ICON_SIZE, STATS_ICON_SIZE);
	}
}
