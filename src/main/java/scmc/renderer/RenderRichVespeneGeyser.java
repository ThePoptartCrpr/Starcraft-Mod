package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;
import scmc.model.ModelRichVespeneGeyser;

@SuppressWarnings("rawtypes")
public class RenderRichVespeneGeyser<T> extends TileEntitySpecialRenderer {

	private static final ResourceLocation texture = new ResourceLocation(
			Reference.RL_BASE + "textures/models/richVespeneGeyser.png"); //And again

	private ModelRichVespeneGeyser model;

	public RenderRichVespeneGeyser() {
		this.model = new ModelRichVespeneGeyser();
	}

	public void renderTileEntityAt(T te, double x, double y, double z, float partialTicks, int destroyStage)
    {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);

		this.bindTexture(texture);

		GL11.glPushMatrix();
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
    }

}