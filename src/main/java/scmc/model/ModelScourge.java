package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelScourge.tcn - TechneToTabulaImporter
 * Created using Tabula 4.1.1
 */
public class ModelScourge extends ModelBase {
    public ModelRenderer tail5;
    public ModelRenderer rightWingExt;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer Mouth;
    public ModelRenderer rightWingBase;
    public ModelRenderer leftWingBase;
    public ModelRenderer leftWingExt;
    public ModelRenderer base;
    public ModelRenderer leftWingBase_1;
    public ModelRenderer rightWingBase_1;
    public ModelRenderer chomper1;
    public ModelRenderer chomper2;
    public ModelRenderer chomper3;
    public ModelRenderer chomper4;
    public ModelRenderer chomper5;
    public ModelRenderer chomper6;
    public ModelRenderer chomper7;
    public ModelRenderer chomper8;

    public ModelScourge() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.base = new ModelRenderer(this, 0, 0);
        this.base.setRotationPoint(-3.0F, 10.0F, -7.0F);
        this.base.addBox(0.0F, 0.0F, 0.0F, 6, 6, 9, 0.0F);
        this.setRotateAngle(base, 0.14871443808078766F, -0.0F, 0.0F);
        this.chomper1 = new ModelRenderer(this, 31, 7);
        this.chomper1.setRotationPoint(1.600000023841858F, 11.399999618530273F, -8.899999618530273F);
        this.chomper1.addBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper1, -0.13962633907794952F, -0.13962633907794952F, 0.0F);
        this.tail5 = new ModelRenderer(this, 0, 48);
        this.tail5.setRotationPoint(-1.0F, 19.0F, 6.5F);
        this.tail5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail5, -2.416609525680542F, -0.0F, 0.0F);
        this.leftWingBase = new ModelRenderer(this, 31, 0);
        this.leftWingBase.setRotationPoint(3.0F, 12.0F, -5.0F);
        this.leftWingBase.addBox(0.0F, 0.0F, 0.0F, 9, 0, 6, 0.0F);
        this.setRotateAngle(leftWingBase, 0.37179118394851673F, -0.4461433291435241F, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 16);
        this.tail1.setRotationPoint(-2.5F, 9.0F, 2.0F);
        this.tail1.addBox(0.0F, 0.0F, 0.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(tail1, -0.40896472334861755F, -0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 0, 26);
        this.tail2.setRotationPoint(-2.0F, 11.0F, 6.0F);
        this.tail2.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(tail2, -1.1153583526611328F, -0.0F, 0.0F);
        this.leftWingBase_1 = new ModelRenderer(this, 0, 54);
        this.leftWingBase_1.setRotationPoint(3.0F, 10.0F, -1.0F);
        this.leftWingBase_1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.setRotateAngle(leftWingBase_1, 0.37179118394851673F, -0.4461433291435241F, 0.0F);
        this.chomper4 = new ModelRenderer(this, 31, 7);
        this.chomper4.setRotationPoint(-1.600000023841858F, 14.800000190734863F, -8.466666221618652F);
        this.chomper4.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper4, 0.279252678155899F, 0.13962633907794952F, 0.0F);
        this.tail3 = new ModelRenderer(this, 0, 34);
        this.tail3.setRotationPoint(-1.5F, 14.0F, 7.0F);
        this.tail3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(tail3, -1.4127871990203857F, -0.0F, 0.0F);
        this.rightWingBase = new ModelRenderer(this, 31, 0);
        this.rightWingBase.setRotationPoint(-11.0F, 12.300000190734863F, -2.0F);
        this.rightWingBase.addBox(0.0F, 0.0F, 0.0F, 9, 0, 6, 0.0F);
        this.setRotateAngle(rightWingBase, 0.37179118394851673F, 0.4788811802864074F, 0.0F);
        this.chomper2 = new ModelRenderer(this, 31, 7);
        this.chomper2.setRotationPoint(-1.4666666984558105F, 11.366666793823242F, -8.866666793823242F);
        this.chomper2.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper2, -0.13962633907794952F, 0.13962633907794952F, 0.0F);
        this.Mouth = new ModelRenderer(this, 11, 48);
        this.Mouth.setRotationPoint(-2.0F, 11.0F, -7.733333110809326F);
        this.Mouth.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.setRotateAngle(Mouth, 0.14835298061370847F, -0.0F, 0.0F);
        this.chomper5 = new ModelRenderer(this, 31, 7);
        this.chomper5.setRotationPoint(0.0F, 10.933333396911621F, -9.333333015441895F);
        this.chomper5.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper5, -0.13962633907794952F, -0.0F, 0.0F);
        this.leftWingExt = new ModelRenderer(this, 0, 58);
        this.leftWingExt.setRotationPoint(9.199999809265137F, 10.0F, 2.0999999046325684F);
        this.leftWingExt.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotateAngle(leftWingExt, 0.6419446023504676F, 0.9771990110331723F, 0.7338341021673389F);
        this.chomper8 = new ModelRenderer(this, 31, 7);
        this.chomper8.setRotationPoint(2.200000047683716F, 13.266666412353516F, -9.466666221618652F);
        this.chomper8.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper8, 0.13962633907794952F, -0.13962633907794952F, 0.0F);
        this.rightWingBase_1 = new ModelRenderer(this, 0, 54);
        this.rightWingBase_1.setRotationPoint(-10.0F, 10.0F, 2.2666666507720947F);
        this.rightWingBase_1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.setRotateAngle(rightWingBase_1, 0.37179118394851673F, 0.4788811802864074F, 0.0F);
        this.chomper3 = new ModelRenderer(this, 31, 7);
        this.chomper3.setRotationPoint(1.5333333015441895F, 14.800000190734863F, -8.466666221618652F);
        this.chomper3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper3, 0.279252678155899F, -0.13962633907794952F, 0.0F);
        this.chomper6 = new ModelRenderer(this, 31, 7);
        this.chomper6.setRotationPoint(0.0F, 15.466666221618652F, -9.133333206176758F);
        this.chomper6.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper6, 0.27925267815589905F, -0.0F, 0.0F);
        this.chomper7 = new ModelRenderer(this, 31, 7);
        this.chomper7.setRotationPoint(-2.200000047683716F, 13.333333015441895F, -9.399999618530273F);
        this.chomper7.addBox(0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(chomper7, 0.13962633907794952F, 0.13962633907794952F, 0.0F);
        this.rightWingExt = new ModelRenderer(this, 0, 58);
        this.rightWingExt.setRotationPoint(-10.0F, 10.0F, 2.0999999046325684F);
        this.rightWingExt.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotateAngle(rightWingExt, 2.4996401628233897F, 0.9772039035680417F, 2.4077520124362692F);
        this.tail4 = new ModelRenderer(this, 0, 41);
        this.tail4.setRotationPoint(-1.5F, 17.0F, 7.5F);
        this.tail4.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(tail4, -2.0820021629333496F, -0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.base.render(f5);
        this.chomper1.render(f5);
        this.tail5.render(f5);
        this.leftWingBase.render(f5);
        this.tail1.render(f5);
        this.tail2.render(f5);
        this.leftWingBase_1.render(f5);
        this.chomper4.render(f5);
        this.tail3.render(f5);
        this.rightWingBase.render(f5);
        this.chomper2.render(f5);
        this.Mouth.render(f5);
        this.chomper5.render(f5);
        this.leftWingExt.render(f5);
        this.chomper8.render(f5);
        this.rightWingBase_1.render(f5);
        this.chomper3.render(f5);
        this.chomper6.render(f5);
        this.chomper7.render(f5);
        this.rightWingExt.render(f5);
        this.tail4.render(f5);
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