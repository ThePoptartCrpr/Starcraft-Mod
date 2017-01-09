package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityBrutalisk;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelBrutalisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrutalisk<T> extends RenderLiving<EntityBrutalisk> {

	private static final ResourceLocation BRUTALISK_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/brutalisk.png");
			
	protected ModelBrutalisk modelEntity;

	public RenderBrutalisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		
		modelEntity = ((ModelBrutalisk) mainModel);
	}
	
	public void doRender(EntityBrutalisk entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }
	
	protected void preRenderCallback(EntityBrutalisk entitylivingbaseIn, float partialTickTime)
    {
		GL11.glScalef(3.0F, 3.0F, 3.0F);
    	GL11.glRotatef(28F, 0F, 1F, 0F);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBrutalisk entity) {
		return BRUTALISK_TEXTURES;
	}

}
