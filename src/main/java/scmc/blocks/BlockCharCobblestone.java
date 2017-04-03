package scmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

/**
 * Char Cobblestone block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockCharCobblestone extends Block {
	public BlockCharCobblestone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_COBBLESTONE_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_C.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}
}
=======
package scmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.CreativeTab;
import scmc.lib.Reference;

/**
 * Char Cobblestone block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockCharCobblestone extends ModBlocks {
	public BlockCharCobblestone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_COBBLESTONE_CHAR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_CHAR.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}
}
