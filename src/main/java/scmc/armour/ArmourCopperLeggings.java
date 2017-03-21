package scmc.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class ArmourCopperLeggings extends ItemArmor {
	private static String name = "copper_leggings";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.RL_BASE + name);

	public ArmourCopperLeggings(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setRegistryName(REGISTRY_RL);
		setUnlocalizedName(name);
	}
}