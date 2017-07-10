package ga.scmc.renderer;

import ga.scmc.model.ModelC14GaussRifle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class ItemRenderC14GaussRifle extends ItemRenderer {
	public ItemRenderC14GaussRifle() {
		super(new ModelC14GaussRifle(), ModelC14GaussRifle.TEXTURE);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
	
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .04000067f;

		GlStateManager.pushMatrix();
		GL11.glScalef(scale, scale, scale);
		GlStateManager.rotate(150, 0, 1, 0);
		GlStateManager.rotate(180, .13f, .04f, .8200002f);
		GlStateManager.translate(1.9199999794363976, -9.480000011622906, 0);
		GlStateManager.pushMatrix();

		//Why this...?
//		{
//			int number = (int) (Minecraft.getMinecraft().theWorld.getWorldTime() % 90);
//
//			scale = 1.0F;
//			GlStateManager.scale(scale, scale, scale);
//			GlStateManager.rotate(90, 0, 1, 0);
//			GlStateManager.translate(0, 120, -70);
//			Gui.drawRect(-2, -2, 14, 10, 0xFF000000);
//			GlStateManager.translate(0, 0, -0.01F);
//			Minecraft.getMinecraft().fontRendererObj.drawString("" + number, 0, 0, 0xFFFF0000);
//			GlStateManager.color(1, 1, 1);
//		}

		GlStateManager.popMatrix();
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
	
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .030000659f;
		
		GlStateManager.pushMatrix();
		GL11.glScalef(scale, scale, scale);
		GL11.glRotated(-80, 1, 0, 0);
		GL11.glRotated(-93, 0, 0, 1);
		GL11.glRotated(-90, .1999999999999993, -.19000000000000006, -2.209999999999997);
		GL11.glTranslated(2.8, -9, -9.379999999999875);
		GlStateManager.color(1, 1, 1);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}
	
	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .015f;
		
		GlStateManager.pushMatrix();
		GL11.glScalef(scale, scale, scale);
		GlStateManager.rotate(-90, 0, 1, 0);
		GlStateManager.rotate(180, 1.1799998f, -0.69999963f, 3.1599975f);
		GlStateManager.translate(1, -6.090000042691827, -16.57999962940812);
		GlStateManager.disableLighting();
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.enableLighting();
		GlStateManager.popMatrix();
	}
	
	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .021009328f;
		
		GlStateManager.pushMatrix();
		GL11.glScalef(scale, scale, scale);
		GL11.glRotated(-90, 1, 0, 0);
		GL11.glRotated(-90, 0, 0, 1);
		GL11.glRotated(-90, 1, 0, 0);
		GL11.glTranslated(.7300000462681062, -11.259999882429838, -19.649999560788274);
		GlStateManager.color(1, 1, 1);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}
}

//Keep this code here. It's nice for on-the-fly GL fiddling (if you know how to abuse it), and it's how I got my values
//if(Keyboard.isKeyDown(Keyboard.KEY_V)) {
//	scale = 1;
//}
//
//if(Keyboard.isKeyDown(Keyboard.KEY_B)) {
//	x = 2.8;
//}
//
//if(Keyboard.isKeyDown(Keyboard.KEY_N)) {
//	y = -8;
//}
//
//if(Keyboard.isKeyDown(Keyboard.KEY_M)) {
//	z = -3.5;
//}
//
//if(Mouse.isButtonDown(0)) {
//	scale -= .01;
//	System.out.println("s " + scale);
//} else if(Mouse.isButtonDown(1)) {
//	scale += .01;
//	System.out.println("s " + scale);
//}
//
//if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
//	x -= .01;
//	System.out.println("x " + x);
//} else if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
//	x += .01;
//	System.out.println("x " + x);
//}
//
//if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {
//	y -= .01;
//	System.out.println("y " + y);
//} else if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
//	y += .01;
//	System.out.println("y " + y);
//}
//
//if(Keyboard.isKeyDown(Keyboard.KEY_LBRACKET)) {
//	z -= .01;
//	System.out.println("z " + z);
//} else if(Keyboard.isKeyDown(Keyboard.KEY_RBRACKET)) {
//	z += .01;
//	System.out.println("z " + z);
//}