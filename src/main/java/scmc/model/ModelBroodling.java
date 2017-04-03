package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBroodling extends ModelBase {
	// fields
	ModelRenderer Head;
	ModelRenderer Bodysegmain;
	ModelRenderer Butt;
	ModelRenderer Tail;
	ModelRenderer WingL1;
	ModelRenderer WingL2;
	ModelRenderer WingR1;
	ModelRenderer WingR2;
	ModelRenderer ArmL1;
	ModelRenderer ArmL2;
	ModelRenderer ArmL3;
	ModelRenderer ArmR1;
	ModelRenderer P1;
	ModelRenderer P2;
	ModelRenderer ArmR2;
	ModelRenderer ArmR3;

	public ModelBroodling() {
		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-1F, -2F, -1F, 2, 2, 1);
		Head.setRotationPoint(0F, 23F, -2F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Bodysegmain = new ModelRenderer(this, 8, 0);
		Bodysegmain.addBox(-1.5F, -2F, -2F, 3, 2, 4);
		Bodysegmain.setRotationPoint(0F, 23F, 0F);
		Bodysegmain.setTextureSize(64, 32);
		Bodysegmain.mirror = true;
		setRotation(Bodysegmain, 0F, 0F, 0F);
		Butt = new ModelRenderer(this, 22, 0);
		Butt.addBox(-1F, -1.5F, -0.5F, 2, 1, 2);
		Butt.setRotationPoint(0F, 23F, 2F);
		Butt.setTextureSize(64, 32);
		Butt.mirror = true;
		setRotation(Butt, -0.1919862F, 0F, 0F);
		Tail = new ModelRenderer(this, 30, 0);
		Tail.addBox(-0.5F, -1.5F, 1F, 1, 1, 2);
		Tail.setRotationPoint(0F, 23F, 2F);
		Tail.setTextureSize(64, 32);
		Tail.mirror = true;
		setRotation(Tail, -0.3665191F, 0F, 0F);
		WingL1 = new ModelRenderer(this, 0, 4);
		WingL1.addBox(0F, 0F, 0F, 1, 0, 2);
		WingL1.setRotationPoint(1F, 21F, -1F);
		WingL1.setTextureSize(64, 32);
		WingL1.mirror = true;
		setRotation(WingL1, 0F, 1.658063F, 0F);
		WingL2 = new ModelRenderer(this, 0, 6);
		WingL2.addBox(-0.5F, 0F, 1.5F, 1, 0, 2);
		WingL2.setRotationPoint(1F, 21F, -1F);
		WingL2.setTextureSize(64, 32);
		WingL2.mirror = true;
		setRotation(WingL2, 0F, 1.918313F, 0F);
		WingR1 = new ModelRenderer(this, 0, 9);
		WingR1.addBox(-1F, 0F, 0F, 1, 0, 2);
		WingR1.setRotationPoint(-1F, 21F, -1F);
		WingR1.setTextureSize(64, 32);
		WingR1.mirror = true;
		setRotation(WingR1, 0F, -1.658063F, 0F);
		WingR2 = new ModelRenderer(this, 0, 11);
		WingR2.addBox(-0.5F, 0F, 1.5F, 1, 0, 2);
		WingR2.setRotationPoint(-1F, 21F, -1F);
		WingR2.setTextureSize(64, 32);
		WingR2.mirror = true;
		setRotation(WingR2, 0F, -1.918309F, 0F);
		ArmL1 = new ModelRenderer(this, 8, 7);
		ArmL1.addBox(0F, -1F, -2F, 1, 1, 3);
		ArmL1.setRotationPoint(1F, 23F, -2F);
		ArmL1.setTextureSize(64, 32);
		ArmL1.mirror = true;
		setRotation(ArmL1, 0.5235988F, 0F, 0F);
		ArmL2 = new ModelRenderer(this, 8, 11);
		ArmL2.addBox(-0.5F, 0.3F, -2F, 1, 1, 2);
		ArmL2.setRotationPoint(1.5F, 23F, -3F);
		ArmL2.setTextureSize(64, 32);
		ArmL2.mirror = true;
		setRotation(ArmL2, -0.5917596F, 0F, 0F);
		ArmL3 = new ModelRenderer(this, 16, 7);
		ArmL3.addBox(0F, -0.8F, -1.5F, 0, 1, 2);
		ArmL3.setRotationPoint(1.5F, 23F, -5F);
		ArmL3.setTextureSize(64, 32);
		ArmL3.mirror = true;
		setRotation(ArmL3, 0.6351346F, 0F, 0F);
		ArmR1 = new ModelRenderer(this, 20, 7);
		ArmR1.addBox(-1F, -1F, -2F, 1, 1, 3);
		ArmR1.setRotationPoint(-1F, 23F, -2F);
		ArmR1.setTextureSize(64, 32);
		ArmR1.mirror = true;
		setRotation(ArmR1, 0.5235988F, 0F, 0F);
		P1 = new ModelRenderer(this, 23, 4);
		P1.addBox(1F, -1.5F, -1.7F, 0, 1, 1);
		P1.setRotationPoint(0F, 23F, -2F);
		P1.setTextureSize(64, 32);
		P1.mirror = true;
		setRotation(P1, 0F, 0.2443461F, 0F);
		P2 = new ModelRenderer(this, 25, 4);
		P2.addBox(-1F, -1.5F, -1.7F, 0, 1, 1);
		P2.setRotationPoint(0F, 23F, -2F);
		P2.setTextureSize(64, 32);
		P2.mirror = true;
		setRotation(P2, 0F, -0.2443461F, 0F);
		ArmR2 = new ModelRenderer(this, 8, 11);
		ArmR2.addBox(-0.5F, 0.3F, -2F, 1, 1, 2);
		ArmR2.setRotationPoint(-1.5F, 23F, -3F);
		ArmR2.setTextureSize(64, 32);
		ArmR2.mirror = true;
		setRotation(ArmR2, -0.5917596F, 0F, 0F);
		ArmR3 = new ModelRenderer(this, 16, 7);
		ArmR3.addBox(0F, -0.8F, -1.5F, 0, 1, 2);
		ArmR3.setRotationPoint(-1.5F, 23F, -5F);
		ArmR3.setTextureSize(64, 32);
		ArmR3.mirror = true;
		setRotation(ArmR3, 0.6351346F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Head.render(f5);
		Bodysegmain.render(f5);
		Butt.render(f5);
		Tail.render(f5);
		WingL1.render(f5);
		WingL2.render(f5);
		WingR1.render(f5);
		WingR2.render(f5);
		ArmL1.render(f5);
		ArmL2.render(f5);
		ArmL3.render(f5);
		ArmR1.render(f5);
		P1.render(f5);
		P2.render(f5);
		ArmR2.render(f5);
		ArmR3.render(f5);
	}

	private static void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}