package scmc.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import scmc.entity.EntityInfestedCivilian;
import scmc.lib.Reference;
import scmc.model.ModelInfestedCivilian;

public class RenderInfestedCivilian extends RenderLiving<EntityInfestedCivilian> {
	private static final ResourceLocation INFESTEDCIVILIAN_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/infestedcivilian.png");
	protected ModelInfestedCivilian modelEntity;
	public RenderInfestedCivilian(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelInfestedCivilian) mainModel);
	}

	@Override
	public void doRender(EntityInfestedCivilian entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityInfestedCivilian entity) {
		return INFESTEDCIVILIAN_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityInfestedCivilian entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(0.75F, 0.75F, 0.75F);
	}
}
