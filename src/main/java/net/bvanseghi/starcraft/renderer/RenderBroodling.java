package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelBroodling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderBroodling<T> extends RenderLiving<EntityBroodling> {

	private static final ResourceLocation BROODLING_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/broodling.png");

	protected ModelBroodling modelEntity;

	public RenderBroodling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelBroodling) mainModel);
	}

	public void renderBroodling(EntityBroodling entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderBroodling((EntityBroodling) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(EntityBroodling entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityBroodling entity) {
		return BROODLING_TEXTURES;
	}

}
