package net.bvanseghi.starcraft.renderer;

import net.bvanseghi.starcraft.entity.EntityCivilian;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelCivilian;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderCivilian<T> extends RenderLiving<EntityCivilian> {

	private static final ResourceLocation CIVILIAN_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/civilian.png");

	protected ModelCivilian modelEntity;

	public RenderCivilian(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelCivilian) mainModel);
	}
	
	public void doRender(EntityCivilian entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityCivilian entity) {
		return CIVILIAN_TEXTURES;
	}

}
