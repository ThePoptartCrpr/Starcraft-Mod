package scmc.items.tools;

import net.minecraft.item.ItemPickaxe;
import scmc.lib.Reference;

public class ToolTitaniumPickaxe extends ItemPickaxe {

	public ToolTitaniumPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_TITANIUM_PICKAXE.getRegistryRL());
	}
}