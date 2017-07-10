package ga.scmc.renderer.entity;

import ga.scmc.entity.living.EntityDarkProbe;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelDarkProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDarkProbe extends RenderLiving<EntityDarkProbe> {
	private static final ResourceLocation DARK_PROBE_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/darkprobe.png");
	protected ModelDarkProbe modelEntity;

	public RenderDarkProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelDarkProbe) mainModel);
	}

	@Override
	public void doRender(EntityDarkProbe entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkProbe entity) {
		return DARK_PROBE_TEXTURES;
	}
}
