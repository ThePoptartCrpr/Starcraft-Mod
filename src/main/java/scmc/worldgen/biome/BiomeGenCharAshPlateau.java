package scmc.worldgen.biome;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import scmc.blocks.ModBlocks;

public class BiomeGenCharAshPlateau extends BiomesSC {

	public BiomeGenCharAshPlateau(BiomeProperties id) {
		super(id);

		setRegistryName("ash_plateau");

		topBlock = ModBlocks.DIRT_CHAR.getDefaultState();
		fillerBlock = ModBlocks.DIRT_CHAR.getDefaultState();

		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
	}

	@SuppressWarnings("deprecation")
	public final void genBiomeTerrainChar(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {

		int seaLevel = worldIn.getSeaLevel();
		IBlockState topBlock = this.topBlock;
		IBlockState fillerBlock = this.fillerBlock;
		int j = -1;
		int randHeight = (int) (noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int zLoc = x & 15;
		int xLoc = z & 15;

		for(int yLoc = 255; yLoc >= 0; --yLoc) {
			if(yLoc <= rand.nextInt(5)) {
				chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, BEDROCK);
			} else {
				IBlockState origState = chunkPrimerIn.getBlockState(xLoc, yLoc, zLoc);

				if(origState.getMaterial() == Material.AIR) { // If we're still in the air...
					j = -1;
				} else if(origState.getBlock() == ModBlocks.STONE_CHAR) { // If we've hit the ground...
					if(j == -1) { // If we were just in the air...
						if(randHeight <= 0) {
							topBlock = AIR;
							fillerBlock = ModBlocks.STONE_CHAR.getDefaultState();
						} else if(yLoc >= seaLevel - 4 && yLoc <= seaLevel + 1) {
							topBlock = this.topBlock;
							fillerBlock = this.fillerBlock;
						}

						if(yLoc < seaLevel && (topBlock == null || topBlock.getMaterial() == Material.AIR)) {
							topBlock = Blocks.LAVA.getDefaultState();
						}

						j = randHeight;

						if(yLoc >= seaLevel - 1) {
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, topBlock);
							chunkPrimerIn.setBlockState(xLoc, yLoc + 1, zLoc, ModBlocks.ASH_CHAR.getStateFromMeta(1));
						} else if(yLoc < seaLevel - 7 - randHeight) {
							topBlock = AIR;
							fillerBlock = ModBlocks.STONE_CHAR.getDefaultState();
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, GRAVEL);
						} else {
							chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);
						}
					} else if(j > 0) {
						--j;
						chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);
					}
				}
			}
		}
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
		genBiomeTerrainChar(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}

	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}
}