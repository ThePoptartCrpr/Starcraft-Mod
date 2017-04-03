package scmc.oreshakuras;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreShakurasIron extends ModBlocks {

	public OreShakurasIron() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(StarcraftCreativeTabs.BUILDING);
		setUnlocalizedName(Reference.ModBlocks.ORE_IRON_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_IRON_S.getRegistryRL());
	}
	
	public int damageDropped(int par1) {
		return par1;

	}
	
	public Item getItemDropped(int par1, Random rand, int par3) {
		return Item.getItemFromBlock(this);
	}
}
