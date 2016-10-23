package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
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
		int mult = 1;
		int base = StarcraftConfig.creepSpreadBaseVal;
		
		if (StarcraftConfig.creepCanSpread == true) {
			if(StarcraftConfig.creepSpreadScalesWithDif = true) {
				if(par1.difficultySetting == EnumDifficulty.PEACEFUL) {
					mult = 1;
				}else if(par1.difficultySetting == EnumDifficulty.EASY) {
					mult = 4;
				}else if(par1.difficultySetting == EnumDifficulty.NORMAL) {
					mult = 8;
				}else if(par1.difficultySetting == EnumDifficulty.HARD) {
					mult = 16;
				}else if(par1.getWorldInfo().isHardcoreModeEnabled()) {
					mult = 32;
				}
			}
			if (!par1.isRemote) {
				if (par1.getBlockLightValue(par2, par3 + 1, par4) >= 0) {
					//l controls the speed of the creep growth. DEFAULT: 4
					for (int l = 0; l < base*mult; ++l) {
						int i1 = par2 + par5.nextInt(3) - 1;
						int j1 = par3 + par5.nextInt(5) - 3;
						int k1 = par4 + par5.nextInt(3) - 1;
						if (par1.getBlock(i1, j1, k1) == Blocks.grass) {
							par1.setBlock(i1, j1, k1, ModBlocks.zergCreep);
						}else if(par1.getBlock(i1, j1, k1) == Blocks.log) {
							if(par1.getBlockMetadata(par2, par3, par4) == 0) {
								//for future update
							}else if(par1.getBlockMetadata(i1, j1, k1) == 1) {
								//for future update
							}else if(par1.getBlockMetadata(i1, j1, k1) == 2) {
								//for future update
							}else if(par1.getBlockMetadata(i1, j1, k1) == 3) {
								//for future update
							}
						}else if(par1.getBlock(i1, j1, k1) == Blocks.leaves) {
							if(par1.getBlockMetadata(i1, j1, k1) == 0) {
								//for future update
							}else if(par1.getBlockMetadata(i1, j1, k1) == 1) {
								
							}else if(par1.getBlockMetadata(i1, j1, k1) == 2) {
								//for future update
							}else if(par1.getBlockMetadata(i1, j1, k1) == 3) {
								//for future update
							}
						}else if(par1.getBlock(i1, j1, k1) == Blocks.farmland || par1.getBlock(i1, j1, k1) == Blocks.dirt) {
							//for future update
						}
					}
				}
			}
		}
	}
}
