package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

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