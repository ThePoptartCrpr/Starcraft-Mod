package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * SCMC_Zealot_armor_MARK_1 - XJustaguyX
 * Created using Tabula 5.1.0
 */
public class ModelProtossArmorMK1 extends ModelBase {
    public ModelRenderer leg_left_2;
    public ModelRenderer leg_right_1;
    public ModelRenderer body_armor_main;
    public ModelRenderer head_protection_front_1;
    public ModelRenderer shoulder_plate_left_4;
    public ModelRenderer shoulder_plate_right_4;
    public ModelRenderer foot_left_1;
    public ModelRenderer kneepad_left_1;
    public ModelRenderer leg_left_1;
    public ModelRenderer finger_right_1;
    public ModelRenderer finger_left_3;
    public ModelRenderer finger_left_2;
    public ModelRenderer finger_left_4;
    public ModelRenderer foot_left_2;
    public ModelRenderer foot_left_3;
    public ModelRenderer foot_left_5;
    public ModelRenderer foot_left_4;
    public ModelRenderer kneepad_left_2;
    public ModelRenderer foot_right_1;
    public ModelRenderer kneepad_right_1;
    public ModelRenderer leg_right_2;
    public ModelRenderer finger_right_1_1;
    public ModelRenderer finger_right_3;
    public ModelRenderer finger_right_2;
    public ModelRenderer finger_right_4;
    public ModelRenderer kneepad_right_2;
    public ModelRenderer foot_right_3;
    public ModelRenderer foot_right_2;
    public ModelRenderer foot_right_5;
    public ModelRenderer foot_right_4;
    public ModelRenderer body_armor_lower_mid;
    public ModelRenderer spine_1;
    public ModelRenderer spine_2;
    public ModelRenderer spine_3;
    public ModelRenderer spine_4;
    public ModelRenderer shoulder_line_right_1;
    public ModelRenderer shoulder_line_left_1;
    public ModelRenderer body_armor_lower_main;
    public ModelRenderer gem_holder_long;
    public ModelRenderer body_armor_lower_right_1;
    public ModelRenderer body_armor_lower_left_1;
    public ModelRenderer shoulder_line_right_2;
    public ModelRenderer shoulder_line_left_2;
    public ModelRenderer body_armor_lower_right;
    public ModelRenderer body_armor_lower_left;
    public ModelRenderer body_armor_main_lower;
    public ModelRenderer gem_holder_wide;
    public ModelRenderer body_armor_lower_right_2;
    public ModelRenderer body_armor_lower_left_2;
    public ModelRenderer shoulder_line_right_3;
    public ModelRenderer shoulder_line_left_3;
    public ModelRenderer gem;
    public ModelRenderer body_armor_lower_right_3;
    public ModelRenderer body_armor_lower_left_3;
    public ModelRenderer shoulder_line_right_4;
    public ModelRenderer shoulder_line_left_4;
    public ModelRenderer shoulder_line_right_5;
    public ModelRenderer shoulder_line_left_5;
    public ModelRenderer shoulder_line_right_6;
    public ModelRenderer shoulder_line_left_6;
    public ModelRenderer shoulder_line_left_7;
    public ModelRenderer shoulder_line_right_7;
    public ModelRenderer shoulder_line_left_8;
    public ModelRenderer shoulder_line_right_9;
    public ModelRenderer shoulder_line_right_8;
    public ModelRenderer shoulder_line_left_9;
    public ModelRenderer head_protection_front_2;
    public ModelRenderer head_protection_back_1;
    public ModelRenderer head_protection_front_3;
    public ModelRenderer head_protection_back_2;
    public ModelRenderer head_protection_back_3;
    public ModelRenderer shoulder_plate_left_1;
    public ModelRenderer shoulder_plate_left_3;
    public ModelRenderer shoulder_plate_left_2;
    public ModelRenderer shoulder_plate_left_5;
    public ModelRenderer wrist_plate_left_1;
    public ModelRenderer wrist_plate_left_2;
    public ModelRenderer wrist_plate_left_3;
    public ModelRenderer shoulder_plate_right_1;
    public ModelRenderer shoulder_plate_right_3;
    public ModelRenderer shoulder_plate_right_2;
    public ModelRenderer shoulder_plate_right_5;
    public ModelRenderer wrist_plate_right_1;
    public ModelRenderer wrist_plate_right_2;
    public ModelRenderer wrist_plate_right_3;

    public ModelProtossArmorMK1() {
        this.textureWidth = 100;
        this.textureHeight = 50;
        this.shoulder_line_left_1 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_1.addBox(2.2F, -3.2F, -3.2F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_1, 0.6108652381980153F, 0.06981317007977318F, 0.6981317007977318F);
        this.foot_left_5 = new ModelRenderer(this, 38, 21);
        this.foot_left_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_left_5.addBox(-2.0F, 10.5F, -0.99F, 1, 1, 1, 0.0F);
        this.setRotateAngle(foot_left_5, 0.2617993877991494F, 0.0F, 0.0F);
        this.finger_right_4 = new ModelRenderer(this, 11, 0);
        this.finger_right_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_right_4.addBox(0.71F, 10.0F, -5.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(finger_right_4, 0.08726646259971645F, -0.2617993877991494F, 0.0F);
        this.shoulder_line_right_8 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_8.addBox(-4.2F, 0.2F, -4.95F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_8, -3.0543261909900763F, -0.06981317007977318F, -0.6981317007977317F);
        this.body_armor_main = new ModelRenderer(this, 22, 1);
        this.body_armor_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_main.addBox(-4.0F, 0.0F, -3.5F, 8, 6, 7, 0.0F);
        this.wrist_plate_right_1 = new ModelRenderer(this, 68, 36);
        this.wrist_plate_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wrist_plate_right_1.addBox(-4.5F, 5.3F, -2.49F, 5, 2, 5, 0.0F);
        this.shoulder_line_right_9 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_9.addBox(-4.2F, -0.02F, -3.97F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_9, 2.617993877991495F, -0.06981317007977318F, -0.6981317007977317F);
        this.shoulder_plate_left_1 = new ModelRenderer(this, 19, 25);
        this.shoulder_plate_left_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_left_1.addBox(-0.5F, -0.7F, -2.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(shoulder_plate_left_1, 0.0F, 0.0F, -0.15707963267948966F);
        this.shoulder_line_left_4 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_4.addBox(2.2F, -1.6F, -7.66F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_4, -1.0471975511965976F, 0.06981317007977318F, 0.6981317007977317F);
        this.shoulder_plate_right_2 = new ModelRenderer(this, 73, 37);
        this.shoulder_plate_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_right_2.addBox(-4.9F, -0.7F, -2.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(shoulder_plate_right_2, 0.0F, 0.0F, 0.15707963267948966F);
        this.finger_right_1 = new ModelRenderer(this, 11, 0);
        this.finger_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_right_1.addBox(-1.71F, 10.0F, -5.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(finger_right_1, 0.08726646259971645F, 0.2617993877991494F, 0.0F);
        this.spine_4 = new ModelRenderer(this, 0, 45);
        this.spine_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine_4.addBox(-1.5F, 2.7F, 2.75F, 3, 3, 1, 0.0F);
        this.setRotateAngle(spine_4, 0.017453292519943295F, 0.0F, 0.0F);
        this.body_armor_lower_right = new ModelRenderer(this, 20, 44);
        this.body_armor_lower_right.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.body_armor_lower_right.addBox(-3.7F, -0.3F, -2.51F, 4, 1, 5, 0.0F);
        this.setRotateAngle(body_armor_lower_right, 0.0F, 0.0F, 0.17453292519943295F);
        this.wrist_plate_left_1 = new ModelRenderer(this, 68, 36);
        this.wrist_plate_left_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wrist_plate_left_1.addBox(-0.5F, 5.3F, -2.49F, 5, 2, 5, 0.0F);
        this.body_armor_lower_left = new ModelRenderer(this, 20, 44);
        this.body_armor_lower_left.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.body_armor_lower_left.addBox(-0.3F, -0.3F, -2.51F, 4, 1, 5, 0.0F);
        this.setRotateAngle(body_armor_lower_left, 0.0F, 0.0F, -0.17453292519943295F);
        this.body_armor_main_lower = new ModelRenderer(this, 45, 43);
        this.body_armor_main_lower.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_main_lower.addBox(-2.0F, 7.0F, -3.01F, 4, 1, 6, 0.0F);
        this.head_protection_front_1 = new ModelRenderer(this, 0, 16);
        this.head_protection_front_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_protection_front_1.addBox(-1.5F, -2.6F, -3.9F, 3, 1, 2, 0.0F);
        this.setRotateAngle(head_protection_front_1, 0.5235987755982988F, 0.0F, 0.0F);
        this.wrist_plate_left_3 = new ModelRenderer(this, 0, 33);
        this.wrist_plate_left_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wrist_plate_left_3.addBox(-0.2F, 7.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(wrist_plate_left_3, 0.0F, 0.0F, 0.017453292519943295F);
        this.shoulder_line_right_3 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_3.addBox(-4.2F, -4.6F, -6.16F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_3, -0.3490658503988659F, -0.06981317007977318F, -0.6981317007977317F);
        this.foot_left_1 = new ModelRenderer(this, 19, 19);
        this.foot_left_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_left_1.addBox(-2.01F, 10.0F, -4.0F, 4, 2, 2, 0.0F);
        this.kneepad_left_2 = new ModelRenderer(this, 0, 10);
        this.kneepad_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.kneepad_left_2.addBox(-1.0F, 3.5F, -3.0F, 2, 4, 1, 0.0F);
        this.spine_3 = new ModelRenderer(this, 0, 45);
        this.spine_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine_3.addBox(-1.5F, 2.0F, 1.85F, 3, 3, 1, 0.0F);
        this.setRotateAngle(spine_3, 0.2617993877991494F, 0.0F, 0.0F);
        this.finger_left_4 = new ModelRenderer(this, 11, 0);
        this.finger_left_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_left_4.addBox(0.71F, 10.0F, -5.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(finger_left_4, 0.08726646259971647F, -0.2617993877991494F, 0.0F);
        this.foot_right_2 = new ModelRenderer(this, 32, 16);
        this.foot_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_right_2.addBox(-2.5F, 11.0F, -3.0F, 4, 1, 6, 0.0F);
        this.spine_1 = new ModelRenderer(this, 0, 45);
        this.spine_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine_1.addBox(-1.5F, 0.2F, 2.55F, 3, 3, 1, 0.0F);
        this.setRotateAngle(spine_1, 0.3490658503988659F, 0.0F, 0.0F);
        this.body_armor_lower_left_3 = new ModelRenderer(this, 48, 25);
        this.body_armor_lower_left_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_lower_left_3.addBox(-2.38F, 7.22F, -2.99F, 2, 1, 6, 0.0F);
        this.setRotateAngle(body_armor_lower_left_3, 0.0F, 0.0F, -0.28797932657906433F);
        this.shoulder_line_left_3 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_3.addBox(2.2F, -4.6F, -6.16F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_3, -0.3490658503988659F, 0.06981317007977318F, 0.6981317007977317F);
        this.shoulder_line_right_5 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_5.addBox(-4.2F, -1.6F, -7.45F, 2, 4, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_5, -1.5707963267948963F, -0.06981317007977318F, -0.6981317007977317F);
        this.shoulder_line_left_8 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_8.addBox(2.2F, 0.2F, -4.95F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_8, -3.0543261909900763F, 0.06981317007977318F, 0.6981317007977317F);
        this.wrist_plate_left_2 = new ModelRenderer(this, 21, 33);
        this.wrist_plate_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wrist_plate_left_2.addBox(4.86F, 6.3F, -2.51F, 1, 4, 5, 0.0F);
        this.setRotateAngle(wrist_plate_left_2, 0.0F, 0.0F, 0.19198621771937624F);
        this.leg_left_1 = new ModelRenderer(this, 69, 18);
        this.leg_left_1.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg_left_1.addBox(1.95F, 0.0F, -2.49F, 1, 12, 5, 0.0F);
        this.foot_right_3 = new ModelRenderer(this, 35, 19);
        this.foot_right_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_right_3.addBox(-2.49F, 10.5F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(foot_right_3, 0.2617993877991494F, 0.0F, 0.0F);
        this.shoulder_line_right_4 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_4.addBox(-4.2F, -1.6F, -7.66F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_4, -1.0471975511965976F, -0.06981317007977318F, -0.6981317007977317F);
        this.gem_holder_wide = new ModelRenderer(this, 0, 10);
        this.gem_holder_wide.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gem_holder_wide.addBox(-1.5F, 1.0F, -3.9F, 3, 3, 1, 0.0F);
        this.finger_right_1_1 = new ModelRenderer(this, 11, 0);
        this.finger_right_1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_right_1_1.addBox(-1.71F, 10.0F, -5.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(finger_right_1_1, 0.08726646259971645F, 0.2617993877991494F, 0.0F);
        this.body_armor_lower_right_1 = new ModelRenderer(this, 45, 23);
        this.body_armor_lower_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_lower_right_1.addBox(-5.8F, 4.5F, -3.49F, 4, 2, 7, 0.0F);
        this.setRotateAngle(body_armor_lower_right_1, 0.0F, 0.0F, -0.31415926535897926F);
        this.head_protection_back_3 = new ModelRenderer(this, 12, 1);
        this.head_protection_back_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_protection_back_3.addBox(-1.0F, -3.1F, 3.7F, 2, 2, 1, 0.0F);
        this.setRotateAngle(head_protection_back_3, -0.5235987755982987F, 0.0F, 0.0F);
        this.kneepad_left_1 = new ModelRenderer(this, 53, 10);
        this.kneepad_left_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.kneepad_left_1.addBox(-1.5F, 3.9F, -2.99F, 3, 3, 1, 0.0F);
        this.spine_2 = new ModelRenderer(this, 0, 45);
        this.spine_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine_2.addBox(-1.5F, 1.2F, 1.95F, 3, 3, 1, 0.0F);
        this.setRotateAngle(spine_2, 0.3490658503988659F, 0.0F, 0.0F);
        this.shoulder_plate_right_3 = new ModelRenderer(this, 20, 26);
        this.shoulder_plate_right_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_right_3.addBox(-4.0F, -1.2F, -2.0F, 5, 1, 4, 0.0F);
        this.setRotateAngle(shoulder_plate_right_3, 0.0F, 0.0F, 0.15707963267948966F);
        this.body_armor_lower_right_3 = new ModelRenderer(this, 47, 25);
        this.body_armor_lower_right_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_lower_right_3.addBox(0.47F, 7.2F, -3.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(body_armor_lower_right_3, 0.0F, 0.0F, 0.28797932657906444F);
        this.foot_right_4 = new ModelRenderer(this, 39, 21);
        this.foot_right_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_right_4.addBox(1.0F, 10.5F, -0.99F, 1, 1, 1, 0.0F);
        this.setRotateAngle(foot_right_4, 0.2617993877991494F, 0.0F, 0.0F);
        this.head_protection_back_2 = new ModelRenderer(this, 2, 20);
        this.head_protection_back_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_protection_back_2.addBox(-2.0F, -2.3F, 2.4F, 4, 1, 2, 0.0F);
        this.setRotateAngle(head_protection_back_2, -0.7853981633974483F, 0.0F, 0.0F);
        this.leg_left_2 = new ModelRenderer(this, 69, 0);
        this.leg_left_2.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leg_left_2.addBox(-1.79F, 0.0F, -2.5F, 4, 12, 5, 0.0F);
        this.shoulder_line_left_5 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_5.addBox(2.2F, -1.6F, -7.45F, 2, 4, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_5, -1.5707963267948963F, 0.06981317007977318F, 0.6981317007977317F);
        this.foot_right_5 = new ModelRenderer(this, 38, 21);
        this.foot_right_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_right_5.addBox(1.0F, 10.94F, 2.19F, 1, 1, 1, 0.0F);
        this.setRotateAngle(foot_right_5, -0.017453292519943295F, 0.0F, 0.0F);
        this.shoulder_line_left_7 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_7.addBox(2.2F, 0.4F, -5.85F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_7, -2.5481807079117207F, 0.06981317007977318F, 0.6981317007977317F);
        this.gem = new ModelRenderer(this, 10, 10);
        this.gem.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gem.addBox(-1.0F, 1.0F, -4.1F, 2, 3, 1, 0.0F);
        this.shoulder_line_left_2 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_2.addBox(2.2F, -4.9F, -4.1F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_2, 0.2617993877991494F, 0.06981317007977318F, 0.6981317007977317F);
        this.shoulder_line_right_1 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_1.addBox(-4.2F, -3.2F, -3.2F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_1, 0.6108652381980154F, -0.06981317007977318F, -0.6981317007977317F);
        this.body_armor_lower_mid = new ModelRenderer(this, 45, 33);
        this.body_armor_lower_mid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_lower_mid.addBox(3.2F, 3.3F, -3.47F, 2, 2, 7, 0.0F);
        this.setRotateAngle(body_armor_lower_mid, 0.0F, 0.0F, 0.7853981633974483F);
        this.gem_holder_long = new ModelRenderer(this, 0, 10);
        this.gem_holder_long.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gem_holder_long.addBox(-1.0F, 0.5F, -3.9F, 2, 4, 1, 0.0F);
        this.shoulder_line_left_6 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_6.addBox(2.2F, 2.2F, -6.37F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_6, -2.3561944901923444F, 0.06981317007977318F, 0.6981317007977317F);
        this.shoulder_line_left_9 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_left_9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_left_9.addBox(2.2F, -0.02F, -3.97F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_left_9, 2.617993877991495F, 0.06981317007977318F, 0.6981317007977317F);
        this.finger_right_3 = new ModelRenderer(this, 11, 0);
        this.finger_right_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_right_3.addBox(-0.81F, 10.0F, -6.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(finger_right_3, 0.08726646259971645F, -0.17453292519943295F, 0.0F);
        this.foot_left_2 = new ModelRenderer(this, 32, 16);
        this.foot_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_left_2.addBox(-1.5F, 11.0F, -3.0F, 4, 1, 6, 0.0F);
        this.shoulder_plate_right_4 = new ModelRenderer(this, 0, 25);
        this.shoulder_plate_right_4.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.shoulder_plate_right_4.addBox(-4.39F, 0.3F, -2.25F, 5, 2, 4, 0.0F);
        this.setRotateAngle(shoulder_plate_right_4, 0.0F, 0.0F, 0.017453292519943302F);
        this.shoulder_plate_right_5 = new ModelRenderer(this, 0, 25);
        this.shoulder_plate_right_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_right_5.addBox(-4.4F, 0.3F, -1.65F, 5, 2, 4, 0.0F);
        this.finger_left_2 = new ModelRenderer(this, 11, 0);
        this.finger_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_left_2.addBox(-1.21F, 10.0F, -6.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(finger_left_2, 0.08726646259971647F, 0.17453292519943295F, 0.0F);
        this.shoulder_line_right_2 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_2.addBox(-4.2F, -4.9F, -4.1F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_2, 0.2617993877991494F, -0.06981317007977318F, -0.6981317007977317F);
        this.head_protection_front_3 = new ModelRenderer(this, 3, 17);
        this.head_protection_front_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_protection_front_3.addBox(-0.5F, -2.1F, -4.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(head_protection_front_3, -0.5235987755982987F, 0.0F, 0.0F);
        this.shoulder_plate_right_1 = new ModelRenderer(this, 19, 25);
        this.shoulder_plate_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_right_1.addBox(-4.5F, -0.7F, -2.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(shoulder_plate_right_1, 0.0F, 0.0F, 0.15707963267948966F);
        this.body_armor_lower_main = new ModelRenderer(this, 68, 44);
        this.body_armor_lower_main.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.body_armor_lower_main.addBox(-4.5F, 0.0F, -2.5F, 9, 1, 5, 0.0F);
        this.shoulder_plate_left_4 = new ModelRenderer(this, 0, 25);
        this.shoulder_plate_left_4.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.shoulder_plate_left_4.addBox(-0.59F, 0.3F, -2.25F, 5, 2, 4, 0.0F);
        this.setRotateAngle(shoulder_plate_left_4, 0.0F, 0.0F, -0.017453292519943295F);
        this.foot_left_3 = new ModelRenderer(this, 35, 19);
        this.foot_left_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_left_3.addBox(-1.51F, 10.5F, -2.98F, 4, 1, 3, 0.0F);
        this.setRotateAngle(foot_left_3, 0.2617993877991494F, 0.0F, 0.0F);
        this.shoulder_line_right_7 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_7.addBox(-4.2F, 0.4F, -5.85F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_7, -2.5481807079117207F, -0.06981317007977318F, -0.6981317007977317F);
        this.head_protection_front_2 = new ModelRenderer(this, 1, 16);
        this.head_protection_front_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_protection_front_2.addBox(-1.0F, -3.3F, -3.7F, 2, 1, 2, 0.0F);
        this.shoulder_line_right_6 = new ModelRenderer(this, 0, 0);
        this.shoulder_line_right_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_line_right_6.addBox(-4.2F, 2.2F, -6.37F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shoulder_line_right_6, -2.356194490192345F, -0.06981317007977318F, -0.6981317007977317F);
        this.wrist_plate_right_2 = new ModelRenderer(this, 21, 33);
        this.wrist_plate_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wrist_plate_right_2.addBox(-5.8F, 6.3F, -2.51F, 1, 4, 5, 0.0F);
        this.setRotateAngle(wrist_plate_right_2, 0.0F, 0.0F, -0.19198621771937624F);
        this.foot_left_4 = new ModelRenderer(this, 38, 21);
        this.foot_left_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_left_4.addBox(-2.0F, 10.94F, 2.19F, 1, 1, 1, 0.0F);
        this.setRotateAngle(foot_left_4, -0.017453292519943295F, 0.0F, 0.0F);
        this.kneepad_right_2 = new ModelRenderer(this, 0, 10);
        this.kneepad_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.kneepad_right_2.addBox(-1.0F, 3.5F, -3.0F, 2, 4, 1, 0.0F);
        this.body_armor_lower_left_1 = new ModelRenderer(this, 45, 23);
        this.body_armor_lower_left_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_lower_left_1.addBox(1.8F, 4.5F, -3.48F, 4, 2, 7, 0.0F);
        this.setRotateAngle(body_armor_lower_left_1, 0.0F, 0.0F, 0.3141592653589793F);
        this.body_armor_lower_right_2 = new ModelRenderer(this, 47, 25);
        this.body_armor_lower_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_lower_right_2.addBox(-5.4F, 5.6F, -2.5F, 3, 2, 5, 0.0F);
        this.setRotateAngle(body_armor_lower_right_2, 0.0F, 0.0F, -0.26179938779914935F);
        this.shoulder_plate_left_5 = new ModelRenderer(this, 0, 25);
        this.shoulder_plate_left_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_left_5.addBox(-0.6F, 0.3F, -1.65F, 5, 2, 4, 0.0F);
        this.leg_right_1 = new ModelRenderer(this, 69, 0);
        this.leg_right_1.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.leg_right_1.addBox(-2.21F, 0.0F, -2.5F, 4, 12, 5, 0.0F);
        this.wrist_plate_right_3 = new ModelRenderer(this, 0, 33);
        this.wrist_plate_right_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wrist_plate_right_3.addBox(-3.8F, 7.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(wrist_plate_right_3, 0.0F, 0.0F, -0.017453292519943302F);
        this.foot_right_1 = new ModelRenderer(this, 19, 19);
        this.foot_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot_right_1.addBox(-2.01F, 10.0F, -4.0F, 4, 2, 2, 0.0F);
        this.finger_right_2 = new ModelRenderer(this, 11, 0);
        this.finger_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_right_2.addBox(-1.21F, 10.0F, -6.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(finger_right_2, 0.08726646259971645F, 0.17453292519943295F, 0.0F);
        this.finger_left_3 = new ModelRenderer(this, 11, 0);
        this.finger_left_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finger_left_3.addBox(-0.81F, 10.0F, -6.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(finger_left_3, 0.08726646259971647F, -0.17453292519943295F, 0.0F);
        this.body_armor_lower_left_2 = new ModelRenderer(this, 48, 25);
        this.body_armor_lower_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_armor_lower_left_2.addBox(2.4F, 5.6F, -2.5F, 3, 2, 5, 0.0F);
        this.setRotateAngle(body_armor_lower_left_2, 0.0F, 0.0F, 0.2617993877991494F);
        this.head_protection_back_1 = new ModelRenderer(this, 0, 20);
        this.head_protection_back_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_protection_back_1.addBox(-3.0F, -2.6F, 2.1F, 6, 1, 2, 0.0F);
        this.setRotateAngle(head_protection_back_1, -1.0471975511965976F, 0.0F, 0.0F);
        this.shoulder_plate_left_3 = new ModelRenderer(this, 20, 26);
        this.shoulder_plate_left_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_left_3.addBox(-1.0F, -1.2F, -2.0F, 5, 1, 4, 0.0F);
        this.setRotateAngle(shoulder_plate_left_3, 0.0F, 0.0F, -0.15707963267948966F);
        this.leg_right_2 = new ModelRenderer(this, 82, 18);
        this.leg_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg_right_2.addBox(1.02F, 0.0F, -2.49F, 1, 12, 5, 0.0F);
        this.shoulder_plate_left_2 = new ModelRenderer(this, 24, 26);
        this.shoulder_plate_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shoulder_plate_left_2.addBox(3.9F, -0.7F, -2.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(shoulder_plate_left_2, 0.0F, 0.0F, -0.15707963267948966F);
        this.kneepad_right_1 = new ModelRenderer(this, 53, 10);
        this.kneepad_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.kneepad_right_1.addBox(-1.5F, 4.0F, -2.99F, 3, 3, 1, 0.0F);
        this.body_armor_main.addChild(this.shoulder_line_left_1);
        this.leg_left_2.addChild(this.foot_left_5);
        this.leg_right_1.addChild(this.finger_right_4);
        this.body_armor_main.addChild(this.shoulder_line_right_8);
        this.shoulder_plate_right_4.addChild(this.wrist_plate_right_1);
        this.body_armor_main.addChild(this.shoulder_line_right_9);
        this.shoulder_plate_left_4.addChild(this.shoulder_plate_left_1);
        this.body_armor_main.addChild(this.shoulder_line_left_4);
        this.shoulder_plate_right_4.addChild(this.shoulder_plate_right_2);
        this.leg_left_2.addChild(this.finger_right_1);
        this.body_armor_main.addChild(this.spine_4);
        this.body_armor_main.addChild(this.body_armor_lower_right);
        this.shoulder_plate_left_4.addChild(this.wrist_plate_left_1);
        this.body_armor_main.addChild(this.body_armor_lower_left);
        this.body_armor_main.addChild(this.body_armor_main_lower);
        this.shoulder_plate_left_4.addChild(this.wrist_plate_left_3);
        this.body_armor_main.addChild(this.shoulder_line_right_3);
        this.leg_left_2.addChild(this.foot_left_1);
        this.leg_left_2.addChild(this.kneepad_left_2);
        this.body_armor_main.addChild(this.spine_3);
        this.leg_left_2.addChild(this.finger_left_4);
        this.leg_right_1.addChild(this.foot_right_2);
        this.body_armor_main.addChild(this.spine_1);
        this.body_armor_main.addChild(this.body_armor_lower_left_3);
        this.body_armor_main.addChild(this.shoulder_line_left_3);
        this.body_armor_main.addChild(this.shoulder_line_right_5);
        this.body_armor_main.addChild(this.shoulder_line_left_8);
        this.shoulder_plate_left_4.addChild(this.wrist_plate_left_2);
        this.leg_left_2.addChild(this.leg_left_1);
        this.leg_right_1.addChild(this.foot_right_3);
        this.body_armor_main.addChild(this.shoulder_line_right_4);
        this.body_armor_main.addChild(this.gem_holder_wide);
        this.leg_right_1.addChild(this.finger_right_1_1);
        this.body_armor_main.addChild(this.body_armor_lower_right_1);
        this.head_protection_front_1.addChild(this.head_protection_back_3);
        this.leg_left_2.addChild(this.kneepad_left_1);
        this.body_armor_main.addChild(this.spine_2);
        this.shoulder_plate_right_4.addChild(this.shoulder_plate_right_3);
        this.body_armor_main.addChild(this.body_armor_lower_right_3);
        this.leg_right_1.addChild(this.foot_right_4);
        this.head_protection_front_1.addChild(this.head_protection_back_2);
        this.body_armor_main.addChild(this.shoulder_line_left_5);
        this.leg_right_1.addChild(this.foot_right_5);
        this.body_armor_main.addChild(this.shoulder_line_left_7);
        this.body_armor_main.addChild(this.gem);
        this.body_armor_main.addChild(this.shoulder_line_left_2);
        this.body_armor_main.addChild(this.shoulder_line_right_1);
        this.body_armor_main.addChild(this.body_armor_lower_mid);
        this.body_armor_main.addChild(this.gem_holder_long);
        this.body_armor_main.addChild(this.shoulder_line_left_6);
        this.body_armor_main.addChild(this.shoulder_line_left_9);
        this.leg_right_1.addChild(this.finger_right_3);
        this.leg_left_2.addChild(this.foot_left_2);
        this.shoulder_plate_right_4.addChild(this.shoulder_plate_right_5);
        this.leg_left_2.addChild(this.finger_left_2);
        this.body_armor_main.addChild(this.shoulder_line_right_2);
        this.head_protection_front_1.addChild(this.head_protection_front_3);
        this.shoulder_plate_right_4.addChild(this.shoulder_plate_right_1);
        this.body_armor_main.addChild(this.body_armor_lower_main);
        this.leg_left_2.addChild(this.foot_left_3);
        this.body_armor_main.addChild(this.shoulder_line_right_7);
        this.head_protection_front_1.addChild(this.head_protection_front_2);
        this.body_armor_main.addChild(this.shoulder_line_right_6);
        this.shoulder_plate_right_4.addChild(this.wrist_plate_right_2);
        this.leg_left_2.addChild(this.foot_left_4);
        this.leg_right_1.addChild(this.kneepad_right_2);
        this.body_armor_main.addChild(this.body_armor_lower_left_1);
        this.body_armor_main.addChild(this.body_armor_lower_right_2);
        this.shoulder_plate_left_4.addChild(this.shoulder_plate_left_5);
        this.shoulder_plate_right_4.addChild(this.wrist_plate_right_3);
        this.leg_right_1.addChild(this.foot_right_1);
        this.leg_right_1.addChild(this.finger_right_2);
        this.leg_left_2.addChild(this.finger_left_3);
        this.body_armor_main.addChild(this.body_armor_lower_left_2);
        this.head_protection_front_1.addChild(this.head_protection_back_1);
        this.shoulder_plate_left_4.addChild(this.shoulder_plate_left_3);
        this.leg_right_1.addChild(this.leg_right_2);
        this.shoulder_plate_left_4.addChild(this.shoulder_plate_left_2);
        this.leg_right_1.addChild(this.kneepad_right_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body_armor_main.render(f5);
        this.head_protection_front_1.render(f5);
        this.leg_left_2.render(f5);
        this.shoulder_plate_right_4.render(f5);
        this.shoulder_plate_left_4.render(f5);
        this.leg_right_1.render(f5);
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
