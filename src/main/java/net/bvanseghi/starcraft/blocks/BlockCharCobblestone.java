package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.material.Material;

public class BlockCharCobblestone extends ModBlocks {

	public static final String name = "charCobblestone";

	public BlockCharCobblestone() {
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