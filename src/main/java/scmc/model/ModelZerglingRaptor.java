package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * zerglingSC2Raptor - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelZerglingRaptor extends ModelBase {
    public ModelRenderer chest;
    public ModelRenderer lWing1;
    public ModelRenderer lbWing1;
    public ModelRenderer rWing1;
    public ModelRenderer rbWing1;
    public ModelRenderer lowerbody;
    public ModelRenderer lShoulder;
    public ModelRenderer lHookArm1;
    public ModelRenderer rShoulder;
    public ModelRenderer rHookArm1;
    public ModelRenderer neck;
    public ModelRenderer tail1;
    public ModelRenderer lThigh;
    public ModelRenderer rThigh;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer lLeg1;
    public ModelRenderer lLegPlate;
    public ModelRenderer lLeg2;
    public ModelRenderer lFoot;
    public ModelRenderer lHoof1a;
    public ModelRenderer lHoof1b;
    public ModelRenderer lHoof1c;
    public ModelRenderer lHoof1d;
    public ModelRenderer lHoof2;
    public ModelRenderer rLeg1;
    public ModelRenderer lLegPlate_1;
    public ModelRenderer rLeg2;
    public ModelRenderer rFoot;
    public ModelRenderer rHoof1a;
    public ModelRenderer rHoof1b;
    public ModelRenderer rHoof1c;
    public ModelRenderer rHoof1d;
    public ModelRenderer rHoof2;
    public ModelRenderer lArm1;
    public ModelRenderer lShoulderPlate;
    public ModelRenderer lArm2;
    public ModelRenderer lArmClaw1a;
    public ModelRenderer lArmClaw1b;
    public ModelRenderer lArmClaw1c;
    public ModelRenderer lArmClaw1b_1;
    public ModelRenderer lArmClaw2;
    public ModelRenderer rHookArm2;
    public ModelRenderer lHookArm3;
    public ModelRenderer lHookArmClaw0;
    public ModelRenderer lHookArmClaw3;
    public ModelRenderer lHookArmClaw1a;
    public ModelRenderer lHookArmClaw4a;
    public ModelRenderer lHookArmClaw4b;
    public ModelRenderer lHookArmClaw4c;
    public ModelRenderer lHookArmClaw4b_1;
    public ModelRenderer lHookArmClaw5;
    public ModelRenderer lHookArmClaw1b;
    public ModelRenderer lHookArmClaw1c;
    public ModelRenderer lHookArmClaw1b_1;
    public ModelRenderer lHookArmClaw2;
    public ModelRenderer rArm1;
    public ModelRenderer rShoulderPlate;
    public ModelRenderer rArm2;
    public ModelRenderer rArmClaw1a;
    public ModelRenderer rArmClaw1b;
    public ModelRenderer rArmClaw1c;
    public ModelRenderer rArmClaw1b_1;
    public ModelRenderer rArmClaw2;
    public ModelRenderer rHookArm2_1;
    public ModelRenderer rHookArm3;
    public ModelRenderer rHookArmClaw0;
    public ModelRenderer rHookArmClaw3;
    public ModelRenderer rHookArmClaw1a;
    public ModelRenderer rHookArmClaw4a;
    public ModelRenderer rHookArmClaw4b;
    public ModelRenderer rHookArmClaw4c;
    public ModelRenderer rHookArmClaw4b_1;
    public ModelRenderer rHookArmClaw5;
    public ModelRenderer lHookArmClaw1b_2;
    public ModelRenderer rHookArmClaw1c;
    public ModelRenderer rHookArmClaw1b;
    public ModelRenderer rHookArmClaw2;
    public ModelRenderer head1;
    public ModelRenderer jawUpper;
    public ModelRenderer head2;
    public ModelRenderer lowerJaw;
    public ModelRenderer lTusk1;
    public ModelRenderer rTusk1;
    public ModelRenderer teethLower;
    public ModelRenderer lTusk2;
    public ModelRenderer lArmClaw3a;
    public ModelRenderer lArmClaw3b;
    public ModelRenderer lArmClaw3c;
    public ModelRenderer lArmClaw3b_1;
    public ModelRenderer lArmClaw4;
    public ModelRenderer rTusk2;
    public ModelRenderer rArmClaw3a;
    public ModelRenderer rArmClaw3b;
    public ModelRenderer rArmClaw3c;
    public ModelRenderer rArmClaw3b_1;
    public ModelRenderer rArmClaw4;
    public ModelRenderer lWing2;
    public ModelRenderer lWing3;
    public ModelRenderer lWing4;
    public ModelRenderer lbWing2;
    public ModelRenderer lbWing3;
    public ModelRenderer lbWing4;
    public ModelRenderer rWing2;
    public ModelRenderer rWing3;
    public ModelRenderer rWing4;
    public ModelRenderer rbWing2;
    public ModelRenderer rbWing3;
    public ModelRenderer rbWing4;

    public ModelZerglingRaptor() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.lbWing3 = new ModelRenderer(this, 25, 25);
        this.lbWing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lbWing3.addBox(-0.4F, -1.3F, 3.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(lbWing3, 0.136659280431156F, 0.0F, 0.0F);
        this.rShoulderPlate = new ModelRenderer(this, 63, 25);
        this.rShoulderPlate.mirror = true;
        this.rShoulderPlate.setRotationPoint(-1.8F, -0.2F, -0.8F);
        this.rShoulderPlate.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(rShoulderPlate, 0.6373942428283291F, -0.045553093477052F, -0.8196066167365371F);
        this.rHookArmClaw2 = new ModelRenderer(this, 88, 0);
        this.rHookArmClaw2.mirror = true;
        this.rHookArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.rHookArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHookArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.rHookArm2_1 = new ModelRenderer(this, 80, 22);
        this.rHookArm2_1.mirror = true;
        this.rHookArm2_1.setRotationPoint(0.0F, -6.7F, 0.0F);
        this.rHookArm2_1.addBox(-1.0F, -1.0F, -3.8F, 2, 2, 4, 0.0F);
        this.setRotateAngle(rHookArm2_1, -0.27314402793711257F, 0.0F, 0.0F);
        this.rTusk1 = new ModelRenderer(this, 31, 0);
        this.rTusk1.mirror = true;
        this.rTusk1.setRotationPoint(-1.8F, 0.7F, 1.3F);
        this.rTusk1.addBox(-1.0F, -1.0F, -1.9F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rTusk1, 0.31869712141416456F, 0.9105382707654417F, 0.0F);
        this.rWing2 = new ModelRenderer(this, 32, 40);
        this.rWing2.mirror = true;
        this.rWing2.setRotationPoint(0.0F, 0.0F, 4.2F);
        this.rWing2.addBox(0.0F, -1.6F, -1.8F, 0, 6, 16, 0.0F);
        this.lHookArmClaw1b_1 = new ModelRenderer(this, 88, 0);
        this.lHookArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHookArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.rHookArmClaw1b = new ModelRenderer(this, 88, 0);
        this.rHookArmClaw1b.mirror = true;
        this.rHookArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHookArmClaw1b.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.rWing4 = new ModelRenderer(this, 88, 2);
        this.rWing4.mirror = true;
        this.rWing4.setRotationPoint(0.0F, -0.7F, 9.5F);
        this.rWing4.addBox(-0.4F, -0.5F, 0.1F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing4, 0.18203784098300857F, 0.0F, 0.0F);
        this.lThigh = new ModelRenderer(this, 42, 0);
        this.lThigh.setRotationPoint(2.8F, -1.6F, 4.0F);
        this.lThigh.addBox(-1.5F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(lThigh, -0.4553564018453205F, -0.136659280431156F, -0.40980330836826856F);
        this.teethLower = new ModelRenderer(this, 110, 23);
        this.teethLower.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.teethLower.addBox(-2.0F, -1.3F, -2.9F, 4, 1, 3, 0.0F);
        this.lHookArmClaw1c = new ModelRenderer(this, 88, 0);
        this.lHookArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHookArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 110, 29);
        this.lowerJaw.setRotationPoint(0.0F, 1.8F, 0.7F);
        this.lowerJaw.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
        this.lFoot = new ModelRenderer(this, 44, 33);
        this.lFoot.setRotationPoint(0.0F, 4.4F, -0.3F);
        this.lFoot.addBox(-1.0F, -0.3F, -2.3F, 2, 2, 3, 0.0F);
        this.setRotateAngle(lFoot, 0.40980330836826856F, 0.0F, 0.136659280431156F);
        this.lLeg2 = new ModelRenderer(this, 46, 23);
        this.lLeg2.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.lLeg2.addBox(-0.5F, 0.0F, -1.2F, 1, 5, 2, 0.0F);
        this.setRotateAngle(lLeg2, -0.6829473363053812F, 0.0F, 0.40980330836826856F);
        this.lHookArmClaw0 = new ModelRenderer(this, 88, 0);
        this.lHookArmClaw0.setRotationPoint(0.0F, 0.3F, -2.8F);
        this.lHookArmClaw0.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHookArmClaw0, 0.36425021489121656F, 0.7853981633974483F, 0.36425021489121656F);
        this.rArmClaw2 = new ModelRenderer(this, 88, 0);
        this.rArmClaw2.mirror = true;
        this.rArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.rArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.lHookArm3 = new ModelRenderer(this, 78, 31);
        this.lHookArm3.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.lHookArm3.addBox(-1.5F, -1.5F, -4.7F, 3, 3, 5, 0.0F);
        this.setRotateAngle(lHookArm3, 0.27314402793711257F, 0.0F, 0.0F);
        this.lWing4 = new ModelRenderer(this, 88, 2);
        this.lWing4.setRotationPoint(0.0F, -0.7F, 9.5F);
        this.lWing4.addBox(-0.4F, -0.5F, 0.1F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing4, 0.18203784098300857F, 0.0F, 0.0F);
        this.lHoof1a = new ModelRenderer(this, 88, 0);
        this.lHoof1a.setRotationPoint(0.0F, 0.5F, -1.7F);
        this.lHoof1a.addBox(-0.6F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHoof1a, 0.22759093446006054F, 0.0F, 0.0F);
        this.rHookArm2 = new ModelRenderer(this, 80, 22);
        this.rHookArm2.setRotationPoint(0.0F, -6.7F, 0.0F);
        this.rHookArm2.addBox(-1.0F, -1.0F, -3.8F, 2, 2, 4, 0.0F);
        this.setRotateAngle(rHookArm2, -0.27314402793711257F, 0.0F, 0.0F);
        this.lbWing4 = new ModelRenderer(this, 88, 2);
        this.lbWing4.setRotationPoint(0.0F, -0.7F, 9.5F);
        this.lbWing4.addBox(-0.4F, -0.5F, 0.1F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lbWing4, 0.18203784098300857F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 0, 42);
        this.tail2.setRotationPoint(0.0F, -0.3F, 5.0F);
        this.tail2.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(tail2, -0.091106186954104F, 0.0F, 0.0F);
        this.lArmClaw3c = new ModelRenderer(this, 88, 0);
        this.lArmClaw3c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArmClaw3c.addBox(-0.2F, 0.0F, -1.7F, 1, 1, 2, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 30);
        this.tail1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.tail1.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 6, 0.0F);
        this.setRotateAngle(tail1, -0.22759093446006054F, 0.0F, 0.0F);
        this.rHoof1c = new ModelRenderer(this, 88, 0);
        this.rHoof1c.mirror = true;
        this.rHoof1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHoof1c.addBox(-0.6F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
        this.lHookArmClaw5 = new ModelRenderer(this, 88, 1);
        this.lHookArmClaw5.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.lHookArmClaw5.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lHookArmClaw5, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.lArmClaw2 = new ModelRenderer(this, 88, 0);
        this.lArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.lArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.lHookArmClaw4b = new ModelRenderer(this, 89, 1);
        this.lHookArmClaw4b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHookArmClaw4b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.lTusk1 = new ModelRenderer(this, 31, 0);
        this.lTusk1.setRotationPoint(1.8F, 0.7F, 1.3F);
        this.lTusk1.addBox(-1.0F, -1.0F, -1.9F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lTusk1, 0.31869712141416456F, -0.9105382707654417F, 0.0F);
        this.lArmClaw1a = new ModelRenderer(this, 88, 0);
        this.lArmClaw1a.setRotationPoint(0.0F, 0.2F, -3.1F);
        this.lArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lArmClaw1a, 0.4553564018453205F, 0.7853981633974483F, 0.31869712141416456F);
        this.rThigh = new ModelRenderer(this, 42, 0);
        this.rThigh.mirror = true;
        this.rThigh.setRotationPoint(-2.8F, -1.6F, 4.0F);
        this.rThigh.addBox(-1.5F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(rThigh, -0.4553564018453205F, 0.136659280431156F, 0.40980330836826856F);
        this.lArmClaw3a = new ModelRenderer(this, 88, 0);
        this.lArmClaw3a.setRotationPoint(0.0F, -0.1F, -1.1F);
        this.lArmClaw3a.addBox(-0.8F, -0.7F, -1.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lArmClaw3a, 0.0F, 0.22759093446006054F, 0.0F);
        this.jawUpper = new ModelRenderer(this, 110, 15);
        this.jawUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jawUpper.addBox(-2.0F, -1.0F, -2.1F, 4, 2, 3, 0.0F);
        this.setRotateAngle(jawUpper, -0.27314402793711257F, 0.0F, 0.0F);
        this.lHookArm1 = new ModelRenderer(this, 83, 10);
        this.lHookArm1.setRotationPoint(3.2F, -1.3F, -3.4F);
        this.lHookArm1.addBox(-0.5F, -7.5F, -0.6F, 1, 8, 1, 0.0F);
        this.setRotateAngle(lHookArm1, -0.40980330836826856F, 0.0F, 0.22759093446006054F);
        this.rArm2 = new ModelRenderer(this, 64, 16);
        this.rArm2.mirror = true;
        this.rArm2.setRotationPoint(0.5F, 3.4F, 0.0F);
        this.rArm2.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(rArm2, -0.136659280431156F, 0.0F, -0.4553564018453205F);
        this.lHookArmClaw1a = new ModelRenderer(this, 88, 0);
        this.lHookArmClaw1a.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.lHookArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHookArmClaw1a, 0.136659280431156F, 0.7853981633974483F, 0.136659280431156F);
        this.lHookArmClaw4b_1 = new ModelRenderer(this, 88, 1);
        this.lHookArmClaw4b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHookArmClaw4b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.lArmClaw4 = new ModelRenderer(this, 88, 0);
        this.lArmClaw4.setRotationPoint(0.0F, 0.1F, -1.6F);
        this.lArmClaw4.addBox(-0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lArmClaw4, 0.045553093477052F, 0.22759093446006054F, 0.091106186954104F);
        this.tail3 = new ModelRenderer(this, 0, 52);
        this.tail3.setRotationPoint(0.0F, 0.2F, 4.3F);
        this.tail3.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(tail3, 0.136659280431156F, 0.0F, 0.0F);
        this.rHookArmClaw1c = new ModelRenderer(this, 88, 0);
        this.rHookArmClaw1c.mirror = true;
        this.rHookArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHookArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.lHoof2 = new ModelRenderer(this, 88, 0);
        this.lHoof2.setRotationPoint(0.1F, 0.0F, -1.5F);
        this.lHoof2.addBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lHoof2, 0.18203784098300857F, 0.0F, 0.0F);
        this.rbWing4 = new ModelRenderer(this, 88, 2);
        this.rbWing4.mirror = true;
        this.rbWing4.setRotationPoint(0.0F, -0.7F, 9.5F);
        this.rbWing4.addBox(-0.4F, -0.5F, 0.1F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rbWing4, 0.18203784098300857F, 0.0F, 0.0F);
        this.rHookArmClaw4b = new ModelRenderer(this, 89, 1);
        this.rHookArmClaw4b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHookArmClaw4b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.rHookArmClaw1a = new ModelRenderer(this, 88, 0);
        this.rHookArmClaw1a.mirror = true;
        this.rHookArmClaw1a.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.rHookArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHookArmClaw1a, 0.136659280431156F, 0.7853981633974483F, 0.136659280431156F);
        this.lbWing2 = new ModelRenderer(this, 32, 40);
        this.lbWing2.setRotationPoint(0.0F, 0.0F, 4.2F);
        this.lbWing2.addBox(0.0F, -1.6F, -1.8F, 0, 6, 16, 0.0F);
        this.lHookArmClaw2 = new ModelRenderer(this, 88, 0);
        this.lHookArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.lHookArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHookArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.lHookArmClaw1b = new ModelRenderer(this, 88, 0);
        this.lHookArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHookArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.rArmClaw1c = new ModelRenderer(this, 88, 0);
        this.rArmClaw1c.mirror = true;
        this.rArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.rArmClaw3b = new ModelRenderer(this, 88, 0);
        this.rArmClaw3b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArmClaw3b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 1, 0.0F);
        this.lWing1 = new ModelRenderer(this, 43, 43);
        this.lWing1.setRotationPoint(2.0F, 15.3F, 0.0F);
        this.lWing1.addBox(-0.4F, -2.0F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(lWing1, 0.8651597102135892F, 0.091106186954104F, 0.091106186954104F);
        this.lHoof1b = new ModelRenderer(this, 88, 0);
        this.lHoof1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHoof1b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
        this.lLegPlate_1 = new ModelRenderer(this, 57, 0);
        this.lLegPlate_1.mirror = true;
        this.lLegPlate_1.setRotationPoint(-0.9F, 0.0F, -0.5F);
        this.lLegPlate_1.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lLegPlate_1, -0.31869712141416456F, 0.0F, -0.31869712141416456F);
        this.lWing2 = new ModelRenderer(this, 32, 40);
        this.lWing2.setRotationPoint(0.0F, 0.0F, 4.2F);
        this.lWing2.addBox(0.0F, -1.6F, -1.8F, 0, 6, 16, 0.0F);
        this.rHoof1a = new ModelRenderer(this, 88, 0);
        this.rHoof1a.mirror = true;
        this.rHoof1a.setRotationPoint(0.0F, 0.5F, -1.7F);
        this.rHoof1a.addBox(-0.6F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHoof1a, 0.22759093446006054F, 0.0F, 0.0F);
        this.rArm1 = new ModelRenderer(this, 70, 8);
        this.rArm1.mirror = true;
        this.rArm1.setRotationPoint(-0.8F, 1.9F, 0.0F);
        this.rArm1.addBox(-0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(rArm1, 0.27314402793711257F, 0.0F, -0.136659280431156F);
        this.lArmClaw1c = new ModelRenderer(this, 88, 0);
        this.lArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.rWing3 = new ModelRenderer(this, 25, 25);
        this.rWing3.mirror = true;
        this.rWing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing3.addBox(-0.4F, -1.3F, 3.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(rWing3, 0.136659280431156F, 0.0F, 0.0F);
        this.rLeg2 = new ModelRenderer(this, 46, 23);
        this.rLeg2.mirror = true;
        this.rLeg2.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.rLeg2.addBox(-0.5F, 0.0F, -1.2F, 1, 5, 2, 0.0F);
        this.setRotateAngle(rLeg2, -0.6829473363053812F, 0.0F, -0.40980330836826856F);
        this.rHookArmClaw4b_1 = new ModelRenderer(this, 88, 1);
        this.rHookArmClaw4b_1.mirror = true;
        this.rHookArmClaw4b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHookArmClaw4b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.rArmClaw3c = new ModelRenderer(this, 88, 0);
        this.rArmClaw3c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArmClaw3c.addBox(-0.2F, 0.0F, -1.7F, 1, 1, 1, 0.0F);
        this.lShoulder = new ModelRenderer(this, 67, 0);
        this.lShoulder.setRotationPoint(2.6F, -0.2F, -2.0F);
        this.lShoulder.addBox(0.0F, -0.7F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(lShoulder, 0.091106186954104F, 0.0F, -0.5918411493512771F);
        this.rArmClaw3a = new ModelRenderer(this, 88, 0);
        this.rArmClaw3a.setRotationPoint(0.0F, -0.1F, -1.1F);
        this.rArmClaw3a.addBox(-0.8F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rArmClaw3a, 0.0F, -0.22759093446006054F, 0.0F);
        this.rbWing2 = new ModelRenderer(this, 32, 40);
        this.rbWing2.mirror = true;
        this.rbWing2.setRotationPoint(0.0F, 0.0F, 4.2F);
        this.rbWing2.addBox(0.0F, -1.6F, -1.8F, 0, 6, 16, 0.0F);
        this.lArm1 = new ModelRenderer(this, 70, 8);
        this.lArm1.setRotationPoint(0.8F, 1.9F, 0.0F);
        this.lArm1.addBox(-0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lArm1, 0.27314402793711257F, 0.0F, 0.136659280431156F);
        this.rHookArmClaw5 = new ModelRenderer(this, 88, 1);
        this.rHookArmClaw5.mirror = true;
        this.rHookArmClaw5.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.rHookArmClaw5.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rHookArmClaw5, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.rTusk2 = new ModelRenderer(this, 31, 0);
        this.rTusk2.mirror = true;
        this.rTusk2.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.rTusk2.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rTusk2, 0.0F, -0.31869712141416456F, 0.0F);
        this.rShoulder = new ModelRenderer(this, 67, 0);
        this.rShoulder.mirror = true;
        this.rShoulder.setRotationPoint(-2.6F, -0.2F, -2.0F);
        this.rShoulder.addBox(-2.0F, -0.7F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(rShoulder, 0.091106186954104F, 0.0F, 0.5918411493512771F);
        this.lArm2 = new ModelRenderer(this, 64, 16);
        this.lArm2.setRotationPoint(-0.5F, 3.4F, 0.0F);
        this.lArm2.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(lArm2, -0.136659280431156F, 0.0F, 0.4553564018453205F);
        this.rHookArmClaw4c = new ModelRenderer(this, 88, 1);
        this.rHookArmClaw4c.mirror = true;
        this.rHookArmClaw4c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHookArmClaw4c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.lArmClaw3b_1 = new ModelRenderer(this, 88, 0);
        this.lArmClaw3b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArmClaw3b_1.addBox(-0.8F, 0.0F, -1.7F, 1, 1, 1, 0.0F);
        this.lShoulderPlate = new ModelRenderer(this, 63, 25);
        this.lShoulderPlate.setRotationPoint(1.8F, -0.2F, -0.8F);
        this.lShoulderPlate.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(lShoulderPlate, 0.6373942428283291F, 0.045553093477052F, 0.8196066167365371F);
        this.lHookArmClaw3 = new ModelRenderer(this, 87, 0);
        this.lHookArmClaw3.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.lHookArmClaw3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lHookArmClaw3, -0.31869712141416456F, 0.7853981633974483F, -0.136659280431156F);
        this.rArmClaw4 = new ModelRenderer(this, 88, 0);
        this.rArmClaw4.setRotationPoint(0.0F, 0.1F, -1.6F);
        this.rArmClaw4.addBox(-0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rArmClaw4, 0.045553093477052F, -0.22759093446006054F, -0.091106186954104F);
        this.rArmClaw1b = new ModelRenderer(this, 88, 0);
        this.rArmClaw1b.mirror = true;
        this.rArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.rHookArm1 = new ModelRenderer(this, 83, 10);
        this.rHookArm1.mirror = true;
        this.rHookArm1.setRotationPoint(-3.2F, -1.3F, -3.4F);
        this.rHookArm1.addBox(-0.5F, -7.5F, -0.6F, 1, 8, 1, 0.0F);
        this.setRotateAngle(rHookArm1, -0.40980330836826856F, 0.0F, -0.22759093446006054F);
        this.lHookArmClaw4c = new ModelRenderer(this, 88, 1);
        this.lHookArmClaw4c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHookArmClaw4c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.neck = new ModelRenderer(this, 21, 40);
        this.neck.setRotationPoint(0.0F, 0.0F, -4.2F);
        this.neck.addBox(-2.5F, -2.0F, -2.6F, 5, 4, 3, 0.0F);
        this.setRotateAngle(neck, 0.22759093446006054F, 0.0F, 0.0F);
        this.lLegPlate = new ModelRenderer(this, 57, 0);
        this.lLegPlate.setRotationPoint(0.9F, 0.0F, -0.5F);
        this.lLegPlate.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lLegPlate, -0.31869712141416456F, 0.0F, 0.31869712141416456F);
        this.rWing1 = new ModelRenderer(this, 43, 43);
        this.rWing1.mirror = true;
        this.rWing1.setRotationPoint(-2.0F, 15.3F, 0.0F);
        this.rWing1.addBox(-0.4F, -2.0F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(rWing1, 0.8651597102135892F, -0.091106186954104F, -0.091106186954104F);
        this.rHookArmClaw3 = new ModelRenderer(this, 87, 0);
        this.rHookArmClaw3.mirror = true;
        this.rHookArmClaw3.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.rHookArmClaw3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rHookArmClaw3, -0.31869712141416456F, 0.7853981633974483F, -0.31869712141416456F);
        this.lHoof1d = new ModelRenderer(this, 88, 0);
        this.lHoof1d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHoof1d.addBox(-0.2F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
        this.rbWing3 = new ModelRenderer(this, 25, 25);
        this.rbWing3.mirror = true;
        this.rbWing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rbWing3.addBox(-0.4F, -1.3F, 3.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(rbWing3, 0.136659280431156F, 0.0F, 0.0F);
        this.head1 = new ModelRenderer(this, 110, 0);
        this.head1.setRotationPoint(0.0F, -0.2F, -2.4F);
        this.head1.addBox(-2.5F, -2.1F, -0.7F, 5, 4, 2, 0.0F);
        this.lLeg1 = new ModelRenderer(this, 42, 15);
        this.lLeg1.setRotationPoint(0.0F, 6.0F, 1.0F);
        this.lLeg1.addBox(-1.2F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(lLeg1, 0.8196066167365371F, 0.31869712141416456F, 0.0F);
        this.rHoof1b = new ModelRenderer(this, 88, 0);
        this.rHoof1b.mirror = true;
        this.rHoof1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHoof1b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
        this.rbWing1 = new ModelRenderer(this, 43, 43);
        this.rbWing1.mirror = true;
        this.rbWing1.setRotationPoint(-2.6F, 15.9F, 8.0F);
        this.rbWing1.addBox(-0.4F, -2.0F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(rbWing1, 0.5009094953223726F, -0.18203784098300857F, -0.22759093446006054F);
        this.lowerbody = new ModelRenderer(this, 0, 16);
        this.lowerbody.setRotationPoint(0.0F, -0.4F, 2.8F);
        this.lowerbody.addBox(-3.0F, -2.1F, 0.0F, 6, 4, 6, 0.0F);
        this.setRotateAngle(lowerbody, -0.18203784098300857F, 0.0F, 0.0F);
        this.rArmClaw3b_1 = new ModelRenderer(this, 88, 0);
        this.rArmClaw3b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArmClaw3b_1.addBox(-0.8F, 0.0F, -1.7F, 1, 1, 2, 0.0F);
        this.lHoof1c = new ModelRenderer(this, 88, 0);
        this.lHoof1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHoof1c.addBox(-0.6F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
        this.rFoot = new ModelRenderer(this, 44, 33);
        this.rFoot.mirror = true;
        this.rFoot.setRotationPoint(0.0F, 4.4F, -0.3F);
        this.rFoot.addBox(-1.0F, -0.3F, -2.3F, 2, 2, 3, 0.0F);
        this.setRotateAngle(rFoot, 0.40980330836826856F, 0.0F, -0.136659280431156F);
        this.rHoof2 = new ModelRenderer(this, 88, 0);
        this.rHoof2.mirror = true;
        this.rHoof2.setRotationPoint(0.1F, 0.0F, -1.5F);
        this.rHoof2.addBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rHoof2, 0.18203784098300857F, 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 112, 8);
        this.head2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head2.addBox(-2.0F, -2.0F, -1.1F, 4, 1, 1, 0.0F);
        this.setRotateAngle(head2, 0.31869712141416456F, 0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 16.2F, 0.0F);
        this.chest.addBox(-3.5F, -2.7F, -4.5F, 7, 6, 8, 0.0F);
        this.lHookArmClaw4a = new ModelRenderer(this, 88, 1);
        this.lHookArmClaw4a.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.lHookArmClaw4a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHookArmClaw4a, 0.136659280431156F, 0.0F, 0.136659280431156F);
        this.rArmClaw1b_1 = new ModelRenderer(this, 88, 0);
        this.rArmClaw1b_1.mirror = true;
        this.rArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.rHoof1d = new ModelRenderer(this, 88, 0);
        this.rHoof1d.mirror = true;
        this.rHoof1d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHoof1d.addBox(-0.2F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
        this.lArmClaw1b = new ModelRenderer(this, 88, 0);
        this.lArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.rHookArmClaw0 = new ModelRenderer(this, 88, 0);
        this.rHookArmClaw0.mirror = true;
        this.rHookArmClaw0.setRotationPoint(0.0F, 0.3F, -2.8F);
        this.rHookArmClaw0.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHookArmClaw0, 0.36425021489121656F, 0.7853981633974483F, 0.36425021489121656F);
        this.rHookArm3 = new ModelRenderer(this, 78, 31);
        this.rHookArm3.mirror = true;
        this.rHookArm3.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.rHookArm3.addBox(-1.5F, -1.5F, -4.7F, 3, 3, 5, 0.0F);
        this.setRotateAngle(rHookArm3, 0.27314402793711257F, 0.0F, 0.0F);
        this.lArmClaw3b = new ModelRenderer(this, 88, 0);
        this.lArmClaw3b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArmClaw3b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
        this.rLeg1 = new ModelRenderer(this, 42, 15);
        this.rLeg1.mirror = true;
        this.rLeg1.setRotationPoint(0.0F, 6.0F, 1.0F);
        this.rLeg1.addBox(-1.2F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(rLeg1, 0.8196066167365371F, -0.31869712141416456F, 0.0F);
        this.lWing3 = new ModelRenderer(this, 25, 25);
        this.lWing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing3.addBox(-0.4F, -1.3F, 3.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(lWing3, 0.136659280431156F, 0.0F, 0.0F);
        this.lTusk2 = new ModelRenderer(this, 31, 0);
        this.lTusk2.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.lTusk2.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lTusk2, 0.0F, 0.31869712141416456F, 0.0F);
        this.lArmClaw1b_1 = new ModelRenderer(this, 88, 0);
        this.lArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
        this.lbWing1 = new ModelRenderer(this, 43, 43);
        this.lbWing1.setRotationPoint(2.6F, 15.9F, 8.0F);
        this.lbWing1.addBox(-0.4F, -2.0F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(lbWing1, 0.5009094953223726F, 0.18203784098300857F, 0.18203784098300857F);
        this.tail4 = new ModelRenderer(this, 16, 52);
        this.tail4.setRotationPoint(0.0F, 0.1F, 3.8F);
        this.tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(tail4, 0.22759093446006054F, 0.0F, 0.0F);
        this.rArmClaw1a = new ModelRenderer(this, 88, 0);
        this.rArmClaw1a.mirror = true;
        this.rArmClaw1a.setRotationPoint(0.0F, 0.2F, -3.1F);
        this.rArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rArmClaw1a, 0.4553564018453205F, 0.7853981633974483F, 0.4553564018453205F);
        this.rHookArmClaw4a = new ModelRenderer(this, 88, 1);
        this.rHookArmClaw4a.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rHookArmClaw4a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHookArmClaw4a, 0.136659280431156F, 0.0F, 0.136659280431156F);
        this.lHookArmClaw1b_2 = new ModelRenderer(this, 88, 0);
        this.lHookArmClaw1b_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHookArmClaw1b_2.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
        this.lbWing1.addChild(this.lbWing3);
        this.rShoulder.addChild(this.rShoulderPlate);
        this.rHookArmClaw1a.addChild(this.rHookArmClaw2);
        this.rHookArm1.addChild(this.rHookArm2_1);
        this.head1.addChild(this.rTusk1);
        this.rWing1.addChild(this.rWing2);
        this.lHookArmClaw1a.addChild(this.lHookArmClaw1b_1);
        this.rHookArmClaw1a.addChild(this.rHookArmClaw1b);
        this.rWing3.addChild(this.rWing4);
        this.lowerbody.addChild(this.lThigh);
        this.lowerJaw.addChild(this.teethLower);
        this.lHookArmClaw1a.addChild(this.lHookArmClaw1c);
        this.head1.addChild(this.lowerJaw);
        this.lLeg2.addChild(this.lFoot);
        this.lLeg1.addChild(this.lLeg2);
        this.rHookArm2.addChild(this.lHookArmClaw0);
        this.rArmClaw1a.addChild(this.rArmClaw2);
        this.rHookArm2.addChild(this.lHookArm3);
        this.lWing3.addChild(this.lWing4);
        this.lFoot.addChild(this.lHoof1a);
        this.lHookArm1.addChild(this.rHookArm2);
        this.lbWing3.addChild(this.lbWing4);
        this.tail1.addChild(this.tail2);
        this.lArmClaw3a.addChild(this.lArmClaw3c);
        this.lowerbody.addChild(this.tail1);
        this.rHoof1a.addChild(this.rHoof1c);
        this.lHookArmClaw4a.addChild(this.lHookArmClaw5);
        this.lArmClaw1a.addChild(this.lArmClaw2);
        this.lHookArmClaw4a.addChild(this.lHookArmClaw4b);
        this.head1.addChild(this.lTusk1);
        this.lArm2.addChild(this.lArmClaw1a);
        this.lowerbody.addChild(this.rThigh);
        this.lTusk2.addChild(this.lArmClaw3a);
        this.head1.addChild(this.jawUpper);
        this.chest.addChild(this.lHookArm1);
        this.rArm1.addChild(this.rArm2);
        this.lHookArm3.addChild(this.lHookArmClaw1a);
        this.lHookArmClaw4a.addChild(this.lHookArmClaw4b_1);
        this.lArmClaw3a.addChild(this.lArmClaw4);
        this.tail2.addChild(this.tail3);
        this.rHookArmClaw1a.addChild(this.rHookArmClaw1c);
        this.lHoof1a.addChild(this.lHoof2);
        this.rbWing3.addChild(this.rbWing4);
        this.rHookArmClaw4a.addChild(this.rHookArmClaw4b);
        this.rHookArm3.addChild(this.rHookArmClaw1a);
        this.lbWing1.addChild(this.lbWing2);
        this.lHookArmClaw1a.addChild(this.lHookArmClaw2);
        this.lHookArmClaw1a.addChild(this.lHookArmClaw1b);
        this.rArmClaw1a.addChild(this.rArmClaw1c);
        this.rArmClaw3a.addChild(this.rArmClaw3b);
        this.lHoof1a.addChild(this.lHoof1b);
        this.rThigh.addChild(this.lLegPlate_1);
        this.lWing1.addChild(this.lWing2);
        this.rFoot.addChild(this.rHoof1a);
        this.rShoulder.addChild(this.rArm1);
        this.lArmClaw1a.addChild(this.lArmClaw1c);
        this.rWing1.addChild(this.rWing3);
        this.rLeg1.addChild(this.rLeg2);
        this.rHookArmClaw4a.addChild(this.rHookArmClaw4b_1);
        this.rArmClaw3a.addChild(this.rArmClaw3c);
        this.chest.addChild(this.lShoulder);
        this.rTusk2.addChild(this.rArmClaw3a);
        this.rbWing1.addChild(this.rbWing2);
        this.lShoulder.addChild(this.lArm1);
        this.rHookArmClaw4a.addChild(this.rHookArmClaw5);
        this.rTusk1.addChild(this.rTusk2);
        this.chest.addChild(this.rShoulder);
        this.lArm1.addChild(this.lArm2);
        this.rHookArmClaw4a.addChild(this.rHookArmClaw4c);
        this.lArmClaw3a.addChild(this.lArmClaw3b_1);
        this.lShoulder.addChild(this.lShoulderPlate);
        this.lHookArm3.addChild(this.lHookArmClaw3);
        this.rArmClaw3a.addChild(this.rArmClaw4);
        this.rArmClaw1a.addChild(this.rArmClaw1b);
        this.chest.addChild(this.rHookArm1);
        this.lHookArmClaw4a.addChild(this.lHookArmClaw4c);
        this.chest.addChild(this.neck);
        this.lThigh.addChild(this.lLegPlate);
        this.rHookArm3.addChild(this.rHookArmClaw3);
        this.lHoof1a.addChild(this.lHoof1d);
        this.rbWing1.addChild(this.rbWing3);
        this.neck.addChild(this.head1);
        this.lThigh.addChild(this.lLeg1);
        this.rHoof1a.addChild(this.rHoof1b);
        this.chest.addChild(this.lowerbody);
        this.rArmClaw3a.addChild(this.rArmClaw3b_1);
        this.lHoof1a.addChild(this.lHoof1c);
        this.rLeg2.addChild(this.rFoot);
        this.rHoof1a.addChild(this.rHoof2);
        this.head1.addChild(this.head2);
        this.lHookArmClaw3.addChild(this.lHookArmClaw4a);
        this.rArmClaw1a.addChild(this.rArmClaw1b_1);
        this.rHoof1a.addChild(this.rHoof1d);
        this.lArmClaw1a.addChild(this.lArmClaw1b);
        this.rHookArm2_1.addChild(this.rHookArmClaw0);
        this.rHookArm2_1.addChild(this.rHookArm3);
        this.lArmClaw3a.addChild(this.lArmClaw3b);
        this.rThigh.addChild(this.rLeg1);
        this.lWing1.addChild(this.lWing3);
        this.lTusk1.addChild(this.lTusk2);
        this.lArmClaw1a.addChild(this.lArmClaw1b_1);
        this.tail3.addChild(this.tail4);
        this.rArm2.addChild(this.rArmClaw1a);
        this.rHookArmClaw3.addChild(this.rHookArmClaw4a);
        this.rHookArmClaw1a.addChild(this.lHookArmClaw1b_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.lWing1.offsetX, this.lWing1.offsetY, this.lWing1.offsetZ);
        GlStateManager.translate(this.lWing1.rotationPointX * f5, this.lWing1.rotationPointY * f5, this.lWing1.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.3D, 1.3D);
        GlStateManager.translate(-this.lWing1.offsetX, -this.lWing1.offsetY, -this.lWing1.offsetZ);
        GlStateManager.translate(-this.lWing1.rotationPointX * f5, -this.lWing1.rotationPointY * f5, -this.lWing1.rotationPointZ * f5);
        this.lWing1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rWing1.offsetX, this.rWing1.offsetY, this.rWing1.offsetZ);
        GlStateManager.translate(this.rWing1.rotationPointX * f5, this.rWing1.rotationPointY * f5, this.rWing1.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.3D, 1.3D);
        GlStateManager.translate(-this.rWing1.offsetX, -this.rWing1.offsetY, -this.rWing1.offsetZ);
        GlStateManager.translate(-this.rWing1.rotationPointX * f5, -this.rWing1.rotationPointY * f5, -this.rWing1.rotationPointZ * f5);
        this.rWing1.render(f5);
        GlStateManager.popMatrix();
        this.rbWing1.render(f5);
        this.chest.render(f5);
        this.lbWing1.render(f5);
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
