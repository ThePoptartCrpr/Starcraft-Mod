package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityZergling;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelZergling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderZergling extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/zergling.png");

	protected ModelZergling modelEntity;

	public RenderZergling(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelZergling) mainModel);
	}

	public void renderZergling(EntityZergling entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderZergling((EntityZergling) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderZergling((EntityZergling) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}
	
	 protected void preRenderCallback(EntityLivingBase entity, float f){
		 	GL11.glScalef(1.25F, 1.25F, 1.25F);
	    	GL11.glRotatef(28F, 0F, 1F, 0F);
	    }

}
