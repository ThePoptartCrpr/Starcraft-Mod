package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityZerglingRaptor;
import scmc.lib.Reference;
import scmc.model.ModelZerglingRaptor;

public class RenderZerglingRaptor<T> extends RenderLiving<EntityZerglingRaptor> {

	private static final ResourceLocation ZERGLINGRAPTOR_TEXTURES = new ResourceLocation(
			Reference.RL_BASE + "textures/entity/zerglingraptor.png");

	protected ModelZerglingRaptor modelEntity;

	public RenderZerglingRaptor(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelZerglingRaptor) mainModel);
	}
	
	public void doRender(EntityZerglingRaptor entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingRaptor entity) {
		return ZERGLINGRAPTOR_TEXTURES;
	}
	
	protected void preRenderCallback(EntityZerglingRaptor entitylivingbaseIn, float partialTickTime)
    {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
    	GL11.glRotatef(28F, 0F, 1F, 0F);
    }
}