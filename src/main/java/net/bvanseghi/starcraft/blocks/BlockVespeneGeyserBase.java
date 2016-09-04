package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockVespeneGeyserBase extends ModBlocks {

	public static final String name = "vespeneGeyserBase";

	public BlockVespeneGeyserBase() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
