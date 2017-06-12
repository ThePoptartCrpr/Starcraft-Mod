package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityZerglingSwarmling;
import scmc.entity.layers.LayerZerglingSwarmling;
import scmc.lib.Reference;
import scmc.model.ModelZerglingSwarmling;

public class RenderZerglingSwarmling<T> extends RenderLiving<EntityZerglingSwarmling> {

	private static final ResourceLocation ZERGLINGSWARMLING_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zerglingswarmling.png");

	protected ModelZerglingSwarmling modelEntity;

	public RenderZerglingSwarmling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZerglingSwarmling) mainModel);
		addLayer(new LayerZerglingSwarmling(this));
	}

	@Override
	public void doRender(EntityZerglingSwarmling entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingSwarmling entity) {
		return ZERGLINGSWARMLING_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZerglingSwarmling entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
	}
}