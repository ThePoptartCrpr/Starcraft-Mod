package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * darktemplar - TechneToTabulaImporter Created using Tabula 5.1.0
 */
public class ModelDarkTemplar extends ModelBase {

	public ModelRenderer chestUpper;
	public ModelRenderer neck;
	public ModelRenderer abdomen;
	public ModelRenderer shoulders;
	public ModelRenderer cape;
	public ModelRenderer waist;
	public ModelRenderer waistPlate1;
	public ModelRenderer loincloth;
	public ModelRenderer loinclothBack;
	public ModelRenderer legLeft1;
	public ModelRenderer legRight1;
	public ModelRenderer legLeft2;
	public ModelRenderer legLeft3;
	public ModelRenderer legLeft4;
	public ModelRenderer legLeft5;
	public ModelRenderer footLeft;
	public ModelRenderer footLeftUpper;
	public ModelRenderer toeLeftLeft;
	public ModelRenderer toeLeftRight;
	public ModelRenderer legRight2;
	public ModelRenderer legRight3;
	public ModelRenderer legRight4;
	public ModelRenderer legRight5;
	public ModelRenderer footRight;
	public ModelRenderer footRightUpper;
	public ModelRenderer toeRightRight;
	public ModelRenderer toeRightLeft;
	public ModelRenderer shoulderGuardLeft1;
	public ModelRenderer shoulderGuardRight1;
	public ModelRenderer armLeft1;
	public ModelRenderer armRight1;
	public ModelRenderer shoulderGuardLeft2;
	public ModelRenderer shoulderGuardRight2;
	public ModelRenderer lForearm;
	public ModelRenderer lFist;
	public ModelRenderer armLeft2;
	public ModelRenderer bladeLeft1;
	public ModelRenderer bladeLeft2;
	public ModelRenderer bladeLeft3;
	public ModelRenderer rForearm;
	public ModelRenderer rFist;
	public ModelRenderer cape2;
	public ModelRenderer cape3;
	public ModelRenderer head;
	public ModelRenderer headBack;
	public ModelRenderer headBack2;
	public ModelRenderer eyes;
	public ModelRenderer lSkullSlant;
	public ModelRenderer rSkullSlant;
	public ModelRenderer lSkullSlant2;
	public ModelRenderer rSkullSlant2;
	public ModelRenderer faceMask1;
	public ModelRenderer nerveCord1;
	public ModelRenderer faceMask2;
	public ModelRenderer khalaBand;
	public ModelRenderer shape55;
	public ModelRenderer khalaStrand1;
	public ModelRenderer khalaStrand2;
	public ModelRenderer khalaStrand3;
	public ModelRenderer khalaStrand4;
	public ModelRenderer khalaStrand10;
	public ModelRenderer khalaStrand6;
	public ModelRenderer khalaStrand7;
	public ModelRenderer khalaStrand8;
	public ModelRenderer khalaStrand9;
	public ModelRenderer khalaStrand5;

	public ModelDarkTemplar() {
		textureWidth = 256;
		textureHeight = 128;
		loinclothBack = new ModelRenderer(this, 225, 0);
		loinclothBack.mirror = true;
		loinclothBack.setRotationPoint(0.0F, 19.3F, 4.11F);
		loinclothBack.addBox(-5.0F, 0.0F, -0.1F, 10, 11, 0, 0.0F);
		legLeft3 = new ModelRenderer(this, 92, 36);
		legLeft3.mirror = true;
		legLeft3.setRotationPoint(0.7F, 0.2F, 1.0F);
		legLeft3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
		setRotateAngle(legLeft3, -0.18203784098300857F, 0.0F, 0.0F);
		legRight2 = new ModelRenderer(this, 92, 23);
		legRight2.setRotationPoint(0.0F, 14.7F, 0.0F);
		legRight2.addBox(-3.5F, -3.0F, -3.2F, 7, 6, 6, 0.0F);
		setRotateAngle(legRight2, 0.5235987755982988F, -0.136659280431156F, -0.045553093477052F);
		legRight4 = new ModelRenderer(this, 92, 53);
		legRight4.setRotationPoint(0.0F, -0.9F, 7.0F);
		legRight4.addBox(-2.0F, -2.2F, 1.9F, 4, 4, 3, 0.0F);
		setRotateAngle(legRight4, -0.27314402793711257F, 0.0F, 0.0F);
		eyes = new ModelRenderer(this, 192, 0);
		eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyes.addBox(-2.5F, 0.1F, -1.9F, 5, 2, 2, 0.0F);
		setRotateAngle(eyes, -1.2747884856566583F, 0.0F, 0.0F);
		faceMask1 = new ModelRenderer(this, 161, 52);
		faceMask1.setRotationPoint(0.0F, 0.8F, -0.92F);
		faceMask1.addBox(-3.5F, -0.1F, -1.5F, 7, 6, 2, 0.0F);
		setRotateAngle(faceMask1, 0.045553093477052F, 0.0F, 0.0F);
		armRight1 = new ModelRenderer(this, 126, 1);
		armRight1.setRotationPoint(-7.0F, 0.6F, 4.0F);
		armRight1.addBox(-4.0F, 0.0F, -3.0F, 5, 13, 5, 0.0F);
		setRotateAngle(armRight1, 0.36425021489121656F, -0.0F, 0.27314402793711257F);
		rForearm = new ModelRenderer(this, 129, 90);
		rForearm.setRotationPoint(-1.5F, 11.3F, 0.0F);
		rForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
		setRotateAngle(rForearm, 0.7740535232594852F, 0.0F, 0.0F);
		loincloth = new ModelRenderer(this, 225, 0);
		loincloth.setRotationPoint(0.0F, 19.3F, -3.91F);
		loincloth.addBox(-5.0F, 0.0F, -0.1F, 10, 11, 0, 0.0F);
		bladeLeft2 = new ModelRenderer(this, 126, 53);
		bladeLeft2.mirror = true;
		bladeLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bladeLeft2.addBox(1.2F, -3.0F, -4.6F, 1, 6, 6, 0.0F);
		khalaStrand6 = new ModelRenderer(this, 161, 37);
		khalaStrand6.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand6.addBox(0.0F, 0.0F, 16.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand6, 0.36128315516282616F, 0.0F, 0.0F);
		waist = new ModelRenderer(this, 0, 73);
		waist.setRotationPoint(0.0F, 0.0F, 0.0F);
		waist.addBox(-6.0F, 17.5F, -4.0F, 12, 5, 8, 0.0F);
		armLeft1 = new ModelRenderer(this, 126, 0);
		armLeft1.mirror = true;
		armLeft1.setRotationPoint(8.0F, 0.0F, 4.0F);
		armLeft1.addBox(-2.0F, 0.0F, -2.0F, 5, 13, 5, 0.0F);
		setRotateAngle(armLeft1, 0.18203784098300857F, -0.0F, -0.40980330836826856F);
		khalaStrand2 = new ModelRenderer(this, 161, 37);
		khalaStrand2.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand2.addBox(0.0F, 0.0F, 16.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand2, 0.36425021489121656F, 0.0F, 0.18203784098300857F);
		lFist = new ModelRenderer(this, 134, 110);
		lFist.mirror = true;
		lFist.setRotationPoint(0.0F, 0.0F, -12.0F);
		lFist.addBox(-3.1F, -2.5F, -4.1F, 5, 5, 5, 0.0F);
		setRotateAngle(lFist, 0.0F, 0.40980330836826856F, 0.0F);
		bladeLeft3 = new ModelRenderer(this, 126, 72);
		bladeLeft3.mirror = true;
		bladeLeft3.setRotationPoint(0.9F, 0.0F, -3.4F);
		bladeLeft3.addBox(-0.8F, -1.5F, -13.4F, 1, 3, 14, 0.0F);
		footRightUpper = new ModelRenderer(this, 92, 99);
		footRightUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		footRightUpper.addBox(-2.0F, -3.0F, -4.9F, 4, 2, 4, 0.0F);
		setRotateAngle(footRightUpper, 0.40980330836826856F, 0.0F, 0.0F);
		khalaStrand5 = new ModelRenderer(this, 161, 37);
		khalaStrand5.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand5.addBox(3.3F, 0.4F, 15.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand5, 0.27314402793711257F, -0.22759093446006054F, -0.22759093446006054F);
		shoulderGuardRight1 = new ModelRenderer(this, 161, 73);
		shoulderGuardRight1.setRotationPoint(-11.8F, -1.8F, 5.0F);
		shoulderGuardRight1.addBox(0.0F, -5.5F, -5.0F, 2, 11, 10, 0.0F);
		setRotateAngle(shoulderGuardRight1, 0.0F, 0.0F, 0.7285004297824331F);
		neck = new ModelRenderer(this, 189, 21);
		neck.setRotationPoint(0.0F, -26.4F, 3.2F);
		neck.addBox(-2.5F, -3.2F, -1.4F, 5, 5, 4, 0.0F);
		setRotateAngle(neck, 0.6829473363053812F, 0.0F, 0.0F);
		faceMask2 = new ModelRenderer(this, 161, 62);
		faceMask2.setRotationPoint(0.0F, 5.6F, 0.0F);
		faceMask2.addBox(-2.5F, 0.0F, -1.2F, 5, 7, 1, 0.0F);
		setRotateAngle(faceMask2, 0.091106186954104F, 0.0F, 0.0F);
		shape55 = new ModelRenderer(this, 0, 0);
		shape55.setRotationPoint(-0.5F, 0.3F, -10.6F);
		shape55.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
		setRotateAngle(shape55, -0.22759093446006054F, 0.0F, 0.0F);
		khalaStrand1 = new ModelRenderer(this, 161, 37);
		khalaStrand1.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand1.addBox(1.6F, -3.3F, 15.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand1, 0.136659280431156F, -0.20123646275494617F, 0.0F);
		lSkullSlant = new ModelRenderer(this, 191, 6);
		lSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSkullSlant.addBox(1.5F, -0.5F, -0.5F, 2, 4, 1, 0.0F);
		setRotateAngle(lSkullSlant, -0.36425021489121656F, 0.0F, 0.40980330836826856F);
		khalaStrand9 = new ModelRenderer(this, 161, 37);
		khalaStrand9.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand9.addBox(0.0F, -7.0F, 15.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand9, -0.18203784098300857F, 0.0F, 0.0F);
		shoulderGuardLeft2 = new ModelRenderer(this, 161, 102);
		shoulderGuardLeft2.mirror = true;
		shoulderGuardLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulderGuardLeft2.addBox(-0.4F, -5.0F, -3.0F, 1, 10, 6, 0.0F);
		headBack = new ModelRenderer(this, 166, 18);
		headBack.setRotationPoint(0.0F, -1.8F, -2.1F);
		headBack.addBox(-2.5F, -5.4F, -0.05F, 5, 6, 2, 0.0F);
		setRotateAngle(headBack, -0.6829473363053812F, 0.0F, 0.0F);
		cape = new ModelRenderer(this, 197, 44);
		cape.mirror = true;
		cape.setRotationPoint(0.0F, -1.9F, 8.5F);
		cape.addBox(-14.0F, 0.0F, 0.0F, 28, 13, 0, 0.0F);
		setRotateAngle(cape, 0.18203784098300857F, 0.0F, 0.0F);
		lSkullSlant2 = new ModelRenderer(this, 200, 5);
		lSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSkullSlant2.addBox(1.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
		setRotateAngle(lSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
		khalaBand = new ModelRenderer(this, 159, 44);
		khalaBand.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaBand.addBox(-2.5F, -3.0F, 4.8F, 5, 5, 1, 0.0F);
		legLeft5 = new ModelRenderer(this, 92, 65);
		legLeft5.mirror = true;
		legLeft5.setRotationPoint(0.0F, 0.6F, 2.8F);
		legLeft5.addBox(-2.02F, 0.0F, -2.5F, 4, 14, 5, 0.0F);
		setRotateAngle(legLeft5, -0.136659280431156F, -0.091106186954104F, 0.0F);
		legRight1 = new ModelRenderer(this, 92, 0);
		legRight1.setRotationPoint(-6.0F, 21.0F, 0.0F);
		legRight1.addBox(-2.5F, -2.0F, -3.0F, 5, 15, 6, 0.0F);
		setRotateAngle(legRight1, -0.4553564018453205F, 0.136659280431156F, 0.0F);
		shoulderGuardRight2 = new ModelRenderer(this, 161, 102);
		shoulderGuardRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulderGuardRight2.addBox(-0.6F, -5.0F, -3.0F, 1, 10, 6, 0.0F);
		footRight = new ModelRenderer(this, 92, 86);
		footRight.setRotationPoint(0.0F, 12.1F, 0.2F);
		footRight.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
		setRotateAngle(footRight, 0.5009094953223726F, 0.091106186954104F, 0.091106186954104F);
		lForearm = new ModelRenderer(this, 129, 90);
		lForearm.mirror = true;
		lForearm.setRotationPoint(0.5F, 11.3F, 0.0F);
		lForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
		setRotateAngle(lForearm, 0.136659280431156F, 0.0F, 0.0F);
		footLeftUpper = new ModelRenderer(this, 92, 99);
		footLeftUpper.mirror = true;
		footLeftUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		footLeftUpper.addBox(-2.0F, -3.0F, -4.9F, 4, 2, 4, 0.0F);
		setRotateAngle(footLeftUpper, 0.40980330836826856F, 0.0F, 0.0F);
		cape2 = new ModelRenderer(this, 197, 57);
		cape2.mirror = true;
		cape2.setRotationPoint(0.1F, 12.9F, 0.0F);
		cape2.addBox(-14.0F, 0.0F, 0.0F, 28, 15, 0, 0.0F);
		setRotateAngle(cape2, -0.136659280431156F, 0.0F, 0.0F);
		rSkullSlant2 = new ModelRenderer(this, 200, 5);
		rSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSkullSlant2.addBox(-3.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
		setRotateAngle(rSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
		khalaStrand10 = new ModelRenderer(this, 174, 37);
		khalaStrand10.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand10.addBox(0.0F, -3.5F, 15.5F, 2, 2, 6, 0.0F);
		setRotateAngle(khalaStrand10, 0.136659280431156F, -0.045553093477052F, 0.0F);
		abdomen = new ModelRenderer(this, 0, 59);
		abdomen.setRotationPoint(0.0F, 0.0F, 4.0F);
		abdomen.addBox(-5.0F, 11.6F, -2.2F, 10, 6, 5, 0.0F);
		toeRightRight = new ModelRenderer(this, 92, 106);
		toeRightRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		toeRightRight.addBox(-2.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
		shoulders = new ModelRenderer(this, 0, 0);
		shoulders.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulders.addBox(-12.0F, -1.6F, 0.5F, 24, 6, 8, 0.0F);
		legLeft4 = new ModelRenderer(this, 92, 53);
		legLeft4.mirror = true;
		legLeft4.setRotationPoint(0.0F, -0.9F, 7.0F);
		legLeft4.addBox(-2.0F, -2.2F, 1.9F, 4, 4, 3, 0.0F);
		setRotateAngle(legLeft4, -0.27314402793711257F, 0.0F, 0.0F);
		khalaStrand7 = new ModelRenderer(this, 161, 37);
		khalaStrand7.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand7.addBox(0.0F, 1.4F, 15.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand7, 0.4553564018453205F, 0.0F, -0.18203784098300857F);
		headBack2 = new ModelRenderer(this, 166, 27);
		headBack2.setRotationPoint(0.0F, -1.0F, -0.8F);
		headBack2.addBox(-3.0F, -7.0F, -0.8F, 6, 8, 2, 0.0F);
		setRotateAngle(headBack2, -0.7740535232594852F, 0.0F, 0.0F);
		legRight3 = new ModelRenderer(this, 92, 36);
		legRight3.setRotationPoint(-0.7F, 0.2F, 1.0F);
		legRight3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
		setRotateAngle(legRight3, -0.18203784098300857F, 0.0F, 0.0F);
		toeRightLeft = new ModelRenderer(this, 92, 106);
		toeRightLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		toeRightLeft.addBox(0.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
		legLeft2 = new ModelRenderer(this, 92, 23);
		legLeft2.mirror = true;
		legLeft2.setRotationPoint(0.0F, 14.7F, 0.0F);
		legLeft2.addBox(-3.5F, -3.0F, -3.2F, 7, 6, 6, 0.0F);
		setRotateAngle(legLeft2, 0.5235987755982988F, 0.136659280431156F, 0.045553093477052F);
		toeLeftLeft = new ModelRenderer(this, 92, 106);
		toeLeftLeft.mirror = true;
		toeLeftLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		toeLeftLeft.addBox(0.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
		khalaStrand4 = new ModelRenderer(this, 161, 37);
		khalaStrand4.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand4.addBox(0.0F, -7.0F, 15.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand4, -0.17226399717184032F, -0.08970992355250852F, 0.22759093446006054F);
		khalaStrand8 = new ModelRenderer(this, 161, 37);
		khalaStrand8.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand8.addBox(-3.3F, 0.0F, 15.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand8, 0.31869712141416456F, 0.18203784098300857F, 0.27314402793711257F);
		footLeft = new ModelRenderer(this, 92, 86);
		footLeft.mirror = true;
		footLeft.setRotationPoint(0.0F, 12.1F, 0.2F);
		footLeft.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
		setRotateAngle(footLeft, 0.5009094953223726F, -0.091106186954104F, -0.091106186954104F);
		armLeft2 = new ModelRenderer(this, 126, 21);
		armLeft2.mirror = true;
		armLeft2.setRotationPoint(0.0F, 0.0F, 1.4F);
		armLeft2.addBox(-3.0F, -3.0F, -11.0F, 6, 6, 11, 0.0F);
		nerveCord1 = new ModelRenderer(this, 63, 53);
		nerveCord1.setRotationPoint(0.0F, 0.0F, 1.6F);
		nerveCord1.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 6, 0.0F);
		setRotateAngle(nerveCord1, 0.36425021489121656F, -0.0F, 0.0F);
		shoulderGuardLeft1 = new ModelRenderer(this, 161, 73);
		shoulderGuardLeft1.mirror = true;
		shoulderGuardLeft1.setRotationPoint(11.9F, -1.8F, 5.0F);
		shoulderGuardLeft1.addBox(-2.0F, -5.5F, -5.0F, 2, 11, 10, 0.0F);
		setRotateAngle(shoulderGuardLeft1, 0.0F, 0.0F, -0.7285004297824331F);
		bladeLeft1 = new ModelRenderer(this, 126, 40);
		bladeLeft1.mirror = true;
		bladeLeft1.setRotationPoint(3.0F, 0.0F, -5.5F);
		bladeLeft1.addBox(0.0F, -2.0F, -3.5F, 2, 4, 4, 0.0F);
		rSkullSlant = new ModelRenderer(this, 191, 6);
		rSkullSlant.mirror = true;
		rSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSkullSlant.addBox(-3.5F, -0.5F, -0.5F, 2, 4, 1, 0.0F);
		setRotateAngle(rSkullSlant, -0.36425021489121656F, 0.0F, -0.40980330836826856F);
		toeLeftRight = new ModelRenderer(this, 92, 106);
		toeLeftRight.mirror = true;
		toeLeftRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		toeLeftRight.addBox(-2.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
		waistPlate1 = new ModelRenderer(this, 48, 44);
		waistPlate1.setRotationPoint(0.0F, 20.0F, -4.3F);
		waistPlate1.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 1, 0.0F);
		setRotateAngle(waistPlate1, 0.0F, -0.0F, 0.7853981633974483F);
		chestUpper = new ModelRenderer(this, 0, 18);
		chestUpper.setRotationPoint(0.0F, -25.1F, 0.0F);
		chestUpper.addBox(-7.5F, 2.8F, 0.0F, 15, 9, 9, 0.0F);
		cape3 = new ModelRenderer(this, 197, 72);
		cape3.mirror = true;
		cape3.setRotationPoint(0.1F, 15.0F, 0.0F);
		cape3.addBox(-14.0F, 0.0F, 0.0F, 28, 10, 0, 0.0F);
		legLeft1 = new ModelRenderer(this, 92, 0);
		legLeft1.mirror = true;
		legLeft1.setRotationPoint(6.0F, 21.0F, 0.0F);
		legLeft1.addBox(-2.5F, -2.0F, -3.0F, 5, 15, 6, 0.0F);
		setRotateAngle(legLeft1, -0.4553564018453205F, -0.136659280431156F, 0.0F);
		legRight5 = new ModelRenderer(this, 92, 65);
		legRight5.setRotationPoint(0.0F, 0.6F, 2.8F);
		legRight5.addBox(-2.08F, 0.0F, -2.5F, 4, 14, 5, 0.0F);
		setRotateAngle(legRight5, -0.136659280431156F, 0.091106186954104F, 0.0F);
		head = new ModelRenderer(this, 166, 0);
		head.setRotationPoint(0.0F, -4.0F, 0.7F);
		head.addBox(-3.0F, -2.0F, -2.0F, 6, 4, 3, 0.0F);
		setRotateAngle(head, -0.8196066167365371F, 0.0F, 0.0F);
		khalaStrand3 = new ModelRenderer(this, 161, 37);
		khalaStrand3.setRotationPoint(0.0F, 0.0F, 0.0F);
		khalaStrand3.addBox(0.0F, -6.0F, 15.5F, 1, 1, 4, 0.0F);
		setRotateAngle(khalaStrand3, -0.14922565104551516F, 0.136659280431156F, -0.4553564018453205F);
		rFist = new ModelRenderer(this, 134, 110);
		rFist.setRotationPoint(0.0F, 0.0F, -12.0F);
		rFist.addBox(-2.1F, -2.5F, -4.1F, 5, 5, 5, 0.0F);
		setRotateAngle(rFist, 0.0F, -0.136659280431156F, 0.0F);
		waist.addChild(loinclothBack);
		legLeft2.addChild(legLeft3);
		legRight1.addChild(legRight2);
		legRight3.addChild(legRight4);
		head.addChild(eyes);
		head.addChild(faceMask1);
		shoulders.addChild(armRight1);
		armRight1.addChild(rForearm);
		waist.addChild(loincloth);
		bladeLeft1.addChild(bladeLeft2);
		shape55.addChild(khalaStrand6);
		abdomen.addChild(waist);
		shoulders.addChild(armLeft1);
		shape55.addChild(khalaStrand2);
		lForearm.addChild(lFist);
		bladeLeft1.addChild(bladeLeft3);
		footRight.addChild(footRightUpper);
		shape55.addChild(khalaStrand5);
		shoulders.addChild(shoulderGuardRight1);
		faceMask1.addChild(faceMask2);
		nerveCord1.addChild(shape55);
		shape55.addChild(khalaStrand1);
		head.addChild(lSkullSlant);
		shape55.addChild(khalaStrand9);
		shoulderGuardLeft1.addChild(shoulderGuardLeft2);
		head.addChild(headBack);
		chestUpper.addChild(cape);
		head.addChild(lSkullSlant2);
		nerveCord1.addChild(khalaBand);
		legLeft4.addChild(legLeft5);
		waist.addChild(legRight1);
		shoulderGuardRight1.addChild(shoulderGuardRight2);
		legRight5.addChild(footRight);
		armLeft1.addChild(lForearm);
		footLeft.addChild(footLeftUpper);
		cape.addChild(cape2);
		head.addChild(rSkullSlant2);
		shape55.addChild(khalaStrand10);
		chestUpper.addChild(abdomen);
		footRight.addChild(toeRightRight);
		chestUpper.addChild(shoulders);
		legLeft3.addChild(legLeft4);
		shape55.addChild(khalaStrand7);
		head.addChild(headBack2);
		legRight2.addChild(legRight3);
		footRight.addChild(toeRightLeft);
		legLeft1.addChild(legLeft2);
		footLeft.addChild(toeLeftLeft);
		shape55.addChild(khalaStrand4);
		shape55.addChild(khalaStrand8);
		legLeft5.addChild(footLeft);
		lForearm.addChild(armLeft2);
		head.addChild(nerveCord1);
		shoulders.addChild(shoulderGuardLeft1);
		armLeft2.addChild(bladeLeft1);
		head.addChild(rSkullSlant);
		footLeft.addChild(toeLeftRight);
		waist.addChild(waistPlate1);
		cape2.addChild(cape3);
		waist.addChild(legLeft1);
		legRight4.addChild(legRight5);
		neck.addChild(head);
		shape55.addChild(khalaStrand3);
		rForearm.addChild(rFist);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		GlStateManager.pushMatrix();
		GlStateManager.translate(neck.offsetX, neck.offsetY, neck.offsetZ);
		GlStateManager.translate(neck.rotationPointX * f5, neck.rotationPointY * f5, neck.rotationPointZ * f5);
		GlStateManager.scale(1.5D, 1.5D, 1.5D);
		GlStateManager.translate(-neck.offsetX, -neck.offsetY, -neck.offsetZ);
		GlStateManager.translate(-neck.rotationPointX * f5, -neck.rotationPointY * f5, -neck.rotationPointZ * f5);
		neck.render(f5);
		GlStateManager.popMatrix();
		chestUpper.render(f5);
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
		head.rotateAngleX = par5 * 0.017453292F + 5.5F;
	    head.rotateAngleY = par4 * 0.0017453292F;
		legLeft1.rotateAngleX = MathHelper.sin(par1 * 1) * 1 * par2 - 0.5F;
		armLeft1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 0.5F * par2;
		legRight1.rotateAngleX = MathHelper.cos(par1 * 1) * 1 * par2 - 0.5F;
		armRight1.rotateAngleX = MathHelper.sin(par1 * 0.6662F + (float) Math.PI) * 0.5F * par2;
	}
}