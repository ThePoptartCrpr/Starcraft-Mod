package net.bvanseghi.starcraft.orechar;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreCharRichMineral extends ModBlocks {

	public OreCharRichMineral() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setUnlocalizedName(Reference.ModBlocks.ORE_RICHMINERAL_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_RICHMINERAL_C.getRegistryRL());
	}
	
	public int damageDropped(int par1) {
		return par1;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return ModItems.richMineralShard;
	    }
	 
	 public int quantityDropped(Random rand)
	    {
		 return 4 + rand.nextInt(4);
	    }
}
