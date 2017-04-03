package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityZealot;
import scmc.lib.Reference;
import scmc.model.ModelZealot;

public class RenderZealot<T> extends RenderLiving<EntityZealot> {

	private static final ResourceLocation ZEALOT_TEXTURES = new ResourceLocation(
			Reference.RL_BASE + "textures/entity/zealot.png");
			
	protected ModelZealot modelEntity;

	public RenderZealot(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		
		modelEntity = ((ModelZealot) mainModel);
	}
	
	public void doRender(EntityZealot entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }
	
	protected void preRenderCallback(EntityZealot entitylivingbaseIn, float partialTickTime)
    {
		GL11.glScalef(0.70F, 0.70F, 0.70F);
    	GL11.glRotatef(28F, 0F, 1F, 0F);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(EntityZealot entity) {
		return ZEALOT_TEXTURES;
	}

}