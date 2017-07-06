package ga.scmc.renderer;

import ga.scmc.Starcraft;
import ga.scmc.entity.EntityHydraliskSpike;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@SuppressWarnings("rawtypes")
public class RenderHydraliskSpike extends Render {

	protected RenderHydraliskSpike(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	public void doRender(Entity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
		EntityRegistry.registerModEntity(EntityHydraliskSpike.class, "HydraSpike", 933, Starcraft.instance, 120, 3, true);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}

}
