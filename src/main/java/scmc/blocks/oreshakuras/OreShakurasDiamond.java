package scmc.oreshakuras;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreShakurasDiamond extends ModBlocks {

	public OreShakurasDiamond() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(StarcraftCreativeTabs.BUILDING);
		setUnlocalizedName(Reference.ModBlocks.ORE_DIAMOND_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_DIAMOND_S.getRegistryRL());
	}
	
	public int damageDropped(int par1) {
		return par1;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Items.DIAMOND;
	    }
}
=======
package scmc.blocks.oreshakuras;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import scmc.CreativeTab;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreShakurasDiamond extends ModBlocks {

	public OreShakurasDiamond() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
		setUnlocalizedName(Reference.ModBlocks.ORE_DIAMOND_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_DIAMOND_S.getRegistryRL());
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Items.DIAMOND;
	}
}
