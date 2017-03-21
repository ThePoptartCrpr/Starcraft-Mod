package scmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.lib.Reference;

public class BlockKeratinChunk extends ModBlocks {
	public BlockKeratinChunk() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_KERATIN_CHUNK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_KERATIN_CHUNK.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
