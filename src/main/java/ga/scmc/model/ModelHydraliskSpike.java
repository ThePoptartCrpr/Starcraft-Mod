package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * SpikePROJECTILE - SCMCDevTeam Created using Tabula 5.1.0
 */
public class ModelHydraliskSpike extends ModelBase {

	public ModelRenderer main1;
	public ModelRenderer main2;
	public ModelRenderer main3;

	public ModelHydraliskSpike() {
		textureWidth = 32;
		textureHeight = 32;
		main2 = new ModelRenderer(this, 14, 0);
		main2.setRotationPoint(0.0F, 0.0F, -0.4F);
		main2.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 3, 0.0F);
		main3 = new ModelRenderer(this, 14, 0);
		main3.setRotationPoint(0.0F, -1.0F, -1.6F);
		main3.addBox(-0.5F, 0.5F, 0.0F, 1, 1, 3, 0.0F);
		main1 = new ModelRenderer(this, 0, 0);
		main1.setRotationPoint(0.0F, 0.0F, -1.5F);
		main1.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		main2.render(f5);
		main3.render(f5);
		main1.render(f5);
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
