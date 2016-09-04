package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityDarkProbe;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelDarkProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderDarkProbe extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/darkProbe.png");

	protected ModelDarkProbe modelEntity;

	public RenderDarkProbe(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelDarkProbe) mainModel);
	}

	public void renderDarkProbe(EntityDarkProbe entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderDarkProbe((EntityDarkProbe) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderDarkProbe((EntityDarkProbe) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
