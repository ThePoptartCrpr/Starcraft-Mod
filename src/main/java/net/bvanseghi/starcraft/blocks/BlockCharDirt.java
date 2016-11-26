package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;

public class BlockCharDirt extends ModBlocks {

	public static final String name = "charDirt";

	public BlockCharDirt() {
		super(name, name, Material.GROUND);
		setStepSound(soundTypeGravel);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
	}
}
