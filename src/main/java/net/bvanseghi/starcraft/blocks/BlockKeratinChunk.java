package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;

public class BlockKeratinChunk extends ModBlocks {

	public static final String name = "keratinChunk";

	public BlockKeratinChunk() {
		super(name, name, Material.ground);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
