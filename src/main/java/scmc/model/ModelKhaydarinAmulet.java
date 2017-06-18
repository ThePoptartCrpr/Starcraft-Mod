package scmc.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * khaydarin_amulet_hdpiece - X_Justaguy_X
 * Created using Tabula 5.1.0
 */
public class ModelKhaydarinAmulet extends ModelBiped {
	public ModelRenderer main_a;
    public ModelRenderer main_b;
    public ModelRenderer prtrLeft_1;
    public ModelRenderer hornLeft_1;
    public ModelRenderer hornRight_1;
    public ModelRenderer prtrRight_1;
    public ModelRenderer gemHolder;
    public ModelRenderer gem;
    public ModelRenderer prtrLeft_2;
    public ModelRenderer prtright_3;
    public ModelRenderer hornLeft_2;
    public ModelRenderer hornRight_2;
    public ModelRenderer prtrRight_2;
    public ModelRenderer prtrRight_3;

    public ModelKhaydarinAmulet(float scale) {
    	super(scale, 0, 64, 32);
	 textureWidth = 64;
     textureHeight = 32;
     hornRight_1 = new ModelRenderer(this, 25, 0);
     hornRight_1.setRotationPoint(0.0F, 0.0F, 0.0F);
     hornRight_1.addBox(-3.93F, -11.25F, -5.88F, 2, 4, 1, 0.0F);
     setRotateAngle(hornRight_1, -0.17453292519943295F, 0.0F, -0.06981317007977318F);
     prtrRight_1 = new ModelRenderer(this, 0, 19);
     prtrRight_1.setRotationPoint(0.0F, 0.0F, 0.0F);
     prtrRight_1.addBox(-4.5F, -6.0F, -4.5F, 1, 2, 2, 0.0F);
     hornLeft_1 = new ModelRenderer(this, 25, 0);
     hornLeft_1.setRotationPoint(0.0F, 0.0F, 0.0F);
     hornLeft_1.addBox(1.93F, -11.25F, -5.88F, 2, 4, 1, 0.0F);
     setRotateAngle(hornLeft_1, -0.17453292519943295F, 0.0F, 0.06981317007977318F);
     main_b = new ModelRenderer(this, 0, 6);
     main_b.setRotationPoint(0.0F, 0.0F, 0.0F);
     main_b.addBox(-0.5F, -12.0F, -4.5F, 1, 7, 1, 0.0F);
     prtrRight_2 = new ModelRenderer(this, 0, 15);
     prtrRight_2.setRotationPoint(0.0F, 0.0F, 0.0F);
     prtrRight_2.addBox(-4.0F, -6.0F, -4.5F, 1, 1, 2, 0.0F);
     hornLeft_2 = new ModelRenderer(this, 32, 0);
     hornLeft_2.setRotationPoint(0.0F, 0.0F, 0.0F);
     hornLeft_2.addBox(3.43F, -13.0F, -8.38F, 1, 4, 1, 0.0F);
     setRotateAngle(hornLeft_2, -0.4363807912205468F, 0.0F, -0.017385942396189322F);
     gem = new ModelRenderer(this, 6, 11);
     gem.setRotationPoint(0.0F, 0.0F, 0.0F);
     gem.addBox(-0.5F, -11.1F, -4.7F, 1, 2, 1, 0.0F);
     prtrLeft_1 = new ModelRenderer(this, 0, 19);
     prtrLeft_1.setRotationPoint(0.0F, 0.0F, 0.0F);
     prtrLeft_1.addBox(3.5F, -6.0F, -4.5F, 1, 2, 2, 0.0F);
     main_a = new ModelRenderer(this, 0, 0);
     main_a.setRotationPoint(0.0F, 0.0F, 0.0F);
     main_a.addBox(-4.5F, -8.0F, -4.5F, 9, 2, 2, 0.0F);
     gemHolder = new ModelRenderer(this, 5, 7);
     gemHolder.setRotationPoint(0.0F, 0.0F, 0.0F);
     gemHolder.addBox(-1.0F, -11.6F, -4.5F, 2, 3, 1, 0.0F);
     prtright_3 = new ModelRenderer(this, 0, 6);
     prtright_3.setRotationPoint(0.0F, 0.0F, 0.0F);
     prtright_3.addBox(3.5F, -4.0F, -4.7F, 1, 3, 1, 0.0F);
     setRotateAngle(prtright_3, -0.17453292519943295F, 0.0F, 0.0F);
     prtrLeft_2 = new ModelRenderer(this, 0, 15);
     prtrLeft_2.setRotationPoint(0.0F, 0.0F, 0.0F);
     prtrLeft_2.addBox(3.0F, -6.0F, -4.5F, 1, 1, 2, 0.0F);
     hornRight_2 = new ModelRenderer(this, 32, 0);
     hornRight_2.setRotationPoint(0.0F, 0.0F, 0.0F);
     hornRight_2.addBox(-4.43F, -13.0F, -8.38F, 1, 4, 1, 0.0F);
     setRotateAngle(hornRight_2, -0.4363807912205468F, 0.0F, 0.017385942396189322F);
     prtrRight_3 = new ModelRenderer(this, 0, 6);
     prtrRight_3.setRotationPoint(0.0F, 0.0F, 0.0F);
     prtrRight_3.addBox(-4.5F, -4.0F, -4.7F, 1, 3, 1, 0.0F);
     setRotateAngle(prtrRight_3, -0.17453292519943295F, 0.0F, 0.0F);
     bipedHead.addChild(hornRight_1);
     bipedHead.addChild(prtrRight_1);
     bipedHead.addChild(hornLeft_1);
     bipedHead.addChild(main_b);
     bipedHead.addChild(prtrRight_2);
     bipedHead.addChild(hornLeft_2);
     bipedHead.addChild(gem);
     bipedHead.addChild(prtrLeft_1);
     bipedHead.addChild(gemHolder);
     bipedHead.addChild(prtright_3);
     bipedHead.addChild(prtrLeft_2);
     bipedHead.addChild(hornRight_2);
     bipedHead.addChild(prtrRight_3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotateAngle(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}