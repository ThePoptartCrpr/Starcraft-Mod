package scmc.oreshakuras;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import scmc.CreativeTab;
import scmc.blocks.ModBlocks;
import scmc.items.ModItems;
import scmc.lib.Reference;

public class OreShakurasRichMineral extends ModBlocks {

	public OreShakurasRichMineral() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
		setUnlocalizedName(Reference.ModBlocks.ORE_RICHMINERAL_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_RICHMINERAL_S.getRegistryRL());
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