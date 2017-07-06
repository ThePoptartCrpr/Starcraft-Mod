package ga.scmc.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * A simple inventory handler class, because 1.10.2 inventory handling is horse shit. Thanks goes to Ri5ux of AVP.
 * @author Ri5ux, with a little touch up from Hypeirochus
 * {@linkplain https://github.com/Ri5ux/MDXLib/blob/1.10.2/src/main/java/com/arisux/mdx/lib/world/entity/player/inventory/Inventories.java}
 */
public class InventoryHandler {

	public static boolean consumeItem(EntityPlayer player, Item item) {
		return consumeItem(player, item, false);
	}

	public static boolean consumeItem(EntityPlayer player, Item item, boolean force) {
		if(!player.capabilities.isCreativeMode || force) {
			int i = getSlotFor(player.inventory, item);
			if(i < 0) {
				return false;
			} else {
				if(--player.inventory.mainInventory[i].stackSize <= 0) {
					player.inventory.mainInventory[i] = null;
				}
				return true;
			}
		}

		return true;
	}

	public static int getSlotFor(InventoryPlayer inventory, Item item) {
		for(int i = 0; i < inventory.mainInventory.length; ++i) {
			if(inventory.mainInventory[i] != null && inventory.mainInventory[i].getItem() == item) {
				return i;
			}
		}
		return -1;
	}

	public static boolean playerHas(Item item, Entity entity) {
		return getAmountOfItemPlayerHas(item, entity) > 0;
	}

	public static boolean playerHas(Item item, EntityPlayer player) {
		return getAmountOfItemPlayerHas(item, player) > 0;
	}

	public static int getAmountOfItemPlayerHas(Item item, Entity entity) {
		if(entity instanceof EntityPlayer) {
			return getAmountOfItemPlayerHas(item, (EntityPlayer) entity);
		}

		return 0;
	}

	public static int getAmountOfItemPlayerHas(Item item, EntityPlayer player) {
		int amount = 0;
		for(ItemStack stack : player.inventory.mainInventory) {
			if(stack != null && stack.getItem() == item) {
				amount += stack.stackSize;
			}
		}

		return amount;
	}

	public static int getSlotForItemIn(Item item, InventoryPlayer inventory) {
		for(int id = 0; id < inventory.getSizeInventory(); ++id) {
			if(inventory.getStackInSlot(id) != null && inventory.getStackInSlot(id).getItem() == item) {
				return id;
			}
		}
		return -1;
	}
}
