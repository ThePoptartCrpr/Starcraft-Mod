package scmc.items.tools;

import net.minecraft.item.ItemHoe;
import scmc.lib.Reference;

public class ToolCopperHoe extends ItemHoe {

	public ToolCopperHoe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.TOOL_COPPER_HOE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_COPPER_HOE.getRegistryRL());
	}
}