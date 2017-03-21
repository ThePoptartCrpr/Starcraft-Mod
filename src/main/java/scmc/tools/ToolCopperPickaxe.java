package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ToolCopperPickaxe extends ItemPickaxe {

	public ToolCopperPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}