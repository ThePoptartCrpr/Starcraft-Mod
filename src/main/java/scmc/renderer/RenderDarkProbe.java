package scmc.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityDarkProbe;
import scmc.lib.Reference;
import scmc.model.ModelDarkProbe;

public class RenderDarkProbe<T> extends RenderLiving<EntityDarkProbe> {

	private static final ResourceLocation DARK_PROBE_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/darkprobe.png");

	protected ModelDarkProbe modelEntity;

	public RenderDarkProbe(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelDarkProbe) mainModel);
	}
	
	public void doRender(EntityDarkProbe entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkProbe entity) {
		return DARK_PROBE_TEXTURES;
	}

}
