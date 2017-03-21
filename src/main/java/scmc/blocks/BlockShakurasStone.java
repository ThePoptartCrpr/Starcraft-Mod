package scmc.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import scmc.CreativeTab;
import scmc.lib.Reference;

public class BlockShakurasStone extends ModBlocks {

	public BlockShakurasStone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_STONE_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_STONE_S.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}

	public int damageDropped(int par1) {
		return par1;

	}
	
	 public Item getItemDropped(int par1, Random rand, int par3)
	    {
	        return Item.getItemFromBlock(ModBlocks.COBBLESTONE_SHAKURAS);
	    }
	
	

}