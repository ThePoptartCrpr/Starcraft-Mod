package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityHydralisk;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelHydralisk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHydralisk<T> extends RenderLiving<EntityHydralisk> {

	private static final ResourceLocation ZERGLING_TEXTURES = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/hydralisk.png");

	protected ModelHydralisk modelEntity;

	public RenderHydralisk(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);

		modelEntity = ((ModelHydralisk) mainModel);
	}
	
	public void doRender(EntityHydralisk entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

        if (!this.renderOutlines)
        {
            this.renderLeash(entity, x, y, z, entityYaw, partialTicks);
        }
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityHydralisk entity) {
		return ZERGLING_TEXTURES;
	}
	
	protected void preRenderCallback(EntityHydralisk entitylivingbaseIn, float partialTickTime)
    {
    }
}