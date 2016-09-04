package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelC14GaussRifle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderC14GaussRifle implements IItemRenderer {

	protected ModelC14GaussRifle c14GaussRifle;
	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/c14GaussRifle.png");

	public ItemRenderC14GaussRifle() {
		c14GaussRifle = new ModelC14GaussRifle();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case EQUIPPED:
		case EQUIPPED_FIRST_PERSON:
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		float sc = 1.3F;
		boolean fprendered = false;

		switch (type) {
		case EQUIPPED:
			GL11.glTranslatef(0.7F, 0.1F, 0.5F);
			GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
		case EQUIPPED_FIRST_PERSON: {
			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			GL11.glRotatef(80.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-40.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(0.4F, -0.5F, -0.4F);
			GL11.glScalef(sc, sc, sc);

			c14GaussRifle.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
		}
		default:
			break;
		}
	}
}
