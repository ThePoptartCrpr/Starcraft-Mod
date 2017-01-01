package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelLarvaCocoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderLarvaCocoon<T> extends RenderLiving<EntityLarvaCocoon> {

	private static final ResourceLocation LARVA_COCOON_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/larvacocoon.png");

	protected ModelLarvaCocoon modelEntity;

	public RenderLarvaCocoon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelLarvaCocoon) mainModel);
	}

	public void renderLarvaCocoon(EntityLarvaCocoon entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderLarvaCocoon((EntityLarvaCocoon) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(EntityLarvaCocoon entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityLarvaCocoon entity) {
		return LARVA_COCOON_TEXTURES;
	}

}
