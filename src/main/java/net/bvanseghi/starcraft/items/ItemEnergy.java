package net.bvanseghi.starcraft.items;


import java.util.List;

import javax.swing.Icon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemEnergy extends Item {


	public ItemEnergy() {
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTab.TabStarcraftMaterials);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public void registerIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[names.length];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(REFERENCE.MODID + ":" + "energy" + names[i]);
		}
	}

	public static final String[] names = new String[] { "Pure", "Corrupt", "Void" };

	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		int i = par1ItemStack.getItemDamage();
		if(i < 0 || i >= names.length){
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + names[i];
	}

	public IIcon getIconFromDamage(int par1)
	{
		return (IIcon) icons[par1];
	}
	
	@SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
    {
		for (int x = 0; x < names.length; x++)
		{
			p_150895_3_.add(new ItemStack(p_150895_1_, 1, x));
		}
        
    }
	
	public int getMetadata(int meta) {
		return meta;
		
	}
}
