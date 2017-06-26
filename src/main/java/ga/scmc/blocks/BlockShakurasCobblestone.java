package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockShakurasCobblestone extends ModBlocks {

	public BlockShakurasCobblestone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_COBBLESTONE_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_S.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	public int damageDropped(int par1) {
		return par1;

	}
}