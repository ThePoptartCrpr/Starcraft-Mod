package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmourCopperChestplate extends ItemArmor {
	private static String name = "copper_chestplate";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.RL_BASE + name);

	public ArmourCopperChestplate(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setCreativeTab(CreativeTab.TabStarcraftCombat);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_CHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_CHESTPLATE.getRegistryRL());
	}
}