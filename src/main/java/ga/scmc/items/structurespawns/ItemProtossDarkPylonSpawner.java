package ga.scmc.items.structurespawns;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.ModItems;
import ga.scmc.lib.Reference;
import ga.scmc.worldgen.structure.StructureProtossPylonTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemProtossDarkPylonSpawner extends ModItems {

	public ItemProtossDarkPylonSpawner() {
		setUnlocalizedName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_DARK_PYLON.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_DARK_PYLON.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossPylonTemplate PROTOSS_PYLON = new StructureProtossPylonTemplate();
		PROTOSS_PYLON.generate_r0(1, 1, worldIn, 3, pos);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), StarcraftSoundEvents.STRUC_PYLON_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
