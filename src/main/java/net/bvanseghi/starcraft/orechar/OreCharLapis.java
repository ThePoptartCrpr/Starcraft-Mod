package net.bvanseghi.starcraft.orechar;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreCharLapis extends ModBlocks {

	public static final String name = "oreLapisC";

	public OreCharLapis() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setBlockName(name);
		setBlockTextureName(REFERENCE.MODID + ":" + name);
	}
	
	public int damageDropped(int par1) {
		return 4;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Items.dye;
	    }
	 
	 public int quantityDropped(Random rand)
	    {
		 return 4 + rand.nextInt(4);
	    }
	 
	 
}
