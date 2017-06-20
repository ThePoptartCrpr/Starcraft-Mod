package ga.scmc.items.tools;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSpade;

public class ToolCopperShovel extends ItemSpade {

	public ToolCopperShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_SHOVEL.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}