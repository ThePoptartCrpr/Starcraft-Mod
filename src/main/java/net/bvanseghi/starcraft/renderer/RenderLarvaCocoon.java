package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelLarvaCocoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderLarvaCocoon extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/larvaCocoon.png");

	protected ModelLarvaCocoon modelEntity;

	public RenderLarvaCocoon(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelLarvaCocoon) mainModel);
	}

	public void renderLarvaCocoon(EntityLarvaCocoon entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderLarvaCocoon((EntityLarvaCocoon) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderLarvaCocoon((EntityLarvaCocoon) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
