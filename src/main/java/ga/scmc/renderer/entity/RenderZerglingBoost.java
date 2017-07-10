package ga.scmc.renderer.entity;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.living.EntityZerglingBoost;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelZerglingBoost;
import ga.scmc.renderer.layers.LayerZerglingBoost;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//You know the drill; no more of these comments
@SuppressWarnings("unused")
public class RenderZerglingBoost<T> extends RenderLiving<EntityZerglingBoost> {
	private static final ResourceLocation ZERGLINGBOOST_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zerglingboost.png");
	protected ModelZerglingBoost modelEntity;

	@SuppressWarnings({"rawtypes", "unchecked"})
	public RenderZerglingBoost(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZerglingBoost) mainModel);
		addLayer(new LayerZerglingBoost(this));
	}

	@Override
	public void doRender(EntityZerglingBoost entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZerglingBoost entity) {
		return ZERGLINGBOOST_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZerglingBoost entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.25F, 1.25F, 1.25F);
	}
}
