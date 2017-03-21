package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

public class ToolCopperHoe extends ItemHoe {

	public ToolCopperHoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}