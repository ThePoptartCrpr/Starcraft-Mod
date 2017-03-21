package scmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.CreativeTab;
import scmc.lib.Reference;

public class BlockShakurasCobblestone extends ModBlocks {

	public BlockShakurasCobblestone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_COBBLESTONE_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_S.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}

	public int damageDropped(int par1) {
		return par1;

	}

}