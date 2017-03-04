package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityScarab;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelScarab;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScarab<T> extends RenderLiving<EntityScarab> {

	private static final ResourceLocation SCARAB_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/scarab.png");
			
	protected ModelScarab modelEntity;

	public RenderScarab(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		
		modelEntity = ((ModelScarab) mainModel);
	}
	
	public void doRender(EntityScarab entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }
	
	protected void preRenderCallback(EntityScarab entitylivingbaseIn, float partialTickTime)
    {
		GL11.glTranslatef(0.0F, 0.25F, 0.0F);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(EntityScarab entity) {
		return SCARAB_TEXTURES;
	}

}
