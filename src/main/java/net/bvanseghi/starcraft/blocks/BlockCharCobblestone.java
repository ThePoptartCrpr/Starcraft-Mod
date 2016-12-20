package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCharCobblestone extends ModBlocks {
	public static final String name = "char_cobblestone";

	public BlockCharCobblestone() {
		super(name, name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	public int damageDropped(int par1) {
		return par1;
	}
}
