package ga.scmc.items.tools;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemHoe;

public class ToolTitaniumHoe extends ItemHoe {

	public ToolTitaniumHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_TITANIUM_HOE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}