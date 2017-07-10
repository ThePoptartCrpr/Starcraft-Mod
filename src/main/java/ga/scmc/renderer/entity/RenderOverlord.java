package ga.scmc.renderer.entity;

import ga.scmc.entity.living.EntityOverlord;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelOverlord;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOverlord extends RenderLiving<EntityOverlord> {
	private static final ResourceLocation OVERLORD_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/overlord.png");
	protected ModelOverlord modelEntity;
	
	public RenderOverlord(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelOverlord) mainModel);
	}

	@Override
	public void doRender(EntityOverlord entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityOverlord entity) {
		return OVERLORD_TEXTURES;
	}
}
