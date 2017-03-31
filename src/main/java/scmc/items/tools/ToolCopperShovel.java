package scmc.items.tools;

import net.minecraft.item.ItemSpade;
import scmc.lib.Reference;

public class ToolCopperShovel extends ItemSpade {

	public ToolCopperShovel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.TOOL_COPPER_SHOVEL.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_COPPER_SHOVEL.getRegistryRL());
	}
}