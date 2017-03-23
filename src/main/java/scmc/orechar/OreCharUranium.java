package scmc.orechar;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import scmc.CreativeTab;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreCharUranium extends ModBlocks {

	public OreCharUranium() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
		setUnlocalizedName(Reference.ModBlocks.ORE_URANIUM_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_URANIUM_C.getRegistryRL());
	}
	
	public int damageDropped(int par1) {
		return par1;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Item.getItemFromBlock(this);
	    }
}