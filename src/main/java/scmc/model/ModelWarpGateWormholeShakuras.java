
package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWarpGateWormholeShakuras extends ModelBase {
	// fields
	public static ModelRenderer WormholeBase;
	public static ModelRenderer revolvingEnergy1;
	public static ModelRenderer revolvingEnergy2;
	public static ModelRenderer revolvingEnergy3;
	public static ModelRenderer revolvingEnergy4;
	public static ModelRenderer revolvingEnergy5;
	public static ModelRenderer revolvingEnergy6;
	public static ModelRenderer revolvingEnergy7;
	public static ModelRenderer revolvingEnergy8;
	public static ModelRenderer revolvingEnergy9;
	public static ModelRenderer revolvingEnergy10;
	public static ModelRenderer revolvingEnergy11;
	public static ModelRenderer revolvingEnergy12;
	public static ModelRenderer revolvingSEnergy1;
	public static ModelRenderer revolvingSEnergy2;
	public static ModelRenderer revolvingSEnergy3;
	public static ModelRenderer revolvingSEnergy4;
	public static ModelRenderer revolvingSEnergy5;
	public static ModelRenderer revolvingSEnergy6;
	public static ModelRenderer revolvingSEnergy7;

	public ModelWarpGateWormholeShakuras() {
		textureWidth = 512;
		textureHeight = 512;

		WormholeBase = new ModelRenderer(this, 0, 0);
		WormholeBase.addBox(0F, 16F, 0F, 16, 16, 16);
		WormholeBase.setRotationPoint(-8F, -8F, -8F);
		WormholeBase.setTextureSize(512, 512);
		WormholeBase.mirror = true;
		setRotation(WormholeBase, 0F, 0F, 0F);
		revolvingEnergy1 = new ModelRenderer(this, 0, 117);
		revolvingEnergy1.addBox(-24F, 15F, -35F, 29, 3, 0);
		revolvingEnergy1.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy1.setTextureSize(512, 512);
		revolvingEnergy1.mirror = true;
		setRotation(revolvingEnergy1, 0F, 0F, 0F);
		revolvingEnergy2 = new ModelRenderer(this, 0, 117);
		revolvingEnergy2.addBox(35F, 6F, -24F, 0, 3, 29);
		revolvingEnergy2.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy2.setTextureSize(512, 512);
		revolvingEnergy2.mirror = true;
		setRotation(revolvingEnergy2, 0F, 0F, 0F);
		revolvingEnergy3 = new ModelRenderer(this, 0, 117);
		revolvingEnergy3.addBox(-35F, -2F, -6F, 0, 3, 29);
		revolvingEnergy3.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy3.setTextureSize(512, 512);
		revolvingEnergy3.mirror = true;
		setRotation(revolvingEnergy3, 0F, 0F, 0F);
		revolvingEnergy4 = new ModelRenderer(this, 0, 117);
		revolvingEnergy4.addBox(-35F, 6F, -22F, 0, 3, 29);
		revolvingEnergy4.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy4.setTextureSize(512, 512);
		revolvingEnergy4.mirror = true;
		setRotation(revolvingEnergy4, 0F, 0F, 0F);
		revolvingEnergy5 = new ModelRenderer(this, 0, 117);
		revolvingEnergy5.addBox(-13F, 12F, 35F, 29, 3, 0);
		revolvingEnergy5.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy5.setTextureSize(512, 512);
		revolvingEnergy5.mirror = true;
		setRotation(revolvingEnergy5, 0F, 0F, 0F);
		revolvingEnergy6 = new ModelRenderer(this, 0, 117);
		revolvingEnergy6.addBox(-35F, -13F, -10F, 0, 3, 29);
		revolvingEnergy6.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy6.setTextureSize(512, 512);
		revolvingEnergy6.mirror = true;
		setRotation(revolvingEnergy6, 0F, 0F, 0F);
		revolvingEnergy7 = new ModelRenderer(this, 0, 117);
		revolvingEnergy7.addBox(35F, -10F, -4F, 0, 3, 29);
		revolvingEnergy7.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy7.setTextureSize(512, 512);
		revolvingEnergy7.mirror = true;
		setRotation(revolvingEnergy7, 0F, 0F, 0F);
		revolvingEnergy8 = new ModelRenderer(this, 0, 117);
		revolvingEnergy8.addBox(35F, -16F, -24F, 0, 3, 29);
		revolvingEnergy8.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy8.setTextureSize(512, 512);
		revolvingEnergy8.mirror = true;
		setRotation(revolvingEnergy8, 0F, 0F, 0F);
		revolvingEnergy9 = new ModelRenderer(this, 0, 117);
		revolvingEnergy9.addBox(-18F, -17F, -35F, 29, 3, 0);
		revolvingEnergy9.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy9.setTextureSize(512, 512);
		revolvingEnergy9.mirror = true;
		setRotation(revolvingEnergy9, 0F, 0F, 0F);
		revolvingEnergy10 = new ModelRenderer(this, 0, 117);
		revolvingEnergy10.addBox(-18F, -20F, 35F, 29, 3, 0);
		revolvingEnergy10.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy10.setTextureSize(512, 512);
		revolvingEnergy10.mirror = true;
		setRotation(revolvingEnergy10, 0F, 0F, 0F);
		revolvingEnergy11 = new ModelRenderer(this, 0, 117);
		revolvingEnergy11.addBox(-21F, -9F, 35F, 29, 3, 0);
		revolvingEnergy11.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy11.setTextureSize(512, 512);
		revolvingEnergy11.mirror = true;
		setRotation(revolvingEnergy11, 0F, 0F, 0F);
		revolvingEnergy12 = new ModelRenderer(this, 0, 117);
		revolvingEnergy12.addBox(-6F, -3F, 35F, 29, 3, 0);
		revolvingEnergy12.setRotationPoint(0F, 0F, 0F);
		revolvingEnergy12.setTextureSize(512, 512);
		revolvingEnergy12.mirror = true;
		setRotation(revolvingEnergy12, 0F, 0F, 0F);
		revolvingSEnergy1 = new ModelRenderer(this, 0, 169);
		revolvingSEnergy1.addBox(-18F, -3F, -35F, 6, 2, 0);
		revolvingSEnergy1.setRotationPoint(0F, 0F, 0F);
		revolvingSEnergy1.setTextureSize(512, 512);
		revolvingSEnergy1.mirror = true;
		setRotation(revolvingSEnergy1, 0F, 0F, 0F);
		revolvingSEnergy2 = new ModelRenderer(this, 0, 169);
		revolvingSEnergy2.addBox(1F, -10F, -35F, 6, 2, 0);
		revolvingSEnergy2.setRotationPoint(0F, 0F, 0F);
		revolvingSEnergy2.setTextureSize(512, 512);
		revolvingSEnergy2.mirror = true;
		setRotation(revolvingSEnergy2, 0F, 0F, 0F);
		revolvingSEnergy3 = new ModelRenderer(this, 0, 169);
		revolvingSEnergy3.addBox(-7F, 10F, -35F, 6, 2, 0);
		revolvingSEnergy3.setRotationPoint(0F, 0F, 0F);
		revolvingSEnergy3.setTextureSize(512, 512);
		revolvingSEnergy3.mirror = true;
		setRotation(revolvingSEnergy3, 0F, 0F, 0F);
		revolvingSEnergy4 = new ModelRenderer(this, 0, 169);
		revolvingSEnergy4.addBox(6F, 8F, 35F, 6, 2, 0);
		revolvingSEnergy4.setRotationPoint(0F, 0F, 0F);
		revolvingSEnergy4.setTextureSize(512, 512);
		revolvingSEnergy4.mirror = true;
		setRotation(revolvingSEnergy4, 0F, 0F, 0F);
		revolvingSEnergy5 = new ModelRenderer(this, 0, 169);
		revolvingSEnergy5.addBox(35F, -1F, -15F, 0, 2, 6);
		revolvingSEnergy5.setRotationPoint(0F, 0F, 0F);
		revolvingSEnergy5.setTextureSize(512, 512);
		revolvingSEnergy5.mirror = true;
		setRotation(revolvingSEnergy5, 0F, 0F, 0F);
		revolvingSEnergy6 = new ModelRenderer(this, 0, 169);
		revolvingSEnergy6.addBox(35F, 13F, 1F, 0, 2, 6);
		revolvingSEnergy6.setRotationPoint(0F, 0F, 0F);
		revolvingSEnergy6.setTextureSize(512, 512);
		revolvingSEnergy6.mirror = true;
		setRotation(revolvingSEnergy6, 0F, 0F, 0F);
		revolvingSEnergy7 = new ModelRenderer(this, 0, 117);
		revolvingSEnergy7.addBox(-35F, 13F, 14F, 0, 2, 6);
		revolvingSEnergy7.setRotationPoint(0F, 0F, 0F);
		revolvingSEnergy7.setTextureSize(512, 512);
		revolvingSEnergy7.mirror = true;
		setRotation(revolvingSEnergy7, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		WormholeBase.render(f5);
		revolvingEnergy1.render(f5);
		revolvingEnergy2.render(f5);
		revolvingEnergy3.render(f5);
		revolvingEnergy4.render(f5);
		revolvingEnergy5.render(f5);
		revolvingEnergy6.render(f5);
		revolvingEnergy7.render(f5);
		revolvingEnergy8.render(f5);
		revolvingEnergy9.render(f5);
		revolvingEnergy10.render(f5);
		revolvingEnergy11.render(f5);
		revolvingEnergy12.render(f5);
		revolvingSEnergy1.render(f5);
		revolvingSEnergy2.render(f5);
		revolvingSEnergy3.render(f5);
		revolvingSEnergy4.render(f5);
		revolvingSEnergy5.render(f5);
		revolvingSEnergy6.render(f5);
		revolvingSEnergy7.render(f5);
	}

	public void renderModel(float f) {
		WormholeBase.render(f);
		revolvingEnergy1.render(f);
		revolvingEnergy2.render(f);
		revolvingEnergy3.render(f);
		revolvingEnergy4.render(f);
		revolvingEnergy5.render(f);
		revolvingEnergy6.render(f);
		revolvingEnergy7.render(f);
		revolvingEnergy8.render(f);
		revolvingEnergy9.render(f);
		revolvingEnergy10.render(f);
		revolvingEnergy11.render(f);
		revolvingEnergy12.render(f);
		revolvingSEnergy1.render(f);
		revolvingSEnergy2.render(f);
		revolvingSEnergy3.render(f);
		revolvingSEnergy4.render(f);
		revolvingSEnergy5.render(f);
		revolvingSEnergy6.render(f);
		revolvingSEnergy7.render(f);
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
