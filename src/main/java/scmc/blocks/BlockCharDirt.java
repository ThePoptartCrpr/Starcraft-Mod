package scmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

/**
 * Char Dirt block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * @author He of a Former Time
 */
public class BlockCharDirt extends Block {
	public BlockCharDirt() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_DIRT_CHAR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_DIRT_CHAR.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}
}
