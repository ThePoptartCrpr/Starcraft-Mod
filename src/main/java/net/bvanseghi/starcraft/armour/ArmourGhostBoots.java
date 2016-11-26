package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourGhostBoots extends ItemArmor {

	public static final String name = "ghostBoots";

	public ArmourGhostBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
 		this.setCreativeTab(null);
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + name);
	}
}
