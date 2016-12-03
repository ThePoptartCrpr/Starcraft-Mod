package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityOverlord;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelOverlord;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderOverlord extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/overlord.png");

	protected ModelOverlord modelEntity;

	public RenderOverlord(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);

		modelEntity = ((ModelOverlord) mainModel);
	}

	public void renderOverlord(EntityOverlord entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderOverlord((EntityOverlord) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderOverlord((EntityOverlord) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
