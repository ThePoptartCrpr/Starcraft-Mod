package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemPickaxe;

public class ToolTitaniumPickaxe extends ItemPickaxe {

	public ToolTitaniumPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_TITANIUM_PICKAXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}