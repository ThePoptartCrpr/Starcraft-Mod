package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityDarkTemplar;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelDarkTemplar;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderDarkTemplar<T> extends RenderLiving<EntityDarkTemplar> {

	private static final ResourceLocation DARK_TEMPLAR_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/darktemplar.png");

	protected ModelDarkTemplar modelEntity;

	public RenderDarkTemplar(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelDarkTemplar) mainModel);
	}

	public void doRender(EntityDarkTemplar entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (!this.renderOutlines) {
			this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkTemplar entity) {
		return DARK_TEMPLAR_TEXTURES;
	}
	
	//TODO: Fix this
	protected void preRenderCallback(T entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(0.70F, 0.70F, 0.70F);
		GL11.glRotatef(28F, 0F, 1F, 0F);
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.7f);
	}
}
