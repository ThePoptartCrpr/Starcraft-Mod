package ga.scmc.items.tools;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemHoe;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/tools/ToolSteelHoe.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/tools/ToolSteelHoe.java

public class ToolSteelHoe extends ItemHoe {

	public ToolSteelHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_HOE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}