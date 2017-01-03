package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityOverlord;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelOverlord;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderOverlord<T> extends RenderLiving<EntityOverlord> {

	private static final ResourceLocation OVERLORD_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/overlord.png");

	protected ModelOverlord modelEntity;

	public RenderOverlord(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelOverlord) mainModel);
	}

	public void renderOverlord(EntityOverlord entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderOverlord((EntityOverlord) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(EntityOverlord entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityOverlord entity) {
		return OVERLORD_TEXTURES;
	}

}
