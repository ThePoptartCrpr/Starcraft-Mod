package scmc.items.structurespawns;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftCreativeTabs;
import scmc.StarcraftSoundEvents;
import scmc.items.ModItems;
import scmc.lib.Reference;
import scmc.worldgen.structure.StructureProtossCyberneticsCoreTemplate;

public class ItemProtossDarkCyberneticsCoreSpawner extends ModItems {

	public ItemProtossDarkCyberneticsCoreSpawner() {
		setUnlocalizedName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_DARK_CYBERNETICSCORE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_DARK_CYBERNETICSCORE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossCyberneticsCoreTemplate CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();
		CYBERNETICS_CORE.generate_r0(1, 4, worldIn, 0, 0, 0, pos);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), StarcraftSoundEvents.STRUC_CYBERNETICSCORE_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
