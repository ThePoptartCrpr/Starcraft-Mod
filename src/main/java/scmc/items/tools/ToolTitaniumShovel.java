package scmc.items.tools;

import net.minecraft.item.ItemSpade;
import scmc.lib.Reference;

public class ToolTitaniumShovel extends ItemSpade {

	public ToolTitaniumShovel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_SHOVEL.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_TITANIUM_SHOVEL.getRegistryRL());
	}
}