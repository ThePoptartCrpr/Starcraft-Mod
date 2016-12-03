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

public class BlockZergStructureCarapace extends Block {

	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon[] texture;
	
	public static final String[] subBlocks = new String[] { "T1", "T2", "T3" };
	
	public BlockZergStructureCarapace() {
		super(Material.GROUND);
		setStepSound(soundTypeStone);
		setResistance(20.0F);
		setHardness(5.0F);
		setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "zergStrucCarapace" + subBlocks[i]);
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