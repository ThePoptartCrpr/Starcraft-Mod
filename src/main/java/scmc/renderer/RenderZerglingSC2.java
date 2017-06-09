package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityZerglingSC2;
import scmc.lib.Reference;
import scmc.model.ModelZerglingSC2;

public class RenderZerglingSC2<T> extends RenderLiving<EntityZerglingSC2> {

	private static final ResourceLocation ZERGLINGSC2_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zerglingsc2.png");

	protected ModelZerglingSC2 modelEntity;

	public RenderZerglingSC2(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelZerglingSC2) mainModel);
	}

	@Override
	public void doRender(EntityZerglingSC2 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingSC2 entity) {
		return ZERGLINGSC2_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZerglingSC2 entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
	}
}