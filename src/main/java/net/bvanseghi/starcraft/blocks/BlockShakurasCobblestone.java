package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockShakurasCobblestone extends ModBlocks {

	public BlockShakurasCobblestone() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	public int damageDropped(int par1) {
		return par1;

	}

}