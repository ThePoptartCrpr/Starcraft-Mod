package net.bvanseghi.starcraft.worldgen.biome;

import java.util.Random;

import net.bvanseghi.starcraft.blocks.BlockShakurasSand;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.EntityZealot;
import net.bvanseghi.starcraft.entity.EntityDarkProbe;
import net.bvanseghi.starcraft.entity.EntityProbe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenDesertShakuras extends BiomesSC {

	public static final Height biomeHeight = new Height(0.05F, 0.05F);

	@SuppressWarnings("unchecked")
	public BiomeGenDesertShakuras(int id) {
		super(id);

		this.setHeight(biomeHeight);
		this.waterColorMultiplier = 9175295;

		this.topBlock = ModBlocks.sandShakuras;
		this.fillerBlock = ModBlocks.stoneShakuras;

		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.setDisableRain();
		
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityProbe.class, 8, 2, 3));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityDarkProbe.class, 5, 2, 3));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityZealot.class, 3, 2, 3));
	}

	public int getSkyColorByTemp(float par1) {
		return 0;
	}

	public void genTerrainBlocks(World world, Random rand, Block[] block, byte[] par1, int par2, int par3,
			double par4) {
		this.genBiomeTerrainShakuras(world, rand, block, par1, par2, par3, par4);
	}

	public final void genBiomeTerrainShakuras(World world, Random rand, Block[] blockArray, byte[] par1, int par2, int par3,
			double par4) {
//		boolean flag = true;
		Block block = this.topBlock;
		byte b0 = (byte) (this.field_150604_aj & 255);
		Block block1 = this.fillerBlock;
		int k = -1;
		int l = (int) (par4 / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int i1 = par2 & 15;
		int j1 = par3 & 15;
		int k1 = blockArray.length / 256;

		for (int l1 = 255; l1 >= 0; --l1) {
			int i2 = (j1 * 16 + i1) * k1 + l1;

			if (l1 <= 0 + rand.nextInt(5)) {
				blockArray[i2] = Blocks.bedrock;
			} else {
				Block block2 = blockArray[i2];

				if (block2 != null && block2.getMaterial() != Material.air) {
					if (block2 == ModBlocks.stoneShakuras) {
						if (k == -1) {
							if (l <= 0) {
								block = null;
								b0 = 0;
								block1 = ModBlocks.stoneShakuras;
							} else if (l1 >= 59 && l1 <= 64) {
								block = this.topBlock;
								b0 = (byte) (this.field_150604_aj & 255);
								block1 = this.fillerBlock;
							}

							if (l1 < 63 && (block == null || block.getMaterial() == Material.air)) {
								block = Blocks.lava;
								b0 = 0;
							}

							k = l;

							if (l1 >= 62) {
								if (block instanceof BlockShakurasSand) {
									int i3 = (j1 * 16 + i1) * k1 + (l1 + 1);
									blockArray[i3] = block;
									block = this.fillerBlock;
								}
								blockArray[i2] = block;
								par1[i2] = b0;
							} else if (l1 < 56 - l) {
								block = null;
								block1 = ModBlocks.stoneShakuras;
								blockArray[i2] = Blocks.gravel;
							} else {
								blockArray[i2] = block1;
							}
						} else if (k > 0) {
							--k;
							blockArray[i2] = block1;

							if (k == 0 && block1 == ModBlocks.sandShakuras) {
								k = rand.nextInt(4) + Math.max(0, l1 - 63);
								block1 = Blocks.sandstone;
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
