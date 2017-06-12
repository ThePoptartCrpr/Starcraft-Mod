package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * brutalisk - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelBrutalisk extends ModelBase {

	public ModelRenderer armour1;
	public ModelRenderer armour2;
	public ModelRenderer armour3;
	public ModelRenderer armour4;
	public ModelRenderer armour5;
	public ModelRenderer armour6;
	public ModelRenderer armour7;
	public ModelRenderer armour8;
	public ModelRenderer body1;
	public ModelRenderer body2;
	public ModelRenderer chest;
	public ModelRenderer fang1;
	public ModelRenderer fang1b;
	public ModelRenderer fang2;
	public ModelRenderer fang2b;
	public ModelRenderer fang3;
	public ModelRenderer fang3b;
	public ModelRenderer head;
	public ModelRenderer headArmour;
	public ModelRenderer headHorn1;
	public ModelRenderer headHorn2;
	public ModelRenderer jawLower;
	public ModelRenderer laLeg1;
	public ModelRenderer laLeg2;
	public ModelRenderer laLeg3;
	public ModelRenderer laLeg4;
	public ModelRenderer laLeg5;
	public ModelRenderer laLeg6;
	public ModelRenderer largeSpike2;
	public ModelRenderer largeSpike2_1;
	public ModelRenderer largeSpike2b;
	public ModelRenderer largeSpike2b_1;
	public ModelRenderer largeSpike3;
	public ModelRenderer largeSpike3b;
	public ModelRenderer largeSpine1;
	public ModelRenderer largeSpine1b;
	public ModelRenderer lArm;
	public ModelRenderer lArmClaw1;
	public ModelRenderer lArmClaw1_1;
	public ModelRenderer lArmClaw1_2;
	public ModelRenderer lArmClaw1a;
	public ModelRenderer lArmClaw1b;
	public ModelRenderer lArmClaw2;
	public ModelRenderer lArmClaw2_1;
	public ModelRenderer lArmClaw2b;
	public ModelRenderer lArmClaw2b_1;
	public ModelRenderer lbLeg1;
	public ModelRenderer lbLeg2;
	public ModelRenderer lbLeg3;
	public ModelRenderer lbLeg4;
	public ModelRenderer lbLeg5;
	public ModelRenderer lcLeg1;
	public ModelRenderer lcLeg2;
	public ModelRenderer lcLeg3;
	public ModelRenderer lcLeg4;
	public ModelRenderer lcLeg5;
	public ModelRenderer ldLeg1;
	public ModelRenderer ldLeg2;
	public ModelRenderer ldLeg3;
	public ModelRenderer ldLeg4;
	public ModelRenderer leLeg1;
	public ModelRenderer leLeg2;
	public ModelRenderer leLeg3;
	public ModelRenderer leLeg4;
	public ModelRenderer lForearm;
	public ModelRenderer lForearm02;
	public ModelRenderer lForearm03;
	public ModelRenderer lLargeSpike1;
	public ModelRenderer lLargeSpike1b;
	public ModelRenderer lLargeSpike2;
	public ModelRenderer lLargeSpike2b;
	public ModelRenderer lShoulder;
	public ModelRenderer lShoulder02;
	public ModelRenderer lShoulder03;
	public ModelRenderer lTailPincer;
	public ModelRenderer lTailPincer2;
	public ModelRenderer lTailPincer3;
	public ModelRenderer lTailPincer4;
	public ModelRenderer lWebbing01;
	public ModelRenderer lWebbing02;
	public ModelRenderer neck;
	public ModelRenderer raLeg1;
	public ModelRenderer raLeg2;
	public ModelRenderer raLeg3;
	public ModelRenderer raLeg4;
	public ModelRenderer raLeg5;
	public ModelRenderer raLeg6;
	public ModelRenderer rArm;
	public ModelRenderer rArmClaw1;
	public ModelRenderer rArmClaw2;
	public ModelRenderer rArmClaw2_1;
	public ModelRenderer rArmClaw2_2;
	public ModelRenderer rArmClaw2_3;
	public ModelRenderer rbLeg1;
	public ModelRenderer rbLeg2;
	public ModelRenderer rbLeg3;
	public ModelRenderer rbLeg4;
	public ModelRenderer rbLeg5;
	public ModelRenderer rcLeg1;
	public ModelRenderer rcLeg2;
	public ModelRenderer rcLeg3;
	public ModelRenderer rcLeg4;
	public ModelRenderer rcLeg5;
	public ModelRenderer rdLeg1;
	public ModelRenderer rdLeg2;
	public ModelRenderer rdLeg3;
	public ModelRenderer rdLeg4;
	public ModelRenderer reLeg1;
	public ModelRenderer reLeg2;
	public ModelRenderer reLeg3;
	public ModelRenderer reLeg4;
	public ModelRenderer rForearm;
	public ModelRenderer rForearm02;
	public ModelRenderer rForearm03;
	public ModelRenderer rLargeSpike1;
	public ModelRenderer rLargeSpike1b;
	public ModelRenderer rLargeSpike2;
	public ModelRenderer rLargeSpike2b;
	public ModelRenderer rShoulder;
	public ModelRenderer rShoulder02;
	public ModelRenderer rShoulder03;
	public ModelRenderer rTailPincer;
	public ModelRenderer rTailPincer2;
	public ModelRenderer rTailPincer3;
	public ModelRenderer rTailPincer4;
	public ModelRenderer rWebbing01;
	public ModelRenderer rWebbing02;
	public ModelRenderer stomach;
	public ModelRenderer tail1;
	public ModelRenderer tail2;
	public ModelRenderer tail3;

	public ModelBrutalisk() {
		textureWidth = 256;
		textureHeight = 128;
		laLeg2 = new ModelRenderer(this, 114, 13);
		laLeg2.setRotationPoint(8.5F, 0.0F, -0.1F);
		laLeg2.addBox(-0.2F, -3.1F, -1.1F, 7, 5, 2, 0.0F);
		setRotateAngle(laLeg2, 0.0F, 0.0F, -0.136659280431156F);
		rLargeSpike2 = new ModelRenderer(this, 118, 33);
		rLargeSpike2.setRotationPoint(0.0F, -4.0F, 0.0F);
		rLargeSpike2.addBox(-0.5F, -3.5F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rLargeSpike2, -0.22759093446006054F, 0.0F, 0.0F);
		lArm = new ModelRenderer(this, 68, 59);
		lArm.setRotationPoint(-0.5F, 0.2F, 5.5F);
		lArm.addBox(-0.8F, -1.1F, 0.0F, 2, 3, 7, 0.0F);
		setRotateAngle(lArm, 0.045553093477052F, 0.6373942428283291F, 0.0F);
		reLeg3 = new ModelRenderer(this, 116, 33);
		reLeg3.setRotationPoint(-0.3F, 0.7F, 0.0F);
		reLeg3.addBox(-0.9F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(reLeg3, 0.0F, 0.0F, -0.40980330836826856F);
		rTailPincer3 = new ModelRenderer(this, 47, 73);
		rTailPincer3.setRotationPoint(0.0F, -0.7F, 1.2F);
		rTailPincer3.addBox(-1.0F, -0.9F, -0.3F, 2, 2, 4, 0.0F);
		setRotateAngle(rTailPincer3, -0.36425021489121656F, 0.0F, 0.0F);
		rForearm = new ModelRenderer(this, 89, 61);
		rForearm.mirror = true;
		rForearm.setRotationPoint(0.0F, 0.0F, 5.6F);
		rForearm.addBox(-6.1F, -1.5F, -1.3F, 7, 4, 4, 0.0F);
		setRotateAngle(rForearm, 0.0F, 0.22759093446006054F, -0.18203784098300857F);
		armour7 = new ModelRenderer(this, 170, 70);
		armour7.setRotationPoint(0.0F, -5.0F, 9.3F);
		armour7.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F);
		setRotateAngle(armour7, 0.27314402793711257F, 0.0F, 0.0F);
		fang1b = new ModelRenderer(this, 0, 6);
		fang1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang1b.addBox(2.9F, -6.9F, -8.2F, 1, 2, 1, 0.0F);
		setRotateAngle(fang1b, 0.27314402793711257F, 0.0F, 0.0F);
		fang3 = new ModelRenderer(this, 0, 0);
		fang3.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang3.addBox(-4.4F, -5.7F, -7.7F, 2, 1, 1, 0.0F);
		setRotateAngle(fang3, 0.36425021489121656F, 0.0F, 0.0F);
		rdLeg1 = new ModelRenderer(this, 147, 0);
		rdLeg1.mirror = true;
		rdLeg1.setRotationPoint(-6.0F, -1.2F, 7.5F);
		rdLeg1.addBox(-5.5F, -1.5F, -2.4F, 7, 2, 3, 0.0F);
		setRotateAngle(rdLeg1, 0.0F, 0.0F, 0.4553564018453205F);
		leLeg1 = new ModelRenderer(this, 147, 0);
		leLeg1.setRotationPoint(6.0F, -1.2F, 7.5F);
		leLeg1.addBox(-1.4F, -1.5F, -2.4F, 7, 2, 3, 0.0F);
		setRotateAngle(leLeg1, 0.0F, 0.0F, -0.4553564018453205F);
		lLargeSpike1 = new ModelRenderer(this, 116, 33);
		lLargeSpike1.setRotationPoint(1.9F, -1.7F, 2.0F);
		lLargeSpike1.addBox(-1.0F, -4.5F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(lLargeSpike1, -0.18203784098300857F, 0.0F, 0.8196066167365371F);
		armour3 = new ModelRenderer(this, 168, 70);
		armour3.setRotationPoint(0.0F, -5.9F, 1.0F);
		armour3.addBox(-4.0F, 0.0F, 0.0F, 8, 2, 7, 0.0F);
		setRotateAngle(armour3, 0.31869712141416456F, 0.0F, 0.0F);
		largeSpike2b_1 = new ModelRenderer(this, 116, 33);
		largeSpike2b_1.setRotationPoint(0.0F, -3.0F, -0.1F);
		largeSpike2b_1.addBox(-1.0F, -3.7F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(largeSpike2b_1, -0.36425021489121656F, 0.0F, 0.0F);
		armour6 = new ModelRenderer(this, 170, 70);
		armour6.setRotationPoint(0.0F, -5.4F, 5.6F);
		armour6.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 7, 0.0F);
		setRotateAngle(armour6, 0.136659280431156F, 0.0F, 0.0F);
		rWebbing02 = new ModelRenderer(this, 161, 90);
		rWebbing02.mirror = true;
		rWebbing02.setRotationPoint(0.0F, 0.0F, 0.0F);
		rWebbing02.addBox(-6.1F, -0.7F, -0.4F, 13, 6, 0, 0.0F);
		setRotateAngle(rWebbing02, 0.0F, 0.36425021489121656F, -0.22759093446006054F);
		fang3b = new ModelRenderer(this, 0, 6);
		fang3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang3b.addBox(-3.9F, -6.9F, -8.2F, 1, 2, 1, 0.0F);
		setRotateAngle(fang3b, 0.27314402793711257F, 0.0F, 0.0F);
		armour4 = new ModelRenderer(this, 168, 70);
		armour4.setRotationPoint(0.0F, -5.3F, 4.2F);
		armour4.addBox(-3.5F, 0.0F, -0.4F, 7, 2, 7, 0.0F);
		setRotateAngle(armour4, 0.27314402793711257F, 0.0F, 0.0F);
		rTailPincer = new ModelRenderer(this, 173, 0);
		rTailPincer.mirror = true;
		rTailPincer.setRotationPoint(-2.7F, -1.2F, 6.8F);
		rTailPincer.addBox(-1.5F, -6.4F, -1.0F, 3, 6, 2, 0.0F);
		setRotateAngle(rTailPincer, -0.7285004297824331F, -0.5918411493512771F, -0.40980330836826856F);
		rArmClaw1 = new ModelRenderer(this, 47, 73);
		rArmClaw1.mirror = true;
		rArmClaw1.setRotationPoint(-5.2F, 0.1F, 0.8F);
		rArmClaw1.addBox(-3.2F, -1.3F, -1.5F, 3, 2, 2, 0.0F);
		setRotateAngle(rArmClaw1, 0.0F, 0.0F, -0.22759093446006054F);
		leLeg3 = new ModelRenderer(this, 116, 33);
		leLeg3.setRotationPoint(0.3F, 0.7F, 0.0F);
		leLeg3.addBox(-0.9F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(leLeg3, 0.0F, 0.0F, 0.40980330836826856F);
		largeSpike3b = new ModelRenderer(this, 118, 33);
		largeSpike3b.setRotationPoint(0.0F, -3.0F, 0.0F);
		largeSpike3b.addBox(-0.5F, -3.5F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(largeSpike3b, -0.22759093446006054F, 0.0F, 0.0F);
		laLeg6 = new ModelRenderer(this, 118, 35);
		laLeg6.setRotationPoint(0.0F, 6.4F, 0.0F);
		laLeg6.addBox(-0.5F, -0.1F, -0.4F, 1, 6, 1, 0.0F);
		setRotateAngle(laLeg6, 0.0F, 0.0F, 0.18203784098300857F);
		rArm = new ModelRenderer(this, 68, 59);
		rArm.mirror = true;
		rArm.setRotationPoint(-0.5F, 0.2F, 5.5F);
		rArm.addBox(-0.8F, -1.1F, 0.0F, 2, 3, 7, 0.0F);
		setRotateAngle(rArm, 0.045553093477052F, -0.6373942428283291F, 0.0F);
		jawLower = new ModelRenderer(this, 80, 99);
		jawLower.setRotationPoint(0.0F, 3.6F, 0.1F);
		jawLower.addBox(-5.0F, -2.0F, -8.7F, 10, 3, 9, 0.0F);
		lbLeg1 = new ModelRenderer(this, 146, 0);
		lbLeg1.setRotationPoint(6.0F, -1.3F, 1.3F);
		lbLeg1.addBox(-1.4F, -1.5F, -2.0F, 8, 4, 4, 0.0F);
		setRotateAngle(lbLeg1, 0.0F, 0.0F, 0.8651597102135892F);
		ldLeg4 = new ModelRenderer(this, 118, 35);
		ldLeg4.setRotationPoint(0.0F, 4.0F, 0.0F);
		ldLeg4.addBox(-0.5F, -0.6F, -0.5F, 1, 4, 1, 0.0F);
		setRotateAngle(ldLeg4, 0.0F, 0.0F, 0.27314402793711257F);
		armour2 = new ModelRenderer(this, 182, 44);
		armour2.setRotationPoint(0.0F, 0.0F, 0.0F);
		armour2.addBox(-7.5F, -17.8F, 5.1F, 15, 12, 7, 0.0F);
		setRotateAngle(armour2, 0.36425021489121656F, 0.0F, 0.0F);
		rShoulder02 = new ModelRenderer(this, 48, 58);
		rShoulder02.mirror = true;
		rShoulder02.setRotationPoint(-7.0F, -2.1F, -4.1F);
		rShoulder02.addBox(-0.8F, -2.0F, 0.0F, 3, 3, 6, 0.0F);
		setRotateAngle(rShoulder02, 0.0F, -0.5918411493512771F, 0.0F);
		rShoulder03 = new ModelRenderer(this, 49, 61);
		rShoulder03.mirror = true;
		rShoulder03.setRotationPoint(-5.6F, 1.3F, -2.5F);
		rShoulder03.addBox(-1.8F, -2.0F, 0.0F, 3, 3, 5, 0.0F);
		setRotateAngle(rShoulder03, -0.7285004297824331F, -0.27314402793711257F, 0.5462880558742251F);
		fang2 = new ModelRenderer(this, 0, 0);
		fang2.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang2.addBox(-1.0F, -5.7F, -7.7F, 2, 1, 1, 0.0F);
		setRotateAngle(fang2, 0.36425021489121656F, 0.0F, 0.0F);
		neck = new ModelRenderer(this, 63, 85);
		neck.setRotationPoint(0.0F, -4.2F, -8.8F);
		neck.addBox(-4.5F, -2.0F, -6.0F, 9, 6, 4, 0.0F);
		rLargeSpike1b = new ModelRenderer(this, 116, 33);
		rLargeSpike1b.setRotationPoint(-1.9F, -1.7F, 2.0F);
		rLargeSpike1b.addBox(-1.0F, -4.5F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(rLargeSpike1b, -0.18203784098300857F, 0.0F, -0.8196066167365371F);
		lLargeSpike2b = new ModelRenderer(this, 118, 33);
		lLargeSpike2b.setRotationPoint(0.0F, -4.0F, 0.0F);
		lLargeSpike2b.addBox(-0.5F, -3.5F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lLargeSpike2b, -0.22759093446006054F, 0.0F, 0.0F);
		head = new ModelRenderer(this, 42, 99);
		head.setRotationPoint(0.0F, 0.0F, -5.5F);
		head.addBox(-5.0F, -2.4F, -7.8F, 10, 4, 8, 0.0F);
		setRotateAngle(head, 0.40980330836826856F, 0.0F, 0.0F);
		body2 = new ModelRenderer(this, 0, 32);
		body2.setRotationPoint(0.0F, -0.1F, 5.2F);
		body2.addBox(-6.0F, -4.5F, 0.0F, 12, 9, 12, 0.0F);
		lArmClaw1_1 = new ModelRenderer(this, 47, 73);
		lArmClaw1_1.mirror = true;
		lArmClaw1_1.setRotationPoint(-6.2F, 0.1F, 0.8F);
		lArmClaw1_1.addBox(-6.2F, -1.3F, -1.5F, 7, 3, 3, 0.0F);
		setRotateAngle(lArmClaw1_1, 0.0F, 0.0F, -0.18203784098300857F);
		lbLeg4 = new ModelRenderer(this, 116, 33);
		lbLeg4.setRotationPoint(1.1F, -0.6F, 0.0F);
		lbLeg4.addBox(-0.9F, -0.1F, -1.0F, 2, 7, 2, 0.0F);
		setRotateAngle(lbLeg4, 0.0F, 0.0F, -0.6829473363053812F);
		tail3 = new ModelRenderer(this, 0, 97);
		tail3.setRotationPoint(0.0F, -1.0F, 7.5F);
		tail3.addBox(-4.0F, -2.5F, -1.9F, 8, 5, 10, 0.0F);
		setRotateAngle(tail3, 0.4553564018453205F, 0.0F, 0.0F);
		rbLeg5 = new ModelRenderer(this, 118, 35);
		rbLeg5.mirror = true;
		rbLeg5.setRotationPoint(-1.2F, 8.3F, 0.0F);
		rbLeg5.addBox(-0.5F, -0.6F, -0.5F, 1, 7, 1, 0.0F);
		setRotateAngle(rbLeg5, 0.0F, 0.0F, -0.27314402793711257F);
		lTailPincer4 = new ModelRenderer(this, 0, 0);
		lTailPincer4.setRotationPoint(0.0F, -0.1F, 3.4F);
		lTailPincer4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
		setRotateAngle(lTailPincer4, -0.40980330836826856F, 0.0F, 0.0F);
		largeSpike2b = new ModelRenderer(this, 114, 33);
		largeSpike2b.setRotationPoint(0.0F, -6.3F, 0.0F);
		largeSpike2b.addBox(-1.5F, -3.2F, -1.5F, 3, 4, 3, 0.0F);
		setRotateAngle(largeSpike2b, -0.27314402793711257F, 0.0F, 0.0F);
		lTailPincer = new ModelRenderer(this, 173, 0);
		lTailPincer.setRotationPoint(2.7F, -1.2F, 6.8F);
		lTailPincer.addBox(-1.5F, -6.4F, -1.0F, 3, 6, 2, 0.0F);
		setRotateAngle(lTailPincer, -0.7285004297824331F, 0.5918411493512771F, 0.40980330836826856F);
		laLeg1 = new ModelRenderer(this, 114, 0);
		laLeg1.setRotationPoint(5.5F, 0.7F, -7.0F);
		laLeg1.addBox(-1.3F, -3.4F, -1.7F, 10, 7, 3, 0.0F);
		setRotateAngle(laLeg1, -0.40980330836826856F, 0.7740535232594852F, -0.6829473363053812F);
		rcLeg2 = new ModelRenderer(this, 152, 11);
		rcLeg2.mirror = true;
		rcLeg2.setRotationPoint(-6.5F, 0.0F, 0.0F);
		rcLeg2.addBox(-2.0F, -6.9F, -1.5F, 2, 8, 3, 0.0F);
		setRotateAngle(rcLeg2, 0.0F, 0.0F, -0.36425021489121656F);
		lForearm02 = new ModelRenderer(this, 90, 63);
		lForearm02.setRotationPoint(0.0F, -0.5F, 5.6F);
		lForearm02.addBox(-0.5F, -1.5F, -1.3F, 7, 3, 3, 0.0F);
		setRotateAngle(lForearm02, 0.0F, -1.0471975511965976F, 0.18203784098300857F);
		lcLeg3 = new ModelRenderer(this, 150, 24);
		lcLeg3.setRotationPoint(0.0F, -6.5F, 0.0F);
		lcLeg3.addBox(-1.1F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(lcLeg3, 0.0F, 0.0F, -0.8196066167365371F);
		rArmClaw2 = new ModelRenderer(this, 47, 74);
		rArmClaw2.mirror = true;
		rArmClaw2.setRotationPoint(-6.2F, 0.1F, 0.0F);
		rArmClaw2.addBox(-6.5F, -1.3F, -1.0F, 7, 2, 2, 0.0F);
		setRotateAngle(rArmClaw2, 0.0F, 0.0F, -0.31869712141416456F);
		chest = new ModelRenderer(this, 53, 28);
		chest.setRotationPoint(0.0F, -15.0F, 0.8F);
		chest.addBox(-7.0F, -7.0F, -11.0F, 14, 9, 15, 0.0F);
		raLeg1 = new ModelRenderer(this, 114, 0);
		raLeg1.mirror = true;
		raLeg1.setRotationPoint(-5.5F, 0.7F, -7.2F);
		raLeg1.addBox(-8.7F, -3.4F, -1.7F, 10, 7, 3, 0.0F);
		setRotateAngle(raLeg1, -0.40980330836826856F, -0.7740535232594852F, 0.6829473363053812F);
		lForearm = new ModelRenderer(this, 89, 61);
		lForearm.setRotationPoint(0.0F, 0.0F, 5.6F);
		lForearm.addBox(-0.5F, -1.5F, -1.3F, 7, 4, 4, 0.0F);
		setRotateAngle(lForearm, 0.0F, -0.22759093446006054F, 0.18203784098300857F);
		largeSpike2_1 = new ModelRenderer(this, 116, 33);
		largeSpike2_1.setRotationPoint(0.0F, -3.0F, -0.1F);
		largeSpike2_1.addBox(-1.0F, -3.7F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(largeSpike2_1, -0.36425021489121656F, 0.0F, 0.0F);
		lArmClaw2_1 = new ModelRenderer(this, 49, 76);
		lArmClaw2_1.setRotationPoint(6.2F, 0.1F, 0.0F);
		lArmClaw2_1.addBox(0.0F, -1.3F, -0.5F, 7, 1, 1, 0.0F);
		setRotateAngle(lArmClaw2_1, 0.0F, 0.0F, 0.31869712141416456F);
		raLeg4 = new ModelRenderer(this, 114, 33);
		raLeg4.mirror = true;
		raLeg4.setRotationPoint(0.0F, 2.0F, 0.0F);
		raLeg4.addBox(-1.8F, -1.1F, -1.5F, 3, 10, 3, 0.0F);
		setRotateAngle(raLeg4, -0.045553093477052F, 0.0F, -0.5918411493512771F);
		lForearm03 = new ModelRenderer(this, 90, 63);
		lForearm03.setRotationPoint(0.0F, -0.5F, 4.2F);
		lForearm03.addBox(-0.5F, -1.5F, -1.3F, 6, 3, 3, 0.0F);
		setRotateAngle(lForearm03, 0.0F, -1.4570008595648662F, 0.18203784098300857F);
		body1 = new ModelRenderer(this, 0, 0);
		body1.setRotationPoint(0.0F, 9.7F, 1.2F);
		body1.addBox(-7.0F, -6.0F, -8.5F, 14, 12, 14, 0.0F);
		lArmClaw1 = new ModelRenderer(this, 47, 73);
		lArmClaw1.setRotationPoint(6.2F, 0.1F, 0.8F);
		lArmClaw1.addBox(0.0F, -1.3F, -1.5F, 7, 3, 3, 0.0F);
		setRotateAngle(lArmClaw1, 0.0F, 0.0F, 0.18203784098300857F);
		tail1 = new ModelRenderer(this, 0, 55);
		tail1.setRotationPoint(0.0F, 0.0F, 10.7F);
		tail1.addBox(-5.0F, -4.3F, 0.0F, 10, 8, 12, 0.0F);
		setRotateAngle(tail1, 0.18203784098300857F, 0.0F, 0.0F);
		lbLeg2 = new ModelRenderer(this, 152, 11);
		lbLeg2.setRotationPoint(6.5F, 0.0F, 0.0F);
		lbLeg2.addBox(-1.3F, -6.4F, -1.5F, 2, 8, 3, 0.0F);
		setRotateAngle(lbLeg2, 0.0F, 0.0F, 0.36425021489121656F);
		rcLeg1 = new ModelRenderer(this, 146, 0);
		rcLeg1.mirror = true;
		rcLeg1.setRotationPoint(-4.9F, -2.6F, 8.6F);
		rcLeg1.addBox(-8.0F, -1.5F, -2.0F, 8, 4, 4, 0.0F);
		setRotateAngle(rcLeg1, 0.0F, 0.0F, -0.8651597102135892F);
		largeSpike3 = new ModelRenderer(this, 118, 33);
		largeSpike3.setRotationPoint(0.0F, -3.0F, 0.0F);
		largeSpike3.addBox(-0.5F, -3.5F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(largeSpike3, -0.22759093446006054F, 0.0F, 0.0F);
		raLeg6 = new ModelRenderer(this, 118, 35);
		raLeg6.mirror = true;
		raLeg6.setRotationPoint(0.0F, 6.6F, 0.0F);
		raLeg6.addBox(-0.5F, -0.1F, -0.4F, 1, 6, 1, 0.0F);
		setRotateAngle(raLeg6, 0.0F, 0.0F, -0.18203784098300857F);
		headHorn2 = new ModelRenderer(this, 116, 34);
		headHorn2.setRotationPoint(0.0F, -3.1F, 0.0F);
		headHorn2.addBox(-0.5F, -3.6F, -0.5F, 1, 4, 1, 0.0F);
		setRotateAngle(headHorn2, -0.40980330836826856F, 0.0F, 0.0F);
		rcLeg4 = new ModelRenderer(this, 116, 33);
		rcLeg4.mirror = true;
		rcLeg4.setRotationPoint(1.1F, -0.6F, 0.0F);
		rcLeg4.addBox(-1.9F, 1.6F, -1.0F, 2, 7, 2, 0.0F);
		setRotateAngle(rcLeg4, 0.0F, 0.0F, 0.6829473363053812F);
		rcLeg5 = new ModelRenderer(this, 118, 35);
		rcLeg5.mirror = true;
		rcLeg5.setRotationPoint(-1.2F, 8.3F, 0.0F);
		rcLeg5.addBox(-0.5F, -0.6F, -0.5F, 1, 7, 1, 0.0F);
		setRotateAngle(rcLeg5, 0.0F, 0.0F, -0.27314402793711257F);
		stomach = new ModelRenderer(this, 63, 0);
		stomach.setRotationPoint(0.0F, -4.6F, -2.1F);
		stomach.addBox(-6.0F, -13.3F, -4.5F, 12, 13, 9, 0.0F);
		setRotateAngle(stomach, -0.22759093446006054F, 0.0F, 0.0F);
		lArmClaw1_2 = new ModelRenderer(this, 47, 74);
		lArmClaw1_2.mirror = true;
		lArmClaw1_2.setRotationPoint(-6.2F, 0.1F, 0.8F);
		lArmClaw1_2.addBox(-3.2F, -1.3F, -1.5F, 4, 2, 2, 0.0F);
		setRotateAngle(lArmClaw1_2, 0.0F, -0.22759093446006054F, 0.0F);
		rdLeg3 = new ModelRenderer(this, 116, 33);
		rdLeg3.setRotationPoint(-0.3F, 0.7F, 0.0F);
		rdLeg3.addBox(-0.9F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(rdLeg3, 0.0F, 0.0F, -0.40980330836826856F);
		lArmClaw2b = new ModelRenderer(this, 49, 74);
		lArmClaw2b.setRotationPoint(3.5F, 0.3F, -0.3F);
		lArmClaw2b.addBox(0.0F, -1.3F, -0.5F, 3, 1, 1, 0.0F);
		setRotateAngle(lArmClaw2b, 0.0F, 0.22759093446006054F, 0.0F);
		rbLeg3 = new ModelRenderer(this, 150, 24);
		rbLeg3.mirror = true;
		rbLeg3.setRotationPoint(-1.3F, -6.5F, 0.0F);
		rbLeg3.addBox(-1.4F, -1.4F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(rbLeg3, 0.0F, 0.0F, 0.8196066167365371F);
		rbLeg1 = new ModelRenderer(this, 146, 0);
		rbLeg1.mirror = true;
		rbLeg1.setRotationPoint(-4.9F, -2.7F, 1.3F);
		rbLeg1.addBox(-8.0F, -1.5F, -2.0F, 8, 4, 4, 0.0F);
		setRotateAngle(rbLeg1, 0.0F, 0.0F, -0.8651597102135892F);
		fang1 = new ModelRenderer(this, 0, 0);
		fang1.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang1.addBox(2.4F, -5.7F, -7.7F, 2, 1, 1, 0.0F);
		setRotateAngle(fang1, 0.36425021489121656F, 0.0F, 0.0F);
		lArmClaw1a = new ModelRenderer(this, 47, 74);
		lArmClaw1a.setRotationPoint(6.2F, 0.1F, 0.8F);
		lArmClaw1a.addBox(0.0F, -1.3F, -1.5F, 4, 2, 2, 0.0F);
		setRotateAngle(lArmClaw1a, 0.0F, 0.22759093446006054F, 0.0F);
		rArmClaw2_3 = new ModelRenderer(this, 47, 74);
		rArmClaw2_3.mirror = true;
		rArmClaw2_3.setRotationPoint(-2.0F, 0.3F, -0.3F);
		rArmClaw2_3.addBox(-3.1F, -1.3F, -0.5F, 3, 1, 1, 0.0F);
		setRotateAngle(rArmClaw2_3, 0.0F, 0.0F, -0.22759093446006054F);
		lShoulder03 = new ModelRenderer(this, 49, 61);
		lShoulder03.setRotationPoint(6.0F, 1.3F, -2.0F);
		lShoulder03.addBox(-1.8F, -2.0F, 0.0F, 3, 3, 5, 0.0F);
		setRotateAngle(lShoulder03, -0.7285004297824331F, 0.27314402793711257F, -0.5462880558742251F);
		lWebbing01 = new ModelRenderer(this, 129, 90);
		lWebbing01.setRotationPoint(0.0F, 0.0F, 0.0F);
		lWebbing01.addBox(-6.6F, 0.5F, -4.2F, 8, 0, 10, 0.0F);
		setRotateAngle(lWebbing01, 0.0F, -0.36425021489121656F, 0.27314402793711257F);
		raLeg2 = new ModelRenderer(this, 114, 13);
		raLeg2.mirror = true;
		raLeg2.setRotationPoint(-8.5F, 0.0F, -0.1F);
		raLeg2.addBox(-6.8F, -3.1F, -1.1F, 7, 5, 2, 0.0F);
		setRotateAngle(raLeg2, 0.0F, 0.0F, 0.136659280431156F);
		rbLeg2 = new ModelRenderer(this, 152, 11);
		rbLeg2.mirror = true;
		rbLeg2.setRotationPoint(-6.5F, 0.0F, 0.0F);
		rbLeg2.addBox(-2.0F, -6.9F, -1.5F, 2, 8, 3, 0.0F);
		setRotateAngle(rbLeg2, 0.0F, 0.0F, -0.36425021489121656F);
		lLargeSpike1b = new ModelRenderer(this, 116, 33);
		lLargeSpike1b.setRotationPoint(1.9F, -1.7F, 2.0F);
		lLargeSpike1b.addBox(-1.0F, -4.5F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(lLargeSpike1b, -0.18203784098300857F, 0.0F, 0.8196066167365371F);
		lTailPincer2 = new ModelRenderer(this, 173, 10);
		lTailPincer2.setRotationPoint(0.0F, -6.5F, 0.0F);
		lTailPincer2.addBox(-2.0F, -2.3F, -1.7F, 4, 3, 3, 0.0F);
		setRotateAngle(lTailPincer2, 0.6829473363053812F, 0.0F, 0.0F);
		laLeg3 = new ModelRenderer(this, 114, 22);
		laLeg3.setRotationPoint(6.7F, 0.0F, 0.0F);
		laLeg3.addBox(-0.9F, -2.8F, -1.9F, 5, 5, 4, 0.0F);
		setRotateAngle(laLeg3, 0.0F, 0.0F, -0.5009094953223726F);
		raLeg5 = new ModelRenderer(this, 116, 34);
		raLeg5.mirror = true;
		raLeg5.setRotationPoint(0.0F, 9.5F, 0.0F);
		raLeg5.addBox(-1.0F, -1.1F, -1.0F, 2, 8, 2, 0.0F);
		setRotateAngle(raLeg5, 0.0F, 0.0F, -0.31869712141416456F);
		ldLeg3 = new ModelRenderer(this, 116, 33);
		ldLeg3.setRotationPoint(0.3F, 0.7F, 0.0F);
		ldLeg3.addBox(-0.9F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(ldLeg3, 0.0F, 0.0F, 0.40980330836826856F);
		lTailPincer3 = new ModelRenderer(this, 47, 73);
		lTailPincer3.setRotationPoint(0.0F, -0.7F, 1.2F);
		lTailPincer3.addBox(-1.0F, -0.9F, -0.3F, 2, 2, 4, 0.0F);
		setRotateAngle(lTailPincer3, -0.36425021489121656F, 0.0F, 0.0F);
		armour5 = new ModelRenderer(this, 169, 70);
		armour5.setRotationPoint(0.0F, -5.4F, 1.9F);
		armour5.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 7, 0.0F);
		setRotateAngle(armour5, 0.136659280431156F, 0.0F, 0.0F);
		lArmClaw2 = new ModelRenderer(this, 47, 74);
		lArmClaw2.setRotationPoint(6.2F, 0.1F, 0.0F);
		lArmClaw2.addBox(0.0F, -1.3F, -1.0F, 7, 2, 2, 0.0F);
		setRotateAngle(lArmClaw2, 0.0F, 0.0F, 0.31869712141416456F);
		reLeg1 = new ModelRenderer(this, 147, 0);
		reLeg1.mirror = true;
		reLeg1.setRotationPoint(-6.0F, -1.2F, 7.5F);
		reLeg1.addBox(-5.5F, -1.5F, -2.4F, 7, 2, 3, 0.0F);
		setRotateAngle(reLeg1, 0.0F, 0.0F, 0.4553564018453205F);
		largeSpike2 = new ModelRenderer(this, 114, 33);
		largeSpike2.setRotationPoint(0.0F, -6.3F, 0.0F);
		largeSpike2.addBox(-1.5F, -3.2F, -1.5F, 3, 4, 3, 0.0F);
		setRotateAngle(largeSpike2, -0.27314402793711257F, 0.0F, 0.0F);
		tail2 = new ModelRenderer(this, 0, 77);
		tail2.setRotationPoint(0.0F, 0.0F, 10.7F);
		tail2.addBox(-4.5F, -4.3F, -1.7F, 9, 7, 9, 0.0F);
		setRotateAngle(tail2, 0.8196066167365371F, 0.0F, 0.0F);
		rbLeg4 = new ModelRenderer(this, 116, 33);
		rbLeg4.mirror = true;
		rbLeg4.setRotationPoint(1.1F, -0.6F, 0.0F);
		rbLeg4.addBox(-1.9F, 1.6F, -1.0F, 2, 7, 2, 0.0F);
		setRotateAngle(rbLeg4, 0.0F, 0.0F, 0.6829473363053812F);
		rForearm02 = new ModelRenderer(this, 90, 63);
		rForearm02.mirror = true;
		rForearm02.setRotationPoint(0.3F, -0.4F, 5.6F);
		rForearm02.addBox(-6.1F, -1.5F, -1.3F, 7, 3, 3, 0.0F);
		setRotateAngle(rForearm02, 0.0F, 1.0471975511965976F, -0.18203784098300857F);
		rArmClaw2_1 = new ModelRenderer(this, 49, 76);
		rArmClaw2_1.mirror = true;
		rArmClaw2_1.setRotationPoint(-6.2F, 0.1F, 0.0F);
		rArmClaw2_1.addBox(-6.8F, -1.3F, -0.5F, 7, 1, 1, 0.0F);
		setRotateAngle(rArmClaw2_1, 0.0F, 0.0F, -0.31869712141416456F);
		rForearm03 = new ModelRenderer(this, 90, 63);
		rForearm03.mirror = true;
		rForearm03.setRotationPoint(-0.6F, -0.5F, 4.2F);
		rForearm03.addBox(-6.1F, -1.5F, -1.3F, 6, 3, 3, 0.0F);
		setRotateAngle(rForearm03, 0.0F, 1.4570008595648662F, -0.18203784098300857F);
		largeSpine1b = new ModelRenderer(this, 208, 69);
		largeSpine1b.setRotationPoint(0.0F, -8.3F, 3.1F);
		largeSpine1b.addBox(-2.5F, -6.0F, -2.5F, 5, 6, 5, 0.0F);
		setRotateAngle(largeSpine1b, -0.6829473363053812F, 0.0F, 0.0F);
		lcLeg1 = new ModelRenderer(this, 146, 0);
		lcLeg1.setRotationPoint(6.0F, -1.2F, 8.6F);
		lcLeg1.addBox(-1.4F, -1.5F, -2.0F, 8, 4, 4, 0.0F);
		setRotateAngle(lcLeg1, 0.0F, 0.0F, 0.8651597102135892F);
		rdLeg4 = new ModelRenderer(this, 118, 35);
		rdLeg4.setRotationPoint(0.0F, 4.0F, 0.0F);
		rdLeg4.addBox(-0.5F, -0.6F, -0.5F, 1, 4, 1, 0.0F);
		setRotateAngle(rdLeg4, 0.0F, 0.0F, -0.27314402793711257F);
		armour8 = new ModelRenderer(this, 173, 69);
		armour8.setRotationPoint(0.0F, -4.7F, 5.0F);
		armour8.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 7, 0.0F);
		setRotateAngle(armour8, 0.27314402793711257F, 0.0F, 0.0F);
		rWebbing01 = new ModelRenderer(this, 129, 90);
		rWebbing01.mirror = true;
		rWebbing01.setRotationPoint(0.0F, 0.0F, 0.0F);
		rWebbing01.addBox(-1.0F, 0.5F, -4.2F, 8, 0, 10, 0.0F);
		setRotateAngle(rWebbing01, 0.0F, 0.36425021489121656F, -0.27314402793711257F);
		lcLeg5 = new ModelRenderer(this, 118, 35);
		lcLeg5.setRotationPoint(0.0F, 6.7F, 0.0F);
		lcLeg5.addBox(-0.5F, -0.6F, -0.5F, 1, 7, 1, 0.0F);
		setRotateAngle(lcLeg5, 0.0F, 0.0F, 0.27314402793711257F);
		rcLeg3 = new ModelRenderer(this, 150, 24);
		rcLeg3.mirror = true;
		rcLeg3.setRotationPoint(-1.3F, -6.5F, 0.0F);
		rcLeg3.addBox(-1.4F, -1.4F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(rcLeg3, 0.0F, 0.0F, 0.8196066167365371F);
		rTailPincer4 = new ModelRenderer(this, 0, 0);
		rTailPincer4.setRotationPoint(0.0F, -0.1F, 3.4F);
		rTailPincer4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
		setRotateAngle(rTailPincer4, -0.40980330836826856F, 0.0F, 0.0F);
		rdLeg2 = new ModelRenderer(this, 150, 33);
		rdLeg2.mirror = true;
		rdLeg2.setRotationPoint(-5.9F, 0.0F, -1.0F);
		rdLeg2.addBox(-1.8F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(rdLeg2, 0.0F, 0.0F, 0.8196066167365371F);
		lShoulder = new ModelRenderer(this, 48, 58);
		lShoulder.setRotationPoint(6.0F, -3.4F, -7.4F);
		lShoulder.addBox(-1.8F, -2.0F, 0.0F, 3, 5, 6, 0.0F);
		setRotateAngle(lShoulder, -0.22759093446006054F, 1.0927506446736497F, 0.0F);
		lbLeg5 = new ModelRenderer(this, 118, 35);
		lbLeg5.setRotationPoint(0.0F, 6.7F, 0.0F);
		lbLeg5.addBox(-0.5F, -0.6F, -0.5F, 1, 7, 1, 0.0F);
		setRotateAngle(lbLeg5, 0.0F, 0.0F, 0.27314402793711257F);
		fang2b = new ModelRenderer(this, 0, 6);
		fang2b.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang2b.addBox(-0.5F, -6.9F, -8.2F, 1, 2, 1, 0.0F);
		setRotateAngle(fang2b, 0.27314402793711257F, 0.0F, 0.0F);
		lWebbing02 = new ModelRenderer(this, 161, 90);
		lWebbing02.setRotationPoint(0.0F, 0.0F, 0.0F);
		lWebbing02.addBox(-6.5F, -0.7F, -0.6F, 13, 6, 0, 0.0F);
		setRotateAngle(lWebbing02, 0.0F, -0.36425021489121656F, 0.22759093446006054F);
		leLeg2 = new ModelRenderer(this, 150, 33);
		leLeg2.setRotationPoint(5.9F, 0.0F, -1.0F);
		leLeg2.addBox(-1.1F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(leLeg2, 0.0F, 0.0F, -0.8196066167365371F);
		headHorn1 = new ModelRenderer(this, 115, 34);
		headHorn1.setRotationPoint(0.0F, -3.0F, -5.6F);
		headHorn1.addBox(-1.0F, -3.6F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(headHorn1, 0.5009094953223726F, 0.0F, 0.0F);
		lShoulder02 = new ModelRenderer(this, 48, 58);
		lShoulder02.setRotationPoint(6.0F, -2.2F, -4.1F);
		lShoulder02.addBox(-1.8F, -2.0F, 0.0F, 3, 3, 6, 0.0F);
		setRotateAngle(lShoulder02, 0.0F, 0.5918411493512771F, 0.0F);
		lArmClaw2b_1 = new ModelRenderer(this, 49, 74);
		lArmClaw2b_1.setRotationPoint(2.7F, -0.3F, -0.4F);
		lArmClaw2b_1.addBox(0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw2b_1, 0.0F, 0.0F, 0.22759093446006054F);
		leLeg4 = new ModelRenderer(this, 118, 35);
		leLeg4.setRotationPoint(0.0F, 4.0F, 0.0F);
		leLeg4.addBox(-0.5F, -0.6F, -0.5F, 1, 4, 1, 0.0F);
		setRotateAngle(leLeg4, 0.0F, 0.0F, 0.27314402793711257F);
		ldLeg1 = new ModelRenderer(this, 147, 0);
		ldLeg1.setRotationPoint(6.0F, -1.2F, 7.5F);
		ldLeg1.addBox(-1.4F, -1.5F, -2.4F, 7, 2, 3, 0.0F);
		setRotateAngle(ldLeg1, 0.0F, 0.0F, -0.4553564018453205F);
		reLeg2 = new ModelRenderer(this, 150, 33);
		reLeg2.mirror = true;
		reLeg2.setRotationPoint(-5.9F, 0.0F, -1.0F);
		reLeg2.addBox(-1.8F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(reLeg2, 0.0F, 0.0F, 0.8196066167365371F);
		ldLeg2 = new ModelRenderer(this, 150, 33);
		ldLeg2.setRotationPoint(5.9F, 0.0F, -1.0F);
		ldLeg2.addBox(-1.1F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(ldLeg2, 0.0F, 0.0F, -0.8196066167365371F);
		lArmClaw1b = new ModelRenderer(this, 47, 74);
		lArmClaw1b.setRotationPoint(5.2F, 0.1F, 0.8F);
		lArmClaw1b.addBox(0.0F, -1.3F, -1.5F, 3, 2, 2, 0.0F);
		setRotateAngle(lArmClaw1b, 0.0F, 0.0F, 0.22759093446006054F);
		headArmour = new ModelRenderer(this, 119, 50);
		headArmour.setRotationPoint(0.0F, 0.0F, 0.0F);
		headArmour.addBox(-5.5F, -4.5F, -8.0F, 11, 4, 10, 0.0F);
		setRotateAngle(headArmour, 0.22759093446006054F, 0.0F, 0.0F);
		rArmClaw2_2 = new ModelRenderer(this, 47, 74);
		rArmClaw2_2.mirror = true;
		rArmClaw2_2.setRotationPoint(-2.0F, 0.3F, -0.3F);
		rArmClaw2_2.addBox(-3.1F, -1.3F, -0.5F, 3, 1, 1, 0.0F);
		setRotateAngle(rArmClaw2_2, 0.0F, -0.22759093446006054F, 0.0F);
		laLeg4 = new ModelRenderer(this, 114, 33);
		laLeg4.setRotationPoint(0.0F, 2.0F, 0.0F);
		laLeg4.addBox(-1.1F, -1.7F, -1.5F, 3, 10, 3, 0.0F);
		setRotateAngle(laLeg4, -0.045553093477052F, 0.0F, 0.5918411493512771F);
		lbLeg3 = new ModelRenderer(this, 150, 24);
		lbLeg3.setRotationPoint(0.0F, -6.5F, 0.0F);
		lbLeg3.addBox(-1.1F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
		setRotateAngle(lbLeg3, 0.0F, 0.0F, -0.8196066167365371F);
		rLargeSpike2b = new ModelRenderer(this, 118, 33);
		rLargeSpike2b.setRotationPoint(0.0F, -4.0F, 0.0F);
		rLargeSpike2b.addBox(-0.5F, -3.5F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rLargeSpike2b, -0.22759093446006054F, 0.0F, 0.0F);
		rShoulder = new ModelRenderer(this, 48, 58);
		rShoulder.mirror = true;
		rShoulder.setRotationPoint(-5.1F, -3.4F, -7.4F);
		rShoulder.addBox(-1.8F, -2.0F, 0.0F, 3, 5, 6, 0.0F);
		setRotateAngle(rShoulder, -0.22759093446006054F, -1.0927506446736497F, 0.0F);
		rLargeSpike1 = new ModelRenderer(this, 116, 33);
		rLargeSpike1.setRotationPoint(-1.9F, -1.7F, 2.0F);
		rLargeSpike1.addBox(-1.0F, -4.5F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(rLargeSpike1, -0.18203784098300857F, 0.0F, -0.8196066167365371F);
		laLeg5 = new ModelRenderer(this, 116, 34);
		laLeg5.setRotationPoint(0.0F, 9.5F, 0.0F);
		laLeg5.addBox(-1.0F, -1.7F, -1.0F, 2, 8, 2, 0.0F);
		setRotateAngle(laLeg5, 0.0F, 0.0F, 0.31869712141416456F);
		lLargeSpike2 = new ModelRenderer(this, 118, 33);
		lLargeSpike2.setRotationPoint(0.0F, -4.0F, 0.0F);
		lLargeSpike2.addBox(-0.5F, -3.5F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lLargeSpike2, -0.22759093446006054F, 0.0F, 0.0F);
		lcLeg2 = new ModelRenderer(this, 152, 11);
		lcLeg2.setRotationPoint(6.5F, 0.0F, 0.0F);
		lcLeg2.addBox(-1.3F, -6.4F, -1.5F, 2, 8, 3, 0.0F);
		setRotateAngle(lcLeg2, 0.0F, 0.0F, 0.36425021489121656F);
		raLeg3 = new ModelRenderer(this, 114, 22);
		raLeg3.mirror = true;
		raLeg3.setRotationPoint(-6.7F, 0.0F, 0.0F);
		raLeg3.addBox(-3.9F, -2.8F, -1.9F, 5, 5, 4, 0.0F);
		setRotateAngle(raLeg3, 0.0F, 0.0F, 0.5009094953223726F);
		lcLeg4 = new ModelRenderer(this, 116, 33);
		lcLeg4.setRotationPoint(1.1F, -0.6F, 0.0F);
		lcLeg4.addBox(-0.9F, -0.1F, -1.0F, 2, 7, 2, 0.0F);
		setRotateAngle(lcLeg4, 0.0F, 0.0F, -0.6829473363053812F);
		reLeg4 = new ModelRenderer(this, 118, 35);
		reLeg4.setRotationPoint(0.0F, 4.0F, 0.0F);
		reLeg4.addBox(-0.5F, -0.6F, -0.5F, 1, 4, 1, 0.0F);
		setRotateAngle(reLeg4, 0.0F, 0.0F, -0.27314402793711257F);
		rTailPincer2 = new ModelRenderer(this, 173, 10);
		rTailPincer2.mirror = true;
		rTailPincer2.setRotationPoint(0.0F, -6.5F, 0.0F);
		rTailPincer2.addBox(-2.0F, -2.3F, -1.7F, 4, 3, 3, 0.0F);
		setRotateAngle(rTailPincer2, 0.6829473363053812F, 0.0F, 0.0F);
		armour1 = new ModelRenderer(this, 183, 9);
		armour1.setRotationPoint(0.0F, 0.0F, 0.0F);
		armour1.addBox(-8.0F, -10.9F, -14.2F, 16, 7, 20, 0.0F);
		largeSpine1 = new ModelRenderer(this, 208, 69);
		largeSpine1.setRotationPoint(0.0F, -9.6F, -9.4F);
		largeSpine1.addBox(-2.5F, -6.0F, -2.5F, 5, 6, 5, 0.0F);
		setRotateAngle(largeSpine1, -0.5009094953223726F, 0.0F, 0.0F);
		laLeg1.addChild(laLeg2);
		rLargeSpike1.addChild(rLargeSpike2);
		lShoulder.addChild(lArm);
		reLeg2.addChild(reLeg3);
		rTailPincer2.addChild(rTailPincer3);
		rArm.addChild(rForearm);
		body2.addChild(armour7);
		jawLower.addChild(fang1b);
		jawLower.addChild(fang3);
		tail1.addChild(rdLeg1);
		tail2.addChild(leLeg1);
		largeSpine1.addChild(lLargeSpike1);
		body1.addChild(armour3);
		largeSpike2b.addChild(largeSpike2b_1);
		body2.addChild(armour6);
		rForearm02.addChild(rWebbing02);
		jawLower.addChild(fang3b);
		body1.addChild(armour4);
		tail3.addChild(rTailPincer);
		rForearm03.addChild(rArmClaw1);
		leLeg2.addChild(leLeg3);
		largeSpike2b_1.addChild(largeSpike3b);
		laLeg5.addChild(laLeg6);
		rShoulder.addChild(rArm);
		head.addChild(jawLower);
		body1.addChild(lbLeg1);
		ldLeg3.addChild(ldLeg4);
		stomach.addChild(armour2);
		chest.addChild(rShoulder02);
		chest.addChild(rShoulder03);
		jawLower.addChild(fang2);
		chest.addChild(neck);
		largeSpine1b.addChild(rLargeSpike1b);
		lLargeSpike1b.addChild(lLargeSpike2b);
		neck.addChild(head);
		body1.addChild(body2);
		rForearm.addChild(lArmClaw1_1);
		lbLeg3.addChild(lbLeg4);
		tail2.addChild(tail3);
		rbLeg4.addChild(rbLeg5);
		lTailPincer3.addChild(lTailPincer4);
		largeSpine1b.addChild(largeSpike2b);
		tail3.addChild(lTailPincer);
		body1.addChild(laLeg1);
		rcLeg1.addChild(rcLeg2);
		lShoulder02.addChild(lForearm02);
		lcLeg2.addChild(lcLeg3);
		lArmClaw1_1.addChild(rArmClaw2);
		stomach.addChild(chest);
		body1.addChild(raLeg1);
		lArm.addChild(lForearm);
		largeSpike2.addChild(largeSpike2_1);
		lArmClaw2.addChild(lArmClaw2_1);
		raLeg3.addChild(raLeg4);
		lShoulder03.addChild(lForearm03);
		lForearm.addChild(lArmClaw1);
		body2.addChild(tail1);
		lbLeg1.addChild(lbLeg2);
		body2.addChild(rcLeg1);
		largeSpike2_1.addChild(largeSpike3);
		raLeg5.addChild(raLeg6);
		headHorn1.addChild(headHorn2);
		rcLeg3.addChild(rcLeg4);
		rcLeg4.addChild(rcLeg5);
		body1.addChild(stomach);
		rForearm02.addChild(lArmClaw1_2);
		rdLeg2.addChild(rdLeg3);
		lArmClaw1a.addChild(lArmClaw2b);
		rbLeg2.addChild(rbLeg3);
		body1.addChild(rbLeg1);
		jawLower.addChild(fang1);
		lForearm02.addChild(lArmClaw1a);
		rArmClaw1.addChild(rArmClaw2_3);
		chest.addChild(lShoulder03);
		lArm.addChild(lWebbing01);
		raLeg1.addChild(raLeg2);
		rbLeg1.addChild(rbLeg2);
		largeSpine1b.addChild(lLargeSpike1b);
		lTailPincer.addChild(lTailPincer2);
		laLeg2.addChild(laLeg3);
		raLeg4.addChild(raLeg5);
		ldLeg2.addChild(ldLeg3);
		lTailPincer2.addChild(lTailPincer3);
		body2.addChild(armour5);
		lArmClaw1.addChild(lArmClaw2);
		tail2.addChild(reLeg1);
		largeSpine1.addChild(largeSpike2);
		tail1.addChild(tail2);
		rbLeg3.addChild(rbLeg4);
		rShoulder02.addChild(rForearm02);
		rArmClaw2.addChild(rArmClaw2_1);
		rShoulder03.addChild(rForearm03);
		armour1.addChild(largeSpine1b);
		body2.addChild(lcLeg1);
		rdLeg3.addChild(rdLeg4);
		tail1.addChild(armour8);
		rArm.addChild(rWebbing01);
		lcLeg4.addChild(lcLeg5);
		rcLeg2.addChild(rcLeg3);
		rTailPincer3.addChild(rTailPincer4);
		rdLeg1.addChild(rdLeg2);
		chest.addChild(lShoulder);
		lbLeg4.addChild(lbLeg5);
		jawLower.addChild(fang2b);
		lForearm02.addChild(lWebbing02);
		leLeg1.addChild(leLeg2);
		head.addChild(headHorn1);
		chest.addChild(lShoulder02);
		lArmClaw1b.addChild(lArmClaw2b_1);
		leLeg3.addChild(leLeg4);
		tail1.addChild(ldLeg1);
		reLeg1.addChild(reLeg2);
		ldLeg1.addChild(ldLeg2);
		lForearm03.addChild(lArmClaw1b);
		head.addChild(headArmour);
		lArmClaw1_2.addChild(rArmClaw2_2);
		laLeg3.addChild(laLeg4);
		lbLeg2.addChild(lbLeg3);
		rLargeSpike1b.addChild(rLargeSpike2b);
		chest.addChild(rShoulder);
		largeSpine1.addChild(rLargeSpike1);
		laLeg4.addChild(laLeg5);
		lLargeSpike1.addChild(lLargeSpike2);
		lcLeg1.addChild(lcLeg2);
		raLeg2.addChild(raLeg3);
		lcLeg3.addChild(lcLeg4);
		reLeg3.addChild(reLeg4);
		rTailPincer.addChild(rTailPincer2);
		chest.addChild(armour1);
		armour1.addChild(largeSpine1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		body1.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		// super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks,
		// netHeadYaw, headPitch, scaleFactor, entityIn);
	}
}