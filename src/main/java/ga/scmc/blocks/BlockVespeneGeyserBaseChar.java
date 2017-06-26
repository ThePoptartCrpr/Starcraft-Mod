package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockVespeneGeyserBaseChar extends ModBlocks {

	public BlockVespeneGeyserBaseChar() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_C.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

}