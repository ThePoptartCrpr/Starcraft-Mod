package scmc.items.weapons;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundCategory;
import scmc.StarcraftCreativeTabs;
import scmc.StarcraftSoundEvents;
import scmc.lib.Reference;

public class WeaponMasterPsiBlade extends ItemSword {
	
	public WeaponMasterPsiBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_MASTER_PSI_BLADE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_MASTER_PSI_BLADE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		player.worldObj.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), StarcraftSoundEvents.FX_WARPBLADE_ATTACK, SoundCategory.PLAYERS, 1.0F, 1.0F);
		return super.onLeftClickEntity(stack, player, entity);
	}
}