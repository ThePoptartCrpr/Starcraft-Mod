package ga.scmc.blocks;

import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/BlockCharDirt.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/BlockCharDirt.java

/**
 * Char Dirt block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * @author He of a Former Time
 */
public class BlockCharDirt extends ModBlocks {

	public BlockCharDirt() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_DIRT_CHAR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_DIRT_CHAR.getRegistryRL());
		setSoundType(SoundType.GROUND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
