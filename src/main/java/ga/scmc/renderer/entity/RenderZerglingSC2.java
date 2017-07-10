package ga.scmc.renderer.entity;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.living.EntityZerglingSC2;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelZerglingSC2;
import ga.scmc.renderer.layers.LayerZerglingSC2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("unused")
public class RenderZerglingSC2<T> extends RenderLiving<EntityZerglingSC2> {
	private static final ResourceLocation ZERGLINGSC2_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zerglingsc2.png");
	protected ModelZerglingSC2 modelEntity;

	@SuppressWarnings({"rawtypes", "unchecked"})
	public RenderZerglingSC2(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZerglingSC2) mainModel);
		addLayer(new LayerZerglingSC2(this));
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
