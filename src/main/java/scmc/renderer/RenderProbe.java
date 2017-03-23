package scmc.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityProbe;
import scmc.lib.Reference;
import scmc.model.ModelProbe;

public class RenderProbe<T> extends RenderLiving<EntityProbe> {

	private static final ResourceLocation PROBE_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/probe.png");

	protected ModelProbe modelEntity;

	public RenderProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelProbe) mainModel);
	}
	
	public void doRender(EntityProbe entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityProbe entity) {
		return PROBE_TEXTURES;
	}

}