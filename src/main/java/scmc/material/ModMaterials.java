package scmc.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;

public class ModMaterials {

	public static Material acid;
	public static Material blood;

	public static void preInit() {
		acid = new MaterialLiquid(MapColor.GREEN);
		blood = new MaterialLiquid(MapColor.RED);
	}
}