package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVespeneGeyser extends ModelBase {
	// fields
	ModelRenderer geyserBase;
	ModelRenderer geyserBase2;
	ModelRenderer openingBase;
	ModelRenderer opening;
	ModelRenderer edge1;
	ModelRenderer edge2;
	ModelRenderer edge3;
	ModelRenderer edge4;

	public ModelVespeneGeyser() {
		textureWidth = 128;
		textureHeight = 64;

		geyserBase = new ModelRenderer(this, 0, 0);
		geyserBase.addBox(0F, 0F, 0F, 16, 4, 16);
		geyserBase.setRotationPoint(-8F, 20F, -8F);
		geyserBase.setTextureSize(128, 64);
		geyserBase.mirror = true;
		setRotation(geyserBase, 0F, 0F, 0F);
		geyserBase2 = new ModelRenderer(this, 0, 20);
		geyserBase2.addBox(0F, 0F, 0F, 14, 3, 14);
		geyserBase2.setRotationPoint(-7F, 17F, -7F);
		geyserBase2.setTextureSize(128, 64);
		geyserBase2.mirror = true;
		setRotation(geyserBase2, 0F, 0F, 0F);
		openingBase = new ModelRenderer(this, 0, 37);
		openingBase.addBox(0F, 0F, 0F, 12, 2, 12);
		openingBase.setRotationPoint(-6F, 15F, -6F);
		openingBase.setTextureSize(128, 64);
		openingBase.mirror = true;
		setRotation(openingBase, 0F, 0F, 0F);
		opening = new ModelRenderer(this, 0, 51);
		opening.addBox(0F, 0F, 0F, 10, 1, 10);
		opening.setRotationPoint(-5F, 14F, -5F);
		opening.setTextureSize(128, 64);
		opening.mirror = true;
		setRotation(opening, 0F, 0F, 0F);
		edge1 = new ModelRenderer(this, 65, 26);
		edge1.addBox(0F, 0F, 0F, 1, 2, 10);
		edge1.setRotationPoint(4F, 12F, -5F);
		edge1.setTextureSize(128, 64);
		edge1.mirror = true;
		setRotation(edge1, 0F, 0F, 0F);
		edge2 = new ModelRenderer(this, 65, 22);
		edge2.addBox(0F, 0F, 0F, 8, 2, 1);
		edge2.setRotationPoint(-4F, 12F, -5F);
		edge2.setTextureSize(128, 64);
		edge2.mirror = true;
		setRotation(edge2, 0F, 0F, 0F);
		edge3 = new ModelRenderer(this, 90, 14);
		edge3.addBox(0F, 0F, 0F, 1, 2, 9);
		edge3.setRotationPoint(-5F, 12F, -5F);
		edge3.setTextureSize(128, 64);
		edge3.mirror = true;
		setRotation(edge3, 0F, 0F, 0F);
		edge4 = new ModelRenderer(this, 67, 17);
		edge4.addBox(0F, 0F, 0F, 9, 2, 1);
		edge4.setRotationPoint(-5F, 12F, 4F);
		edge4.setTextureSize(128, 64);
		edge4.mirror = true;
		setRotation(edge4, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		geyserBase.render(f5);
		geyserBase2.render(f5);
		openingBase.render(f5);
		opening.render(f5);
		edge1.render(f5);
		edge2.render(f5);
		edge3.render(f5);
		edge4.render(f5);
	}

	public void renderModel(float f) {
		geyserBase.render(f);
		geyserBase2.render(f);
		openingBase.render(f);
		opening.render(f);
		edge1.render(f);
		edge2.render(f);
		edge3.render(f);
		edge4.render(f);
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