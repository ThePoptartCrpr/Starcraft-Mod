package ga.scmc.items;

import javax.annotation.Nullable;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.StarcraftSoundEvents;
import ga.scmc.entity.EntityC14GaussRifleBullet;
import ga.scmc.items.metaitems.ItemBullet;
import ga.scmc.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends Item {
	public ItemC14GaussRifle() {
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
		setFull3D();
		setUnlocalizedName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getRegistryRL());
	}

	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
		boolean flag = this.findAmmo(playerIn) != null;

        if (!playerIn.capabilities.isCreativeMode && !flag)
        {
        	if(!flag) {
        		worldIn.playSound(playerIn, playerIn.getPosition(), StarcraftSoundEvents.FX_PSIBLADE_ATTACK, SoundCategory.PLAYERS, 0.4F, 0.4F / (itemRand.nextFloat() * 0.5F + 0.8F));
        		return new ActionResult(EnumActionResult.FAIL, itemStackIn);
        	}else {
        		worldIn.spawnEntityInWorld(new EntityC14GaussRifleBullet(worldIn, playerIn));
        		return new ActionResult(EnumActionResult.PASS, itemStackIn);
        	}
        }
        else
        {
            playerIn.setActiveHand(hand);
            return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
        }
    }
	
	private ItemStack findAmmo(EntityPlayer player)
    {
        if (this.isBullet(player.getHeldItem(EnumHand.OFF_HAND)))
        {
            return player.getHeldItem(EnumHand.OFF_HAND);
        }
        else if (this.isBullet(player.getHeldItem(EnumHand.MAIN_HAND)))
        {
            return player.getHeldItem(EnumHand.MAIN_HAND);
        }
        else
        {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
            {
                ItemStack itemstack = player.inventory.getStackInSlot(i);

                if (this.isBullet(itemstack))
                {
                    return itemstack;
                }
            }

            return null;
        }
    }
	
	protected boolean isBullet(@Nullable ItemStack stack)
    {
        return stack != null && stack.getItem() instanceof ItemBullet;
    }
}
