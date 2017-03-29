package scmc.worldgen.biome;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import scmc.blocks.BlockShakurasSand;
import scmc.blocks.ModBlocks;

//FIXME: this. all of this
public class BiomeGenDesertShakuras extends BiomesSC {

	public BiomeGenDesertShakuras(BiomeProperties id) {
		super(id);
		
		topBlock = ModBlocks.SAND_SHAKURAS.getDefaultState();
		fillerBlock = ModBlocks.STONE_SHAKURAS.getDefaultState();

		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
	}

	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}

	@Override
	public void genTerrainBlocks(World world, Random rand, ChunkPrimer primer, int x, int z, double noiseVal) {
		genBiomeTerrainShakuras(rand, primer, x, z, noiseVal);
	}

	//Craft's Thoughts: So blockArray is pretty much the same as the ChunkPrimer in that it holds the blocks in the chunk.
	//The primary difference is that the ChinkPrimer allows you to refer to the array by x, y, z coords rather than having to do the conversion yourself.
	//I don't fully understand what this is doing, the variables are all generic work variable names. But to convert it, you simply need to seperate out the
	//X Y and Z coords, and use primer.setBlockState. And it seems x and y are given, so I presume this is supposed to give the blocks in a single column?
	//Commented out stuff is old stuff, line after the comment is my line.
	public final void genBiomeTerrainShakuras(Random rand, ChunkPrimer primer, int x, int z, double noiseVal) {
//		boolean flag = true;
		Block block = topBlock.getBlock();
		byte b0 = (byte) (0 & 255);
		//WARNING FOR B0
		Block block1 = fillerBlock.getBlock();
		int k = -1;
		int l = (int) (noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int i1 = x & 15;
		int j1 = z & 15;
//		int k1 = blockArray.length / 256;
		int k1 = 256;

		for (int l1 = 255; l1 >= 0; --l1) {
			int i2 = (j1 * 16 + i1) * k1 + l1;

			if (l1 <= 0 + rand.nextInt(5)) {
//				blockArray[i2] = Blocks.BEDROCK;
				primer.setBlockState(i1, i2, j1, BEDROCK);
			} else {
				Block block2 = primer.getBlockState(i1, i2, j1).getBlock();//blockArray[i2];
				Material mat2 = block2.getBlockState().getBaseState().getMaterial();
				if (block2 != null && mat2 != Material.AIR) {
					if (block2 == ModBlocks.STONE_SHAKURAS) {
						if (k == -1) {
							if (l <= 0) {
								block = null;
								b0 = 0;
								block1 = ModBlocks.STONE_SHAKURAS;
							} else if (l1 >= 59 && l1 <= 64) {
								block = topBlock.getBlock();
								b0 = (byte) (0 & 255);
								//WARNING FOR B0
								block1 = fillerBlock.getBlock();
							}
							Material mat = block.getBlockState().getBaseState().getMaterial();
							if (l1 < 63 && (block == null || mat == Material.AIR)) {
								block = Blocks.LAVA;
								b0 = 0;
							}

							k = l;

							if (l1 >= 62) {
								if (block instanceof BlockShakurasSand) {
									int i3 = (j1 * 16 + i1) * k1 + (l1 + 1);
									primer.setBlockState(i1, i3, j1, block.getDefaultState());
//									blockArray[i3] = block;
									block = fillerBlock.getBlock();
								}
//								blockArray[i2] = block;
								primer.setBlockState(i1, i2, j1, block.getDefaultState());
//								par1[i2] = b0; //TODO Figure out what this was for?
							} else if (l1 < 56 - l) {
								block = null;
								block1 = ModBlocks.STONE_SHAKURAS;
//								blockArray[i2] = Blocks.GRAVEL;
								primer.setBlockState(i1, i2, j1, GRAVEL);
							} else {
//								blockArray[i2] = block1;
								primer.setBlockState(i1, i2, j1, block1.getDefaultState());
							}
						} else if (k > 0) {
							--k;
//							blockArray[i2] = block1;
							primer.setBlockState(i1, i2, j1, block1.getDefaultState());

							if (k == 0 && block1 == ModBlocks.SAND_SHAKURAS) {
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