package ga.scmc.items.structurespawns;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.items.ModItems;
import ga.scmc.lib.Reference;
import ga.scmc.worldgen.structure.StructureProtossCyberneticsCoreTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/structurespawns/ItemProtossCyberneticsCoreSpawner.java
=======
import scmc.StarcraftSoundEvents;
import scmc.lib.Reference;
import scmc.worldgen.structure.StructureProtossCyberneticsCoreTemplate;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/structurespawns/ItemProtossCyberneticsCoreSpawner.java

public class ItemProtossCyberneticsCoreSpawner extends ModItems {

	public ItemProtossCyberneticsCoreSpawner() {
		setUnlocalizedName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_CYBERNETICSCORE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_SPAWNER_PROTOSS_CYBERNETICSCORE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossCyberneticsCoreTemplate CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();
		CYBERNETICS_CORE.generate_r0(0, 3, worldIn, 0, 0, 0, pos);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), StarcraftSoundEvents.STRUC_CYBERNETICSCORE_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
