package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.entity.EntityC14GaussRifleBullet;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends ItemSword {

	public ItemC14GaussRifle() {
		super(ModWeapons.GUN);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setFull3D();
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + "c14GaussRifle");
		this.setTextureName(REFERENCE.Texture_Path + "c14GaussRifle");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if (par3EntityPlayer.capabilities.isCreativeMode
				|| par3EntityPlayer.inventory.consumeInventoryItem(ModItems.C14GaussRifleBullet)) {
			par2World.playSoundAtEntity(par3EntityPlayer, "Starcraft:c14GaussRifle-firing", 20.0F, 1.5F / 1F);
			if (!par2World.isRemote) {
				par2World.spawnEntityInWorld(new EntityC14GaussRifleBullet(par2World, par3EntityPlayer));
			}
		} else {
			par2World.playSoundAtEntity(par3EntityPlayer, "Starcraft:c14GaussRifle-out", 0.4F,
					0.4F / (itemRand.nextFloat() * 0.5F + 0.8F));
		}
		return par1ItemStack;
	}

}
