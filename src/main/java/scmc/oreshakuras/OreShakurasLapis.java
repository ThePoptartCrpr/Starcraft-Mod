package net.bvanseghi.starcraft.oreshakuras;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreShakurasLapis extends ModBlocks {

	public OreShakurasLapis() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
		setUnlocalizedName(Reference.ModBlocks.ORE_LAPIS_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_LAPIS_S.getRegistryRL());
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
