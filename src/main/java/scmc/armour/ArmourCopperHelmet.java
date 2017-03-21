package scmc.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import scmc.CreativeTab;
import scmc.lib.Reference;

public class ArmourCopperHelmet extends ItemArmor {
	private static String name = "copper_helmet";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.RL_BASE + name);

	public ArmourCopperHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setCreativeTab(CreativeTab.tabStarcraftCombat);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_HELMET.getRegistryRL());
	}
}
