package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCompressedMetals extends Block {

	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon[] texture;
	
	/**
	 *  Aiur = yellow, Dark = dark grey.
	 */
	public static final String[] subBlocks = new String[] { "Copper", "Titanium", "Steel" };
	
	public BlockCompressedMetals() {
		super(Material.IRON);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "compMetal" + subBlocks[i]);
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