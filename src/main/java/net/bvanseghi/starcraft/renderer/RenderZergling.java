package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityZergling;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelZergling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderZergling<T> extends RenderLiving<EntityZergling> {

	private static final ResourceLocation ZERGLING_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/zergling.png");

	protected ModelZergling modelEntity;

	public RenderZergling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelZergling) mainModel);
	}

	public void renderZergling(EntityZergling entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderZergling((EntityZergling) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(EntityZergling entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityZergling entity) {
		return ZERGLING_TEXTURES;
	}
	
	//TODO: Fix this
		protected void preRenderCallback(T entitylivingbaseIn, float partialTickTime) {
			GL11.glScalef(1.25F, 1.25F, 1.25F);
	    	GL11.glRotatef(28F, 0F, 1F, 0F);
		}
}
