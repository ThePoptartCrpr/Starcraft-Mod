package scmc.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class ToolTitaniumPickaxe extends ItemPickaxe {

	public ToolTitaniumPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}