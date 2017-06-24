package ga.scmc.items.tools;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemHoe;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/tools/ToolCopperHoe.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/tools/ToolCopperHoe.java

public class ToolCopperHoe extends ItemHoe {

	public ToolCopperHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_HOE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}