package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityScourge;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelScourge;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderScourge<T> extends RenderLiving<EntityScourge> {

	private static final ResourceLocation SCOURGE_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/scourge.png");

	protected ModelScourge modelEntity;

	public RenderScourge(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelScourge) mainModel);
	}
	
	public void doRender(EntityScourge entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityScourge entity) {
		return SCOURGE_TEXTURES;
	}

}
