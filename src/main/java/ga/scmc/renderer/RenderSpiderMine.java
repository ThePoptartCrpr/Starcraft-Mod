package ga.scmc.renderer;

import ga.scmc.entity.EntitySpiderMine;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelSpiderMine;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpiderMine extends RenderLiving<EntitySpiderMine> {
	private static final ResourceLocation CIVILIAN_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/models/spidermine.png");
	protected ModelSpiderMine modelEntity;

	public RenderSpiderMine(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelSpiderMine) mainModel);
	}

	@Override
	public void doRender(EntitySpiderMine entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySpiderMine entity) {
		return CIVILIAN_TEXTURES;
	}
}
