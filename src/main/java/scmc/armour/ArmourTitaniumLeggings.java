package scmc.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class ArmourTitaniumLeggings extends ItemArmor {
	private static String name = "titanium_leggings";
	public static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.RL_BASE + name);

	public ArmourTitaniumLeggings(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setRegistryName(REGISTRY_RL);
		setUnlocalizedName(name);
	}
}