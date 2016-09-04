package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityProbe;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderProbe extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/probe.png");

	protected ModelProbe modelEntity;

	public RenderProbe(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelProbe) mainModel);
	}

	public void renderProbe(EntityProbe entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderProbe((EntityProbe) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderProbe((EntityProbe) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
