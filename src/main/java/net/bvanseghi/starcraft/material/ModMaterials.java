package net.bvanseghi.starcraft.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;

public class ModMaterials {
	public static Material acid;
	public static Material blood;

	public static void preInit() {
		acid = new MaterialLiquid(MapColor.greenColor);
		blood = new MaterialLiquid(MapColor.redColor);
	}

}