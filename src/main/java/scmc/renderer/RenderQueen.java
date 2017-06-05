package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityQueen;
import scmc.lib.Reference;
import scmc.model.ModelQueen;

public class RenderQueen<T> extends RenderLiving<EntityQueen> {

	private static final ResourceLocation QUEEN_TEXTURES = new ResourceLocation(
			Reference.RL_BASE + "textures/entity/queen.png");

	protected ModelQueen modelEntity;

	public RenderQueen(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelQueen) mainModel);
	}
	
	public void doRender(EntityQueen entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityQueen entity) {
		return QUEEN_TEXTURES;
	}
	
	protected void preRenderCallback(EntityQueen entitylivingbaseIn, float partialTickTime)
    {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
    	GL11.glRotatef(28F, 0F, 1F, 0F);
    }
}