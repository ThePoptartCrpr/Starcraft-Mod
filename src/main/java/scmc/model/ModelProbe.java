package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelProbe extends ModelBase {
	// fields
	ModelRenderer rightSide;
	ModelRenderer lowerBaseP1;
	ModelRenderer base;
	ModelRenderer eye;
	ModelRenderer leftSide;
	ModelRenderer upperBase;
	ModelRenderer upperRightSpike;
	ModelRenderer lowerRightSpike;
	ModelRenderer UpperLeftSpike;
	ModelRenderer lowerLeftSpike;
	ModelRenderer upperSpike1;
	ModelRenderer UpperSpike4;
	ModelRenderer lowerBase;
	ModelRenderer UpperSpike2;
	ModelRenderer UpperSpike3;

	public ModelProbe() {
		textureWidth = 128;
		textureHeight = 128;

		rightSide = new ModelRenderer(this, 14, 75);
		rightSide.addBox(-1F, -2F, -2F, 1, 4, 4);
		rightSide.setRotationPoint(-3.5F, 13F, -0.5F);
		rightSide.setTextureSize(128, 128);
		rightSide.mirror = true;
		setRotation(rightSide, 0F, 0F, 0F);
		lowerBaseP1 = new ModelRenderer(this, 29, 17);
		lowerBaseP1.addBox(-1F, 0F, -2F, 2, 1, 3);
		lowerBaseP1.setRotationPoint(0F, 18.03333F, -2.3F);
		lowerBaseP1.setTextureSize(128, 128);
		lowerBaseP1.mirror = true;
		setRotation(lowerBaseP1, -0.9294653F, 0F, 0F);
		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 7, 7, 7);
		base.setRotationPoint(-3.5F, 9F, -4F);
		base.setTextureSize(128, 128);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		eye = new ModelRenderer(this, 0, 18);
		eye.addBox(-1.5F, -1.5F, -1F, 3, 3, 1);
		eye.setRotationPoint(0F, 12.5F, -3.5F);
		eye.setTextureSize(128, 128);
		eye.mirror = true;
		setRotation(eye, 0F, 0F, 0F);
		leftSide = new ModelRenderer(this, 0, 75);
		leftSide.addBox(0F, -2F, -2F, 1, 4, 4);
		leftSide.setRotationPoint(3.5F, 13F, -0.5F);
		leftSide.setTextureSize(128, 128);
		leftSide.mirror = true;
		setRotation(leftSide, 0F, 0F, 0F);
		upperBase = new ModelRenderer(this, 0, 62);
		upperBase.addBox(-4F, -2F, -4F, 8, 2, 8);
		upperBase.setRotationPoint(0.03333334F, 10F, -1F);
		upperBase.setTextureSize(128, 128);
		upperBase.mirror = true;
		setRotation(upperBase, 0F, 0F, 0F);
		upperRightSpike = new ModelRenderer(this, 0, 87);
		upperRightSpike.addBox(-1F, 0F, 0F, 1, 1, 3);
		upperRightSpike.setRotationPoint(-4F, 12F, -0.5F);
		upperRightSpike.setTextureSize(128, 128);
		upperRightSpike.mirror = true;
		setRotation(upperRightSpike, 0.7807508F, 0F, 0F);
		lowerRightSpike = new ModelRenderer(this, 0, 95);
		lowerRightSpike.addBox(-0.5F, 0F, -1F, 1, 6, 2);
		lowerRightSpike.setRotationPoint(-4F, 13F, 0F);
		lowerRightSpike.setTextureSize(128, 128);
		lowerRightSpike.mirror = true;
		setRotation(lowerRightSpike, 0F, 0F, 0.418879F);
		UpperLeftSpike = new ModelRenderer(this, 14, 87);
		UpperLeftSpike.addBox(0F, 0F, 0F, 1, 1, 3);
		UpperLeftSpike.setRotationPoint(4F, 12F, -0.5F);
		UpperLeftSpike.setTextureSize(128, 128);
		UpperLeftSpike.mirror = true;
		setRotation(UpperLeftSpike, 0.7807508F, 0F, 0F);
		lowerLeftSpike = new ModelRenderer(this, 19, 95);
		lowerLeftSpike.addBox(-0.5F, 0F, -1F, 1, 6, 2);
		lowerLeftSpike.setRotationPoint(4F, 13F, 0F);
		lowerLeftSpike.setTextureSize(128, 128);
		lowerLeftSpike.mirror = true;
		setRotation(lowerLeftSpike, 0F, 0F, -0.418879F);
		upperSpike1 = new ModelRenderer(this, 0, 25);
		upperSpike1.addBox(-2F, 0F, 0F, 4, 2, 7);
		upperSpike1.setRotationPoint(0F, 8F, -5F);
		upperSpike1.setTextureSize(128, 128);
		upperSpike1.mirror = true;
		setRotation(upperSpike1, 0.9294653F, 0F, 0F);
		UpperSpike4 = new ModelRenderer(this, 0, 52);
		UpperSpike4.addBox(-0.5F, -1.5F, 0F, 1, 3, 4);
		UpperSpike4.setRotationPoint(-2.9F, 10F, 1F);
		UpperSpike4.setTextureSize(128, 128);
		UpperSpike4.mirror = true;
		setRotation(UpperSpike4, 0.2230717F, 0F, 0F);
		lowerBase = new ModelRenderer(this, 29, 26);
		lowerBase.addBox(-2.5F, 0F, 0F, 5, 2, 5);
		lowerBase.setRotationPoint(0F, 14.5F, -3F);
		lowerBase.setTextureSize(128, 128);
		lowerBase.mirror = true;
		setRotation(lowerBase, -0.9294653F, 0F, 0F);
		UpperSpike2 = new ModelRenderer(this, 0, 39);
		UpperSpike2.addBox(-1.5F, 0F, 0F, 3, 2, 7);
		UpperSpike2.setRotationPoint(0F, 8F, -1F);
		UpperSpike2.setTextureSize(128, 128);
		UpperSpike2.mirror = true;
		setRotation(UpperSpike2, 0.2230717F, 0F, 0F);
		UpperSpike3 = new ModelRenderer(this, 13, 52);
		UpperSpike3.addBox(-0.5F, -1.5F, 0F, 1, 3, 4);
		UpperSpike3.setRotationPoint(2.9F, 10F, 1F);
		UpperSpike3.setTextureSize(128, 128);
		UpperSpike3.mirror = true;
		setRotation(UpperSpike3, 0.2230717F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		rightSide.render(f5);
		lowerBaseP1.render(f5);
		base.render(f5);
		eye.render(f5);
		leftSide.render(f5);
		upperBase.render(f5);
		upperRightSpike.render(f5);
		lowerRightSpike.render(f5);
		UpperLeftSpike.render(f5);
		lowerLeftSpike.render(f5);
		upperSpike1.render(f5);
		UpperSpike4.render(f5);
		lowerBase.render(f5);
		UpperSpike2.render(f5);
		UpperSpike3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}