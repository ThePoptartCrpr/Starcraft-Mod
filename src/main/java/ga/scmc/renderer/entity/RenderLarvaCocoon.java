package ga.scmc.renderer.entity;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.living.EntityLarvaCocoon;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelLarvaCocoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLarvaCocoon extends RenderLiving<EntityLarvaCocoon> {
	private static final ResourceLocation LARVA_COCOON_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/larvacocoon.png");
	protected ModelLarvaCocoon modelEntity;

	public RenderLarvaCocoon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelLarvaCocoon) mainModel);
	}

	@Override
	public void doRender(EntityLarvaCocoon entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLarvaCocoon entity) {
		return LARVA_COCOON_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityLarvaCocoon entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.7F, 1.7F, 1.7F);
	}
}
