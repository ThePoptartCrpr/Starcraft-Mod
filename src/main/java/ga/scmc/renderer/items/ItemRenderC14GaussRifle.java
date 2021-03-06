package ga.scmc.renderer.items;

import org.lwjgl.opengl.GL11;

import ga.scmc.model.ModelC14GaussRifle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemRenderC14GaussRifle extends ItemRenderer {

	public ItemRenderC14GaussRifle() {
		//super(new ModelC14GaussRifle(), ModelC14GaussRifle.texture);
		super(new ModelC14GaussRifle(), ModelC14GaussRifle.TEXTURE);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		;
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		float scale = 1.0F;
		GL11.glScalef(scale, scale, scale);
		GlStateManager.rotate(150F, 0, 1, 0);
		GlStateManager.rotate(180F, 0, 0, 1);
		GlStateManager.translate(1, -10, 0);

		GlStateManager.pushMatrix();
		{
			int number = (int) (Minecraft.getMinecraft().theWorld.getWorldTime() % 90);

			scale = 1.0F;
			GlStateManager.scale(scale, scale, scale);
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.translate(0, 120, -70);
			Gui.drawRect(-2, -2, 14, 10, 0xFF000000);
			GlStateManager.translate(0, 0, -0.01F);
			Minecraft.getMinecraft().fontRendererObj.drawString("" + number, 0, 0, 0xFFFF0000);
			GlStateManager.color(1F, 1F, 1F);
		}
		GlStateManager.popMatrix();

		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1.0F);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		float scale = 1.0F;
		GL11.glScalef(scale, scale, scale);
		GlStateManager.rotate(-90, 0, 1, 0);
		GlStateManager.rotate(180, 1, 0, 0);
		GlStateManager.translate(2.5, -8, 0);
		GlStateManager.disableLighting();
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1.0F);
		GlStateManager.enableLighting();
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		float scale = 1.0F;
		GL11.glScalef(scale, scale, scale);
		GL11.glRotated(-90F, 1, 0, 0);
		GL11.glRotated(-90F, 0, 0, 1);
		GL11.glRotated(-90F, 1, 0, 0);
		GL11.glTranslated(2.8, -6, 0);
		GlStateManager.color(1F, 1F, 1F);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1.0F);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		;
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		float scale = 1.0F;
		GL11.glScalef(scale, scale, scale);
		GL11.glRotated(-80F, 1, 0, 0);
		GL11.glRotated(-93F, 0, 0, 1);
		GL11.glRotated(-90F, 1, 0, 0);
		GL11.glTranslated(2.8, -8, -3.5);
		GlStateManager.color(1F, 1F, 1F);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1.0F);
		GlStateManager.popMatrix();
	}
}