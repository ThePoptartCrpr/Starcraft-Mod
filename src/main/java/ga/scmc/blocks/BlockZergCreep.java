package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.entity.monster.EntityZergMob;
import ga.scmc.entity.passive.EntityZergPassive;
import ga.scmc.items.ModItems;
import ga.scmc.items.armor.ArmorZergBootsT1;
import ga.scmc.items.armor.ArmorZergBootsT2;
import ga.scmc.items.armor.ArmorZergBootsT3;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/BlockZergCreep.java
=======
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityZergPassive;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/BlockZergCreep.java

public class BlockZergCreep extends ModBlocks {

	// TODO: Review the sound creep makes (sand?...)
	public BlockZergCreep() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.CREEP_RESIN;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if(entityIn instanceof EntityZergMob || entityIn instanceof EntityZergPassive) {
			entityIn.motionX *= 1.2D;
			entityIn.motionZ *= 1.2D;
		}
		if(entityIn instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entityIn;
			try {
				if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorZergBootsT1 ||
						player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorZergBootsT2 ||
						player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorZergBootsT3) {
					player.motionX *= 1.2D;
					player.motionZ *= 1.2D;
				} else {
				}
			} catch(@SuppressWarnings("unused") NullPointerException e) {
			}
		}
	}

	// FIXME: Creep spread speed and block params
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if(!worldIn.isRemote) {
			if(worldIn.getLightFromNeighbors(pos.up()) >= 9) {
				for(int i = 0; i < 1000; ++i) {
					BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

					if(blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
						return;
					}

					IBlockState iblockstate = worldIn.getBlockState(blockpos);

					if(iblockstate.getBlock() == Blocks.GRASS) {
						worldIn.setBlockState(blockpos, ModBlocks.ZERG_CREEP.getDefaultState());
					}
				}
			}
		}
	}
}
