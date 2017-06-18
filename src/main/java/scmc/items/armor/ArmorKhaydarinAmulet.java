package scmc.items.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.Starcraft;
import scmc.lib.Reference;

public class ArmorKhaydarinAmulet extends ItemArmor {

	public ArmorKhaydarinAmulet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_KHAYDARIN_AMULET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_KHAYDARIN_AMULET.getRegistryRL());
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
					armorModel = Starcraft.proxy.getArmorModel(0);
					break;
				case FEET:
				case CHEST:
					armorModel = Starcraft.proxy.getArmorModel(1);
					break;
				default:
					break;
				}

				armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}
	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Reference.RL_BASE + "textures/models/armor/" + "khaydarin_amulet_layer" + "_1.png";
	}
}
