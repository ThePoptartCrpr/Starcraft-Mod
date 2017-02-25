package net.bvanseghi.starcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * scarab - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelScarab extends ModelBase {
    public ModelRenderer scarab01;
    public ModelRenderer scarab02;
    public ModelRenderer scarab03;
    public ModelRenderer scarab04;
    public ModelRenderer lNode01;
    public ModelRenderer rNode01;
    public ModelRenderer plate01;
    public ModelRenderer scarab05;
    public ModelRenderer lNode02;
    public ModelRenderer rNode02;
    public ModelRenderer fSlope01;
    public ModelRenderer bSlope01;
    public ModelRenderer plate02;
    public ModelRenderer fSlope03;
    public ModelRenderer bSlope03;
    public ModelRenderer fNode01;
    public ModelRenderer bNode01;
    public ModelRenderer fSlope02;
    public ModelRenderer bSlope02;
    public ModelRenderer fNode02;
    public ModelRenderer bNode02;

    public ModelScarab() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.bSlope03 = new ModelRenderer(this, 40, 24);
        this.bSlope03.mirror = true;
        this.bSlope03.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.bSlope03.addBox(-2.0F, 3.2F, -3.3F, 4, 1, 2, 0.0F);
        this.setRotateAngle(bSlope03, 0.6829473363053812F, 0.0F, 0.0F);
        this.fNode01 = new ModelRenderer(this, 36, 8);
        this.fNode01.setRotationPoint(0.0F, 2.3F, -3.0F);
        this.fNode01.addBox(-1.0F, -1.2F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(fNode01, -0.31869712141416456F, 0.0F, 0.0F);
        this.scarab04 = new ModelRenderer(this, 0, 0);
        this.scarab04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.scarab04.addBox(-2.0F, -3.2F, -2.5F, 4, 1, 5, 0.0F);
        this.bNode02 = new ModelRenderer(this, 39, 12);
        this.bNode02.mirror = true;
        this.bNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bNode02.addBox(-0.5F, -0.7F, -0.3F, 1, 1, 1, 0.0F);
        this.bSlope02 = new ModelRenderer(this, 38, 18);
        this.bSlope02.mirror = true;
        this.bSlope02.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.bSlope02.addBox(-2.5F, -0.2F, -1.0F, 5, 1, 4, 0.0F);
        this.setRotateAngle(bSlope02, -0.8651597102135892F, 0.0F, 0.0F);
        this.fSlope02 = new ModelRenderer(this, 38, 18);
        this.fSlope02.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.fSlope02.addBox(-2.5F, -0.1F, -2.9F, 5, 1, 4, 0.0F);
        this.setRotateAngle(fSlope02, 0.8651597102135892F, 0.0F, 0.0F);
        this.scarab01 = new ModelRenderer(this, 0, 25);
        this.scarab01.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.scarab01.addBox(-1.5F, 0.5F, -2.0F, 3, 1, 4, 0.0F);
        this.scarab03 = new ModelRenderer(this, 0, 7);
        this.scarab03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.scarab03.addBox(-2.5F, -2.6F, -3.0F, 5, 3, 6, 0.0F);
        this.fSlope03 = new ModelRenderer(this, 40, 24);
        this.fSlope03.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.fSlope03.addBox(-2.0F, 3.2F, 1.3F, 4, 1, 2, 0.0F);
        this.setRotateAngle(fSlope03, -0.6829473363053812F, 0.0F, 0.0F);
        this.plate01 = new ModelRenderer(this, 22, 17);
        this.plate01.setRotationPoint(0.0F, -3.2F, 0.0F);
        this.plate01.addBox(-1.5F, -1.0F, -2.0F, 3, 1, 4, 0.0F);
        this.plate02 = new ModelRenderer(this, 41, 0);
        this.plate02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.plate02.addBox(-1.5F, 4.3F, -2.0F, 3, 1, 4, 0.0F);
        this.lNode02 = new ModelRenderer(this, 26, 13);
        this.lNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lNode02.addBox(-1.6F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.scarab02 = new ModelRenderer(this, 0, 16);
        this.scarab02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.scarab02.addBox(-2.0F, 0.0F, -2.5F, 4, 1, 5, 0.0F);
        this.bSlope01 = new ModelRenderer(this, 24, 23);
        this.bSlope01.mirror = true;
        this.bSlope01.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.bSlope01.addBox(-2.0F, -0.8F, -0.7F, 4, 1, 2, 0.0F);
        this.setRotateAngle(bSlope01, -0.6829473363053812F, 0.0F, 0.0F);
        this.bNode01 = new ModelRenderer(this, 36, 8);
        this.bNode01.mirror = true;
        this.bNode01.setRotationPoint(0.0F, 2.3F, 3.7F);
        this.bNode01.addBox(-1.0F, -1.2F, -0.6F, 2, 2, 1, 0.0F);
        this.setRotateAngle(bNode01, 0.31869712141416456F, 0.0F, 0.0F);
        this.rNode02 = new ModelRenderer(this, 26, 13);
        this.rNode02.mirror = true;
        this.rNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rNode02.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.rNode01 = new ModelRenderer(this, 26, 7);
        this.rNode01.mirror = true;
        this.rNode01.setRotationPoint(2.2F, -1.2F, 0.0F);
        this.rNode01.addBox(-1.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rNode01, 0.0F, 0.0F, -0.31869712141416456F);
        this.fSlope01 = new ModelRenderer(this, 24, 23);
        this.fSlope01.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.fSlope01.addBox(-2.0F, -0.8F, -1.3F, 4, 1, 2, 0.0F);
        this.setRotateAngle(fSlope01, 0.6829473363053812F, 0.0F, 0.0F);
        this.scarab05 = new ModelRenderer(this, 25, 0);
        this.scarab05.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.scarab05.addBox(-1.5F, -3.7F, -2.0F, 3, 1, 4, 0.0F);
        this.fNode02 = new ModelRenderer(this, 39, 12);
        this.fNode02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fNode02.addBox(-0.5F, -0.7F, -1.3F, 1, 1, 1, 0.0F);
        this.lNode01 = new ModelRenderer(this, 26, 7);
        this.lNode01.setRotationPoint(-1.8F, -1.2F, 0.0F);
        this.lNode01.addBox(-1.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lNode01, 0.0F, 0.0F, 0.31869712141416456F);
        this.plate01.addChild(this.bSlope03);
        this.plate01.addChild(this.fNode01);
        this.scarab03.addChild(this.scarab04);
        this.bNode01.addChild(this.bNode02);
        this.bSlope01.addChild(this.bSlope02);
        this.fSlope01.addChild(this.fSlope02);
        this.scarab02.addChild(this.scarab03);
        this.plate01.addChild(this.fSlope03);
        this.scarab03.addChild(this.plate01);
        this.plate01.addChild(this.plate02);
        this.lNode01.addChild(this.lNode02);
        this.scarab01.addChild(this.scarab02);
        this.plate01.addChild(this.bSlope01);
        this.plate01.addChild(this.bNode01);
        this.rNode01.addChild(this.rNode02);
        this.scarab03.addChild(this.rNode01);
        this.plate01.addChild(this.fSlope01);
        this.scarab04.addChild(this.scarab05);
        this.fNode01.addChild(this.fNode02);
        this.scarab03.addChild(this.lNode01);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.scarab01.render(f5);
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
