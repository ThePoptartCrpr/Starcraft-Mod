package scmc.items.structurespawns;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.items.ModItems;
import scmc.lib.Reference;
import scmc.worldgen.structure.StructureProtossWarpGateTemplate;

public class ProtossDarkWarpGateSpawner extends ModItems {

	public ProtossDarkWarpGateSpawner() {
		setUnlocalizedName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_DARK_WARPGATE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_DARK_WARPGATE.getRegistryRL());
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossWarpGateTemplate PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
		Random rand = new Random();
		PROTOSS_WARPGATE.generate(1, 4, worldIn, rand, 0, 0, 0, pos);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}