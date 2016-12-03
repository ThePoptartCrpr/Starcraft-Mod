package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityCivilian;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelCivilian;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderCivilian extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/civilian.png");

	protected ModelCivilian modelEntity;

	public RenderCivilian(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelCivilian) mainModel);
	}

	public void renderCivilian(EntityCivilian entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderCivilian((EntityCivilian) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderCivilian((EntityCivilian) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
