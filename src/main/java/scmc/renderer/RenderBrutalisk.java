package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityBrutalisk;
import scmc.lib.Reference;
import scmc.model.ModelBrutalisk;

public class RenderBrutalisk<T> extends RenderLiving<EntityBrutalisk> {

	private static final ResourceLocation BRUTALISK_TEXTURES = new ResourceLocation(
			Reference.RL_BASE + "textures/entity/brutalisk.png");
			
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
    }
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBrutalisk entity) {
		return BRUTALISK_TEXTURES;
	}

}