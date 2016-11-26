package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPylonCrystal extends Block {

	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon[] texture;
	
	public static final String[] subBlocks = new String[] { "Pure", "Dark", "Void" };
	
	public BlockPylonCrystal() {
		super(Material.rock);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(20.0F);
		setLightLevel(4.0F);
		setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "crystal" + subBlocks[i]);
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
	
	public Item getItemDropped(int meta, Random rand, int par1)
    {
		if(rand.nextInt(9) == 0){
			return ModItems.energy;
		}
			return null;
    }
	
	public int damageDropped(int meta)
    {
		if(meta == 0) {
			return this == ModBlocks.crystals ? 0 : 0;
		}else if(meta == 1) {
			return this == ModBlocks.crystals ? 1 : 0;
		}else if(meta == 2) {
			return this == ModBlocks.crystals ? 2 : 0;
		}
        return 0;
    }	
}