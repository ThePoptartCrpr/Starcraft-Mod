package ga.scmc.blocks;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Energy block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author Hypeirochus
 */
public class BlockVoidEnergy extends ModBlocks {

	public BlockVoidEnergy() {
		super(Material.REDSTONE_LIGHT);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_VOID_ENERGY.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_VOID_ENERGY.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setLightLevel(1.0F);
		setHarvestLevel("???", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}