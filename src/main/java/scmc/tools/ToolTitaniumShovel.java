package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class ToolTitaniumShovel extends ItemSpade {

	public ToolTitaniumShovel(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}