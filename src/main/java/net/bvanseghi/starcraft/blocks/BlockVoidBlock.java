package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockVoidBlock extends ModBlocks {

	public static final String name = "voidBlock";

	public BlockVoidBlock() {
		super(name, name, Material.ground);
		setHardness(30000.0F);
		setResistance(30000.0F);
		setHarvestLevel("pickaxe", 4);
		this.setTickRandomly(true);
		this.setCreativeTab(null);
	}

	
	public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_,
			int p_149690_5_, float p_149690_6_, int p_149690_7_) {
	}

	public void updateTick(World par1, int par2, int par3, int par4, Random par5) {
		if (!par1.isRemote) {
			if (par1.getBlockLightValue(par2, par3 + 1, par4) >= 0) {
				for (int l = 0; l < 10000; ++l) {
					int i1 = par2 + par5.nextInt(3) - 1;
					int j1 = par3 + par5.nextInt(5) - 3;
					int k1 = par4 + par5.nextInt(3) - 1;
					if (par1.getBlock(i1, j1, k1) != Blocks.air) {
						par1.setBlock(i1, j1, k1, ModBlocks.voidBlock);
					}
				}
			}
		}
	}
	
	public void onEntityCollidedWithBlock(World world, int par1, int par2, int par3, Entity entity) {
		entity.attackEntityFrom(DamageSource.cactus, 4.0F);
	}
}
