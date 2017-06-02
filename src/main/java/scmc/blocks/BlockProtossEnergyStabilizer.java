package scmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

/**
 * Protoss Energy Stabilizer block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockProtossEnergyStabilizer extends ModBlocks {
	public BlockProtossEnergyStabilizer() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_ENERGY_STABILIZER.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_ENERGY_STABILIZER.getRegistryRL());
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(StarcraftCreativeTabs.DECORATION);
	}
}
