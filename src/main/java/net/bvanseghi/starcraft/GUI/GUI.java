package net.bvanseghi.starcraft.GUI;

import java.util.Collection;
import java.util.Iterator;

import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GUI extends Gui {

	private Minecraft mc;

	private static final int STATS_ICON_SIZE = 7; // size of individual icons
													// (i.e hearts)
	private static final int STATS_ICON_SPACING = STATS_ICON_SIZE + 10; // spacing
																		// between
																		// the
																		// icons
	private static final int STATS_ICON_BASE_U = 10;
	private static final int STATS_ICON_BASE_V = 95;
	private static final int STATS_ICONS_PER_ROW = 8;

	public GUI(Minecraft mc) {
		super();
		this.mc = mc;
	}

	@SubscribeEvent(priority = EventPriority.NORMAL) // This is an annotation

	public void onRenderXPBar(RenderGameOverlayEvent event) { // Draw stuff
																// after XP bar
																// render

		int xPos = 123;
		int yPos = 202; // X, Y, offset on screen, i.e., the location the icon
						// will be drawn

		GL11.glColor4f(1F, 1F, 1F, 1F);
		GL11.glDisable(GL11.GL_LIGHTING); // Stuff
		// this.drawTexturedModalRect(xPos, yPos, STATS_ICON_BASE_U,
		// STATS_ICON_BASE_V, STATS_ICON_SIZE, STATS_ICON_SIZE);
	}

}
