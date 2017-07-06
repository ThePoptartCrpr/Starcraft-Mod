package ga.scmc.renderer.entity;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.living.EntityZergling;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelZergling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZergling extends RenderLiving<EntityZergling> {
	private static final ResourceLocation ZERGLING_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zergling.png");
	protected ModelZergling modelEntity;

	public RenderZergling(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZergling) mainModel);
	}

	@Override
	public void doRender(EntityZergling entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZergling entity) {
		return ZERGLING_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZergling entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
	}
}
