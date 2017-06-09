package scmc.items.tools;

import net.minecraft.item.ItemSpade;
import scmc.lib.Reference;

public class ToolTitaniumShovel extends ItemSpade {

	public ToolTitaniumShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_TITANIUM_SHOVEL.getRegistryRL());
	}
}