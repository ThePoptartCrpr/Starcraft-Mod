package scmc.items.tools;

import net.minecraft.item.ItemSpade;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ToolCopperShovel extends ItemSpade {

	public ToolCopperShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_SHOVEL.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}