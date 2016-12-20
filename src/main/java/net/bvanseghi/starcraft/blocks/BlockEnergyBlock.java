package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;

public class BlockEnergyBlock extends ModBlocks {
	public static final String name = "energyBlock";

	public BlockEnergyBlock() {
		super(name, name, Material.REDSTONE_LIGHT);
		// setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(3.0F);
		setLightLevel(1.0F);
		// setHarvestLevel("???", 0);
	}
}
