package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourTitaniumHelmet extends ItemArmor {

	public static final String name = "titaniumHelmet";

	public ArmourTitaniumHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + name);
	}
}
