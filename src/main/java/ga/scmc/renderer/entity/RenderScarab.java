package ga.scmc.renderer.entity;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.living.EntityScarab;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelScarab;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScarab extends RenderLiving<EntityScarab> {
	private static final ResourceLocation SCARAB_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/scarab.png");
	protected ModelScarab modelEntity;

	public RenderScarab(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelScarab) mainModel);
	}

	@Override
	public void doRender(EntityScarab entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityScarab entity) {
		return SCARAB_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityScarab entitylivingbaseIn, float partialTickTime) {
		GL11.glTranslatef(0.0F, 0.25F, 0.0F);
	}
}
