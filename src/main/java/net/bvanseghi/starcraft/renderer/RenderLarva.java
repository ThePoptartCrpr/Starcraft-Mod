package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelLarva;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderLarva<T> extends RenderLiving<EntityLarva> {

	private static final ResourceLocation LARVA_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/larva.png");

	protected ModelLarva modelEntity;

	public RenderLarva(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelLarva) mainModel);
	}

	public void renderLarva(EntityLarva entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderLarva((EntityLarva) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(EntityLarva entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityLarva entity) {
		return LARVA_TEXTURES;
	}

}
