package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityProtossReaver;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelProtossReaver;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtossReaver<T> extends RenderLiving<EntityProtossReaver> {

	private static final ResourceLocation PREAVER_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/preaver.png");
			
	protected ModelProtossReaver modelEntity;

	public RenderProtossReaver(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		
		modelEntity = ((ModelProtossReaver) mainModel);
	}
	
	public void doRender(EntityProtossReaver entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }
	
	protected void preRenderCallback(EntityProtossReaver entitylivingbaseIn, float partialTickTime)
    {
		GL11.glScalef(5.0F, 5.0F, 5.0F);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(EntityProtossReaver entity) {
		return PREAVER_TEXTURES;
	}

}
