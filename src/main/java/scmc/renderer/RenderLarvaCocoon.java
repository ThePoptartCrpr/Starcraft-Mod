package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityLarvaCocoon;
import scmc.lib.Reference;
import scmc.model.ModelLarvaCocoon;

public class RenderLarvaCocoon<T> extends RenderLiving<EntityLarvaCocoon> {

	private static final ResourceLocation LARVA_COCOON_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/larvacocoon.png");

	protected ModelLarvaCocoon modelEntity;

	public RenderLarvaCocoon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelLarvaCocoon) mainModel);
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

	protected void preRenderCallback(EntityLarvaCocoon entitylivingbaseIn, float partialTickTime)
    {
		GL11.glScalef(1.7F, 1.7F, 1.7F);
    }
}