package scmc.items.tools;

import net.minecraft.item.ItemSpade;
import scmc.lib.Reference;

public class ToolSteelShovel extends ItemSpade {

	public ToolSteelShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_SHOVEL.getRegistryRL());
	}
}