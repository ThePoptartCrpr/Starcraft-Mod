package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Creep Tumor - Ruthless Created using Tabula 5.1.0
 */
public class ModelCreepTumor extends ModelBase {

	public ModelRenderer bulb1;
	public ModelRenderer bulb10;
	public ModelRenderer bulb2;
	public ModelRenderer bulb3;
	public ModelRenderer bulb4;
	public ModelRenderer bulb5;
	public ModelRenderer bulb6;
	public ModelRenderer bulb7;
	public ModelRenderer bulb8;
	public ModelRenderer bulb9;
	public ModelRenderer main;
	public ModelRenderer maintop;
	public ModelRenderer side1;
	public ModelRenderer side2;
	public ModelRenderer side3;
	public ModelRenderer side4;
	public ModelRenderer topside1;
	public ModelRenderer topside2;
	public ModelRenderer topside3;
	public ModelRenderer topside4;

	public ModelCreepTumor() {
		textureWidth = 64;
		textureHeight = 64;
		bulb2 = new ModelRenderer(this, 12, 8);
		bulb2.setRotationPoint(-2.0F, 17.0F, -3.0F);
		bulb2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
		bulb5 = new ModelRenderer(this, 16, 10);
		bulb5.setRotationPoint(-4.0F, 18.0F, 3.0F);
		bulb5.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
		bulb9 = new ModelRenderer(this, 16, 11);
		bulb9.setRotationPoint(4.0F, 18.0F, 3.0F);
		bulb9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		side4 = new ModelRenderer(this, 38, 27);
		side4.setRotationPoint(-8.0F, 20.0F, -6.0F);
		side4.addBox(0.0F, 0.0F, 0.0F, 1, 4, 12, 0.0F);
		main = new ModelRenderer(this, 0, 46);
		main.mirror = true;
		main.setRotationPoint(-7.0F, 20.0F, -7.0F);
		main.addBox(0.0F, 0.0F, 0.0F, 14, 4, 14, 0.0F);
		side1 = new ModelRenderer(this, 38, 38);
		side1.setRotationPoint(-6.0F, 20.0F, 7.0F);
		side1.addBox(0.0F, 0.0F, 0.0F, 12, 4, 1, 0.0F);
		topside1 = new ModelRenderer(this, 40, 23);
		topside1.setRotationPoint(-5.0F, 19.0F, 6.0F);
		topside1.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
		topside3 = new ModelRenderer(this, 40, 13);
		topside3.setRotationPoint(6.0F, 19.0F, -5.0F);
		topside3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
		bulb7 = new ModelRenderer(this, 16, 11);
		bulb7.setRotationPoint(-5.0F, 18.0F, -3.0F);
		bulb7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		bulb8 = new ModelRenderer(this, 16, 11);
		bulb8.setRotationPoint(-4.0F, 18.0F, -6.0F);
		bulb8.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		side2 = new ModelRenderer(this, 38, 38);
		side2.setRotationPoint(-6.0F, 20.0F, -8.0F);
		side2.addBox(0.0F, 0.0F, 0.0F, 12, 4, 1, 0.0F);
		bulb3 = new ModelRenderer(this, 16, 11);
		bulb3.setRotationPoint(3.0F, 18.0F, -4.0F);
		bulb3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		topside2 = new ModelRenderer(this, 40, 23);
		topside2.setRotationPoint(-5.0F, 19.0F, -7.0F);
		topside2.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
		bulb6 = new ModelRenderer(this, 17, 12);
		bulb6.setRotationPoint(-4.0F, 18.0F, 0.0F);
		bulb6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		side3 = new ModelRenderer(this, 38, 27);
		side3.setRotationPoint(7.0F, 20.0F, -6.0F);
		side3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 12, 0.0F);
		topside4 = new ModelRenderer(this, 0, 21);
		topside4.setRotationPoint(-7.0F, 19.0F, -5.0F);
		topside4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
		maintop = new ModelRenderer(this, 0, 33);
		maintop.setRotationPoint(-6.0F, 19.0F, -6.0F);
		maintop.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12, 0.0F);
		bulb1 = new ModelRenderer(this, 17, 11);
		bulb1.setRotationPoint(0.0F, 18.0F, 3.0F);
		bulb1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		bulb4 = new ModelRenderer(this, 16, 11);
		bulb4.setRotationPoint(3.0F, 18.0F, 0.0F);
		bulb4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		bulb10 = new ModelRenderer(this, 16, 11);
		bulb10.setRotationPoint(1.0F, 18.0F, -5.0F);
		bulb10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		bulb9.addChild(bulb8);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bulb2.render(f5);
		bulb5.render(f5);
		bulb9.render(f5);
		side4.render(f5);
		main.render(f5);
		side1.render(f5);
		topside1.render(f5);
		topside3.render(f5);
		bulb7.render(f5);
		side2.render(f5);
		bulb3.render(f5);
		topside2.render(f5);
		bulb6.render(f5);
		side3.render(f5);
		topside4.render(f5);
		maintop.render(f5);
		bulb1.render(f5);
		bulb4.render(f5);
		bulb10.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}