package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockEnergyBlock extends ModBlocks {
	public BlockEnergyBlock() {
		super(Material.REDSTONE_LIGHT);
		setRegistryName(new ResourceLocation(Reference.MODID + ":energy_block"));
		setUnlocalizedName("energyBlock");
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setLightLevel(1.0F);
		setHarvestLevel("???", 0);
	}
}
