package scmc.worldgen.biome;

import java.util.Random;

import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.chunk.ChunkPrimer;
import scmc.blocks.ModBlocks;

public class BiomeGenAshPlains extends BiomesSC {

	public BiomeGenAshPlains(BiomeProperties par1) {
		super(par1);
		
		setRegistryName("ash_plains");

		this.topBlock = ModBlocks.DIRT_CHAR.getDefaultState();
		this.fillerBlock = ModBlocks.DIRT_CHAR.getDefaultState();

		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
	}

	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}
	
	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        genBiomeTerrainChar(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

	@SuppressWarnings("deprecation")
	public final void genBiomeTerrainChar(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {

		int seaLevel = worldIn.getSeaLevel();
        IBlockState topBlock = this.topBlock;
        IBlockState fillerBlock = this.fillerBlock;
        int j = -1;
        int randHeight = (int)(noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
        int xLoc = x & 15;
        int zLoc = z & 15;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for (int yLoc = 255; yLoc >= 0; --yLoc)
        {
            if (yLoc <= rand.nextInt(5))
            {
                chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, BEDROCK);
            }
            else
            {
                IBlockState origState = chunkPrimerIn.getBlockState(xLoc, yLoc, zLoc);

                if (origState.getMaterial() == Material.AIR) //If we're still in the air...
                {
                    j = -1;
                }
                else if (origState.getBlock() == Blocks.STONE) //If we've hit the ground...
                {
                    if (j == -1) //If we were just in the air...
                    {
                        if (randHeight <= 0)
                        {
                            topBlock = AIR;
                            fillerBlock = ModBlocks.STONE_CHAR.getDefaultState();
                        }
                        else if (yLoc >= seaLevel - 4 && yLoc <= seaLevel + 1)
                        {
                            topBlock = this.topBlock;
                            fillerBlock = this.fillerBlock;
                        }

                        if (yLoc < seaLevel && (topBlock == null || topBlock.getMaterial() == Material.AIR))
                        {
                            if (this.getFloatTemperature(blockpos$mutableblockpos.setPos(x, yLoc, z)) < 0.15F)
                            {
                                topBlock = ICE;
                            }
                            else
                            {
                                topBlock = WATER;
                            }
                        }

                        j = randHeight;

                        if (yLoc >= seaLevel - 1)
                        {
                            chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, topBlock);
                            chunkPrimerIn.setBlockState(xLoc, yLoc+1, zLoc,
                            		ModBlocks.ASH_CHAR.getStateFromMeta(rand.nextInt(3)));
                        }
                        else if (yLoc < seaLevel - 7 - randHeight)
                        {
                            topBlock = AIR;
                            fillerBlock = ModBlocks.STONE_CHAR.getDefaultState();
                            chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, GRAVEL);
                        }
                        else
                        {
                            chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);
                        }
                    }
                    else if (j > 0)
                    {
                        --j;
                        chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, fillerBlock);

                        if (j == 0 && fillerBlock.getBlock() == Blocks.SAND && randHeight > 1)
                        {
                            j = rand.nextInt(4) + Math.max(0, yLoc - 63);
                            fillerBlock = fillerBlock.getValue(BlockSand.VARIANT) == BlockSand.EnumType.RED_SAND ? RED_SANDSTONE : SANDSTONE;
                        }
                    } else if (j == 0) {
                    	chunkPrimerIn.setBlockState(xLoc, yLoc, zLoc, ModBlocks.STONE_CHAR.getDefaultState());
                    }
                }
            }
        }
	}
}