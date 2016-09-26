package net.bvanseghi.starcraft.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemDust extends Item {
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public static final String[] metaNames = {"Steel", "Iron", "Carbon"};
	
	public ItemDust() {
		setHasSubtypes(true);
		// setCreativeTab(CreativeTab.TabStarcraftMaterials);
	}
	
	public void registerIcons(IIconRegister iconReg) {
		icons = new IIcon[metaNames.length];
		
		for(int i = 0; i < icons.length; i++) {
			icons[i] = iconReg.registerIcon(REFERENCE.MODID + ":" + "ingot" + metaNames[i]);
		}
	}
	
	public String getUnlocalizedName(ItemStack itemStack) {
		int itemDamage = itemStack.getItemDamage();
		
		if((itemDamage < 0) || (itemDamage >= metaNames.length)) {
			itemDamage = 0;
		}
		
		return super.getUnlocalizedName() + "." + metaNames[itemDamage];
	}
	
	public IIcon getIconFromDamage(int par1) {
		return (IIcon) icons[par1];
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < metaNames.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	//Why?!
	public int getMetadata(int meta) {
		return meta;
	}
}
