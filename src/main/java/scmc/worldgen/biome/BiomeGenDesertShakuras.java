package scmc.worldgen.biome;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import scmc.blocks.ModBlocks;

//FIXME: Copy over one of the Char biomes
public class BiomeGenDesertShakuras extends BiomesSC {

	public BiomeGenDesertShakuras(BiomeProperties id) {
		super(id);
		
		setRegistryName("desert_shakuras");
		
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
		genBiomeTerrainShakuras(world, rand, primer, x, z, noiseVal);
	}

	//Craft's Thoughts: So blockArray is pretty much the same as the ChunkPrimer in that it holds the blocks in the chunk.
	//The primary difference is that the ChinkPrimer allows you to refer to the array by x, y, z coords rather than having to do the conversion yourself.
	//I don't fully understand what this is doing, the variables are all generic work variable names. But to convert it, you simply need to seperate out the
	//X Y and Z coords, and use primer.setBlockState. And it seems x and y are given, so I presume this is supposed to give the blocks in a single column?
	//Commented out stuff is old stuff, line after the comment is my line.
	public final void genBiomeTerrainShakuras(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {

		int seaLevel = worldIn.getSeaLevel();
		IBlockState topBlock = this.topBlock;
		IBlockState fillerBlock = this.fillerBlock;
		int j = -1;
		int randHeight = (int) (noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int zLoc = x & 15;
		int xLoc = z & 15;

		for (int yLoc = 255; yLoc >= 0; --yLoc) {
			if (yLoc <= rand.nextInt(5)) {
                chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, BEDROCK);
            } else {
            	IBlockState origState = chunkPrimerIn.getBlockState(xLoc, yLoc, zLoc);

                if (origState.getMaterial() == Material.AIR) { //If we're still in the air...
                    j = -1;
                } else if (origState.getBlock() == Blocks.STONE) {
					if (j == -1) {
						if (randHeight <= 0) {
							topBlock = null;
							fillerBlock = ModBlocks.STONE_SHAKURAS.getDefaultState();
						} else if (yLoc >= seaLevel - 4 && yLoc <= seaLevel + 1) {
							topBlock = this.topBlock;
							fillerBlock = this.fillerBlock;
						}
						
						if (yLoc < seaLevel && (topBlock == null || topBlock.getMaterial() == Material.AIR)) {
							topBlock = Blocks.LAVA.getDefaultState();
						}

						j = randHeight;

						if (yLoc >= seaLevel - 1) {
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, topBlock);
						} else if (yLoc < seaLevel - 7 - randHeight) {
                            topBlock = AIR;
							fillerBlock = ModBlocks.STONE_SHAKURAS.getDefaultState();
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, GRAVEL);
						} else {
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);
						}
					} else if (j > 0) {
						j--;
						chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);

						if (j == 0 && fillerBlock == ModBlocks.SAND_SHAKURAS) {
							j = rand.nextInt(4) + Math.max(0, yLoc - 63);
							fillerBlock = Blocks.SANDSTONE.getDefaultState();
						}
					} else {
						chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, ModBlocks.STONE_SHAKURAS.getDefaultState());
					}
				}
			}
		}
	}

}