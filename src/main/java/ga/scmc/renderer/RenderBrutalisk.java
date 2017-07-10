package ga.scmc.renderer;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.EntityBrutalisk;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelBrutalisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrutalisk extends RenderLiving<EntityBrutalisk> {
	private static final ResourceLocation BRUTALISK_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/brutalisk.png");
	protected ModelBrutalisk modelEntity;

	public RenderBrutalisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelBrutalisk) mainModel);
	}

	@Override
	public void doRender(EntityBrutalisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrutalisk entity) {
		return BRUTALISK_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityBrutalisk entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(3.0F, 3.0F, 3.0F);
	}
}
