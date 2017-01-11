package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

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
