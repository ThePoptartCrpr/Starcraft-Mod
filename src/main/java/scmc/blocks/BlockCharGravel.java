package scmc.blocks;

import net.minecraft.block.BlockGravel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

/**
 * Char Gravel block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author Hypeirochus
 */
public class BlockCharGravel extends BlockGravel {

	public BlockCharGravel() {
		super();
		setUnlocalizedName(Reference.ModBlocks.BLOCK_GRAVEL_CHAR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_GRAVEL_CHAR.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
		this.setSoundType(SoundType.SAND);
	}
}
