package scmc.tools;

import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class ToolSteelHoe extends ItemHoe {

	public ToolSteelHoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}