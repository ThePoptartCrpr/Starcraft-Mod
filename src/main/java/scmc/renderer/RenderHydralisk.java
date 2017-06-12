package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityHydralisk;
import scmc.entity.layers.LayerHydralisk;
import scmc.lib.Reference;
import scmc.model.ModelHydralisk;

public class RenderHydralisk<T> extends RenderLiving<EntityHydralisk> {

	private static final ResourceLocation ZERGLING_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/hydralisk.png");

	protected ModelHydralisk modelEntity;

	public RenderHydralisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelHydralisk) mainModel);
		addLayer(new LayerHydralisk(this));
	}

	@Override
	public void doRender(EntityHydralisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydralisk entity) {
		return ZERGLING_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityHydralisk entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.3F, 1.3F, 1.3F);
	}
}