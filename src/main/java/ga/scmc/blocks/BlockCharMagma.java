package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.lib.Library;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/BlockCharMagma.java
=======
import scmc.lib.Library;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/BlockCharMagma.java

/**
 * Magma block. Makes lava source when broken or when lava is found near it on a
 * random tick<br>
 * Copyright 2016 the Starcraft Minecraft (SCMC) mod team
 * @author wundrweapon
 */
public class BlockCharMagma extends ModBlocks {

	public BlockCharMagma() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setLightLevel(0.2F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_MAGMA_CHAR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_MAGMA_CHAR.getRegistryRL());
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		world.setBlockState(pos, Blocks.FLOWING_LAVA.getDefaultState());
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.NETHERRACK;
	}

	@Override
	@SideOnly(Side.CLIENT)
    public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos) {
        return 7864;
    }

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if(!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.func_189869_j((EntityLivingBase) entityIn)) {
			entityIn.attackEntityFrom(DamageSource.field_190095_e, 1.0F);
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
		if(!Library.checkCube(world, Blocks.FLOWING_LAVA.getDefaultState(), pos, 3).isEmpty()) {
			breakBlock(world, pos, state);
		}
	}
}
