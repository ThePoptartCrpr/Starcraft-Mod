package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockVoidEnergyBlock extends ModBlocks {
	
	public BlockVoidEnergyBlock() {
		super(Material.REDSTONE_LIGHT);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		// setHarvestLevel("???", 0);
	}
}
