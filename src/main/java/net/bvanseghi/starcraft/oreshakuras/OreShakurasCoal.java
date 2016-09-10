package net.bvanseghi.starcraft.oreshakuras;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreShakurasCoal extends ModBlocks {

	public static final String name = "oreCoalS";

	public OreShakurasCoal() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setBlockName(name);
		setBlockTextureName(REFERENCE.MODID + ":" + name);
	}
	
	public int damageDropped(int par1) {
		return par1;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Items.coal;
	    }
}
