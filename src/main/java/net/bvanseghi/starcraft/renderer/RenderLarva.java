package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.model.ModelLarva;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.ResourceLocation;

public class RenderLarva extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(
			Reference.MODID + ":" + "textures/model/larva.png");

	@SuppressWarnings("unused")
	private ModelBase scaleAmount;
	protected ModelLarva modelEntity;

	public RenderLarva(ModelBase parModelBase, float par2) {
		super(parModelBase, par2);
		this.scaleAmount = parModelBase;
		modelEntity = ((ModelLarva) mainModel);
	}

	public void renderLarva(EntityLarva entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderLarva((EntityLarva) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderLarva((EntityLarva) entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}
	
	protected int shouldRenderPass(EntitySlime p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        if (p_77032_1_.isInvisible())
        {
            return 0;
        }
                GL11.glDisable(GL11.GL_BLEND);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
       

            return -1;
        
    }

}
