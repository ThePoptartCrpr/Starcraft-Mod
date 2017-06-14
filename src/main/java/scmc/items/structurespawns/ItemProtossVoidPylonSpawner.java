package scmc.items.structurespawns;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.items.ModItems;
import scmc.lib.Reference;
import scmc.worldgen.structure.StructureProtossPylonTemplate;

public class ItemProtossVoidPylonSpawner extends ModItems {

	public ItemProtossVoidPylonSpawner() {
		setUnlocalizedName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_VOID_PYLON.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_VOID_PYLON.getRegistryRL());
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossPylonTemplate PROTOSS_PYLON = new StructureProtossPylonTemplate();
		Random rand = new Random();
		PROTOSS_PYLON.generate_r0(1, 2, worldIn, rand, 0, 3, 0, pos);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), StarcraftSoundEvents.STRUC_PYLON_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}