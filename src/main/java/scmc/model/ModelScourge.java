package scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelScourge.tcn - TechneToTabulaImporter Created using Tabula 4.1.1
 */
public class ModelScourge extends ModelBase {

	public ModelRenderer base;
	public ModelRenderer chomper1;
	public ModelRenderer chomper2;
	public ModelRenderer chomper3;
	public ModelRenderer chomper4;
	public ModelRenderer chomper5;
	public ModelRenderer chomper6;
	public ModelRenderer chomper7;
	public ModelRenderer chomper8;
	public ModelRenderer leftWingBase;
	public ModelRenderer leftWingBase_1;
	public ModelRenderer leftWingExt;
	public ModelRenderer Mouth;
	public ModelRenderer rightWingBase;
	public ModelRenderer rightWingBase_1;
	public ModelRenderer rightWingExt;
	public ModelRenderer tail1;
	public ModelRenderer tail2;
	public ModelRenderer tail3;
	public ModelRenderer tail4;
	public ModelRenderer tail5;

	public ModelScourge() {
		textureWidth = 64;
		textureHeight = 64;
		base = new ModelRenderer(this, 0, 0);
		base.setRotationPoint(-3.0F, 10.0F, -7.0F);
		base.addBox(0.0F, 0.0F, 0.0F, 6, 6, 9, 0.0F);
		setRotateAngle(base, 0.14871443808078766F, -0.0F, 0.0F);
		chomper1 = new ModelRenderer(this, 31, 7);
		chomper1.setRotationPoint(1.600000023841858F, 11.399999618530273F, -8.899999618530273F);
		chomper1.addBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper1, -0.13962633907794952F, -0.13962633907794952F, 0.0F);
		tail5 = new ModelRenderer(this, 0, 48);
		tail5.setRotationPoint(-1.0F, 19.0F, 6.5F);
		tail5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
		setRotateAngle(tail5, -2.416609525680542F, -0.0F, 0.0F);
		leftWingBase = new ModelRenderer(this, 31, 0);
		leftWingBase.setRotationPoint(3.0F, 12.0F, -5.0F);
		leftWingBase.addBox(0.0F, 0.0F, 0.0F, 9, 0, 6, 0.0F);
		setRotateAngle(leftWingBase, 0.37179118394851673F, -0.4461433291435241F, 0.0F);
		tail1 = new ModelRenderer(this, 0, 16);
		tail1.setRotationPoint(-2.5F, 9.0F, 2.0F);
		tail1.addBox(0.0F, 0.0F, 0.0F, 5, 4, 5, 0.0F);
		setRotateAngle(tail1, -0.40896472334861755F, -0.0F, 0.0F);
		tail2 = new ModelRenderer(this, 0, 26);
		tail2.setRotationPoint(-2.0F, 11.0F, 6.0F);
		tail2.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
		setRotateAngle(tail2, -1.1153583526611328F, -0.0F, 0.0F);
		leftWingBase_1 = new ModelRenderer(this, 0, 54);
		leftWingBase_1.setRotationPoint(3.0F, 10.0F, -1.0F);
		leftWingBase_1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
		setRotateAngle(leftWingBase_1, 0.37179118394851673F, -0.4461433291435241F, 0.0F);
		chomper4 = new ModelRenderer(this, 31, 7);
		chomper4.setRotationPoint(-1.600000023841858F, 14.800000190734863F, -8.466666221618652F);
		chomper4.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper4, 0.279252678155899F, 0.13962633907794952F, 0.0F);
		tail3 = new ModelRenderer(this, 0, 34);
		tail3.setRotationPoint(-1.5F, 14.0F, 7.0F);
		tail3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
		setRotateAngle(tail3, -1.4127871990203857F, -0.0F, 0.0F);
		rightWingBase = new ModelRenderer(this, 31, 0);
		rightWingBase.setRotationPoint(-11.0F, 12.300000190734863F, -2.0F);
		rightWingBase.addBox(0.0F, 0.0F, 0.0F, 9, 0, 6, 0.0F);
		setRotateAngle(rightWingBase, 0.37179118394851673F, 0.4788811802864074F, 0.0F);
		chomper2 = new ModelRenderer(this, 31, 7);
		chomper2.setRotationPoint(-1.4666666984558105F, 11.366666793823242F, -8.866666793823242F);
		chomper2.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper2, -0.13962633907794952F, 0.13962633907794952F, 0.0F);
		Mouth = new ModelRenderer(this, 11, 48);
		Mouth.setRotationPoint(-2.0F, 11.0F, -7.733333110809326F);
		Mouth.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
		setRotateAngle(Mouth, 0.14835298061370847F, -0.0F, 0.0F);
		chomper5 = new ModelRenderer(this, 31, 7);
		chomper5.setRotationPoint(0.0F, 10.933333396911621F, -9.333333015441895F);
		chomper5.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper5, -0.13962633907794952F, -0.0F, 0.0F);
		leftWingExt = new ModelRenderer(this, 0, 58);
		leftWingExt.setRotationPoint(9.199999809265137F, 10.0F, 2.0999999046325684F);
		leftWingExt.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
		setRotateAngle(leftWingExt, 0.6419446023504676F, 0.9771990110331723F, 0.7338341021673389F);
		chomper8 = new ModelRenderer(this, 31, 7);
		chomper8.setRotationPoint(2.200000047683716F, 13.266666412353516F, -9.466666221618652F);
		chomper8.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper8, 0.13962633907794952F, -0.13962633907794952F, 0.0F);
		rightWingBase_1 = new ModelRenderer(this, 0, 54);
		rightWingBase_1.setRotationPoint(-10.0F, 10.0F, 2.2666666507720947F);
		rightWingBase_1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
		setRotateAngle(rightWingBase_1, 0.37179118394851673F, 0.4788811802864074F, 0.0F);
		chomper3 = new ModelRenderer(this, 31, 7);
		chomper3.setRotationPoint(1.5333333015441895F, 14.800000190734863F, -8.466666221618652F);
		chomper3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper3, 0.279252678155899F, -0.13962633907794952F, 0.0F);
		chomper6 = new ModelRenderer(this, 31, 7);
		chomper6.setRotationPoint(0.0F, 15.466666221618652F, -9.133333206176758F);
		chomper6.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper6, 0.27925267815589905F, -0.0F, 0.0F);
		chomper7 = new ModelRenderer(this, 31, 7);
		chomper7.setRotationPoint(-2.200000047683716F, 13.333333015441895F, -9.399999618530273F);
		chomper7.addBox(0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(chomper7, 0.13962633907794952F, 0.13962633907794952F, 0.0F);
		rightWingExt = new ModelRenderer(this, 0, 58);
		rightWingExt.setRotationPoint(-10.0F, 10.0F, 2.0999999046325684F);
		rightWingExt.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
		setRotateAngle(rightWingExt, 2.4996401628233897F, 0.9772039035680417F, 2.4077520124362692F);
		tail4 = new ModelRenderer(this, 0, 41);
		tail4.setRotationPoint(-1.5F, 17.0F, 7.5F);
		tail4.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
		setRotateAngle(tail4, -2.0820021629333496F, -0.0F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		base.render(f5);
		chomper1.render(f5);
		tail5.render(f5);
		leftWingBase.render(f5);
		tail1.render(f5);
		tail2.render(f5);
		leftWingBase_1.render(f5);
		chomper4.render(f5);
		tail3.render(f5);
		rightWingBase.render(f5);
		chomper2.render(f5);
		Mouth.render(f5);
		chomper5.render(f5);
		leftWingExt.render(f5);
		chomper8.render(f5);
		rightWingBase_1.render(f5);
		chomper3.render(f5);
		chomper6.render(f5);
		chomper7.render(f5);
		rightWingExt.render(f5);
		tail4.render(f5);
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