package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.material.Material;

public class BlockShakurasCobblestone extends ModBlocks {

	public static final String name = "shakurasCobblestone";

	public BlockShakurasCobblestone() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setResistance(5.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	public int damageDropped(int par1) {
		return par1;

	}

}