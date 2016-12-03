package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmourTitaniumBoots extends ItemArmor {
	private static String name = "titanium_boots";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.TEXTURE_PATH_BASE + name);
	
	public ArmourTitaniumBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setCreativeTab(CreativeTab.TabStarcraftCombat);
		setRegistryName(REGISTRY_RL);
		setUnlocalizedName(Reference.UNLOCALIZED_NAME_PATH_BASE + name);
	}
}