package ga.scmc.renderer;

import ga.scmc.entity.EntityCivilian;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelCivilian;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCivilian extends RenderLiving<EntityCivilian> {
	private static final ResourceLocation CIVILIAN_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/civilian.png");
	protected ModelCivilian modelEntity;

	public RenderCivilian(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelCivilian) mainModel);
	}

	@Override
	public void doRender(EntityCivilian entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCivilian entity) {
		return CIVILIAN_TEXTURES;
	}
}
