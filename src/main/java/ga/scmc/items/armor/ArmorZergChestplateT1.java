package ga.scmc.items.armor;

import ga.scmc.Starcraft;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorZergChestplateT1 extends ItemArmor {

	public ArmorZergChestplateT1(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T1.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T1.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
	
	@Override 	
	@SideOnly(Side.CLIENT)
		public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
				ModelBiped defaultModel) {

			if (itemStack != null) {
				if (itemStack.getItem() instanceof ItemArmor) {

					EntityEquipmentSlot type = ((ItemArmor) itemStack.getItem()).armorType;
					ModelBiped armorModel = null;
					switch (type) {
					case HEAD:
						armorModel = Starcraft.proxy.getZergArmorT1Model(0);
						break;
					case LEGS:
						armorModel = Starcraft.proxy.getZergArmorT1Model(2);
						break;
					case FEET:
						armorModel = Starcraft.proxy.getZergArmorT1Model(3);
						break;
					case CHEST:
						armorModel = Starcraft.proxy.getZergArmorT1Model(1);
						break;
					default:
						break;
					}

					armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
					armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
					armorModel.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST)
							|| (armorSlot == EntityEquipmentSlot.CHEST);
					armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
					armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
					armorModel.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS)
							|| (armorSlot == EntityEquipmentSlot.FEET);
					armorModel.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS)
							|| (armorSlot == EntityEquipmentSlot.FEET);

					armorModel.isSneak = defaultModel.isSneak;
					armorModel.isRiding = defaultModel.isRiding;
					armorModel.isChild = defaultModel.isChild;
					armorModel.rightArmPose = defaultModel.rightArmPose;
					armorModel.leftArmPose = defaultModel.leftArmPose;

					return armorModel;
				}
			}
			return null;
	}

	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if (stack.toString().contains("Leggings")) {
			return Reference.RL_BASE + "textures/models/armor/" + "zerg_armor_t1_layer" + "_2.png";
		}
		return Reference.RL_BASE + "textures/models/armor/" + "zerg_armor_t1_layer" + "_1.png";
	}
}
