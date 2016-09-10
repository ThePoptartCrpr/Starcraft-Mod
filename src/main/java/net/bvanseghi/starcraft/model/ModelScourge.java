package net.bvanseghi.starcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScourge extends ModelBase
{
  //fields
    ModelRenderer tail5;
    ModelRenderer rightWingExt;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer Mouth;
    ModelRenderer rightWingWebbing;
    ModelRenderer leftWingWebbing;
    ModelRenderer leftWingExt;
    ModelRenderer base;
    ModelRenderer leftWingBase;
    ModelRenderer rightWingBase;
    ModelRenderer chomper1;
    ModelRenderer chomper2;
    ModelRenderer chomper3;
    ModelRenderer chomper4;
    ModelRenderer chomper5;
    ModelRenderer chomper6;
    ModelRenderer chomper7;
    ModelRenderer chomper8;
  
  public ModelScourge()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      tail5 = new ModelRenderer(this, 0, 48);
      tail5.addBox(0F, 0F, 0F, 2, 2, 3);
      tail5.setRotationPoint(-1F, 19F, 6.5F);
      tail5.setTextureSize(64, 32);
      tail5.mirror = true;
      setRotation(tail5, -2.41661F, 0F, 0F);
      rightWingExt = new ModelRenderer(this, 0, 58);
      rightWingExt.addBox(0F, 0F, 0F, 7, 1, 1);
      rightWingExt.setRotationPoint(-10F, 10F, 2.1F);
      rightWingExt.setTextureSize(64, 32);
      rightWingExt.mirror = true;
      setRotation(rightWingExt, 0F, 2.035316F, 0.3839724F);
      tail1 = new ModelRenderer(this, 0, 16);
      tail1.addBox(0F, 0F, 0F, 5, 4, 5);
      tail1.setRotationPoint(-2.5F, 9F, 2F);
      tail1.setTextureSize(64, 32);
      tail1.mirror = true;
      setRotation(tail1, -0.4089647F, 0F, 0F);
      tail2 = new ModelRenderer(this, 0, 26);
      tail2.addBox(0F, 0F, 0F, 4, 3, 4);
      tail2.setRotationPoint(-2F, 11F, 6F);
      tail2.setTextureSize(64, 32);
      tail2.mirror = true;
      setRotation(tail2, -1.115358F, 0F, 0F);
      tail3 = new ModelRenderer(this, 0, 34);
      tail3.addBox(0F, 0F, 0F, 3, 3, 3);
      tail3.setRotationPoint(-1.5F, 14F, 7F);
      tail3.setTextureSize(64, 32);
      tail3.mirror = true;
      setRotation(tail3, -1.412787F, 0F, 0F);
      tail4 = new ModelRenderer(this, 0, 41);
      tail4.addBox(0F, 0F, 0F, 3, 3, 3);
      tail4.setRotationPoint(-1.5F, 17F, 7.5F);
      tail4.setTextureSize(64, 32);
      tail4.mirror = true;
      setRotation(tail4, -2.082002F, 0F, 0F);
      Mouth = new ModelRenderer(this, 11, 48);
      Mouth.addBox(0F, 0F, 0F, 4, 4, 1);
      Mouth.setRotationPoint(-2F, 11F, -7.733333F);
      Mouth.setTextureSize(64, 32);
      Mouth.mirror = true;
      setRotation(Mouth, 0.148353F, 0F, 0F);
      rightWingWebbing = new ModelRenderer(this, 31, 0);
      rightWingWebbing.addBox(0F, 0F, 0F, 9, 0, 6);
      rightWingWebbing.setRotationPoint(-11F, 12.3F, -2F);
      rightWingWebbing.setTextureSize(64, 32);
      rightWingWebbing.mirror = true;
      setRotation(rightWingWebbing, 0.3717912F, 0.4788812F, 0F);
      leftWingWebbing = new ModelRenderer(this, 31, 0);
      leftWingWebbing.addBox(0F, 0F, 0F, 9, 0, 6);
      leftWingWebbing.setRotationPoint(3F, 12F, -5F);
      leftWingWebbing.setTextureSize(64, 32);
      leftWingWebbing.mirror = true;
      setRotation(leftWingWebbing, 0.3717912F, -0.4461433F, 0F);
      leftWingExt = new ModelRenderer(this, 0, 58);
      leftWingExt.addBox(0F, 0F, 0F, 7, 1, 1);
      leftWingExt.setRotationPoint(9.2F, 10F, 2.1F);
      leftWingExt.setTextureSize(64, 32);
      leftWingExt.mirror = true;
      setRotation(leftWingExt, 0F, 1.10627F, 0.3839724F);
      base = new ModelRenderer(this, 0, 0);
      base.addBox(0F, 0F, 0F, 6, 6, 9);
      base.setRotationPoint(-3F, 10F, -7F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0.1487144F, 0F, 0F);
      leftWingBase = new ModelRenderer(this, 0, 54);
      leftWingBase.addBox(0F, 0F, 0F, 8, 1, 2);
      leftWingBase.setRotationPoint(3F, 10F, -1F);
      leftWingBase.setTextureSize(64, 32);
      leftWingBase.mirror = true;
      setRotation(leftWingBase, 0.3717912F, -0.4461433F, 0F);
      rightWingBase = new ModelRenderer(this, 0, 54);
      rightWingBase.addBox(0F, 0F, 0F, 8, 1, 2);
      rightWingBase.setRotationPoint(-10F, 10F, 2.266667F);
      rightWingBase.setTextureSize(64, 32);
      rightWingBase.mirror = true;
      setRotation(rightWingBase, 0.3717912F, 0.4788812F, 0F);
      chomper1 = new ModelRenderer(this, 31, 7);
      chomper1.addBox(0F, -1F, 0F, 1, 1, 3);
      chomper1.setRotationPoint(1.6F, 11.4F, -8.9F);
      chomper1.setTextureSize(64, 32);
      chomper1.mirror = true;
      setRotation(chomper1, -0.1396263F, -0.1396263F, 0F);
      chomper2 = new ModelRenderer(this, 31, 7);
      chomper2.addBox(-1F, -1F, 0F, 1, 1, 3);
      chomper2.setRotationPoint(-1.466667F, 11.36667F, -8.866667F);
      chomper2.setTextureSize(64, 32);
      chomper2.mirror = true;
      setRotation(chomper2, -0.1396263F, 0.1396263F, 0F);
      chomper3 = new ModelRenderer(this, 31, 7);
      chomper3.addBox(0F, 0F, 0F, 1, 1, 3);
      chomper3.setRotationPoint(1.533333F, 14.8F, -8.466666F);
      chomper3.setTextureSize(64, 32);
      chomper3.mirror = true;
      setRotation(chomper3, 0.2792527F, -0.1396263F, 0F);
      chomper4 = new ModelRenderer(this, 31, 7);
      chomper4.addBox(-1F, 0F, 0F, 1, 1, 3);
      chomper4.setRotationPoint(-1.6F, 14.8F, -8.466666F);
      chomper4.setTextureSize(64, 32);
      chomper4.mirror = true;
      setRotation(chomper4, 0.2792527F, 0.1396263F, 0F);
      chomper5 = new ModelRenderer(this, 31, 7);
      chomper5.addBox(-0.5F, 0F, 0F, 1, 1, 3);
      chomper5.setRotationPoint(0F, 10.93333F, -9.333333F);
      chomper5.setTextureSize(64, 32);
      chomper5.mirror = true;
      setRotation(chomper5, -0.1396263F, 0F, 0F);
      chomper6 = new ModelRenderer(this, 31, 7);
      chomper6.addBox(-0.5F, -1F, 0F, 1, 1, 3);
      chomper6.setRotationPoint(0F, 15.46667F, -9.133333F);
      chomper6.setTextureSize(64, 32);
      chomper6.mirror = true;
      setRotation(chomper6, 0.2792527F, 0F, 0F);
      chomper7 = new ModelRenderer(this, 31, 7);
      chomper7.addBox(0F, -0.5F, 0F, 1, 1, 3);
      chomper7.setRotationPoint(-2.2F, 13.33333F, -9.4F);
      chomper7.setTextureSize(64, 32);
      chomper7.mirror = true;
      setRotation(chomper7, 0.1396263F, 0.1396263F, 0F);
      chomper8 = new ModelRenderer(this, 31, 7);
      chomper8.addBox(-1F, -0.5F, 0F, 1, 1, 3);
      chomper8.setRotationPoint(2.2F, 13.26667F, -9.466666F);
      chomper8.setTextureSize(64, 32);
      chomper8.mirror = true;
      setRotation(chomper8, 0.1396263F, -0.1396263F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    tail5.render(f5);
    rightWingExt.render(f5);
    tail1.render(f5);
    tail2.render(f5);
    tail3.render(f5);
    tail4.render(f5);
    Mouth.render(f5);
    rightWingBase.render(f5);
    leftWingBase.render(f5);
    leftWingExt.render(f5);
    base.render(f5);
    leftWingBase.render(f5);
    rightWingBase.render(f5);
    chomper1.render(f5);
    chomper2.render(f5);
    chomper3.render(f5);
    chomper4.render(f5);
    chomper5.render(f5);
    chomper6.render(f5);
    chomper7.render(f5);
    chomper8.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
