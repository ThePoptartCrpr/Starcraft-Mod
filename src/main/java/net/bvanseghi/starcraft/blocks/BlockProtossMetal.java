package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Copyright 2016 the Starcraft Minecraft mod team
public class BlockProtossMetal extends Block {

	/**
	 *  Aiur = yellow, Dark = dark grey.
	 */
	public static final String[] subBlocks = new String[] {"Aiur", "Dark", "Blue", "Green"};
	
	public BlockProtossMetal() {
		super(Material.IRON);
		setRegistryName(new ResourceLocation(Reference.RL_BASE + "protoss_metal"));
		setUnlocalizedName(Reference.UN_BASE + "protossMetal");
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
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
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
}
