package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Energy block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author Hypeirochus
 */
public class BlockEnergy extends ModBlocks {

	public BlockEnergy() {
		super(Material.REDSTONE_LIGHT);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ENERGY.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ENERGY.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setLightLevel(1.0F);
		setHarvestLevel("???", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}