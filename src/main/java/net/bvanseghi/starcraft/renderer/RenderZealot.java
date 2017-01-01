package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityZealot;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelZealot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderZealot<T> extends RenderLiving<EntityZealot> {

	private static final ResourceLocation ZEALOT_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/zealot.png");

	protected ModelZealot modelEntity;

	public RenderZealot(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelZealot) mainModel);
	}

	public void renderZealot(EntityZealot entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderZealot((EntityZealot) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(EntityZealot entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityZealot entity) {
		return ZEALOT_TEXTURES;
	}

}
