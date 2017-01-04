package net.bvanseghi.starcraft.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDust extends Item {
	
	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon[] icons;
	
	public static final String[] metaNames = {"Steel", "Iron", "Carbon"};
	
	public ItemDust() {
		setHasSubtypes(true);
//		setCreativeTab(CreativeTab.TabStarcraftMaterials);
	}
	public String getUnlocalizedName(ItemStack itemStack) {
		int itemDamage = itemStack.getItemDamage();
		
		if((itemDamage < 0) || (itemDamage >= metaNames.length)) {
			itemDamage = 0;
		}
		
		return super.getUnlocalizedName() + "." + metaNames[itemDamage];
	}
	
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < metaNames.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
