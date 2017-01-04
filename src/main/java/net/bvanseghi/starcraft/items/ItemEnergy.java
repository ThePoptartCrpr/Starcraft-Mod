package net.bvanseghi.starcraft.items;


import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEnergy extends Item {


	public ItemEnergy() {
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTab.TabStarcraftMaterials);
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
	
	@SuppressWarnings({"rawtypes", "unchecked"})
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
