package net.bvanseghi.starcraft.weapons;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class WeaponMasterPsiBlade extends ItemSword {

	public WeaponMasterPsiBlade(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}