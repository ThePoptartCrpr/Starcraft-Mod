package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityZerglingRaptor;
import scmc.entity.layers.LayerZerglingRaptor;
import scmc.lib.Reference;
import scmc.model.ModelZerglingRaptor;

@SuppressWarnings("unused")
public class RenderZerglingRaptor<T> extends RenderLiving<EntityZerglingRaptor> {
	private static final ResourceLocation ZERGLINGRAPTOR_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zerglingraptor.png");
	protected ModelZerglingRaptor modelEntity;

	@SuppressWarnings({"rawtypes", "unchecked"})
	public RenderZerglingRaptor(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZerglingRaptor) mainModel);
		addLayer(new LayerZerglingRaptor(this));
	}

	@Override
	public void doRender(EntityZerglingRaptor entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingRaptor entity) {
		return ZERGLINGRAPTOR_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZerglingRaptor entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
	}
}
