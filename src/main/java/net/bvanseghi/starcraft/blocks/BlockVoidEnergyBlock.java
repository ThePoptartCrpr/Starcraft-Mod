package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;

public class BlockVoidEnergyBlock extends ModBlocks {
	public static final String name = "voidEnergyBlock";

	public BlockVoidEnergyBlock() {
		super(name, name, Material.redstoneLight);
		// setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(3.0F);
		// setHarvestLevel("???", 0);
	}
}
