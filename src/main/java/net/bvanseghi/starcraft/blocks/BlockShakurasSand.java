package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockShakurasSand extends BlockFalling {

	public BlockShakurasSand() {
		super(Material.SAND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_SAND_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_SAND_S.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setResistance(2.5F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	public int damageDropped(int par1) {
		return par1;

	}

}