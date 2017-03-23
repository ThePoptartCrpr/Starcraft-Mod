package scmc.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityLarva;
import scmc.lib.Reference;
import scmc.model.ModelLarva;

public class RenderLarva<T> extends RenderLiving<EntityLarva> {

	private static final ResourceLocation LARVA_TEXTURES = new ResourceLocation(
			Reference.RL_BASE + "textures/entity/larva.png");

	protected ModelLarva modelEntity;

	public RenderLarva(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelLarva) mainModel);
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