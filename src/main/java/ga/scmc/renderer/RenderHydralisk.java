package ga.scmc.renderer;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.EntityHydralisk;
import ga.scmc.entity.layers.LayerHydralisk;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelHydralisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//Same reason for special case
@SuppressWarnings("unused")
public class RenderHydralisk<T> extends RenderLiving<EntityHydralisk> {
	private static final ResourceLocation ZERGLING_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/hydralisk.png");
	protected ModelHydralisk modelEntity;

	@SuppressWarnings({"rawtypes", "unchecked"}) //Laziness
	public RenderHydralisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelHydralisk) mainModel);
		addLayer(new LayerHydralisk(this));
	}

	@Override
	public void doRender(EntityHydralisk entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHydralisk entity) {
		return ZERGLING_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityHydralisk entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.3F, 1.3F, 1.3F);
	}
}
