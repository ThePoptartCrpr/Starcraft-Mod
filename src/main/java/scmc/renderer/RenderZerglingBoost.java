package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityZerglingBoost;
import scmc.entity.layers.LayerZerglingBoost;
import scmc.lib.Reference;
import scmc.model.ModelZerglingBoost;

public class RenderZerglingBoost<T> extends RenderLiving<EntityZerglingBoost> {

	private static final ResourceLocation ZERGLINGBOOST_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zerglingboost.png");

	protected ModelZerglingBoost modelEntity;

	public RenderZerglingBoost(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZerglingBoost) mainModel);
		addLayer(new LayerZerglingBoost(this));
	}

	@Override
	public void doRender(EntityZerglingBoost entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingBoost entity) {
		return ZERGLINGBOOST_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZerglingBoost entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
	}
}