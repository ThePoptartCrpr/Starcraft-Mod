package scmc.orechar;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import scmc.CreativeTab;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreCharLapis extends ModBlocks {

	public OreCharLapis() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
		setUnlocalizedName(Reference.ModBlocks.ORE_LAPIS_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_LAPIS_C.getRegistryRL());
	}
	
	public int damageDropped(int par1) {
		return 4;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Items.DYE;
	    }
	 
	 public int quantityDropped(Random rand)
	    {
		 return 4 + rand.nextInt(4);
	    }
	 
	 
}