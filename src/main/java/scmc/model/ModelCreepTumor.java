package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Creep Tumor - Ruthless
 * Created using Tabula 5.1.0
 */
public class ModelCreepTumor extends ModelBase {
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
    public ModelRenderer bulb1;
    public ModelRenderer bulb2;
    public ModelRenderer bulb3;
    public ModelRenderer bulb4;
    public ModelRenderer bulb5;
    public ModelRenderer bulb6;
    public ModelRenderer bulb7;
    public ModelRenderer bulb9;
    public ModelRenderer bulb10;
    public ModelRenderer bulb8;

    public ModelCreepTumor() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.bulb2 = new ModelRenderer(this, 12, 8);
        this.bulb2.setRotationPoint(-2.0F, 17.0F, -3.0F);
        this.bulb2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.bulb5 = new ModelRenderer(this, 16, 10);
        this.bulb5.setRotationPoint(-4.0F, 18.0F, 3.0F);
        this.bulb5.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.bulb9 = new ModelRenderer(this, 16, 11);
        this.bulb9.setRotationPoint(4.0F, 18.0F, 3.0F);
        this.bulb9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.side4 = new ModelRenderer(this, 38, 27);
        this.side4.setRotationPoint(-8.0F, 20.0F, -6.0F);
        this.side4.addBox(0.0F, 0.0F, 0.0F, 1, 4, 12, 0.0F);
        this.main = new ModelRenderer(this, 0, 46);
        this.main.mirror = true;
        this.main.setRotationPoint(-7.0F, 20.0F, -7.0F);
        this.main.addBox(0.0F, 0.0F, 0.0F, 14, 4, 14, 0.0F);
        this.side1 = new ModelRenderer(this, 38, 38);
        this.side1.setRotationPoint(-6.0F, 20.0F, 7.0F);
        this.side1.addBox(0.0F, 0.0F, 0.0F, 12, 4, 1, 0.0F);
        this.topside1 = new ModelRenderer(this, 40, 23);
        this.topside1.setRotationPoint(-5.0F, 19.0F, 6.0F);
        this.topside1.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        this.topside3 = new ModelRenderer(this, 40, 13);
        this.topside3.setRotationPoint(6.0F, 19.0F, -5.0F);
        this.topside3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.bulb7 = new ModelRenderer(this, 16, 11);
        this.bulb7.setRotationPoint(-5.0F, 18.0F, -3.0F);
        this.bulb7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.bulb8 = new ModelRenderer(this, 16, 11);
        this.bulb8.setRotationPoint(-4.0F, 18.0F, -6.0F);
        this.bulb8.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        this.side2 = new ModelRenderer(this, 38, 38);
        this.side2.setRotationPoint(-6.0F, 20.0F, -8.0F);
        this.side2.addBox(0.0F, 0.0F, 0.0F, 12, 4, 1, 0.0F);
        this.bulb3 = new ModelRenderer(this, 16, 11);
        this.bulb3.setRotationPoint(3.0F, 18.0F, -4.0F);
        this.bulb3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.topside2 = new ModelRenderer(this, 40, 23);
        this.topside2.setRotationPoint(-5.0F, 19.0F, -7.0F);
        this.topside2.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        this.bulb6 = new ModelRenderer(this, 17, 12);
        this.bulb6.setRotationPoint(-4.0F, 18.0F, 0.0F);
        this.bulb6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.side3 = new ModelRenderer(this, 38, 27);
        this.side3.setRotationPoint(7.0F, 20.0F, -6.0F);
        this.side3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 12, 0.0F);
        this.topside4 = new ModelRenderer(this, 0, 21);
        this.topside4.setRotationPoint(-7.0F, 19.0F, -5.0F);
        this.topside4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.maintop = new ModelRenderer(this, 0, 33);
        this.maintop.setRotationPoint(-6.0F, 19.0F, -6.0F);
        this.maintop.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12, 0.0F);
        this.bulb1 = new ModelRenderer(this, 17, 11);
        this.bulb1.setRotationPoint(0.0F, 18.0F, 3.0F);
        this.bulb1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.bulb4 = new ModelRenderer(this, 16, 11);
        this.bulb4.setRotationPoint(3.0F, 18.0F, 0.0F);
        this.bulb4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.bulb10 = new ModelRenderer(this, 16, 11);
        this.bulb10.setRotationPoint(1.0F, 18.0F, -5.0F);
        this.bulb10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.bulb9.addChild(this.bulb8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.bulb2.render(f5);
        this.bulb5.render(f5);
        this.bulb9.render(f5);
        this.side4.render(f5);
        this.main.render(f5);
        this.side1.render(f5);
        this.topside1.render(f5);
        this.topside3.render(f5);
        this.bulb7.render(f5);
        this.side2.render(f5);
        this.bulb3.render(f5);
        this.topside2.render(f5);
        this.bulb6.render(f5);
        this.side3.render(f5);
        this.topside4.render(f5);
        this.maintop.render(f5);
        this.bulb1.render(f5);
        this.bulb4.render(f5);
        this.bulb10.render(f5);
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