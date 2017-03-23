package scmc.renderer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import scmc.Starcraft;
import scmc.entity.EntityC14GaussRifleBullet;

@SuppressWarnings("rawtypes")
public class RenderC14GaussRifleBullet extends Render {

	protected RenderC14GaussRifleBullet(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	public void doRender(Entity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
		EntityRegistry.registerModEntity(EntityC14GaussRifleBullet.class, "BlasterBolt", 932, Starcraft.instance, 120, 3, true);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}

}