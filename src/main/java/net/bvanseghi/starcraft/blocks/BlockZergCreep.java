package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockZergCreep extends ModBlocks {

	public static final String name = "zergCreep";

	public BlockZergCreep() {
		super(name, name, Material.ground);
		setStepSound(soundTypeGravel);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		this.setTickRandomly(true);
	}

	public Item getItemDropped(int par1, Random par2, int par3) {
		return ModItems.creepResin;
	}

	public int quantityDropped(Random par1) {
		return 2 + par1.nextInt(2);
	}

	protected boolean canSilkHarvest() {
		return true;
	}

	public void updateTick(World par1, int par2, int par3, int par4, Random par5) {
		if (StarcraftConfig.creepCanSpread == true) {
			if (!par1.isRemote) {
				if (par1.getBlockLightValue(par2, par3 + 1, par4) >= 0) {
					for (int l = 0; l < 4; ++l) {
						int i1 = par2 + par5.nextInt(3) - 1;
						int j1 = par3 + par5.nextInt(5) - 3;
						int k1 = par4 + par5.nextInt(3) - 1;
						Block block = par1.getBlock(i1, j1 + 1, k1);

						if (par1.getBlock(i1, j1, k1) == Blocks.grass) {

							par1.setBlock(i1, j1+1, k1, ModBlocks.zergCreep);

						}
					}
				}
			}
		}
	}
}
			
	
	