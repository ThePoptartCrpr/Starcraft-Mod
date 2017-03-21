package scmc.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class ToolSteelShovel extends ItemSpade {

	public ToolSteelShovel(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}