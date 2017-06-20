package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * scarab - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelScarab extends ModelBase {

	public ModelRenderer bNode01;
	public ModelRenderer bNode02;
	public ModelRenderer bSlope01;
	public ModelRenderer bSlope02;
	public ModelRenderer bSlope03;
	public ModelRenderer fNode01;
	public ModelRenderer fNode02;
	public ModelRenderer fSlope01;
	public ModelRenderer fSlope02;
	public ModelRenderer fSlope03;
	public ModelRenderer lNode01;
	public ModelRenderer lNode02;
	public ModelRenderer plate01;
	public ModelRenderer plate02;
	public ModelRenderer rNode01;
	public ModelRenderer rNode02;
	public ModelRenderer scarab01;
	public ModelRenderer scarab02;
	public ModelRenderer scarab03;
	public ModelRenderer scarab04;
	public ModelRenderer scarab05;

	public ModelScarab() {
		textureWidth = 64;
		textureHeight = 32;
		bSlope03 = new ModelRenderer(this, 40, 24);
		bSlope03.mirror = true;
		bSlope03.setRotationPoint(0.0F, 0.0F, 1.9F);
		bSlope03.addBox(-2.0F, 3.2F, -3.3F, 4, 1, 2, 0.0F);
		setRotateAngle(bSlope03, 0.6829473363053812F, 0.0F, 0.0F);
		fNode01 = new ModelRenderer(this, 36, 8);
		fNode01.setRotationPoint(0.0F, 2.3F, -3.0F);
		fNode01.addBox(-1.0F, -1.2F, -1.0F, 2, 2, 1, 0.0F);
		setRotateAngle(fNode01, -0.31869712141416456F, 0.0F, 0.0F);
		scarab04 = new ModelRenderer(this, 0, 0);
		scarab04.setRotationPoint(0.0F, 0.0F, 0.0F);
		scarab04.addBox(-2.0F, -3.2F, -2.5F, 4, 1, 5, 0.0F);
		bNode02 = new ModelRenderer(this, 39, 12);
		bNode02.mirror = true;
		bNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
		bNode02.addBox(-0.5F, -0.7F, -0.3F, 1, 1, 1, 0.0F);
		bSlope02 = new ModelRenderer(this, 38, 18);
		bSlope02.mirror = true;
		bSlope02.setRotationPoint(0.0F, 0.0F, 1.9F);
		bSlope02.addBox(-2.5F, -0.2F, -1.0F, 5, 1, 4, 0.0F);
		setRotateAngle(bSlope02, -0.8651597102135892F, 0.0F, 0.0F);
		fSlope02 = new ModelRenderer(this, 38, 18);
		fSlope02.setRotationPoint(0.0F, 0.0F, -1.9F);
		fSlope02.addBox(-2.5F, -0.1F, -2.9F, 5, 1, 4, 0.0F);
		setRotateAngle(fSlope02, 0.8651597102135892F, 0.0F, 0.0F);
		scarab01 = new ModelRenderer(this, 0, 25);
		scarab01.setRotationPoint(0.0F, 15.0F, 0.0F);
		scarab01.addBox(-1.5F, 0.5F, -2.0F, 3, 1, 4, 0.0F);
		scarab03 = new ModelRenderer(this, 0, 7);
		scarab03.setRotationPoint(0.0F, 0.0F, 0.0F);
		scarab03.addBox(-2.5F, -2.6F, -3.0F, 5, 3, 6, 0.0F);
		fSlope03 = new ModelRenderer(this, 40, 24);
		fSlope03.setRotationPoint(0.0F, 0.0F, -1.9F);
		fSlope03.addBox(-2.0F, 3.2F, 1.3F, 4, 1, 2, 0.0F);
		setRotateAngle(fSlope03, -0.6829473363053812F, 0.0F, 0.0F);
		plate01 = new ModelRenderer(this, 22, 17);
		plate01.setRotationPoint(0.0F, -3.2F, 0.0F);
		plate01.addBox(-1.5F, -1.0F, -2.0F, 3, 1, 4, 0.0F);
		plate02 = new ModelRenderer(this, 41, 0);
		plate02.setRotationPoint(0.0F, 0.0F, 0.0F);
		plate02.addBox(-1.5F, 4.3F, -2.0F, 3, 1, 4, 0.0F);
		lNode02 = new ModelRenderer(this, 26, 13);
		lNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
		lNode02.addBox(-1.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		scarab02 = new ModelRenderer(this, 0, 16);
		scarab02.setRotationPoint(0.0F, 0.0F, 0.0F);
		scarab02.addBox(-2.0F, 0.0F, -2.5F, 4, 1, 5, 0.0F);
		bSlope01 = new ModelRenderer(this, 24, 23);
		bSlope01.mirror = true;
		bSlope01.setRotationPoint(0.0F, 0.0F, 1.9F);
		bSlope01.addBox(-2.0F, -0.8F, -0.7F, 4, 1, 2, 0.0F);
		setRotateAngle(bSlope01, -0.6829473363053812F, 0.0F, 0.0F);
		bNode01 = new ModelRenderer(this, 36, 8);
		bNode01.mirror = true;
		bNode01.setRotationPoint(0.0F, 2.3F, 3.7F);
		bNode01.addBox(-1.0F, -1.2F, -0.6F, 2, 2, 1, 0.0F);
		setRotateAngle(bNode01, 0.31869712141416456F, 0.0F, 0.0F);
		rNode02 = new ModelRenderer(this, 26, 13);
		rNode02.mirror = true;
		rNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
		rNode02.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		rNode01 = new ModelRenderer(this, 26, 7);
		rNode01.mirror = true;
		rNode01.setRotationPoint(2.2F, -1.2F, 0.0F);
		rNode01.addBox(-1.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rNode01, 0.0F, 0.0F, -0.31869712141416456F);
		fSlope01 = new ModelRenderer(this, 24, 23);
		fSlope01.setRotationPoint(0.0F, 0.0F, -1.9F);
		fSlope01.addBox(-2.0F, -0.8F, -1.3F, 4, 1, 2, 0.0F);
		setRotateAngle(fSlope01, 0.6829473363053812F, 0.0F, 0.0F);
		scarab05 = new ModelRenderer(this, 25, 0);
		scarab05.setRotationPoint(0.0F, 0.0F, 0.0F);
		scarab05.addBox(-1.5F, -3.7F, -2.0F, 3, 1, 4, 0.0F);
		fNode02 = new ModelRenderer(this, 39, 12);
		fNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
		fNode02.addBox(-0.5F, -0.7F, -1.3F, 1, 1, 1, 0.0F);
		lNode01 = new ModelRenderer(this, 26, 7);
		lNode01.setRotationPoint(-1.8F, -1.2F, 0.0F);
		lNode01.addBox(-1.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lNode01, 0.0F, 0.0F, 0.31869712141416456F);
		plate01.addChild(bSlope03);
		plate01.addChild(fNode01);
		scarab03.addChild(scarab04);
		bNode01.addChild(bNode02);
		bSlope01.addChild(bSlope02);
		fSlope01.addChild(fSlope02);
		scarab02.addChild(scarab03);
		plate01.addChild(fSlope03);
		scarab03.addChild(plate01);
		plate01.addChild(plate02);
		lNode01.addChild(lNode02);
		scarab01.addChild(scarab02);
		plate01.addChild(bSlope01);
		plate01.addChild(bNode01);
		rNode01.addChild(rNode02);
		scarab03.addChild(rNode01);
		plate01.addChild(fSlope01);
		scarab04.addChild(scarab05);
		fNode01.addChild(fNode02);
		scarab03.addChild(lNode01);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		scarab01.render(f5);
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
