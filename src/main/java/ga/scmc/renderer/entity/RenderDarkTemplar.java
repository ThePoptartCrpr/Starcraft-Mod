package ga.scmc.renderer.entity;

import org.lwjgl.opengl.GL11;

import ga.scmc.entity.living.EntityDarkTemplar;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelDarkTemplar;
import ga.scmc.renderer.layers.LayerDarkTemplar;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//Special case for the generic type because I don't want to dig through LayerDarkTemplar :/
@SuppressWarnings("unused")
public class RenderDarkTemplar<T> extends RenderLiving<EntityDarkTemplar> {
	private static final ResourceLocation DARK_TEMPLAR_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/darktemplar.png");
	protected ModelDarkTemplar modelEntity;

	@SuppressWarnings({"rawtypes", "unchecked"}) //Laziness
	public RenderDarkTemplar(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelDarkTemplar) mainModel);
		addLayer(new LayerDarkTemplar(this));
	}

	@Override
	public void doRender(EntityDarkTemplar entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDarkTemplar entity) {
		return DARK_TEMPLAR_TEXTURES;
	}

	@Override
	protected void preRenderCallback(EntityDarkTemplar entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(0.70F, 0.70F, 0.70F);
	}
}
