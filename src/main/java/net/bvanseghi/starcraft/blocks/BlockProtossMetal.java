package net.bvanseghi.starcraft.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockProtossMetal extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	/**
	 *  Aiur = yellow, Dark = dark grey.
	 */
	public static final String[] subBlocks = new String[] { "Aiur", "Dark", "Blue", "Green" };
	
	public BlockProtossMetal() {
		super(Material.iron);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "protossMetal" + subBlocks[i]);
		}
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		
		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return texture[meta];
	}
	
	public int damageDropped(int meta) {
		return meta;
	}
}