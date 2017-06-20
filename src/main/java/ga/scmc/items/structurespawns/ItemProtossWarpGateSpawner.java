package ga.scmc.items.structurespawns;

import java.util.Random;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.StarcraftSoundEvents;
import ga.scmc.items.ModItems;
import ga.scmc.lib.Reference;
import ga.scmc.worldgen.structure.StructureProtossWarpGateTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemProtossWarpGateSpawner extends ModItems {

	public ItemProtossWarpGateSpawner() {
		setUnlocalizedName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_WARPGATE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_WARPGATE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossWarpGateTemplate PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
		Random rand = new Random();
		PROTOSS_WARPGATE.generate(0, 0, worldIn, rand, 0, 0, 0, pos);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), StarcraftSoundEvents.STRUC_GATEWAY_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}