package scmc.ore;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreOWCopper extends ModBlocks {

	public OreOWCopper() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setUnlocalizedName(Reference.ModBlocks.ORE_COPPER_OW.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_COPPER_OW.getRegistryRL());
	}
	
	public int damageDropped(int par1) {
		return par1;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Item.getItemFromBlock(this);
	    }
}
