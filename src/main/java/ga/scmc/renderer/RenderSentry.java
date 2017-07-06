package ga.scmc.renderer;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.EntitySentry;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelSentry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSentry extends RenderLiving<EntitySentry> {
	private static final ResourceLocation SENTRY_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/sentry.png");
	protected ModelSentry modelEntity;

	public RenderSentry(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelSentry) mainModel);
	}

	@Override
	public void doRender(EntitySentry entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySentry entity) {
		return SENTRY_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntitySentry entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(0.75F, 0.75F, 0.75F);
	}
}
