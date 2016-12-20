package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Copyright 2016 the Starcraft Minecraft mod team
public class BlockProtossMetal extends Block {

	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon[] texture;
	
	/**
	 *  Aiur = yellow, Dark = dark grey.
	 */
	public static final String[] subBlocks = new String[] {"Aiur", "Dark", "Blue", "Green"};
	
	public BlockProtossMetal() {
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "protossMetal" + subBlocks[i]);
		}
	}*/
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return texture[meta];
	}*/
	
	public int damageDropped(int meta) {
		return meta;
	}
}
