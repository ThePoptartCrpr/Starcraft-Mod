package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemHoe;

public class ToolCopperHoe extends ItemHoe {

	public ToolCopperHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_HOE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}