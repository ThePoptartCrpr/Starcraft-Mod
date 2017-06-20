package ga.scmc.blocks;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Char Cobblestone block.<br>
 * Copyright 2017 the Starcraft Minecraft (SCMC) mod team
 * @author He of a Former Time
 */
public class BlockCharCobblestone extends ModBlocks {

	public BlockCharCobblestone() {
		super(Material.ROCK);
		setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_CHAR.getRegistryName());
		setUnlocalizedName(Reference.ModBlocks.BLOCK_COBBLESTONE_CHAR.getUnlocalizedName());
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
