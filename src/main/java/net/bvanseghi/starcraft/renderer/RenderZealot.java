package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityZealot;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelZealot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderZealot extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/zealot.png");

	protected ModelZealot modelEntity;

	public RenderZealot(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = (ModelZealot) mainModel;
	}

	public void renderArmoredZealot(EntityZealot entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderArmoredZealot((EntityZealot) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderArmoredZealot((EntityZealot) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}
	   
     protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glScalef(0.70F, 0.70F, 0.70F);
    	GL11.glRotatef(28F, 0F, 1F, 0F);
    }

   
}
