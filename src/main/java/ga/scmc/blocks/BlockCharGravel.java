package ga.scmc.blocks;

import ga.scmc.lib.Reference;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.SoundType;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/BlockCharGravel.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/BlockCharGravel.java

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
