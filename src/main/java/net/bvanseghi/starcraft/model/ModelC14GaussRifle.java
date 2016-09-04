package net.bvanseghi.starcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelC14GaussRifle extends ModelBase {

	ModelRenderer top;
	ModelRenderer belly;
	ModelRenderer butt;
	ModelRenderer opening;
	ModelRenderer focuser;
	ModelRenderer mag;
	ModelRenderer main;
	ModelRenderer grip1;
	ModelRenderer grip2;

	public ModelC14GaussRifle() {
		textureWidth = 64;
		textureHeight = 32;

		top = new ModelRenderer(this, 33, 0);
		top.addBox(0F, 0F, 0F, 3, 1, 10);
		top.setRotationPoint(0F, 0F, -3.5F);
		top.setTextureSize(64, 32);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
		belly = new ModelRenderer(this, 0, 16);
		belly.addBox(0F, 0F, 0F, 1, 1, 8);
		belly.setRotationPoint(1F, 3F, -6F);
		belly.setTextureSize(64, 32);
		belly.mirror = true;
		setRotation(belly, 0F, 0F, 0F);
		butt = new ModelRenderer(this, 5, 26);
		butt.addBox(0F, 0F, 0F, 2, 1, 3);
		butt.setRotationPoint(0.5F, 4F, 6.5F);
		butt.setTextureSize(64, 32);
		butt.mirror = true;
		setRotation(butt, 1.570796F, 0F, 0F);
		opening = new ModelRenderer(this, 0, 26);
		opening.addBox(0F, 0F, 0F, 1, 1, 1);
		opening.setRotationPoint(1F, 1.5F, -6.5F);
		opening.setTextureSize(64, 32);
		opening.mirror = true;
		setRotation(opening, 0F, 0F, 0F);
		focuser = new ModelRenderer(this, 0, 29);
		focuser.addBox(0F, 0F, 0F, 1, 1, 1);
		focuser.setRotationPoint(1F, 4F, -6F);
		focuser.setTextureSize(64, 32);
		focuser.mirror = true;
		setRotation(focuser, 0F, 0F, 0F);
		mag = new ModelRenderer(this, 33, 12);
		mag.addBox(0F, 0F, 0F, 2, 2, 3);
		mag.setRotationPoint(0.5F, 3F, 2F);
		mag.setTextureSize(64, 32);
		mag.mirror = true;
		setRotation(mag, 0F, 0F, 0F);
		main = new ModelRenderer(this, 0, 0);
		main.addBox(0F, 0F, 0F, 3, 2, 13);
		main.setRotationPoint(0F, 1F, -6F);
		main.setTextureSize(64, 32);
		main.mirror = true;
		setRotation(main, 0F, 0F, 0F);
		grip1 = new ModelRenderer(this, 19, 21);
		grip1.addBox(0F, 0F, 0F, 1, 1, 2);
		grip1.setRotationPoint(1F, 3F, 2F);
		grip1.setTextureSize(64, 32);
		grip1.mirror = true;
		setRotation(grip1, -1.152537F, 0F, 0F);
		grip2 = new ModelRenderer(this, 19, 16);
		grip2.addBox(0F, 0F, 0F, 2, 1, 3);
		grip2.setRotationPoint(0.5F, 2F, 5F);
		grip2.setTextureSize(64, 32);
		grip2.mirror = true;
		setRotation(grip2, -0.9666439F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		top.render(f5);
		belly.render(f5);
		butt.render(f5);
		opening.render(f5);
		focuser.render(f5);
		mag.render(f5);
		main.render(f5);
		grip1.render(f5);
		grip2.render(f5);
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
