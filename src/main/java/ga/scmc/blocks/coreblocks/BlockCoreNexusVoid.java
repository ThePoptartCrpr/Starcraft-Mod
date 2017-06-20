package ga.scmc.blocks.coreblocks;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.blocks.ModBlocks;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCoreNexusVoid extends ModBlocks {

	public BlockCoreNexusVoid() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_NEXUS_VOID.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_NEXUS_VOID.getRegistryRL());
		setSoundType(SoundType.STONE);
		// setHardness(2.0F);
		// setResistance(5.0F);
		// setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
