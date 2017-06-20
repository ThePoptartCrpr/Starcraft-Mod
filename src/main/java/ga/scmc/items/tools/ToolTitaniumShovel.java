package ga.scmc.items.tools;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSpade;

public class ToolTitaniumShovel extends ItemSpade {

	public ToolTitaniumShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_TITANIUM_SHOVEL.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}