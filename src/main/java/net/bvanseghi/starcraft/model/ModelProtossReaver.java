package net.bvanseghi.starcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * reaver - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelProtossReaver extends ModelBase {
    public ModelRenderer chassis00a;
    public ModelRenderer lFrontPipe2a;
    public ModelRenderer rFrontPipe2a;
    public ModelRenderer chassis00b;
    public ModelRenderer lFrontPipe1a;
    public ModelRenderer rFrontPipe1a;
    public ModelRenderer lfPipe3;
    public ModelRenderer rfPipe3;
    public ModelRenderer chassis1a;
    public ModelRenderer lFrontPipe2b;
    public ModelRenderer rFrontPipe2b;
    public ModelRenderer head;
    public ModelRenderer lfPlatea;
    public ModelRenderer visor;
    public ModelRenderer rfPlatea;
    public ModelRenderer lfPlate2;
    public ModelRenderer rfPlate2;
    public ModelRenderer headMuzzle;
    public ModelRenderer muzzleSlope;
    public ModelRenderer muzzleSlopeBottom;
    public ModelRenderer lfPlateb;
    public ModelRenderer lfPlatec;
    public ModelRenderer rfPlateb;
    public ModelRenderer rfPlatec;
    public ModelRenderer lFrontPipe1b;
    public ModelRenderer lFrontPipe1c;
    public ModelRenderer rFrontPipe1b;
    public ModelRenderer rFrontPipe1c;
    public ModelRenderer lPanel1a;
    public ModelRenderer cPlate1a;
    public ModelRenderer chassis1b;
    public ModelRenderer rPanel1a;
    public ModelRenderer lPipe1a;
    public ModelRenderer rPipe1a;
    public ModelRenderer lPipe2;
    public ModelRenderer rPipe2;
    public ModelRenderer chassis2a;
    public ModelRenderer lPanel1b;
    public ModelRenderer lPanel1Light;
    public ModelRenderer clPanel1a;
    public ModelRenderer crPanel1a;
    public ModelRenderer cplate1b;
    public ModelRenderer cPlate1c;
    public ModelRenderer clPanel1b;
    public ModelRenderer clPanel1c;
    public ModelRenderer crPanel1b;
    public ModelRenderer crPanel1c;
    public ModelRenderer lPanel1b_1;
    public ModelRenderer lPanel1Light_1;
    public ModelRenderer lPipe1b;
    public ModelRenderer rPipe1b;
    public ModelRenderer lPanel2a;
    public ModelRenderer cPlate2a;
    public ModelRenderer chassis2b;
    public ModelRenderer rPanel2a;
    public ModelRenderer chassis3a;
    public ModelRenderer lPanel2b;
    public ModelRenderer lPanel2Light;
    public ModelRenderer clPanel2a;
    public ModelRenderer crPanel2a;
    public ModelRenderer cPlate2c;
    public ModelRenderer clPanel2b;
    public ModelRenderer clPanel2c;
    public ModelRenderer crPanel2b;
    public ModelRenderer crPanel2c;
    public ModelRenderer lPanel2b_1;
    public ModelRenderer lPanel2Light_1;
    public ModelRenderer lPanel3a;
    public ModelRenderer cPlate3a;
    public ModelRenderer chassis3b;
    public ModelRenderer rPanel3a;
    public ModelRenderer chassis4a;
    public ModelRenderer lPanel3b;
    public ModelRenderer lPanel3Light;
    public ModelRenderer clPanel3a;
    public ModelRenderer crPanel3a;
    public ModelRenderer cPlate3c;
    public ModelRenderer clPanel3b;
    public ModelRenderer clPanel3c;
    public ModelRenderer crPanel3b;
    public ModelRenderer crPanel3c;
    public ModelRenderer lPanel3b_1;
    public ModelRenderer lPanel3Light_1;
    public ModelRenderer lPanel4a;
    public ModelRenderer cPlate4a;
    public ModelRenderer chassis4b;
    public ModelRenderer rPanel4a;
    public ModelRenderer chassis5a;
    public ModelRenderer lPanel4b;
    public ModelRenderer lPanel4Light;
    public ModelRenderer clPanel4a;
    public ModelRenderer crPanel4a;
    public ModelRenderer cPlate4c;
    public ModelRenderer clPanel4b;
    public ModelRenderer crPanel4b;
    public ModelRenderer lPanel4b_1;
    public ModelRenderer lPanel4Light_1;
    public ModelRenderer chassis5b;
    public ModelRenderer lBrace1;
    public ModelRenderer rBrace1;
    public ModelRenderer lBrace2;
    public ModelRenderer rBrace2;

    public ModelProtossReaver() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.lPanel4b = new ModelRenderer(this, 18, 22);
        this.lPanel4b.setRotationPoint(0.0F, -0.5F, 4.9F);
        this.lPanel4b.addBox(-0.1F, -1.5F, -0.3F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lPanel4b, 0.0F, -0.31869712141416456F, 0.0F);
        this.lPanel2Light_1 = new ModelRenderer(this, 25, 24);
        this.lPanel2Light_1.mirror = true;
        this.lPanel2Light_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel2Light_1.addBox(-1.6F, -1.0F, 1.5F, 1, 2, 3, 0.0F);
        this.rPipe2 = new ModelRenderer(this, 27, 45);
        this.rPipe2.mirror = true;
        this.rPipe2.setRotationPoint(-6.7F, 2.9F, 1.7F);
        this.rPipe2.addBox(-1.1F, -0.5F, -0.7F, 2, 1, 5, 0.0F);
        this.setRotateAngle(rPipe2, 0.0F, -0.6829473363053812F, 0.0F);
        this.lFrontPipe2b = new ModelRenderer(this, 48, 30);
        this.lFrontPipe2b.setRotationPoint(0.0F, -0.2F, -0.7F);
        this.lFrontPipe2b.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lFrontPipe2b, 0.4303981935418017F, 0.0F, 0.0F);
        this.chassis00b = new ModelRenderer(this, 79, 16);
        this.chassis00b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chassis00b.addBox(-4.0F, -5.3F, -3.0F, 8, 5, 3, 0.0F);
        this.cPlate1c = new ModelRenderer(this, 0, 52);
        this.cPlate1c.setRotationPoint(0.0F, 0.2F, 2.7F);
        this.cPlate1c.addBox(-1.5F, -1.9F, -0.7F, 3, 1, 4, 0.0F);
        this.setRotateAngle(cPlate1c, -0.31869712141416456F, 0.0F, 0.0F);
        this.rPanel2a = new ModelRenderer(this, 0, 14);
        this.rPanel2a.mirror = true;
        this.rPanel2a.setRotationPoint(-5.5F, -0.5F, -1.8F);
        this.rPanel2a.addBox(-1.3F, -3.5F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(rPanel2a, 0.045553093477052F, -0.36425021489121656F, 0.27314402793711257F);
        this.chassis2b = new ModelRenderer(this, 47, 2);
        this.chassis2b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chassis2b.addBox(-5.5F, -3.9F, -1.5F, 11, 4, 6, 0.0F);
        this.clPanel2b = new ModelRenderer(this, 32, 36);
        this.clPanel2b.setRotationPoint(0.0F, 0.5F, 6.3F);
        this.clPanel2b.addBox(-3.5F, -1.0F, -0.5F, 7, 2, 3, 0.0F);
        this.setRotateAngle(clPanel2b, -0.18203784098300857F, 0.0F, 0.0F);
        this.rPanel3a = new ModelRenderer(this, 2, 17);
        this.rPanel3a.mirror = true;
        this.rPanel3a.setRotationPoint(-5.0F, 0.2F, -0.5F);
        this.rPanel3a.addBox(-0.9F, -2.5F, 0.0F, 1, 5, 6, 0.0F);
        this.setRotateAngle(rPanel3a, -0.045553093477052F, -0.4553564018453205F, 0.22759093446006054F);
        this.lPanel4a = new ModelRenderer(this, 2, 17);
        this.lPanel4a.setRotationPoint(4.5F, 0.8F, -0.5F);
        this.lPanel4a.addBox(0.0F, -2.5F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(lPanel4a, -0.18203784098300857F, 0.40980330836826856F, -0.22759093446006054F);
        this.lPanel2b = new ModelRenderer(this, 18, 20);
        this.lPanel2b.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.lPanel2b.addBox(-0.1F, -3.0F, -0.3F, 1, 6, 2, 0.0F);
        this.setRotateAngle(lPanel2b, 0.0F, -0.31869712141416456F, 0.0F);
        this.rPanel4a = new ModelRenderer(this, 2, 17);
        this.rPanel4a.mirror = true;
        this.rPanel4a.setRotationPoint(-4.5F, 0.8F, -0.5F);
        this.rPanel4a.addBox(-0.9F, -2.5F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(rPanel4a, -0.18203784098300857F, -0.40980330836826856F, 0.22759093446006054F);
        this.lfPipe3 = new ModelRenderer(this, 27, 45);
        this.lfPipe3.setRotationPoint(4.4F, 0.9F, -2.8F);
        this.lfPipe3.addBox(-1.1F, -0.5F, -0.7F, 2, 1, 5, 0.0F);
        this.setRotateAngle(lfPipe3, 0.0F, 0.9560913642424937F, 0.0F);
        this.chassis4a = new ModelRenderer(this, 4, 4);
        this.chassis4a.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.chassis4a.addBox(-5.0F, 1.0F, -0.2F, 10, 3, 6, 0.0F);
        this.cPlate4c = new ModelRenderer(this, 2, 54);
        this.cPlate4c.setRotationPoint(0.0F, 1.2F, 2.7F);
        this.cPlate4c.addBox(-1.5F, -1.9F, -0.7F, 3, 1, 2, 0.0F);
        this.setRotateAngle(cPlate4c, -0.31869712141416456F, 0.0F, 0.0F);
        this.cplate1b = new ModelRenderer(this, 108, 0);
        this.cplate1b.setRotationPoint(0.0F, -0.7F, -1.5F);
        this.cplate1b.addBox(-2.5F, -0.7F, -2.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(cplate1b, 0.136659280431156F, 0.0F, 0.0F);
        this.lPanel1Light_1 = new ModelRenderer(this, 25, 24);
        this.lPanel1Light_1.mirror = true;
        this.lPanel1Light_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel1Light_1.addBox(-1.3F, -1.0F, 1.5F, 1, 2, 3, 0.0F);
        this.visor = new ModelRenderer(this, 19, 55);
        this.visor.setRotationPoint(0.0F, -5.3F, -2.6F);
        this.visor.addBox(-2.0F, -0.4F, -2.4F, 4, 1, 2, 0.0F);
        this.rFrontPipe1b = new ModelRenderer(this, 50, 25);
        this.rFrontPipe1b.mirror = true;
        this.rFrontPipe1b.setRotationPoint(0.2F, -0.2F, -3.6F);
        this.rFrontPipe1b.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rFrontPipe1b, 0.22759093446006054F, 0.0F, 0.0F);
        this.rPipe1a = new ModelRenderer(this, 0, 42);
        this.rPipe1a.mirror = true;
        this.rPipe1a.setRotationPoint(-6.3F, 2.9F, -1.8F);
        this.rPipe1a.addBox(-0.9F, -1.1F, 0.1F, 2, 2, 5, 0.0F);
        this.setRotateAngle(rPipe1a, 0.0F, -1.0016444577195458F, 0.0F);
        this.lPipe2 = new ModelRenderer(this, 27, 45);
        this.lPipe2.setRotationPoint(6.7F, 2.9F, 1.7F);
        this.lPipe2.addBox(-1.1F, -0.5F, -0.7F, 2, 1, 5, 0.0F);
        this.setRotateAngle(lPipe2, 0.0F, 0.6829473363053812F, 0.0F);
        this.cPlate2a = new ModelRenderer(this, 85, 5);
        this.cPlate2a.setRotationPoint(0.0F, -3.5F, -3.3F);
        this.cPlate2a.addBox(-5.0F, -1.5F, -1.6F, 10, 2, 4, 0.0F);
        this.setRotateAngle(cPlate2a, 0.6373942428283291F, 0.0F, 0.0F);
        this.cPlate1a = new ModelRenderer(this, 89, 5);
        this.cPlate1a.setRotationPoint(0.0F, -5.0F, -2.3F);
        this.cPlate1a.addBox(-3.5F, -1.5F, -1.6F, 7, 2, 4, 0.0F);
        this.setRotateAngle(cPlate1a, 0.6373942428283291F, 0.0F, 0.0F);
        this.chassis3b = new ModelRenderer(this, 49, 4);
        this.chassis3b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chassis3b.addBox(-5.0F, -2.0F, 0.8F, 10, 3, 5, 0.0F);
        this.lPanel3b = new ModelRenderer(this, 18, 22);
        this.lPanel3b.setRotationPoint(0.0F, 0.0F, 6.1F);
        this.lPanel3b.addBox(-0.1F, -2.0F, -0.3F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lPanel3b, 0.0F, -0.31869712141416456F, 0.0F);
        this.lPanel1b_1 = new ModelRenderer(this, 18, 20);
        this.lPanel1b_1.mirror = true;
        this.lPanel1b_1.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.lPanel1b_1.addBox(-0.9F, -3.0F, -0.3F, 1, 6, 2, 0.0F);
        this.setRotateAngle(lPanel1b_1, 0.0F, 0.31869712141416456F, 0.0F);
        this.clPanel1c = new ModelRenderer(this, 55, 38);
        this.clPanel1c.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.clPanel1c.addBox(-3.0F, -0.8F, -0.3F, 6, 1, 1, 0.0F);
        this.setRotateAngle(clPanel1c, -0.18203784098300857F, 0.0F, 0.0F);
        this.lBrace2 = new ModelRenderer(this, 94, 42);
        this.lBrace2.setRotationPoint(0.5F, 0.3F, 2.5F);
        this.lBrace2.addBox(0.6F, -0.9F, 0.3F, 2, 5, 3, 0.0F);
        this.setRotateAngle(lBrace2, 0.136659280431156F, -0.5009094953223726F, -0.091106186954104F);
        this.lFrontPipe2a = new ModelRenderer(this, 38, 30);
        this.lFrontPipe2a.setRotationPoint(3.5F, 0.5F, -4.2F);
        this.lFrontPipe2a.addBox(-1.0F, -0.8F, -1.0F, 2, 1, 2, 0.0F);
        this.lPanel3a = new ModelRenderer(this, 2, 17);
        this.lPanel3a.setRotationPoint(5.0F, 0.2F, -0.5F);
        this.lPanel3a.addBox(0.0F, -2.5F, 0.0F, 1, 5, 6, 0.0F);
        this.setRotateAngle(lPanel3a, -0.045553093477052F, 0.4553564018453205F, -0.22759093446006054F);
        this.lfPlatec = new ModelRenderer(this, 85, 44);
        this.lfPlatec.setRotationPoint(5.8F, 0.0F, 0.0F);
        this.lfPlatec.addBox(-0.2F, -2.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lfPlatec, 0.0F, -0.22759093446006054F, 0.0F);
        this.clPanel3a = new ModelRenderer(this, 2, 33);
        this.clPanel3a.setRotationPoint(4.0F, -0.8F, 1.4F);
        this.clPanel3a.addBox(-4.0F, -0.8F, 0.0F, 7, 3, 5, 0.0F);
        this.setRotateAngle(clPanel3a, -0.31869712141416456F, 0.136659280431156F, 0.18203784098300857F);
        this.muzzleSlope = new ModelRenderer(this, 88, 26);
        this.muzzleSlope.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.muzzleSlope.addBox(-1.0F, -2.3F, -2.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(muzzleSlope, 0.5164429256651221F, 0.0F, 0.0F);
        this.crPanel1b = new ModelRenderer(this, 32, 36);
        this.crPanel1b.mirror = true;
        this.crPanel1b.setRotationPoint(0.0F, 0.5F, 7.3F);
        this.crPanel1b.addBox(-3.5F, -1.0F, -0.5F, 7, 2, 3, 0.0F);
        this.setRotateAngle(crPanel1b, -0.18203784098300857F, 0.0F, 0.0F);
        this.lFrontPipe1c = new ModelRenderer(this, 62, 26);
        this.lFrontPipe1c.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.lFrontPipe1c.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lFrontPipe1c, 0.22759093446006054F, 0.0F, 0.0F);
        this.chassis2a = new ModelRenderer(this, 2, 2);
        this.chassis2a.setRotationPoint(0.0F, -0.6F, 6.5F);
        this.chassis2a.addBox(-6.5F, 0.1F, -2.5F, 13, 4, 7, 0.0F);
        this.crPanel2b = new ModelRenderer(this, 32, 36);
        this.crPanel2b.mirror = true;
        this.crPanel2b.setRotationPoint(0.0F, 0.5F, 6.3F);
        this.crPanel2b.addBox(-3.5F, -1.0F, -0.5F, 7, 2, 3, 0.0F);
        this.setRotateAngle(crPanel2b, -0.18203784098300857F, 0.0F, 0.0F);
        this.crPanel1a = new ModelRenderer(this, 0, 31);
        this.crPanel1a.mirror = true;
        this.crPanel1a.setRotationPoint(-3.8F, -0.8F, 1.4F);
        this.crPanel1a.addBox(-4.0F, -0.8F, 0.0F, 8, 3, 7, 0.0F);
        this.setRotateAngle(crPanel1a, -0.31869712141416456F, -0.27314402793711257F, -0.18203784098300857F);
        this.lPanel4b_1 = new ModelRenderer(this, 18, 22);
        this.lPanel4b_1.mirror = true;
        this.lPanel4b_1.setRotationPoint(0.1F, -0.5F, 4.9F);
        this.lPanel4b_1.addBox(-0.9F, -1.5F, -0.3F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lPanel4b_1, 0.0F, 0.31869712141416456F, 0.0F);
        this.clPanel3c = new ModelRenderer(this, 55, 38);
        this.clPanel3c.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.clPanel3c.addBox(-3.0F, -0.8F, -0.3F, 5, 1, 1, 0.0F);
        this.setRotateAngle(clPanel3c, -0.18203784098300857F, 0.0F, 0.0F);
        this.lPanel1Light = new ModelRenderer(this, 25, 24);
        this.lPanel1Light.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel1Light.addBox(0.4F, -1.0F, 1.5F, 1, 2, 3, 0.0F);
        this.lBrace1 = new ModelRenderer(this, 92, 33);
        this.lBrace1.setRotationPoint(2.1F, -0.4F, 0.0F);
        this.lBrace1.addBox(-0.4F, -1.0F, 0.6F, 2, 2, 5, 0.0F);
        this.setRotateAngle(lBrace1, -0.091106186954104F, 0.31869712141416456F, 0.0F);
        this.crPanel2c = new ModelRenderer(this, 55, 38);
        this.crPanel2c.mirror = true;
        this.crPanel2c.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.crPanel2c.addBox(-3.0F, -0.8F, -0.3F, 6, 1, 1, 0.0F);
        this.setRotateAngle(crPanel2c, -0.18203784098300857F, 0.0F, 0.0F);
        this.chassis5b = new ModelRenderer(this, 53, 5);
        this.chassis5b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chassis5b.addBox(-4.0F, -0.9F, 0.8F, 8, 3, 3, 0.0F);
        this.lPanel2Light = new ModelRenderer(this, 25, 24);
        this.lPanel2Light.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel2Light.addBox(0.4F, -1.0F, 1.5F, 1, 2, 3, 0.0F);
        this.rfPlatec = new ModelRenderer(this, 85, 44);
        this.rfPlatec.mirror = true;
        this.rfPlatec.setRotationPoint(-5.8F, 0.0F, 0.0F);
        this.rfPlatec.addBox(-1.2F, -2.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rfPlatec, 0.0F, 0.22759093446006054F, 0.0F);
        this.lFrontPipe1b = new ModelRenderer(this, 50, 25);
        this.lFrontPipe1b.setRotationPoint(0.2F, -0.2F, -3.6F);
        this.lFrontPipe1b.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lFrontPipe1b, 0.22759093446006054F, 0.0F, 0.0F);
        this.lPanel3Light_1 = new ModelRenderer(this, 25, 24);
        this.lPanel3Light_1.mirror = true;
        this.lPanel3Light_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel3Light_1.addBox(-1.2F, -1.0F, 2.0F, 1, 2, 2, 0.0F);
        this.lfPlate2 = new ModelRenderer(this, 28, 15);
        this.lfPlate2.setRotationPoint(4.2F, -1.6F, 0.0F);
        this.lfPlate2.addBox(-0.5F, -1.5F, -4.4F, 1, 3, 4, 0.0F);
        this.setRotateAngle(lfPlate2, 0.22759093446006054F, -0.31869712141416456F, 0.0F);
        this.clPanel3b = new ModelRenderer(this, 32, 36);
        this.clPanel3b.setRotationPoint(0.0F, 0.5F, 5.2F);
        this.clPanel3b.addBox(-3.5F, -1.0F, -0.5F, 6, 2, 2, 0.0F);
        this.setRotateAngle(clPanel3b, -0.18203784098300857F, 0.0F, 0.0F);
        this.lPanel2a = new ModelRenderer(this, 0, 14);
        this.lPanel2a.setRotationPoint(6.0F, -0.5F, -1.8F);
        this.lPanel2a.addBox(0.0F, -3.5F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(lPanel2a, 0.045553093477052F, 0.36425021489121656F, -0.136659280431156F);
        this.crPanel3a = new ModelRenderer(this, 2, 33);
        this.crPanel3a.mirror = true;
        this.crPanel3a.setRotationPoint(-3.9F, -0.8F, 1.4F);
        this.crPanel3a.addBox(-3.5F, -0.8F, 0.0F, 7, 3, 5, 0.0F);
        this.setRotateAngle(crPanel3a, -0.31869712141416456F, -0.136659280431156F, -0.18203784098300857F);
        this.chassis5a = new ModelRenderer(this, 10, 6);
        this.chassis5a.setRotationPoint(0.0F, -0.1F, 4.9F);
        this.chassis5a.addBox(-4.5F, 2.1F, 0.9F, 9, 2, 3, 0.0F);
        this.lPipe1a = new ModelRenderer(this, 0, 42);
        this.lPipe1a.mirror = true;
        this.lPipe1a.setRotationPoint(6.3F, 2.9F, -1.8F);
        this.lPipe1a.addBox(-1.2F, -1.1F, 0.1F, 2, 2, 5, 0.0F);
        this.setRotateAngle(lPipe1a, 0.0F, 1.0016444577195458F, 0.0F);
        this.lPanel1b = new ModelRenderer(this, 18, 20);
        this.lPanel1b.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.lPanel1b.addBox(-0.1F, -3.0F, -0.3F, 1, 6, 2, 0.0F);
        this.setRotateAngle(lPanel1b, 0.0F, -0.31869712141416456F, 0.0F);
        this.clPanel4b = new ModelRenderer(this, 36, 38);
        this.clPanel4b.setRotationPoint(0.0F, 0.5F, 4.3F);
        this.clPanel4b.addBox(-2.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(clPanel4b, -0.18203784098300857F, 0.0F, 0.0F);
        this.cPlate3a = new ModelRenderer(this, 85, 5);
        this.cPlate3a.setRotationPoint(0.2F, -2.1F, 0.7F);
        this.cPlate3a.addBox(-5.0F, -1.5F, -1.6F, 10, 2, 4, 0.0F);
        this.setRotateAngle(cPlate3a, 0.5918411493512771F, 0.0F, 0.0F);
        this.lPanel4Light = new ModelRenderer(this, 26, 25);
        this.lPanel4Light.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel4Light.addBox(0.4F, -1.0F, 1.5F, 1, 1, 2, 0.0F);
        this.lPanel4Light_1 = new ModelRenderer(this, 26, 25);
        this.lPanel4Light_1.mirror = true;
        this.lPanel4Light_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel4Light_1.addBox(-1.2F, -1.2F, 1.5F, 1, 1, 2, 0.0F);
        this.lfPlatea = new ModelRenderer(this, 77, 44);
        this.lfPlatea.setRotationPoint(1.7F, -4.4F, -3.5F);
        this.lfPlatea.addBox(-0.1F, -1.0F, -1.5F, 1, 2, 2, 0.0F);
        this.setRotateAngle(lfPlatea, 0.0F, 0.0F, -0.5164429256651221F);
        this.chassis00a = new ModelRenderer(this, 49, 16);
        this.chassis00a.setRotationPoint(0.0F, 22.5F, -3.7F);
        this.chassis00a.addBox(-4.5F, -0.5F, -4.0F, 9, 2, 4, 0.0F);
        this.clPanel1a = new ModelRenderer(this, 0, 31);
        this.clPanel1a.setRotationPoint(3.9F, -0.8F, 1.4F);
        this.clPanel1a.addBox(-4.0F, -0.8F, 0.0F, 8, 3, 7, 0.0F);
        this.setRotateAngle(clPanel1a, -0.31869712141416456F, 0.27314402793711257F, 0.18203784098300857F);
        this.cPlate2c = new ModelRenderer(this, 0, 52);
        this.cPlate2c.setRotationPoint(0.0F, 0.6F, 2.7F);
        this.cPlate2c.addBox(-1.5F, -1.9F, -0.7F, 3, 1, 4, 0.0F);
        this.setRotateAngle(cPlate2c, -0.31869712141416456F, 0.0F, 0.0F);
        this.lPanel3b_1 = new ModelRenderer(this, 18, 22);
        this.lPanel3b_1.mirror = true;
        this.lPanel3b_1.setRotationPoint(0.1F, 0.0F, 6.1F);
        this.lPanel3b_1.addBox(-0.9F, -2.0F, -0.3F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lPanel3b_1, 0.0F, 0.31869712141416456F, 0.0F);
        this.crPanel1c = new ModelRenderer(this, 55, 38);
        this.crPanel1c.mirror = true;
        this.crPanel1c.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.crPanel1c.addBox(-3.0F, -0.8F, -0.3F, 6, 1, 1, 0.0F);
        this.setRotateAngle(crPanel1c, -0.18203784098300857F, 0.0F, 0.0F);
        this.chassis4b = new ModelRenderer(this, 49, 4);
        this.chassis4b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chassis4b.addBox(-4.5F, -1.0F, 0.8F, 9, 2, 5, 0.0F);
        this.crPanel2a = new ModelRenderer(this, 1, 32);
        this.crPanel2a.mirror = true;
        this.crPanel2a.setRotationPoint(-3.8F, -0.8F, 1.4F);
        this.crPanel2a.addBox(-4.0F, -0.8F, 0.0F, 8, 3, 6, 0.0F);
        this.setRotateAngle(crPanel2a, -0.31869712141416456F, -0.22759093446006054F, -0.18203784098300857F);
        this.rfPlate2 = new ModelRenderer(this, 28, 15);
        this.rfPlate2.mirror = true;
        this.rfPlate2.setRotationPoint(-4.2F, -1.6F, 0.0F);
        this.rfPlate2.addBox(-0.5F, -1.5F, -4.4F, 1, 3, 4, 0.0F);
        this.setRotateAngle(rfPlate2, 0.22759093446006054F, 0.31869712141416456F, 0.0F);
        this.clPanel1b = new ModelRenderer(this, 32, 36);
        this.clPanel1b.setRotationPoint(0.0F, 0.5F, 7.3F);
        this.clPanel1b.addBox(-3.5F, -1.0F, -0.5F, 7, 2, 3, 0.0F);
        this.setRotateAngle(clPanel1b, -0.18203784098300857F, 0.0F, 0.0F);
        this.lfPlateb = new ModelRenderer(this, 75, 36);
        this.lfPlateb.setRotationPoint(1.0F, 0.0F, -0.6F);
        this.lfPlateb.addBox(-0.2F, -2.4F, -0.5F, 6, 5, 1, 0.0F);
        this.setRotateAngle(lfPlateb, 0.0F, -0.5009094953223726F, -0.22759093446006054F);
        this.rfPlateb = new ModelRenderer(this, 75, 36);
        this.rfPlateb.mirror = true;
        this.rfPlateb.setRotationPoint(-0.2F, 0.0F, -0.6F);
        this.rfPlateb.addBox(-6.2F, -2.4F, -0.5F, 6, 5, 1, 0.0F);
        this.setRotateAngle(rfPlateb, 0.0F, 0.5009094953223726F, 0.22759093446006054F);
        this.lFrontPipe1a = new ModelRenderer(this, 37, 25);
        this.lFrontPipe1a.setRotationPoint(1.0F, 0.3F, -1.3F);
        this.lFrontPipe1a.addBox(-0.8F, -1.2F, -3.7F, 2, 2, 2, 0.0F);
        this.rfPlatea = new ModelRenderer(this, 77, 44);
        this.rfPlatea.mirror = true;
        this.rfPlatea.setRotationPoint(-2.0F, -4.4F, -3.5F);
        this.rfPlatea.addBox(-0.6F, -1.1F, -1.5F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rfPlatea, 0.0F, 0.0F, 0.5164429256651221F);
        this.rFrontPipe1c = new ModelRenderer(this, 62, 26);
        this.rFrontPipe1c.mirror = true;
        this.rFrontPipe1c.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.rFrontPipe1c.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rFrontPipe1c, 0.22759093446006054F, 0.0F, 0.0F);
        this.rBrace2 = new ModelRenderer(this, 94, 42);
        this.rBrace2.mirror = true;
        this.rBrace2.setRotationPoint(0.5F, 0.3F, 2.5F);
        this.rBrace2.addBox(-2.4F, -0.9F, 0.3F, 2, 5, 3, 0.0F);
        this.setRotateAngle(rBrace2, 0.136659280431156F, 0.5009094953223726F, 0.091106186954104F);
        this.chassis3a = new ModelRenderer(this, 4, 4);
        this.chassis3a.setRotationPoint(0.0F, 0.1F, 4.7F);
        this.chassis3a.addBox(-6.0F, 1.0F, -0.2F, 12, 3, 6, 0.0F);
        this.cPlate3c = new ModelRenderer(this, 0, 52);
        this.cPlate3c.setRotationPoint(0.0F, 0.8F, 2.7F);
        this.cPlate3c.addBox(-1.5F, -1.9F, -0.7F, 3, 1, 4, 0.0F);
        this.setRotateAngle(cPlate3c, -0.31869712141416456F, 0.0F, 0.0F);
        this.rFrontPipe1a = new ModelRenderer(this, 37, 25);
        this.rFrontPipe1a.mirror = true;
        this.rFrontPipe1a.setRotationPoint(-1.4F, 0.3F, -1.3F);
        this.rFrontPipe1a.addBox(-0.8F, -1.2F, -3.7F, 2, 2, 2, 0.0F);
        this.rPipe1b = new ModelRenderer(this, 15, 45);
        this.rPipe1b.mirror = true;
        this.rPipe1b.setRotationPoint(-0.2F, 0.0F, 4.8F);
        this.rPipe1b.addBox(-0.6F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rPipe1b, 0.0F, 0.136659280431156F, 0.0F);
        this.rPanel1a = new ModelRenderer(this, 0, 14);
        this.rPanel1a.mirror = true;
        this.rPanel1a.setRotationPoint(-6.0F, -1.2F, -1.5F);
        this.rPanel1a.addBox(-0.9F, -3.5F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(rPanel1a, 0.136659280431156F, -0.4553564018453205F, 0.36425021489121656F);
        this.crPanel3c = new ModelRenderer(this, 55, 38);
        this.crPanel3c.mirror = true;
        this.crPanel3c.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.crPanel3c.addBox(-2.5F, -0.8F, -0.3F, 5, 1, 1, 0.0F);
        this.setRotateAngle(crPanel3c, -0.18203784098300857F, 0.0F, 0.0F);
        this.rfPipe3 = new ModelRenderer(this, 27, 45);
        this.rfPipe3.mirror = true;
        this.rfPipe3.setRotationPoint(-4.4F, 0.9F, -2.8F);
        this.rfPipe3.addBox(-1.1F, -0.5F, -0.7F, 2, 1, 5, 0.0F);
        this.setRotateAngle(rfPipe3, 0.0F, -0.9560913642424937F, 0.0F);
        this.chassis1a = new ModelRenderer(this, 0, 0);
        this.chassis1a.setRotationPoint(0.0F, -2.0F, 2.4F);
        this.chassis1a.addBox(-7.0F, -0.9F, -2.5F, 14, 5, 8, 0.0F);
        this.head = new ModelRenderer(this, 105, 18);
        this.head.setRotationPoint(0.0F, -2.8F, -2.5F);
        this.head.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
        this.crPanel3b = new ModelRenderer(this, 32, 36);
        this.crPanel3b.mirror = true;
        this.crPanel3b.setRotationPoint(0.0F, 0.5F, 5.2F);
        this.crPanel3b.addBox(-3.0F, -1.0F, -0.5F, 6, 2, 2, 0.0F);
        this.setRotateAngle(crPanel3b, -0.18203784098300857F, 0.0F, 0.0F);
        this.lPipe1b = new ModelRenderer(this, 15, 45);
        this.lPipe1b.setRotationPoint(-0.2F, 0.0F, 4.8F);
        this.lPipe1b.addBox(-1.1F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lPipe1b, 0.0F, -0.136659280431156F, 0.0F);
        this.cPlate4a = new ModelRenderer(this, 89, 5);
        this.cPlate4a.setRotationPoint(0.2F, -1.2F, 0.7F);
        this.cPlate4a.addBox(-2.8F, -1.5F, -1.6F, 6, 2, 4, 0.0F);
        this.setRotateAngle(cPlate4a, 0.31869712141416456F, 0.0F, 0.0F);
        this.clPanel4a = new ModelRenderer(this, 5, 34);
        this.clPanel4a.setRotationPoint(2.7F, -0.8F, 1.4F);
        this.clPanel4a.addBox(-2.5F, -0.8F, 0.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(clPanel4a, -0.31869712141416456F, 0.136659280431156F, 0.18203784098300857F);
        this.rBrace1 = new ModelRenderer(this, 92, 33);
        this.rBrace1.mirror = true;
        this.rBrace1.setRotationPoint(-3.4F, -0.4F, -0.3F);
        this.rBrace1.addBox(-0.4F, -1.0F, 0.6F, 2, 2, 5, 0.0F);
        this.setRotateAngle(rBrace1, -0.091106186954104F, -0.31869712141416456F, 0.0F);
        this.lPanel3Light = new ModelRenderer(this, 25, 24);
        this.lPanel3Light.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPanel3Light.addBox(0.4F, -1.0F, 1.5F, 1, 2, 3, 0.0F);
        this.lPanel1a = new ModelRenderer(this, 0, 14);
        this.lPanel1a.setRotationPoint(5.9F, -1.2F, -1.8F);
        this.lPanel1a.addBox(0.0F, -3.5F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(lPanel1a, 0.136659280431156F, 0.4553564018453205F, -0.36425021489121656F);
        this.clPanel2c = new ModelRenderer(this, 55, 38);
        this.clPanel2c.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.clPanel2c.addBox(-3.0F, -0.8F, -0.3F, 6, 1, 1, 0.0F);
        this.setRotateAngle(clPanel2c, -0.18203784098300857F, 0.0F, 0.0F);
        this.crPanel4a = new ModelRenderer(this, 5, 35);
        this.crPanel4a.mirror = true;
        this.crPanel4a.setRotationPoint(-3.1F, -0.8F, 1.4F);
        this.crPanel4a.addBox(-2.5F, -0.8F, 0.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(crPanel4a, -0.31869712141416456F, -0.136659280431156F, -0.18029251173101424F);
        this.lPanel2b_1 = new ModelRenderer(this, 18, 20);
        this.lPanel2b_1.mirror = true;
        this.lPanel2b_1.setRotationPoint(-0.4F, 0.0F, 7.0F);
        this.lPanel2b_1.addBox(-0.9F, -3.0F, -0.3F, 1, 6, 2, 0.0F);
        this.setRotateAngle(lPanel2b_1, 0.0F, 0.31869712141416456F, 0.0F);
        this.headMuzzle = new ModelRenderer(this, 80, 25);
        this.headMuzzle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headMuzzle.addBox(-1.0F, -1.0F, -2.9F, 2, 2, 1, 0.0F);
        this.crPanel4b = new ModelRenderer(this, 36, 38);
        this.crPanel4b.mirror = true;
        this.crPanel4b.setRotationPoint(0.0F, 0.5F, 4.3F);
        this.crPanel4b.addBox(-2.0F, -1.0F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(crPanel4b, -0.18203784098300857F, 0.0F, 0.0F);
        this.muzzleSlopeBottom = new ModelRenderer(this, 96, 26);
        this.muzzleSlopeBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.muzzleSlopeBottom.addBox(-1.0F, 1.3F, -2.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(muzzleSlopeBottom, -0.5164429256651221F, 0.0F, 0.0F);
        this.rFrontPipe2b = new ModelRenderer(this, 48, 30);
        this.rFrontPipe2b.mirror = true;
        this.rFrontPipe2b.setRotationPoint(0.0F, -0.2F, -0.7F);
        this.rFrontPipe2b.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rFrontPipe2b, 0.4303981935418017F, 0.0F, 0.0F);
        this.rFrontPipe2a = new ModelRenderer(this, 38, 30);
        this.rFrontPipe2a.mirror = true;
        this.rFrontPipe2a.setRotationPoint(-3.5F, 0.5F, -4.2F);
        this.rFrontPipe2a.addBox(-1.0F, -0.8F, -1.0F, 2, 1, 2, 0.0F);
        this.chassis1b = new ModelRenderer(this, 45, 0);
        this.chassis1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chassis1b.addBox(-6.0F, -5.1F, -2.5F, 12, 5, 7, 0.0F);
        this.clPanel2a = new ModelRenderer(this, 1, 32);
        this.clPanel2a.setRotationPoint(3.9F, -0.8F, 1.4F);
        this.clPanel2a.addBox(-4.0F, -0.8F, 0.0F, 8, 3, 6, 0.0F);
        this.setRotateAngle(clPanel2a, -0.36425021489121656F, 0.22759093446006054F, 0.18203784098300857F);
        this.lPanel4a.addChild(this.lPanel4b);
        this.rPanel2a.addChild(this.lPanel2Light_1);
        this.chassis1a.addChild(this.rPipe2);
        this.lFrontPipe2a.addChild(this.lFrontPipe2b);
        this.chassis00a.addChild(this.chassis00b);
        this.cPlate1a.addChild(this.cPlate1c);
        this.chassis2a.addChild(this.rPanel2a);
        this.chassis2a.addChild(this.chassis2b);
        this.clPanel2a.addChild(this.clPanel2b);
        this.chassis3a.addChild(this.rPanel3a);
        this.chassis4a.addChild(this.lPanel4a);
        this.lPanel2a.addChild(this.lPanel2b);
        this.chassis4a.addChild(this.rPanel4a);
        this.chassis00a.addChild(this.lfPipe3);
        this.chassis3a.addChild(this.chassis4a);
        this.cPlate4a.addChild(this.cPlate4c);
        this.cPlate1a.addChild(this.cplate1b);
        this.rPanel1a.addChild(this.lPanel1Light_1);
        this.chassis00b.addChild(this.visor);
        this.rFrontPipe1a.addChild(this.rFrontPipe1b);
        this.chassis1a.addChild(this.rPipe1a);
        this.chassis1a.addChild(this.lPipe2);
        this.chassis2a.addChild(this.cPlate2a);
        this.chassis1a.addChild(this.cPlate1a);
        this.chassis3a.addChild(this.chassis3b);
        this.lPanel3a.addChild(this.lPanel3b);
        this.rPanel1a.addChild(this.lPanel1b_1);
        this.clPanel1b.addChild(this.clPanel1c);
        this.lBrace1.addChild(this.lBrace2);
        this.chassis00a.addChild(this.lFrontPipe2a);
        this.chassis3a.addChild(this.lPanel3a);
        this.lfPlateb.addChild(this.lfPlatec);
        this.cPlate3a.addChild(this.clPanel3a);
        this.head.addChild(this.muzzleSlope);
        this.crPanel1a.addChild(this.crPanel1b);
        this.lFrontPipe1b.addChild(this.lFrontPipe1c);
        this.chassis1a.addChild(this.chassis2a);
        this.crPanel2a.addChild(this.crPanel2b);
        this.cPlate1a.addChild(this.crPanel1a);
        this.rPanel4a.addChild(this.lPanel4b_1);
        this.clPanel3b.addChild(this.clPanel3c);
        this.lPanel1a.addChild(this.lPanel1Light);
        this.chassis5a.addChild(this.lBrace1);
        this.crPanel2b.addChild(this.crPanel2c);
        this.chassis5a.addChild(this.chassis5b);
        this.lPanel2a.addChild(this.lPanel2Light);
        this.rfPlateb.addChild(this.rfPlatec);
        this.lFrontPipe1a.addChild(this.lFrontPipe1b);
        this.rPanel3a.addChild(this.lPanel3Light_1);
        this.chassis00b.addChild(this.lfPlate2);
        this.clPanel3a.addChild(this.clPanel3b);
        this.chassis2a.addChild(this.lPanel2a);
        this.cPlate3a.addChild(this.crPanel3a);
        this.chassis4a.addChild(this.chassis5a);
        this.chassis1a.addChild(this.lPipe1a);
        this.lPanel1a.addChild(this.lPanel1b);
        this.clPanel4a.addChild(this.clPanel4b);
        this.chassis3a.addChild(this.cPlate3a);
        this.lPanel4a.addChild(this.lPanel4Light);
        this.rPanel4a.addChild(this.lPanel4Light_1);
        this.chassis00b.addChild(this.lfPlatea);
        this.cPlate1a.addChild(this.clPanel1a);
        this.cPlate2a.addChild(this.cPlate2c);
        this.rPanel3a.addChild(this.lPanel3b_1);
        this.crPanel1b.addChild(this.crPanel1c);
        this.chassis4a.addChild(this.chassis4b);
        this.cPlate2a.addChild(this.crPanel2a);
        this.chassis00b.addChild(this.rfPlate2);
        this.clPanel1a.addChild(this.clPanel1b);
        this.lfPlatea.addChild(this.lfPlateb);
        this.rfPlatea.addChild(this.rfPlateb);
        this.chassis00a.addChild(this.lFrontPipe1a);
        this.chassis00b.addChild(this.rfPlatea);
        this.rFrontPipe1b.addChild(this.rFrontPipe1c);
        this.rBrace1.addChild(this.rBrace2);
        this.chassis2a.addChild(this.chassis3a);
        this.cPlate3a.addChild(this.cPlate3c);
        this.chassis00a.addChild(this.rFrontPipe1a);
        this.rPipe1a.addChild(this.rPipe1b);
        this.chassis1a.addChild(this.rPanel1a);
        this.crPanel3b.addChild(this.crPanel3c);
        this.chassis00a.addChild(this.rfPipe3);
        this.chassis00a.addChild(this.chassis1a);
        this.chassis00b.addChild(this.head);
        this.crPanel3a.addChild(this.crPanel3b);
        this.lPipe1a.addChild(this.lPipe1b);
        this.chassis4a.addChild(this.cPlate4a);
        this.cPlate4a.addChild(this.clPanel4a);
        this.chassis5a.addChild(this.rBrace1);
        this.lPanel3a.addChild(this.lPanel3Light);
        this.chassis1a.addChild(this.lPanel1a);
        this.clPanel2b.addChild(this.clPanel2c);
        this.cPlate4a.addChild(this.crPanel4a);
        this.rPanel2a.addChild(this.lPanel2b_1);
        this.head.addChild(this.headMuzzle);
        this.crPanel4a.addChild(this.crPanel4b);
        this.head.addChild(this.muzzleSlopeBottom);
        this.rFrontPipe2a.addChild(this.rFrontPipe2b);
        this.chassis00a.addChild(this.rFrontPipe2a);
        this.chassis1a.addChild(this.chassis1b);
        this.cPlate2a.addChild(this.clPanel2a);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.chassis00a.render(f5);
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