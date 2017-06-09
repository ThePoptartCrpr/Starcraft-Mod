package scmc.items.tools;

import net.minecraft.item.ItemHoe;
import scmc.lib.Reference;

public class ToolSteelHoe extends ItemHoe {

	public ToolSteelHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_HOE.getRegistryRL());
	}
}