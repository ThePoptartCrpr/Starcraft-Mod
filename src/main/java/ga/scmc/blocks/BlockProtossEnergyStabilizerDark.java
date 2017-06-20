package ga.scmc.blocks;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Dark Protoss Energy Stabilizer block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockProtossEnergyStabilizerDark extends ModBlocks {

	public BlockProtossEnergyStabilizerDark() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_DARK_ENERGY_STABILIZER.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_DARK_ENERGY_STABILIZER.getRegistryRL());
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
