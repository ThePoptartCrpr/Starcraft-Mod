package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockKeratinChunk extends ModBlocks {
	public static final String name = "keratin_chunk";

	public BlockKeratinChunk() {
		super(name, name, Material.GROUND);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
