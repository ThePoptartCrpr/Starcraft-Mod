package net.bvanseghi.starcraft.orechar;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreCharAlien extends ModBlocks {
	
	public OreCharAlien() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setUnlocalizedName(Reference.ModBlocks.ORE_ALIEN_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_ALIEN_C.getRegistryRL());
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	public int damageDropped(int par1) {
		return par1;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Item.getItemFromBlock(this);
	    }
}
