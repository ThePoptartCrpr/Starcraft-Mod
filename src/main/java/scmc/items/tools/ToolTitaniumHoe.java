package scmc.items.tools;

import net.minecraft.item.ItemHoe;
import scmc.lib.Reference;

public class ToolTitaniumHoe extends ItemHoe {

	public ToolTitaniumHoe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_HOE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_TITANIUM_HOE.getRegistryRL());
	}
}