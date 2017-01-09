package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityProbe;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelProbe;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

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
