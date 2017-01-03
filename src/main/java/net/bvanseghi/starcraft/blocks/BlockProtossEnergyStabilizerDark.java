package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockProtossEnergyStabilizerDark extends Block {
	public BlockProtossEnergyStabilizerDark() {
		super(Material.ROCK);
		setRegistryName(new ResourceLocation(Reference.RL_BASE + "protoss_energy_stabilizer_d"));
		setUnlocalizedName(Reference.UN_BASE + "protossEnergyStabilizerD");
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTab.TabStarcraftDecorativeBlocks);
	}
}
