package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityScourge;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelScourge;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderScourge extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/scourge.png");

	protected ModelScourge modelEntity;

	public RenderScourge(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelScourge) mainModel);
	}

	public void renderScourge(EntityScourge entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderScourge((EntityScourge) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderScourge((EntityScourge) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
