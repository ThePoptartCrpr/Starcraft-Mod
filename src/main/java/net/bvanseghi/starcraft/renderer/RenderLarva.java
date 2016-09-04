package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.model.ModelLarva;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderLarva extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			REFERENCE.MODID + ":" + "textures/model/larva.png");

	protected ModelLarva modelEntity;

	public RenderLarva(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelLarva) mainModel);
	}

	public void renderLarva(EntityLarva entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderLarva((EntityLarva) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderLarva((EntityLarva) entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
