package ga.scmc.blocks;

import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/BlockKeratinChunk.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/BlockKeratinChunk.java

/**
 * Keratin Chunk block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockKeratinChunk extends ModBlocks {

	public BlockKeratinChunk() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_KERATIN_CHUNK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_KERATIN_CHUNK.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}