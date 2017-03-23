package scmc.worldgen.biome;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import scmc.blocks.BlockAsh;
import scmc.blocks.ModBlocks;
import scmc.entity.EntityLarva;
import scmc.entity.EntityLarvaCocoon;

//FIXME: same desertshakuras stuff
public class CharBiomeGenCreepInfestation extends BiomesSC {

	public boolean isOnChar;

	public CharBiomeGenCreepInfestation(BiomeProperties id) {
		super(id);

		this.topBlock = ModBlocks.ZERG_CREEP.getDefaultState();
		this.fillerBlock = ModBlocks.DIRT_CHAR.getDefaultState();

		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLarva.class, 8, 2, 3));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLarvaCocoon.class, 8, 2, 3));
	}

	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}

	public void genTerrainBlocks(World par1, Random par2, Block[] par3, byte[] par4, int par5, int par6, double par7) {
		this.genBiomeTerrainChar(par1, par2, par3, par4, par5, par6, par7);
	}

	public final void genBiomeTerrainChar(World world, Random rand, Block[] blockArray, byte[] par1, int par2, int par3,
			double par4) {
//		boolean flag = true;
		Block block = this.topBlock.getBlock();
		byte b0 = (byte) (0 & 255);
		//WARNING ON B0
		Block block1 = this.fillerBlock.getBlock();
		int k = -1;
		int l = (int) (par4 / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int i1 = par2 & 15;
		int j1 = par3 & 15;
		int k1 = blockArray.length / 256;

		for (int l1 = 255; l1 >= 0; --l1) {
			int i2 = (j1 * 16 + i1) * k1 + l1;

			if (l1 <= 0 + rand.nextInt(5)) {
				blockArray[i2] = Blocks.BEDROCK;
			} else {
				Block block2 = blockArray[i2];
				Material mat2 = block2.getBlockState().getBaseState().getMaterial();
				if (block2 != null && mat2 != Material.AIR) {
					if (block2 == ModBlocks.STONE_CHAR) {
						if (k == -1) {
							if (l <= 0) {
								block = null;
								b0 = 0;
								block1 = ModBlocks.STONE_CHAR;
							} else if (l1 >= 59 && l1 <= 64) {
								block = this.topBlock.getBlock();
								b0 = (byte) (0 & 255);
								//WARNING ON B0
								block1 = this.fillerBlock.getBlock();
							}
							Material mat = block.getBlockState().getBaseState().getMaterial();
							if (l1 < 63 && (block == null || mat == Material.AIR)) {
								block = Blocks.LAVA;
								b0 = 0;
							}

							k = l;

							if (l1 >= 62) {
								if (block instanceof BlockAsh) {
									int i3 = (j1 * 16 + i1) * k1 + (l1 + 1);
									blockArray[i3] = block;
									block = this.fillerBlock.getBlock();
								}
								blockArray[i2] = block;
								par1[i2] = b0;
							} else if (l1 < 56 - l) {
								block = null;
								block1 = ModBlocks.STONE_CHAR;
								blockArray[i2] = Blocks.GRAVEL;
							} else {
								blockArray[i2] = block1;
							}
						} else if (k > 0) {
							--k;
							blockArray[i2] = block1;

							if (k == 0 && block1 == Blocks.SAND) {
								k = rand.nextInt(4) + Math.max(0, l1 - 63);
								block1 = Blocks.SANDSTONE;
							}
						}
					}
				} else {
					k = -1;
				}
			}
		}
	}

}
