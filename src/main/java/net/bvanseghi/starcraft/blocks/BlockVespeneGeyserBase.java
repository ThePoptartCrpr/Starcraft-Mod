package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockVespeneGeyserBase extends ModBlocks {

	public BlockVespeneGeyserBase() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
