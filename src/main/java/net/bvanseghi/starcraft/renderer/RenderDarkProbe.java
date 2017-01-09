package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityDarkProbe;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelDarkProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

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
