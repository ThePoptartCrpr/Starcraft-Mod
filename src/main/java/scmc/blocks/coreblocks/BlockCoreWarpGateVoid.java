package scmc.blocks.coreblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class BlockCoreWarpGateVoid extends Block {
	public BlockCoreWarpGateVoid() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_VOID.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_VOID.getRegistryRL());
		setSoundType(SoundType.STONE);
		//setHardness(2.0F);
		//setResistance(5.0F);
		//setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}
}
=======
package scmc.blocks.coreblocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.CreativeTab;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class BlockCoreWarpGateVoid extends ModBlocks {
	public BlockCoreWarpGateVoid() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_VOID.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_VOID.getRegistryRL());
		setSoundType(SoundType.STONE);
		//setHardness(2.0F);
		//setResistance(5.0F);
		//setHarvestLevel("pickaxe", 0);
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}
}
