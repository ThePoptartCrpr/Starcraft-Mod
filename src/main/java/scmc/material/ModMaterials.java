package scmc.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;

public class ModMaterials {

	public static Material ACID;
	public static Material BLOOD;

	public static void preInit() {
		ACID = new MaterialLiquid(MapColor.GREEN);
		BLOOD = new MaterialLiquid(MapColor.RED);
	}
}