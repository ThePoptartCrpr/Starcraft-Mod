package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.entity.EntityC14GaussRifleBullet;
import net.bvanseghi.starcraft.events.SCSoundEvents;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends ItemSword {

	public ItemC14GaussRifle() {
		super(ModWeapons.GUN);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setFull3D();
		setUnlocalizedName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_RIFLE_C14_GAUSS.getRegistryRL());
	}

	// TODO: fix type of sound emitted
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player,
			EnumHand hand) {
		int index = player.inventory.getSlotFor(new ItemStack(ModItems.C14GaussRifleBullet));
		player.inventory.decrStackSize(index, 1);
		
		if (player.capabilities.isCreativeMode || index >= 0) {
			world.playSound(player, player.getPosition(), SCSoundEvents.ENTITY_LARVA_LIVE1, SoundCategory.NEUTRAL,
					20.0F, 1.5F / 1F);
			if (!world.isRemote) {
				world.spawnEntityInWorld(new EntityC14GaussRifleBullet(world, player));
			}
		} else {

			world.playSound(player, player.getPosition(), SCSoundEvents.ENTITY_LARVA_LIVE1, SoundCategory.NEUTRAL, 0.4F,
					0.4F / (itemRand.nextFloat() * 0.5F + 0.8F));
		}
		return new ActionResult(EnumActionResult.PASS, 0);
	}

}
