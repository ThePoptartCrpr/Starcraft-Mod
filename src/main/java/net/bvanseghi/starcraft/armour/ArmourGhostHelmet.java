package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmourGhostHelmet extends ItemArmor {
	private static String name = "ghost_helmet";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.RL_BASE + name);

	public ArmourGhostHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
 		setCreativeTab(null);
 		setRegistryName(REGISTRY_RL);
		setUnlocalizedName(Reference.UN_BASE + name);
	}
}
