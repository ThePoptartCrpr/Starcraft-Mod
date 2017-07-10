package ga.scmc.renderer.entity;

import ga.scmc.entity.living.EntityProbe;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProbe extends RenderLiving<EntityProbe> {
	private static final ResourceLocation PROBE_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/probe.png");
	protected ModelProbe modelEntity;

	public RenderProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelProbe) mainModel);
	}

	@Override
	public void doRender(EntityProbe entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityProbe entity) {
		return PROBE_TEXTURES;
	}
}
