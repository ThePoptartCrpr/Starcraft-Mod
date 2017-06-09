package scmc.items.tools;

import net.minecraft.item.ItemHoe;
import scmc.lib.Reference;

public class ToolTitaniumHoe extends ItemHoe {

	public ToolTitaniumHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_TITANIUM_HOE.getRegistryRL());
	}
}