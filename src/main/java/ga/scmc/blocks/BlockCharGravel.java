package ga.scmc.blocks;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.SoundType;

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
		setCreativeTab(StarcraftCreativeTabs.MISC);
		this.setSoundType(SoundType.GROUND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
	}
}
