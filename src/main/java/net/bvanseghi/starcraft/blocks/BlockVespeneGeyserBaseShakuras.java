package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;

public class BlockVespeneGeyserBaseShakuras extends ModBlocks {

	public static final String name = "vespeneGeyserBaseShakuras";

	public BlockVespeneGeyserBaseShakuras() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
