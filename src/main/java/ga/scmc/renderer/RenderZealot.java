package ga.scmc.renderer;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.EntityZealot;
import ga.scmc.entity.layers.LayerZealot;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelZealot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//Moar special cases
@SuppressWarnings("unused")
public class RenderZealot<T> extends RenderLiving<EntityZealot> {
	private static final ResourceLocation ZEALOT_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/zealot.png");
	protected ModelZealot modelEntity;

	@SuppressWarnings({"rawtypes", "unchecked"})
	public RenderZealot(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelZealot) mainModel);
		addLayer(new LayerZealot(this));
	}

	@Override
	public void doRender(EntityZealot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityZealot entity) {
		return ZEALOT_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityZealot entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(0.70F, 0.70F, 0.70F);
	}
}
