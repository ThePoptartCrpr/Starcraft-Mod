package net.bvanseghi.starcraft.renderer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.bvanseghi.starcraft.Starcraft;
import net.bvanseghi.starcraft.entity.EntityC14GaussRifleBullet;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class RenderC14GaussRifleBullet extends Render {

	@Override
	public void doRender(Entity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
		EntityRegistry.registerModEntity(EntityC14GaussRifleBullet.class, "BlasterBolt", 932, Starcraft.instance, 120,
				3, true);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}

}
