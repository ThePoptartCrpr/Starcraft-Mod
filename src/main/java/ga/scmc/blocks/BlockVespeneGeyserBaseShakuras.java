package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockVespeneGeyserBaseShakuras extends ModBlocks {

	public BlockVespeneGeyserBaseShakuras() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_S.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

}