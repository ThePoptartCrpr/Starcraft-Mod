package scmc.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ItemC14GaussRifle extends Item {
	public ItemC14GaussRifle() {
		setCreativeTab(StarcraftCreativeTabs.COMBAT);
		setFull3D();
		setUnlocalizedName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getRegistryRL());
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		return ActionResult.newResult(EnumActionResult.PASS, itemStackIn);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
