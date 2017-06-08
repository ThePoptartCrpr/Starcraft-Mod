package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityZergling;
import scmc.lib.Reference;
import scmc.model.ModelZergling;

public class RenderZergling<T> extends RenderLiving<EntityZergling> {

	private static final ResourceLocation ZERGLING_TEXTURES = new ResourceLocation(
			Reference.RL_BASE + "textures/entity/zergling.png");

	protected ModelZergling modelEntity;

	public RenderZergling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelZergling) mainModel);
	}
	
	public void doRender(EntityZergling entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityZergling entity) {
		return ZERGLING_TEXTURES;
	}
	
	protected void preRenderCallback(EntityZergling entitylivingbaseIn, float partialTickTime)
    {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
    }
}