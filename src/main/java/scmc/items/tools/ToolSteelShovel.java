package scmc.items.tools;

import net.minecraft.item.ItemSpade;
import scmc.lib.Reference;

public class ToolSteelShovel extends ItemSpade {

	public ToolSteelShovel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.TOOL_STEEL_SHOVEL.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_STEEL_SHOVEL.getRegistryRL());
	}
}