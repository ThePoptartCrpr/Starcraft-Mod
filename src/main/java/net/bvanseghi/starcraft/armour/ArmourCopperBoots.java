package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmourCopperBoots extends ItemArmor {
	private static String name = "copper_boots";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.RL_BASE + name);

	public ArmourCopperBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setCreativeTab(CreativeTab.TabStarcraftCombat);
		setRegistryName(REGISTRY_RL);
		setUnlocalizedName(Reference.UN_BASE + name);
	}
}
