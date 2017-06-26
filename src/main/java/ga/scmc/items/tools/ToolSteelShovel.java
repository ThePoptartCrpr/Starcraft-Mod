package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSpade;

public class ToolSteelShovel extends ItemSpade {

	public ToolSteelShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_SHOVEL.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}