package scmc.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

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