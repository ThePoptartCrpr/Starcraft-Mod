package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * zergoverlord - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelOverlord extends ModelBase {

	public ModelRenderer body;
	public ModelRenderer head;
	public ModelRenderer lAirSac01;
	public ModelRenderer lAirSac02;
	public ModelRenderer lAirSacAntenna1;
	public ModelRenderer lAirSacAntenna2;
	public ModelRenderer lAirSacSpikeA1;
	public ModelRenderer lAirSacSpikeA2;
	public ModelRenderer lAirSacSpikeB1;
	public ModelRenderer lAirSacSpikeB2;
	public ModelRenderer lAirSacSpikeC1;
	public ModelRenderer lAirSacSpikeC2;
	public ModelRenderer lAirSacSpikeD1;
	public ModelRenderer lAirSacSpikeD2;
	public ModelRenderer lAirSacSpikeE1;
	public ModelRenderer lAirSacSpikeE2;
	public ModelRenderer lArmA1;
	public ModelRenderer lArmB1;
	public ModelRenderer lArmB2;
	public ModelRenderer lArmB3;
	public ModelRenderer lArmClaw1A;
	public ModelRenderer lArmClaw1B;
	public ModelRenderer lArmClaw2A;
	public ModelRenderer lArmClaw2B;
	public ModelRenderer lArmClaw3A;
	public ModelRenderer lArmClaw3B;
	public ModelRenderer lArmClaw3C;
	public ModelRenderer lArmClaw3D;
	public ModelRenderer lArmClaw3E;
	public ModelRenderer lArmClaw3E_1;
	public ModelRenderer lArmClaw4A;
	public ModelRenderer lArmClaw4B;
	public ModelRenderer lArmClaw4C;
	public ModelRenderer lArmClaw4D;
	public ModelRenderer lArmClaw4E;
	public ModelRenderer lBodyAntenna1;
	public ModelRenderer lBodyAntenna2;
	public ModelRenderer lClawA1;
	public ModelRenderer lClawA2;
	public ModelRenderer lClawA3;
	public ModelRenderer lClawA4;
	public ModelRenderer lClawA5;
	public ModelRenderer lHeadAntenna1;
	public ModelRenderer lHeadAntenna2;
	public ModelRenderer lLegA01;
	public ModelRenderer lLegA02;
	public ModelRenderer lLegA03;
	public ModelRenderer lLegA04;
	public ModelRenderer lLegA05;
	public ModelRenderer lLegB01;
	public ModelRenderer lLegB02;
	public ModelRenderer lLegB03;
	public ModelRenderer lLegB04;
	public ModelRenderer lLegB05;
	public ModelRenderer lLegC01;
	public ModelRenderer lLegC02;
	public ModelRenderer lLegC03;
	public ModelRenderer lLegC04;
	public ModelRenderer lLegC05;
	public ModelRenderer lMandible01;
	public ModelRenderer lMandible02;
	public ModelRenderer lMandible02_1;
	public ModelRenderer lrHeadAntenna1;
	public ModelRenderer rAirSac01;
	public ModelRenderer rAirSac02;
	public ModelRenderer rAirSacAntenna1;
	public ModelRenderer rAirSacAntenna2;
	public ModelRenderer rAirSacSpikeA1;
	public ModelRenderer rAirSacSpikeA2;
	public ModelRenderer rAirSacSpikeB1;
	public ModelRenderer rAirSacSpikeB2;
	public ModelRenderer rAirSacSpikeC1;
	public ModelRenderer rAirSacSpikeC2;
	public ModelRenderer rAirSacSpikeD1;
	public ModelRenderer rAirSacSpikeD2;
	public ModelRenderer rAirSacSpikeE1;
	public ModelRenderer rAirSacSpikeE2;
	public ModelRenderer rArmA1;
	public ModelRenderer rArmB1;
	public ModelRenderer rArmB2;
	public ModelRenderer rArmB3;
	public ModelRenderer rArmClaw1A;
	public ModelRenderer rArmClaw1B;
	public ModelRenderer rArmClaw2A;
	public ModelRenderer rArmClaw2B;
	public ModelRenderer rArmClaw3A;
	public ModelRenderer rArmClaw3B;
	public ModelRenderer rArmClaw3C;
	public ModelRenderer rArmClaw3D;
	public ModelRenderer rArmClaw4A;
	public ModelRenderer rArmClaw4B;
	public ModelRenderer rArmClaw4C;
	public ModelRenderer rArmClaw4D;
	public ModelRenderer rArmClaw4E;
	public ModelRenderer rBodyAntenna1;
	public ModelRenderer rBodyAntenna2;
	public ModelRenderer rClawA1;
	public ModelRenderer rClawA2;
	public ModelRenderer rClawA3;
	public ModelRenderer rClawA4;
	public ModelRenderer rClawA5;
	public ModelRenderer rHeadAntenna2;
	public ModelRenderer rLegA01;
	public ModelRenderer rLegA02;
	public ModelRenderer rLegA03;
	public ModelRenderer rLegA04;
	public ModelRenderer rLegA05;
	public ModelRenderer rLegB01;
	public ModelRenderer rLegB02;
	public ModelRenderer rLegB03;
	public ModelRenderer rLegB04;
	public ModelRenderer rLegB05;
	public ModelRenderer rLegC01;
	public ModelRenderer rLegC02;
	public ModelRenderer rLegC03;
	public ModelRenderer rLegC04;
	public ModelRenderer rLegC05;
	public ModelRenderer rMandible01;
	public ModelRenderer rMandible02;
	public ModelRenderer rMandible02_1;
	public ModelRenderer spike1;
	public ModelRenderer spike2;
	public ModelRenderer spike3;
	public ModelRenderer tail01;
	public ModelRenderer tail02;
	public ModelRenderer tail03;
	public ModelRenderer teeth;

	public ModelOverlord() {
		textureWidth = 256;
		textureHeight = 128;
		head = new ModelRenderer(this, 77, 0);
		head.setRotationPoint(0.0F, 0.1F, -8.2F);
		head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
		setRotateAngle(head, 0.6829473363053812F, 0.0F, 0.0F);
		lLegA02 = new ModelRenderer(this, 213, 11);
		lLegA02.setRotationPoint(-0.4F, 4.0F, 0.3F);
		lLegA02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(lLegA02, -0.136659280431156F, 0.0F, -0.8651597102135892F);
		rArmClaw1B = new ModelRenderer(this, 234, 0);
		rArmClaw1B.mirror = true;
		rArmClaw1B.setRotationPoint(-0.8F, 0.4F, 0.0F);
		rArmClaw1B.addBox(1.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rArmClaw1B, 0.0F, 0.0F, -0.18203784098300857F);
		rLegC03 = new ModelRenderer(this, 213, 22);
		rLegC03.mirror = true;
		rLegC03.setRotationPoint(0.0F, 5.2F, 0.0F);
		rLegC03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
		setRotateAngle(rLegC03, 0.091106186954104F, 0.0F, -0.40980330836826856F);
		lLegC02 = new ModelRenderer(this, 213, 11);
		lLegC02.setRotationPoint(-0.4F, 4.0F, 0.3F);
		lLegC02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(lLegC02, -0.136659280431156F, 0.0F, -0.8651597102135892F);
		tail01 = new ModelRenderer(this, 0, 38);
		tail01.setRotationPoint(0.0F, 1.7F, 5.9F);
		tail01.addBox(-8.0F, -8.0F, -3.7F, 16, 12, 11, 0.0F);
		setRotateAngle(tail01, -0.7740535232594852F, 0.0F, 0.0F);
		lMandible02 = new ModelRenderer(this, 78, 29);
		lMandible02.setRotationPoint(-0.1F, 0.0F, -2.7F);
		lMandible02.addBox(-1.0F, -1.0F, -2.5F, 2, 2, 3, 0.0F);
		setRotateAngle(lMandible02, 0.0F, -0.18203784098300857F, 0.0F);
		lAirSac01 = new ModelRenderer(this, 118, 0);
		lAirSac01.setRotationPoint(-6.9F, 0.0F, 0.0F);
		lAirSac01.addBox(-2.0F, -7.0F, -8.0F, 4, 14, 18, 0.0F);
		setRotateAngle(lAirSac01, -0.091106186954104F, 0.0F, 0.0F);
		rArmClaw4C = new ModelRenderer(this, 233, 0);
		rArmClaw4C.mirror = true;
		rArmClaw4C.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw4C.addBox(-2.0F, 0.0F, -0.7F, 2, 1, 1, 0.0F);
		rArmB1 = new ModelRenderer(this, 64, 59);
		rArmB1.mirror = true;
		rArmB1.setRotationPoint(2.0F, 9.3F, -8.9F);
		rArmB1.addBox(-1.5F, -0.9F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(rArmB1, -0.9560913642424937F, 0.0F, 0.0F);
		rHeadAntenna2 = new ModelRenderer(this, 98, 26);
		rHeadAntenna2.setRotationPoint(2.1F, -3.6F, -4.9F);
		rHeadAntenna2.addBox(-0.5F, -7.0F, 0.0F, 1, 7, 0, 0.0F);
		setRotateAngle(rHeadAntenna2, 0.136659280431156F, 0.0F, 0.091106186954104F);
		lAirSacSpikeD1 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeD1.setRotationPoint(-0.5F, -5.9F, 5.5F);
		lAirSacSpikeD1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(lAirSacSpikeD1, -0.40980330836826856F, 0.0F, 0.0F);
		rLegB03 = new ModelRenderer(this, 213, 22);
		rLegB03.mirror = true;
		rLegB03.setRotationPoint(0.0F, 5.2F, 0.0F);
		rLegB03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
		setRotateAngle(rLegB03, -0.045553093477052F, 0.0F, -0.40980330836826856F);
		rLegC02 = new ModelRenderer(this, 213, 11);
		rLegC02.mirror = true;
		rLegC02.setRotationPoint(-0.4F, 4.0F, 0.3F);
		rLegC02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(rLegC02, -0.136659280431156F, 0.0F, 0.8651597102135892F);
		lrHeadAntenna1 = new ModelRenderer(this, 98, 26);
		lrHeadAntenna1.setRotationPoint(2.7F, -3.6F, -2.1F);
		lrHeadAntenna1.addBox(-0.5F, -7.0F, 0.0F, 1, 7, 0, 0.0F);
		setRotateAngle(lrHeadAntenna1, -0.22759093446006054F, 0.0F, 0.27314402793711257F);
		rLegA02 = new ModelRenderer(this, 213, 11);
		rLegA02.mirror = true;
		rLegA02.setRotationPoint(-0.4F, 4.0F, 0.3F);
		rLegA02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(rLegA02, -0.136659280431156F, 0.0F, 0.8651597102135892F);
		rArmClaw3C = new ModelRenderer(this, 233, 0);
		rArmClaw3C.mirror = true;
		rArmClaw3C.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3C.addBox(-2.0F, 0.0F, -0.7F, 2, 1, 1, 0.0F);
		lAirSacSpikeC1 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeC1.setRotationPoint(-0.5F, -6.4F, 0.0F);
		lAirSacSpikeC1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(lAirSacSpikeC1, -0.40980330836826856F, 0.0F, 0.0F);
		lArmClaw3E_1 = new ModelRenderer(this, 233, 0);
		lArmClaw3E_1.mirror = true;
		lArmClaw3E_1.setRotationPoint(-1.6F, 0.1F, 0.0F);
		lArmClaw3E_1.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw3E_1, 0.0F, 0.0F, -0.27314402793711257F);
		rAirSac02 = new ModelRenderer(this, 118, 36);
		rAirSac02.mirror = true;
		rAirSac02.setRotationPoint(1.3F, 0.0F, 0.0F);
		rAirSac02.addBox(0.5F, -6.0F, -7.0F, 2, 12, 15, 0.0F);
		lHeadAntenna1 = new ModelRenderer(this, 98, 26);
		lHeadAntenna1.setRotationPoint(-2.7F, -3.6F, -2.1F);
		lHeadAntenna1.addBox(-0.5F, -7.0F, 0.0F, 1, 7, 0, 0.0F);
		setRotateAngle(lHeadAntenna1, -0.22759093446006054F, 0.0F, -0.27314402793711257F);
		lLegB04 = new ModelRenderer(this, 234, 0);
		lLegB04.setRotationPoint(-0.5F, 7.4F, 0.0F);
		lLegB04.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(lLegB04, -0.045553093477052F, 0.0F, -0.31869712141416456F);
		rClawA1 = new ModelRenderer(this, 178, 15);
		rClawA1.setRotationPoint(0.0F, 6.6F, 0.0F);
		rClawA1.addBox(-2.5F, 0.0F, -2.5F, 5, 5, 5, 0.0F);
		setRotateAngle(rClawA1, 0.0F, 0.0F, 0.5462880558742251F);
		lAirSacSpikeE2 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeE2.setRotationPoint(0.0F, -2.3F, -0.1F);
		lAirSacSpikeE2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lAirSacSpikeE2, -0.136659280431156F, 0.0F, 0.0F);
		lArmClaw4C = new ModelRenderer(this, 233, 0);
		lArmClaw4C.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw4C.addBox(0.0F, 0.0F, -0.7F, 2, 1, 1, 0.0F);
		rArmClaw1A = new ModelRenderer(this, 234, 0);
		rArmClaw1A.mirror = true;
		rArmClaw1A.setRotationPoint(2.1F, 1.9F, 0.0F);
		rArmClaw1A.addBox(-0.4F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rArmClaw1A, 0.0F, 0.0F, -0.40980330836826856F);
		rArmClaw4E = new ModelRenderer(this, 233, 0);
		rArmClaw4E.mirror = true;
		rArmClaw4E.setRotationPoint(-1.6F, 0.1F, 0.0F);
		rArmClaw4E.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rArmClaw4E, 0.0F, 0.0F, -0.27314402793711257F);
		lBodyAntenna1 = new ModelRenderer(this, 98, 35);
		lBodyAntenna1.setRotationPoint(-6.3F, -4.8F, 2.3F);
		lBodyAntenna1.addBox(0.0F, -5.3F, -0.5F, 0, 7, 1, 0.0F);
		setRotateAngle(lBodyAntenna1, 0.136659280431156F, 0.0F, -0.8651597102135892F);
		rMandible02_1 = new ModelRenderer(this, 78, 37);
		rMandible02_1.mirror = true;
		rMandible02_1.setRotationPoint(0.0F, 0.0F, -2.7F);
		rMandible02_1.addBox(-0.5F, -0.5F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(rMandible02_1, 0.0F, 0.18203784098300857F, 0.0F);
		lArmClaw2A = new ModelRenderer(this, 234, 0);
		lArmClaw2A.setRotationPoint(-1.9F, 4.4F, 0.0F);
		lArmClaw2A.addBox(-1.6F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmClaw2A, 0.0F, 0.0F, 0.22759093446006054F);
		lAirSacSpikeE1 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeE1.setRotationPoint(-0.5F, -4.6F, 9.1F);
		lAirSacSpikeE1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(lAirSacSpikeE1, -1.0927506446736497F, 0.0F, 0.0F);
		lClawA4 = new ModelRenderer(this, 233, 0);
		lClawA4.setRotationPoint(1.6F, 0.2F, 0.0F);
		lClawA4.addBox(0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lClawA4, 0.0F, 0.0F, -0.22759093446006054F);
		tail02 = new ModelRenderer(this, 0, 64);
		tail02.setRotationPoint(-0.0F, -1.3F, 4.5F);
		tail02.addBox(-7.0F, -6.8F, -1.3F, 14, 10, 8, 0.0F);
		setRotateAngle(tail02, -0.5918411493512771F, 0.0F, 0.0F);
		lAirSac02 = new ModelRenderer(this, 118, 36);
		lAirSac02.setRotationPoint(-1.3F, 0.0F, 0.0F);
		lAirSac02.addBox(-2.5F, -6.0F, -7.0F, 2, 12, 15, 0.0F);
		lArmClaw3A = new ModelRenderer(this, 233, 0);
		lArmClaw3A.setRotationPoint(1.5F, 0.2F, -1.6F);
		lArmClaw3A.addBox(0.0F, -0.7F, -0.7F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw3A, 0.36425021489121656F, 0.0F, 0.22759093446006054F);
		rAirSacSpikeB2 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeB2.mirror = true;
		rAirSacSpikeB2.setRotationPoint(0.0F, -2.3F, -0.1F);
		rAirSacSpikeB2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rAirSacSpikeB2, -0.136659280431156F, 0.0F, 0.0F);
		lLegC05 = new ModelRenderer(this, 234, 0);
		lLegC05.setRotationPoint(-0.2F, 3.3F, 0.0F);
		lLegC05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lLegC05, -0.045553093477052F, 0.0F, -0.31869712141416456F);
		lArmClaw3E = new ModelRenderer(this, 233, 0);
		lArmClaw3E.setRotationPoint(1.6F, 0.1F, 0.0F);
		lArmClaw3E.addBox(-0.3F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw3E, 0.0F, 0.0F, 0.27314402793711257F);
		rArmClaw2A = new ModelRenderer(this, 234, 0);
		rArmClaw2A.mirror = true;
		rArmClaw2A.setRotationPoint(1.9F, 4.4F, 0.0F);
		rArmClaw2A.addBox(-0.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rArmClaw2A, 0.0F, 0.0F, -0.22759093446006054F);
		rLegA04 = new ModelRenderer(this, 234, 0);
		rLegA04.mirror = true;
		rLegA04.setRotationPoint(-0.5F, 7.4F, 0.0F);
		rLegA04.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(rLegA04, -0.045553093477052F, 0.0F, 0.31869712141416456F);
		rArmClaw2B = new ModelRenderer(this, 234, 0);
		rArmClaw2B.mirror = true;
		rArmClaw2B.setRotationPoint(0.8F, 0.1F, 0.0F);
		rArmClaw2B.addBox(0.2F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rArmClaw2B, 0.0F, 0.0F, -0.18203784098300857F);
		rLegC04 = new ModelRenderer(this, 234, 0);
		rLegC04.mirror = true;
		rLegC04.setRotationPoint(-0.5F, 7.4F, 0.0F);
		rLegC04.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(rLegC04, -0.045553093477052F, 0.0F, 0.31869712141416456F);
		rArmClaw4B = new ModelRenderer(this, 233, 0);
		rArmClaw4B.mirror = true;
		rArmClaw4B.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw4B.addBox(-2.0F, -0.7F, -0.3F, 2, 1, 1, 0.0F);
		rAirSacSpikeB1 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeB1.mirror = true;
		rAirSacSpikeB1.setRotationPoint(-0.5F, -6.4F, -6.2F);
		rAirSacSpikeB1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(rAirSacSpikeB1, -0.27314402793711257F, 0.0F, 0.0F);
		rLegA03 = new ModelRenderer(this, 213, 22);
		rLegA03.mirror = true;
		rLegA03.setRotationPoint(0.0F, 5.2F, 0.0F);
		rLegA03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
		setRotateAngle(rLegA03, -0.045553093477052F, 0.5918411493512771F, -0.40980330836826856F);
		spike1 = new ModelRenderer(this, 234, 0);
		spike1.setRotationPoint(-0.5F, -6.7F, 2.6F);
		spike1.addBox(-1.4F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(spike1, -0.5009094953223726F, 0.0F, 0.0F);
		rLegA05 = new ModelRenderer(this, 234, 0);
		rLegA05.mirror = true;
		rLegA05.setRotationPoint(-0.2F, 3.3F, 0.0F);
		rLegA05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rLegA05, -0.045553093477052F, 0.0F, 0.31869712141416456F);
		rLegB05 = new ModelRenderer(this, 234, 0);
		rLegB05.mirror = true;
		rLegB05.setRotationPoint(-0.2F, 3.3F, 0.0F);
		rLegB05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rLegB05, -0.045553093477052F, 0.0F, 0.31869712141416456F);
		lLegC01 = new ModelRenderer(this, 213, 0);
		lLegC01.setRotationPoint(-2.4F, 9.1F, 5.6F);
		lLegC01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(lLegC01, -0.22759093446006054F, 0.22759093446006054F, 0.6829473363053812F);
		body = new ModelRenderer(this, 0, 0);
		body.setRotationPoint(0.0F, -8.0F, -5.5F);
		body.addBox(-5.5F, -6.7F, -9.0F, 11, 17, 18, 0.0F);
		setRotateAngle(body, 0.4553564018453205F, 0.0F, 0.0F);
		rLegC05 = new ModelRenderer(this, 234, 0);
		rLegC05.mirror = true;
		rLegC05.setRotationPoint(-0.2F, 3.3F, 0.0F);
		rLegC05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rLegC05, -0.045553093477052F, 0.0F, 0.31869712141416456F);
		rAirSacSpikeE1 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeE1.mirror = true;
		rAirSacSpikeE1.setRotationPoint(-0.5F, -4.6F, 9.1F);
		rAirSacSpikeE1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(rAirSacSpikeE1, -1.0927506446736497F, 0.0F, 0.0F);
		teeth = new ModelRenderer(this, 76, 42);
		teeth.setRotationPoint(0.0F, -0.6F, -7.8F);
		teeth.addBox(-2.0F, 0.0F, -2.5F, 4, 0, 3, 0.0F);
		setRotateAngle(teeth, 0.4553564018453205F, 0.0F, 0.0F);
		lLegC04 = new ModelRenderer(this, 234, 0);
		lLegC04.setRotationPoint(-0.5F, 7.4F, 0.0F);
		lLegC04.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(lLegC04, -0.045553093477052F, 0.0F, -0.31869712141416456F);
		rBodyAntenna1 = new ModelRenderer(this, 98, 35);
		rBodyAntenna1.setRotationPoint(6.3F, -4.8F, 2.3F);
		rBodyAntenna1.addBox(0.0F, -5.3F, -0.5F, 0, 7, 1, 0.0F);
		setRotateAngle(rBodyAntenna1, 0.136659280431156F, 0.0F, 0.8651597102135892F);
		lArmClaw3D = new ModelRenderer(this, 233, 0);
		lArmClaw3D.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3D.addBox(0.0F, 0.0F, -0.3F, 2, 1, 1, 0.0F);
		lLegB01 = new ModelRenderer(this, 213, 0);
		lLegB01.setRotationPoint(-5.0F, 9.1F, 0.5F);
		lLegB01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(lLegB01, -0.22759093446006054F, 0.0F, 0.6829473363053812F);
		lArmClaw4A = new ModelRenderer(this, 233, 0);
		lArmClaw4A.setRotationPoint(1.5F, 0.2F, 1.7F);
		lArmClaw4A.addBox(0.0F, -0.7F, -0.7F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw4A, -0.36425021489121656F, 0.0F, 0.22759093446006054F);
		lAirSacSpikeD2 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeD2.setRotationPoint(0.0F, -2.3F, -0.1F);
		lAirSacSpikeD2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lAirSacSpikeD2, -0.136659280431156F, 0.0F, 0.0F);
		lArmClaw2B = new ModelRenderer(this, 234, 0);
		lArmClaw2B.setRotationPoint(-0.8F, 0.1F, 0.0F);
		lArmClaw2B.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw2B, 0.0F, 0.0F, 0.18203784098300857F);
		rAirSacSpikeD1 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeD1.mirror = true;
		rAirSacSpikeD1.setRotationPoint(-0.5F, -5.9F, 5.5F);
		rAirSacSpikeD1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(rAirSacSpikeD1, -0.40980330836826856F, 0.0F, 0.0F);
		rAirSacSpikeC2 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeC2.mirror = true;
		rAirSacSpikeC2.setRotationPoint(0.0F, -2.3F, -0.1F);
		rAirSacSpikeC2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rAirSacSpikeC2, -0.136659280431156F, 0.0F, 0.0F);
		lHeadAntenna2 = new ModelRenderer(this, 98, 26);
		lHeadAntenna2.setRotationPoint(-2.1F, -3.6F, -4.9F);
		lHeadAntenna2.addBox(-0.5F, -7.0F, 0.0F, 1, 7, 0, 0.0F);
		setRotateAngle(lHeadAntenna2, 0.136659280431156F, 0.0F, -0.091106186954104F);
		rAirSacSpikeA1 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeA1.mirror = true;
		rAirSacSpikeA1.setRotationPoint(0.5F, -2.5F, -7.5F);
		rAirSacSpikeA1.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		setRotateAngle(rAirSacSpikeA1, -0.5009094953223726F, 0.0F, 0.0F);
		lAirSacAntenna1 = new ModelRenderer(this, 83, 49);
		lAirSacAntenna1.setRotationPoint(-1.9F, 6.6F, 6.1F);
		lAirSacAntenna1.addBox(-7.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F);
		setRotateAngle(lAirSacAntenna1, 0.0F, 0.6373942428283291F, 0.045553093477052F);
		lArmClaw4E = new ModelRenderer(this, 233, 0);
		lArmClaw4E.setRotationPoint(1.6F, 0.1F, 0.0F);
		lArmClaw4E.addBox(-0.3F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw4E, 0.0F, 0.0F, 0.27314402793711257F);
		rArmClaw3D = new ModelRenderer(this, 233, 0);
		rArmClaw3D.mirror = true;
		rArmClaw3D.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3D.addBox(-2.0F, 0.0F, -0.3F, 2, 1, 1, 0.0F);
		lArmClaw4B = new ModelRenderer(this, 233, 0);
		lArmClaw4B.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw4B.addBox(0.0F, -0.7F, -0.3F, 2, 1, 1, 0.0F);
		lLegC03 = new ModelRenderer(this, 213, 22);
		lLegC03.setRotationPoint(0.0F, 5.2F, 0.0F);
		lLegC03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
		setRotateAngle(lLegC03, 0.091106186954104F, 0.0F, 0.40980330836826856F);
		rAirSacAntenna1 = new ModelRenderer(this, 83, 49);
		rAirSacAntenna1.setRotationPoint(1.9F, 6.6F, 6.1F);
		rAirSacAntenna1.addBox(0.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F);
		setRotateAngle(rAirSacAntenna1, 0.0F, -0.6373942428283291F, 0.045553093477052F);
		lClawA5 = new ModelRenderer(this, 233, 0);
		lClawA5.setRotationPoint(1.6F, 0.2F, 0.0F);
		lClawA5.addBox(-0.3F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lClawA5, 0.0F, 0.0F, -0.27314402793711257F);
		rArmClaw4D = new ModelRenderer(this, 233, 0);
		rArmClaw4D.mirror = true;
		rArmClaw4D.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw4D.addBox(-2.0F, 0.0F, -0.3F, 2, 1, 1, 0.0F);
		rArmClaw3B = new ModelRenderer(this, 233, 0);
		rArmClaw3B.mirror = true;
		rArmClaw3B.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3B.addBox(-2.0F, -0.7F, -0.3F, 2, 1, 1, 0.0F);
		rAirSacSpikeC1 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeC1.mirror = true;
		rAirSacSpikeC1.setRotationPoint(-0.5F, -6.4F, 0.0F);
		rAirSacSpikeC1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(rAirSacSpikeC1, -0.40980330836826856F, 0.0F, 0.0F);
		lAirSacSpikeB1 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeB1.setRotationPoint(-0.5F, -6.4F, -6.2F);
		lAirSacSpikeB1.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(lAirSacSpikeB1, -0.27314402793711257F, 0.0F, 0.0F);
		rLegA01 = new ModelRenderer(this, 213, 0);
		rLegA01.mirror = true;
		rLegA01.setRotationPoint(2.8F, 8.8F, -3.7F);
		rLegA01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(rLegA01, -0.22759093446006054F, 0.0F, -0.6829473363053812F);
		lAirSacSpikeA2 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeA2.setRotationPoint(0.0F, 0.0F, -2.4F);
		lAirSacSpikeA2.addBox(-0.5F, -0.5F, -2.3F, 1, 1, 3, 0.0F);
		setRotateAngle(lAirSacSpikeA2, -0.136659280431156F, 0.0F, 0.0F);
		lLegB05 = new ModelRenderer(this, 234, 0);
		lLegB05.setRotationPoint(-0.2F, 3.3F, 0.0F);
		lLegB05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lLegB05, -0.045553093477052F, 0.0F, -0.31869712141416456F);
		rLegB04 = new ModelRenderer(this, 234, 0);
		rLegB04.mirror = true;
		rLegB04.setRotationPoint(-0.5F, 7.4F, 0.0F);
		rLegB04.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(rLegB04, -0.045553093477052F, 0.0F, 0.31869712141416456F);
		lAirSacSpikeC2 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeC2.setRotationPoint(0.0F, -2.3F, -0.1F);
		lAirSacSpikeC2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lAirSacSpikeC2, -0.136659280431156F, 0.0F, 0.0F);
		rLegC01 = new ModelRenderer(this, 213, 0);
		rLegC01.mirror = true;
		rLegC01.setRotationPoint(2.4F, 9.1F, 5.6F);
		rLegC01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(rLegC01, -0.22759093446006054F, -0.22759093446006054F, -0.6829473363053812F);
		spike2 = new ModelRenderer(this, 234, 0);
		spike2.setRotationPoint(0.0F, -2.3F, -0.1F);
		spike2.addBox(-1.0F, -2.3F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(spike2, -0.136659280431156F, 0.0F, 0.0F);
		lLegA04 = new ModelRenderer(this, 234, 0);
		lLegA04.setRotationPoint(-0.5F, 7.4F, 0.0F);
		lLegA04.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(lLegA04, -0.045553093477052F, 0.0F, -0.31869712141416456F);
		lMandible01 = new ModelRenderer(this, 78, 20);
		lMandible01.setRotationPoint(-2.8F, 0.4F, -7.3F);
		lMandible01.addBox(-1.5F, -1.4F, -3.1F, 3, 3, 3, 0.0F);
		setRotateAngle(lMandible01, 0.22759093446006054F, 0.18203784098300857F, 0.0F);
		lClawA1 = new ModelRenderer(this, 178, 15);
		lClawA1.setRotationPoint(0.0F, 6.6F, 0.0F);
		lClawA1.addBox(-2.5F, 0.0F, -2.5F, 5, 5, 5, 0.0F);
		setRotateAngle(lClawA1, 0.0F, 0.0F, -0.5462880558742251F);
		rArmB2 = new ModelRenderer(this, 64, 72);
		rArmB2.mirror = true;
		rArmB2.setRotationPoint(0.0F, 4.8F, 0.0F);
		rArmB2.addBox(-1.0F, -1.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(rArmB2, 0.31869712141416456F, 0.0F, 0.0F);
		rArmB3 = new ModelRenderer(this, 64, 72);
		rArmB3.mirror = true;
		rArmB3.setRotationPoint(0.0F, 2.7F, 0.0F);
		rArmB3.addBox(-0.5F, -0.2F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rArmB3, 0.31869712141416456F, 0.0F, 0.0F);
		lBodyAntenna2 = new ModelRenderer(this, 98, 35);
		lBodyAntenna2.setRotationPoint(-6.3F, -2.7F, 3.1F);
		lBodyAntenna2.addBox(0.0F, -7.0F, -0.5F, 0, 7, 1, 0.0F);
		setRotateAngle(lBodyAntenna2, 0.136659280431156F, 0.0F, -0.8651597102135892F);
		lArmClaw1B = new ModelRenderer(this, 234, 0);
		lArmClaw1B.setRotationPoint(-0.8F, 0.1F, 0.0F);
		lArmClaw1B.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lArmClaw1B, 0.0F, 0.0F, 0.18203784098300857F);
		rLegB02 = new ModelRenderer(this, 213, 11);
		rLegB02.mirror = true;
		rLegB02.setRotationPoint(-0.4F, 4.0F, 0.3F);
		rLegB02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(rLegB02, -0.136659280431156F, 0.0F, 0.8651597102135892F);
		rClawA4 = new ModelRenderer(this, 233, 0);
		rClawA4.setRotationPoint(-1.6F, 0.2F, 0.0F);
		rClawA4.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rClawA4, 0.0F, 0.0F, 0.22759093446006054F);
		lArmB2 = new ModelRenderer(this, 64, 72);
		lArmB2.setRotationPoint(0.0F, 4.8F, 0.0F);
		lArmB2.addBox(-1.0F, -1.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(lArmB2, 0.31869712141416456F, 0.0F, 0.0F);
		lAirSacAntenna2 = new ModelRenderer(this, 83, 49);
		lAirSacAntenna2.setRotationPoint(-1.3F, 5.3F, 7.8F);
		lAirSacAntenna2.addBox(-7.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F);
		setRotateAngle(lAirSacAntenna2, 0.0F, 0.8196066167365371F, 0.045553093477052F);
		lLegA05 = new ModelRenderer(this, 234, 0);
		lLegA05.setRotationPoint(-0.2F, 3.3F, 0.0F);
		lLegA05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lLegA05, -0.045553093477052F, 0.0F, -0.31869712141416456F);
		lLegA01 = new ModelRenderer(this, 213, 0);
		lLegA01.setRotationPoint(-2.8F, 8.8F, -3.7F);
		lLegA01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(lLegA01, -0.22759093446006054F, 0.0F, 0.6829473363053812F);
		rClawA3 = new ModelRenderer(this, 233, 0);
		rClawA3.mirror = true;
		rClawA3.setRotationPoint(-0.7F, 2.5F, 0.0F);
		rClawA3.addBox(-2.2F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
		setRotateAngle(rClawA3, 0.0F, 0.0F, -0.8651597102135892F);
		rAirSac01 = new ModelRenderer(this, 118, 0);
		rAirSac01.mirror = true;
		rAirSac01.setRotationPoint(6.9F, 0.0F, 0.0F);
		rAirSac01.addBox(-2.0F, -7.0F, -8.0F, 4, 14, 18, 0.0F);
		setRotateAngle(rAirSac01, -0.091106186954104F, 0.0F, 0.0F);
		rBodyAntenna2 = new ModelRenderer(this, 98, 35);
		rBodyAntenna2.setRotationPoint(6.3F, -2.7F, 3.1F);
		rBodyAntenna2.addBox(0.0F, -7.0F, -0.5F, 0, 7, 1, 0.0F);
		setRotateAngle(rBodyAntenna2, 0.136659280431156F, 0.0F, 0.8651597102135892F);
		rAirSacSpikeE2 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeE2.mirror = true;
		rAirSacSpikeE2.setRotationPoint(0.0F, -2.3F, -0.1F);
		rAirSacSpikeE2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rAirSacSpikeE2, -0.136659280431156F, 0.0F, 0.0F);
		lClawA2 = new ModelRenderer(this, 180, 28);
		lClawA2.setRotationPoint(0.3F, 4.8F, 0.0F);
		lClawA2.addBox(-2.3F, -0.5F, -2.0F, 4, 4, 4, 0.0F);
		setRotateAngle(lClawA2, 0.0F, 0.0F, -0.22759093446006054F);
		rMandible01 = new ModelRenderer(this, 78, 20);
		rMandible01.mirror = true;
		rMandible01.setRotationPoint(2.8F, 0.4F, -7.3F);
		rMandible01.addBox(-1.5F, -1.4F, -3.1F, 3, 3, 3, 0.0F);
		setRotateAngle(rMandible01, 0.22759093446006054F, -0.18203784098300857F, 0.0F);
		rAirSacAntenna2 = new ModelRenderer(this, 83, 49);
		rAirSacAntenna2.setRotationPoint(1.3F, 5.3F, 7.8F);
		rAirSacAntenna2.addBox(0.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F);
		setRotateAngle(rAirSacAntenna2, 0.0F, -0.8196066167365371F, 0.045553093477052F);
		lClawA3 = new ModelRenderer(this, 233, 0);
		lClawA3.setRotationPoint(0.2F, 2.5F, 0.0F);
		lClawA3.addBox(0.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
		setRotateAngle(lClawA3, 0.0F, 0.0F, 0.8651597102135892F);
		lArmB1 = new ModelRenderer(this, 64, 59);
		lArmB1.setRotationPoint(-2.0F, 9.3F, -8.9F);
		lArmB1.addBox(-1.5F, -0.9F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(lArmB1, -0.9560913642424937F, 0.0F, 0.0F);
		rArmA1 = new ModelRenderer(this, 182, 0);
		rArmA1.mirror = true;
		rArmA1.setRotationPoint(4.9F, 9.2F, -8.0F);
		rArmA1.addBox(-1.5F, -0.1F, -1.5F, 3, 8, 3, 0.0F);
		setRotateAngle(rArmA1, -0.4553564018453205F, 0.045553093477052F, -0.5462880558742251F);
		spike3 = new ModelRenderer(this, 234, 0);
		spike3.setRotationPoint(0.0F, -1.8F, -0.1F);
		spike3.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(spike3, -0.136659280431156F, 0.0F, 0.0F);
		lArmClaw3B = new ModelRenderer(this, 233, 0);
		lArmClaw3B.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3B.addBox(0.0F, -0.7F, -0.3F, 2, 1, 1, 0.0F);
		lMandible02_1 = new ModelRenderer(this, 78, 37);
		lMandible02_1.setRotationPoint(0.0F, 0.0F, -2.7F);
		lMandible02_1.addBox(-0.5F, -0.5F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(lMandible02_1, 0.0F, -0.18203784098300857F, 0.0F);
		lArmClaw4D = new ModelRenderer(this, 233, 0);
		lArmClaw4D.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw4D.addBox(0.0F, 0.0F, -0.3F, 2, 1, 1, 0.0F);
		rLegB01 = new ModelRenderer(this, 213, 0);
		rLegB01.mirror = true;
		rLegB01.setRotationPoint(5.0F, 9.1F, 0.5F);
		rLegB01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		setRotateAngle(rLegB01, -0.22759093446006054F, 0.0F, -0.6829473363053812F);
		lArmClaw1A = new ModelRenderer(this, 234, 0);
		lArmClaw1A.setRotationPoint(-2.1F, 1.9F, 0.0F);
		lArmClaw1A.addBox(-1.6F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmClaw1A, 0.0F, 0.0F, 0.40980330836826856F);
		lAirSacSpikeB2 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeB2.setRotationPoint(0.0F, -2.3F, -0.1F);
		lAirSacSpikeB2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lAirSacSpikeB2, -0.136659280431156F, 0.0F, 0.0F);
		rClawA5 = new ModelRenderer(this, 233, 0);
		rClawA5.mirror = true;
		rClawA5.setRotationPoint(-1.6F, 0.2F, 0.0F);
		rClawA5.addBox(-1.7F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rClawA5, 0.0F, 0.0F, 0.27314402793711257F);
		lArmB3 = new ModelRenderer(this, 64, 72);
		lArmB3.setRotationPoint(0.0F, 2.7F, 0.0F);
		lArmB3.addBox(-0.5F, -0.2F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lArmB3, 0.31869712141416456F, 0.0F, 0.0F);
		lLegA03 = new ModelRenderer(this, 213, 22);
		lLegA03.setRotationPoint(0.0F, 5.2F, 0.0F);
		lLegA03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
		setRotateAngle(lLegA03, -0.045553093477052F, -0.5918411493512771F, 0.40980330836826856F);
		lArmClaw3C = new ModelRenderer(this, 233, 0);
		lArmClaw3C.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3C.addBox(0.0F, 0.0F, -0.7F, 2, 1, 1, 0.0F);
		rArmClaw4A = new ModelRenderer(this, 233, 0);
		rArmClaw4A.mirror = true;
		rArmClaw4A.setRotationPoint(-1.5F, 0.2F, 1.7F);
		rArmClaw4A.addBox(-2.0F, -0.7F, -0.7F, 2, 1, 1, 0.0F);
		setRotateAngle(rArmClaw4A, -0.36425021489121656F, 0.0F, -0.22759093446006054F);
		lArmA1 = new ModelRenderer(this, 182, 0);
		lArmA1.setRotationPoint(-4.9F, 9.2F, -8.0F);
		lArmA1.addBox(-1.5F, -0.1F, -1.5F, 3, 8, 3, 0.0F);
		setRotateAngle(lArmA1, -0.4553564018453205F, -0.045553093477052F, 0.5462880558742251F);
		lLegB02 = new ModelRenderer(this, 213, 11);
		lLegB02.setRotationPoint(-0.4F, 4.0F, 0.3F);
		lLegB02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(lLegB02, -0.136659280431156F, 0.0F, -0.8651597102135892F);
		rArmClaw3A = new ModelRenderer(this, 233, 0);
		rArmClaw3A.mirror = true;
		rArmClaw3A.setRotationPoint(-1.5F, 0.2F, -1.6F);
		rArmClaw3A.addBox(-2.0F, -0.7F, -0.7F, 2, 1, 1, 0.0F);
		setRotateAngle(rArmClaw3A, 0.36425021489121656F, 0.0F, -0.22759093446006054F);
		rMandible02 = new ModelRenderer(this, 78, 29);
		rMandible02.mirror = true;
		rMandible02.setRotationPoint(-0.1F, 0.0F, -2.7F);
		rMandible02.addBox(-1.0F, -1.0F, -2.5F, 2, 2, 3, 0.0F);
		setRotateAngle(rMandible02, 0.0F, 0.18203784098300857F, 0.0F);
		rClawA2 = new ModelRenderer(this, 180, 28);
		rClawA2.setRotationPoint(0.3F, 4.8F, 0.0F);
		rClawA2.addBox(-2.3F, -0.5F, -2.0F, 4, 4, 4, 0.0F);
		setRotateAngle(rClawA2, 0.0F, 0.0F, 0.22759093446006054F);
		rAirSacSpikeA2 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeA2.mirror = true;
		rAirSacSpikeA2.setRotationPoint(0.0F, 0.0F, -2.4F);
		rAirSacSpikeA2.addBox(-0.5F, -0.5F, -2.3F, 1, 1, 3, 0.0F);
		setRotateAngle(rAirSacSpikeA2, -0.136659280431156F, 0.0F, 0.0F);
		lLegB03 = new ModelRenderer(this, 213, 22);
		lLegB03.setRotationPoint(0.0F, 5.2F, 0.0F);
		lLegB03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
		setRotateAngle(lLegB03, -0.045553093477052F, 0.0F, 0.40980330836826856F);
		lAirSacSpikeA1 = new ModelRenderer(this, 234, 0);
		lAirSacSpikeA1.setRotationPoint(-0.5F, -2.5F, -7.5F);
		lAirSacSpikeA1.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		setRotateAngle(lAirSacSpikeA1, -0.5009094953223726F, 0.0F, 0.0F);
		tail03 = new ModelRenderer(this, 0, 88);
		tail03.setRotationPoint(0.0F, -1.7F, 6.5F);
		tail03.addBox(-6.0F, -4.0F, -1.3F, 12, 8, 5, 0.0F);
		setRotateAngle(tail03, -0.36425021489121656F, 0.0F, 0.0F);
		rAirSacSpikeD2 = new ModelRenderer(this, 234, 0);
		rAirSacSpikeD2.mirror = true;
		rAirSacSpikeD2.setRotationPoint(0.0F, -2.3F, -0.1F);
		rAirSacSpikeD2.addBox(-0.5F, -2.3F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rAirSacSpikeD2, -0.136659280431156F, 0.0F, 0.0F);
		body.addChild(head);
		lLegA01.addChild(lLegA02);
		rArmClaw1A.addChild(rArmClaw1B);
		rLegC02.addChild(rLegC03);
		lLegC01.addChild(lLegC02);
		body.addChild(tail01);
		lMandible01.addChild(lMandible02);
		body.addChild(lAirSac01);
		rArmClaw4A.addChild(rArmClaw4C);
		body.addChild(rArmB1);
		head.addChild(rHeadAntenna2);
		lAirSac01.addChild(lAirSacSpikeD1);
		rLegB02.addChild(rLegB03);
		rLegC01.addChild(rLegC02);
		head.addChild(lrHeadAntenna1);
		rLegA01.addChild(rLegA02);
		rArmClaw3A.addChild(rArmClaw3C);
		lAirSac01.addChild(lAirSacSpikeC1);
		rArmClaw3A.addChild(lArmClaw3E_1);
		rAirSac01.addChild(rAirSac02);
		head.addChild(lHeadAntenna1);
		lLegB03.addChild(lLegB04);
		rArmA1.addChild(rClawA1);
		lAirSacSpikeE1.addChild(lAirSacSpikeE2);
		lArmClaw4A.addChild(lArmClaw4C);
		rClawA1.addChild(rArmClaw1A);
		rArmClaw4A.addChild(rArmClaw4E);
		tail02.addChild(lBodyAntenna1);
		rMandible02.addChild(rMandible02_1);
		lClawA1.addChild(lArmClaw2A);
		lAirSac01.addChild(lAirSacSpikeE1);
		lClawA3.addChild(lClawA4);
		tail01.addChild(tail02);
		lAirSac01.addChild(lAirSac02);
		lClawA2.addChild(lArmClaw3A);
		rAirSacSpikeB1.addChild(rAirSacSpikeB2);
		lLegC04.addChild(lLegC05);
		lArmClaw3A.addChild(lArmClaw3E);
		rClawA1.addChild(rArmClaw2A);
		rLegA03.addChild(rLegA04);
		rArmClaw2A.addChild(rArmClaw2B);
		rLegC03.addChild(rLegC04);
		rArmClaw4A.addChild(rArmClaw4B);
		rAirSac01.addChild(rAirSacSpikeB1);
		rLegA02.addChild(rLegA03);
		tail01.addChild(spike1);
		rLegA04.addChild(rLegA05);
		rLegB04.addChild(rLegB05);
		body.addChild(lLegC01);
		rLegC04.addChild(rLegC05);
		rAirSac01.addChild(rAirSacSpikeE1);
		head.addChild(teeth);
		lLegC03.addChild(lLegC04);
		tail02.addChild(rBodyAntenna1);
		lArmClaw3A.addChild(lArmClaw3D);
		body.addChild(lLegB01);
		lClawA2.addChild(lArmClaw4A);
		lAirSacSpikeD1.addChild(lAirSacSpikeD2);
		lArmClaw2A.addChild(lArmClaw2B);
		rAirSac01.addChild(rAirSacSpikeD1);
		rAirSacSpikeC1.addChild(rAirSacSpikeC2);
		head.addChild(lHeadAntenna2);
		rAirSac01.addChild(rAirSacSpikeA1);
		lAirSac01.addChild(lAirSacAntenna1);
		lArmClaw4A.addChild(lArmClaw4E);
		rArmClaw3A.addChild(rArmClaw3D);
		lArmClaw4A.addChild(lArmClaw4B);
		lLegC02.addChild(lLegC03);
		rAirSac01.addChild(rAirSacAntenna1);
		lClawA4.addChild(lClawA5);
		rArmClaw4A.addChild(rArmClaw4D);
		rArmClaw3A.addChild(rArmClaw3B);
		rAirSac01.addChild(rAirSacSpikeC1);
		lAirSac01.addChild(lAirSacSpikeB1);
		body.addChild(rLegA01);
		lAirSacSpikeA1.addChild(lAirSacSpikeA2);
		lLegB04.addChild(lLegB05);
		rLegB03.addChild(rLegB04);
		lAirSacSpikeC1.addChild(lAirSacSpikeC2);
		body.addChild(rLegC01);
		spike1.addChild(spike2);
		lLegA03.addChild(lLegA04);
		head.addChild(lMandible01);
		lArmA1.addChild(lClawA1);
		rArmB1.addChild(rArmB2);
		rArmB2.addChild(rArmB3);
		tail02.addChild(lBodyAntenna2);
		lArmClaw1A.addChild(lArmClaw1B);
		rLegB01.addChild(rLegB02);
		rClawA3.addChild(rClawA4);
		lArmB1.addChild(lArmB2);
		lAirSac01.addChild(lAirSacAntenna2);
		lLegA04.addChild(lLegA05);
		body.addChild(lLegA01);
		rClawA2.addChild(rClawA3);
		body.addChild(rAirSac01);
		tail02.addChild(rBodyAntenna2);
		rAirSacSpikeE1.addChild(rAirSacSpikeE2);
		lClawA1.addChild(lClawA2);
		head.addChild(rMandible01);
		rAirSac01.addChild(rAirSacAntenna2);
		lClawA2.addChild(lClawA3);
		body.addChild(lArmB1);
		body.addChild(rArmA1);
		spike2.addChild(spike3);
		lArmClaw3A.addChild(lArmClaw3B);
		lMandible02.addChild(lMandible02_1);
		lArmClaw4A.addChild(lArmClaw4D);
		body.addChild(rLegB01);
		lClawA1.addChild(lArmClaw1A);
		lAirSacSpikeB1.addChild(lAirSacSpikeB2);
		rClawA4.addChild(rClawA5);
		lArmB2.addChild(lArmB3);
		lLegA02.addChild(lLegA03);
		lArmClaw3A.addChild(lArmClaw3C);
		rClawA2.addChild(rArmClaw4A);
		body.addChild(lArmA1);
		lLegB01.addChild(lLegB02);
		rClawA2.addChild(rArmClaw3A);
		rMandible01.addChild(rMandible02);
		rClawA1.addChild(rClawA2);
		rAirSacSpikeA1.addChild(rAirSacSpikeA2);
		lLegB02.addChild(lLegB03);
		lAirSac01.addChild(lAirSacSpikeA1);
		tail02.addChild(tail03);
		rAirSacSpikeD1.addChild(rAirSacSpikeD2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
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