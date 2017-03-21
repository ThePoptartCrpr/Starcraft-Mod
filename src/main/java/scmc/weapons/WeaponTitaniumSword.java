package scmc.weapons;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class WeaponTitaniumSword extends ItemSword {

	public WeaponTitaniumSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}