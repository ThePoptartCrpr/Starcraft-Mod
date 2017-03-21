package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends Item {
	public ItemC14GaussRifle() {
		setCreativeTab(CreativeTab.tabStarcraftCombat);
		setFull3D();
		setUnlocalizedName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getRegistryRL());
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
