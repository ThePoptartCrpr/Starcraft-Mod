package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelVespeneGeyserShakuras;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderVespeneGeyserShakuras extends TileEntitySpecialRenderer {

	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/vespeneGeyserShakuras.png");

	private ModelVespeneGeyserShakuras model;

	public RenderVespeneGeyserShakuras() {
		this.model = new ModelVespeneGeyserShakuras();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);

		this.bindTexture(texture);

		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

}
