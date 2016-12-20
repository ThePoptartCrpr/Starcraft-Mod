package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCharStone extends ModBlocks {
	public static final String name = "char_stone";

	public BlockCharStone() {
		super(name, name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setUnlocalizedName(name);
		setRegistryName(Reference.MODID + ":" + name);
	}
	
	public int damageDropped(int par1) {
		return par1;
	}
	
	 public Item getItemDropped(int par1, Random rand, int par3) {
		 return Item.getItemFromBlock(ModBlocks.cobblestoneChar);
	 }
}
