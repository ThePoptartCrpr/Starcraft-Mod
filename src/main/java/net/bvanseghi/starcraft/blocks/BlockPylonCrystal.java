package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPylonCrystal extends Block {
	public static final String[] subBlocks = new String[] { "Pure", "Dark", "Void" };
	
	public BlockPylonCrystal() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(20.0F);
		setLightLevel(4.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if(rand.nextInt(9) == 0){
			return ModItems.energy;
		} else {
			return null;
		}
    }
	
	@Override
	public int damageDropped(IBlockState state) {
		if(getMetaFromState(state) == 0) {
			return this == ModBlocks.crystals ? 0 : 0;
		}else if(getMetaFromState(state) == 1) {
			return this == ModBlocks.crystals ? 1 : 0;
		}else if(getMetaFromState(state) == 2) {
			return this == ModBlocks.crystals ? 2 : 0;
		} else {
			return 0;
		}
    }
}
