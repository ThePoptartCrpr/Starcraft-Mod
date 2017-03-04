package net.bvanseghi.starcraft.renderer;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import net.bvanseghi.starcraft.items.ItemC14GaussRifle;
import net.bvanseghi.starcraft.model.ModelC14GaussRifle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

//DO NOT TOUCH THIS CLASS UNTIL WUNDR'S DONE WITH IT >:(
public class RenderItemC14GaussRifle extends ItemRenderer {
	private float tempScale = .04f;
	private float xTrans = 1.2699993f;
	private float yTrans = -.28f;
	private float zTrans = 1;
	private float xRot = -.01f;
	private float yRot = -.00000007f; //.009999925f
	private float zRot = 0;
	private float angle = -7.860085f;
	public static final ModelC14GaussRifle model = new ModelC14GaussRifle();

	public RenderItemC14GaussRifle() {
		super(model, ModelC14GaussRifle.texture);
	}

	@Override
	public ModelC14GaussRifle getModel() {
		return (ModelC14GaussRifle) super.getModel();
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		//nothing here... yet
	}

    @Override
    public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
    	float glScale = .04F;
    	
    	GlStateManager.rotate(95.0F, 1.0F, 0.0F, 0.0F);
    	GlStateManager.rotate(130.0F, 0.0F, 1.0F, 0.0F);
    	GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
    	GlStateManager.translate(0.28F, -0.77F, 0.85F);
    	GlStateManager.scale(glScale, glScale, glScale);
    	RenderUtil.bindTexture(getResourceLocation());
    	getModel().render(null, 0, 0, 0, 0, 0, RenderUtil.DEFAULT_BOX_TRANSLATION);
    }

    @Override
    public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
        //nothing here... yet
    }

    @Override
    public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
    	float displayScale = .04F;
    	float glScale = .04F;

    	if(RenderUtil.firstPersonRenderCheck(Minecraft.getMinecraft().thePlayer)) {
    		if(Mouse.isButtonDown(0) && mc.inGameHasFocus) {
    			GlStateManager.translate(-0.1F, 1.44F, -0.595F);
    			GlStateManager.rotate(102F, 1.0F, 0.0F, 0.0F);
    			GlStateManager.rotate(115.0F, 0.0F, 1.0F, 0.0F);
    			GlStateManager.rotate(79F, 0.0F, 0.0F, 1.0F);
    			GlStateManager.translate(0.027F, 0F, 0F);
            } else {
            	GlStateManager.translate(0.1F, 1.55F, 0.2F);
            	GlStateManager.rotate(95.0F, 1.0F, 0.0F, 0.0F);
            	GlStateManager.rotate(120.0F, 0.0F, 1.0F, 0.0F);
            	GlStateManager.rotate(79.0F, 0.0F, 0.0F, 1.0F);
            }

    		GL11.glDisable(GL11.GL_CULL_FACE);
    		GlStateManager.scale(glScale, glScale, glScale);
    		RenderUtil.bindTexture(getResourceLocation());
    		getModel().render(null, 0, 0, 0, 0, 0, RenderUtil.DEFAULT_BOX_TRANSLATION);

            if(itemstack != null && itemstack.getItem() instanceof ItemC14GaussRifle) {
            	GL11.glDisable(GL11.GL_LIGHTING);
            	GlStateManager.translate(-0.3439F, 0.6F, 0.04F);
            	GlStateManager.scale(displayScale, displayScale, displayScale);
            	GlStateManager.rotate(90F, 0F, 1F, 0F);
            	Gui.drawRect(-2, -2, 16, 11, 0xFF000000);
            	GlStateManager.translate(0F, 0F, -0.01F);
            	GlStateManager.disableLighting();
            	GL11.glEnable(GL11.GL_LIGHTING);
            	GlStateManager.color(1F, 1F, 1F, 1F);
            }
        }
    }

    @Override
    public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
//    	float scale = .8f;
    	
    	GlStateManager.rotate(0F, 1.0F, 0.0F, 0.0F);
    	GlStateManager.rotate(-40F, 0.0F, 1.0F, 0.0F);
    	GlStateManager.rotate(0F, 0.0F, 0.0F, 1.0F);
    	GlStateManager.rotate(angle, xRot, yRot, zRot);
    	GlStateManager.translate(xTrans, yTrans, zTrans);
    	GlStateManager.scale(tempScale, tempScale, tempScale);
    	GL11.glDisable(GL11.GL_CULL_FACE);
    	RenderUtil.bindTexture(getResourceLocation());
    	getModel().render(null, 0, 0, 0, 0, 0, RenderUtil.DEFAULT_BOX_TRANSLATION);
    	GlStateManager.color(1F, 1F, 1F, 1F);
    	
    	if(Mouse.isButtonDown(0)) {
//    		tempScale += .01f;
//    		System.out.println(tempScale);
//    		yTrans += .01f;
//    		System.out.println(yTrans);
//    		zTrans += .01f;
//    		System.out.println(zTrans);
//    		xTrans += .01f;
//    		System.out.println(xTrans);
    		zRot += .01f;
    		System.out.println(zRot);
    	} else if(Mouse.isButtonDown(1)) {
//    		tempScale -= .01f;
//    		System.out.println(tempScale);
//    		yTrans -= .01f;
//    		System.out.println(yTrans);
//    		zTrans -= .01f;
//    		System.out.println(zTrans);
//    		xTrans -= .01f;
//    		System.out.println(xTrans);
    		zRot -= .01f;
    		System.out.println(zRot);
    	}
    }

    @Override
    public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
    	float scale = .04f;
    	
    	GlStateManager.translate(0, .35f, -0.52999973f);
    	GlStateManager.scale(scale, -scale, scale);
    	GL11.glDisable(GL11.GL_CULL_FACE);
    	RenderUtil.bindTexture(getResourceLocation());
    	getModel().render(null, 0, 0, 0, 0, 0, RenderUtil.DEFAULT_BOX_TRANSLATION);
    }
}
