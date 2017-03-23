package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMineralField extends ModelBase {
	// fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;

	public ModelMineralField() {
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(-1F, -10F, -1F, 2, 10, 2);
		Shape1.setRotationPoint(0F, 24F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0.1684398F, 0.4647326F, -0.2602503F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(-1.5F, -14F, -1.5F, 3, 14, 3);
		Shape2.setRotationPoint(0F, 24F, 0F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, -0.1858931F, 0.2230717F, 0.1115358F);
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(-1.5F, -13F, -1.5F, 3, 13, 3);
		Shape3.setRotationPoint(0F, 24F, 0F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0.5205006F, 0.2602503F, -0.0371786F);
		Shape4 = new ModelRenderer(this, 0, 0);
		Shape4.addBox(-1.5F, -10F, -1.5F, 3, 10, 3);
		Shape4.setRotationPoint(0F, 24F, 0F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0.5205006F, 2.193538F, 0.0371786F);
		Shape5 = new ModelRenderer(this, 0, 0);
		Shape5.addBox(-1F, -8F, -1F, 2, 8, 2);
		Shape5.setRotationPoint(1F, 24F, 0F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0.9666439F, -0.4089647F, -0.4461433F);
		Shape6 = new ModelRenderer(this, 0, 0);
		Shape6.addBox(-1F, -10F, -1F, 2, 10, 2);
		Shape6.setRotationPoint(1F, 24F, 0F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0.5205006F, -0.7435722F, 0.0371786F);
		Shape7 = new ModelRenderer(this, 0, 0);
		Shape7.addBox(-1F, -10F, -1F, 2, 10, 2);
		Shape7.setRotationPoint(1F, 24F, 0F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0.5205006F, -2.41661F, 0.0371786F);
		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(-1F, -9F, -1F, 2, 9, 2);
		Shape8.setRotationPoint(0F, 24F, 0F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0.8922867F, 2.286485F, 0.3717861F);
		Shape9 = new ModelRenderer(this, 0, 0);
		Shape9.addBox(-1F, -8F, -1F, 2, 8, 2);
		Shape9.setRotationPoint(1F, 24F, 0F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0.2974289F, -1.115358F, -0.3717861F);
		Shape10 = new ModelRenderer(this, 0, 0);
		Shape10.addBox(-1F, -8F, -1F, 2, 8, 2);
		Shape10.setRotationPoint(1F, 24F, 0F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0.9666439F, -1.784573F, -0.0743572F);
		Shape11 = new ModelRenderer(this, 0, 0);
		Shape11.addBox(-1F, -10F, -1F, 2, 10, 2);
		Shape11.setRotationPoint(0F, 24F, 0F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0.9294653F, 0.9480546F, 0.0371786F);
		Shape12 = new ModelRenderer(this, 0, 0);
		Shape12.addBox(-1F, -9F, -1F, 2, 9, 2);
		Shape12.setRotationPoint(0F, 24F, 0F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0.5576792F, 2.769806F, -0.0743572F);
		Shape13 = new ModelRenderer(this, 0, 0);
		Shape13.addBox(-1F, -12F, -1F, 2, 12, 2);
		Shape13.setRotationPoint(0F, 24F, 0F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0.1312612F, 0.7993401F, 0.0371786F);
		Shape14 = new ModelRenderer(this, 0, 0);
		Shape14.addBox(-1F, -10F, -1F, 2, 10, 2);
		Shape14.setRotationPoint(0F, 24F, 0F);
		Shape14.setTextureSize(64, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0.9294653F, 3.067235F, 0.0371786F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
	}

	public void renderModel(float f) {
		Shape1.render(f);
		Shape2.render(f);
		Shape3.render(f);
		Shape4.render(f);
		Shape5.render(f);
		Shape6.render(f);
		Shape7.render(f);
		Shape8.render(f);
		Shape9.render(f);
		Shape10.render(f);
		Shape11.render(f);
		Shape12.render(f);
		Shape13.render(f);
		Shape14.render(f);
	}

	private static void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
