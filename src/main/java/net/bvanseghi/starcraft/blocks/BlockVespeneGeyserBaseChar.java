package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;

public class BlockVespeneGeyserBaseChar extends ModBlocks {

	public static final String name = "vespeneGeyserBaseChar";

	public BlockVespeneGeyserBaseChar() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
