package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmourGhostChestplate extends ItemArmor {
	private static String name = "ghost_chestplate";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.TEXTURE_PATH_BASE + name);

	public ArmourGhostChestplate(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
 		setCreativeTab(null);
 		setRegistryName(REGISTRY_RL);
		setUnlocalizedName(Reference.UNLOCALIZED_NAME_PATH_BASE + name);
	}
}
