package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAlienOre extends ModBlocks {

	public static final String name = "alienOre";

	public BlockAlienOre() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
