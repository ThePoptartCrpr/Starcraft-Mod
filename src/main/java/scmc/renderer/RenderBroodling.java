package scmc.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityBroodling;
import scmc.lib.Reference;
import scmc.model.ModelBroodling;

public class RenderBroodling<T> extends RenderLiving<EntityBroodling> {

	private static final ResourceLocation BROODLING_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/broodling.png");

	protected ModelBroodling modelEntity;

	public RenderBroodling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelBroodling) mainModel);
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
