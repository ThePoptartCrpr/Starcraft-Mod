package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.InventoryHandler;
import ga.scmc.lib.Reference;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends Item {

	public ItemC14GaussRifle() {
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
		setFull3D();
		setUnlocalizedName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getRegistryRL());
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World world, EntityPlayer player, EnumHand hand) {
		if(this.hasAmmo(world, player)) {
			if(!world.isRemote) {
				EntityTippedArrow entity = new EntityTippedArrow(world, player);
				entity.setLocationAndAngles(entity.posX, entity.posY - 0.35, entity.posZ, entity.rotationYaw, entity.rotationPitch);
				entity.setVelocity(player.getLookVec().xCoord * 10, player.getLookVec().yCoord * 10, player.getLookVec().zCoord * 10);
				world.spawnEntityInWorld(entity);
			}

			//Sounds.SOUND_WEAPON_FLAMETHROWER.playSound(player);
		}
		return super.onItemRightClick(itemstack, world, player, hand);
	}

	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		return true;
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		return false;
	}

	public boolean hasAmmo(World world, EntityPlayer player) {
		if(player.capabilities.isCreativeMode) {
			return true;
		}

		if(InventoryHandler.playerHas(getAmmo(), player)) {
			ItemStack ammoStack = player.inventory.getStackInSlot(InventoryHandler.getSlotForItemIn(getAmmo(), player.inventory));

			if(ammoStack != null && ammoStack.getItem() != null) {
				if(ammoStack.getItemDamage() < ammoStack.getMaxDamage()) {
					ammoStack.damageItem(1, player);
				} else {
					InventoryHandler.consumeItem(player, ammoStack.getItem());
				}

				return true;
			}
		}
		return false;
	}

	public Item getAmmo() {
		return Items.ARROW;
	}
}
