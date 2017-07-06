package ga.scmc.renderer.entity;

import ga.scmc.entity.living.EntityScourge;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelScourge;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScourge extends RenderLiving<EntityScourge> {
	private static final ResourceLocation SCOURGE_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/scourge.png");
	protected ModelScourge modelEntity;

	public RenderScourge(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelScourge) mainModel);
	}

	@Override
	public void doRender(EntityScourge entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityScourge entity) {
		return SCOURGE_TEXTURES;
	}
}
