package ga.scmc.renderer;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.EntityProtossReaver;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelProtossReaver;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtossReaver extends RenderLiving<EntityProtossReaver> {
	private static final ResourceLocation PREAVER_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/preaver.png");
	protected ModelProtossReaver modelEntity;
	
	public RenderProtossReaver(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelProtossReaver) mainModel);
	}

	@Override
	public void doRender(EntityProtossReaver entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProtossReaver entity) {
		return PREAVER_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityProtossReaver entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(5.0F, 5.0F, 5.0F);
	}
}
