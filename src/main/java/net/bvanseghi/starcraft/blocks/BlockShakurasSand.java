package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockShakurasSand extends BlockFalling {

	public static final String name = "shakurasSand";

	public BlockShakurasSand() {
		super(Material.sand);
		setStepSound(soundTypeSand);
		setHardness(0.5F);
		setResistance(2.5F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setBlockName(name);
		setBlockTextureName(Reference.MODID + ":" + name);
	}

	public int damageDropped(int par1) {
		return par1;

	}

}