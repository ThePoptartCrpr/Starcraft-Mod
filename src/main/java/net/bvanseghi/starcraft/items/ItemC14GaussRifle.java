package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends Item {

	public ItemC14GaussRifle() {
<<<<<<< HEAD
		super();
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
=======
		super(ModWeapons.GUN);
		this.setCreativeTab(CreativeTab.tabStarcraftCombat);
		this.setFull3D();
		setUnlocalizedName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getRegistryRL());
>>>>>>> 9bc3d3439873a8d50d86344bdc19af949a0a32f3
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
