package ga.scmc.renderer;

import ga.scmc.entity.EntityLarva;
import ga.scmc.entity.layers.LayerLarva;
import ga.scmc.lib.Reference;
import ga.scmc.model.ModelLarva;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

//And again
@SuppressWarnings("unused")
public class RenderLarva<T> extends RenderLiving<EntityLarva> {
	private static final ResourceLocation LARVA_TEXTURES = new ResourceLocation(Reference.RL_BASE + "textures/entity/larva.png");
	protected ModelLarva modelEntity;
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public RenderLarva(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
		modelEntity = ((ModelLarva) mainModel);
		addLayer(new LayerLarva(this));
	}

	@Override
	public void doRender(EntityLarva entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if(!renderOutlines) {
			renderLeash(entity, x, y, z, entityYaw, partialTicks);
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLarva entity) {
		return LARVA_TEXTURES;
	}
}
