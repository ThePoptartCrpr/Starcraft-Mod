package scmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.lib.Reference;

/**
 * Energy block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockEnergyBlock extends ModBlocks {
	public BlockEnergyBlock() {
		super(Material.REDSTONE_LIGHT);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ENERGY.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ENERGY.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setLightLevel(1.0F);
		setHarvestLevel("???", 0);
	}
}
