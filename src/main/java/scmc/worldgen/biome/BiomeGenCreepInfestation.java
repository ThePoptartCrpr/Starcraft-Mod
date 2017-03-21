package scmc.worldgen.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import scmc.blocks.ModBlocks;

public class BiomeGenCreepInfestation extends Biome {

	public BiomeGenCreepInfestation(BiomeProperties id) {
		super(id);


		this.topBlock = ModBlocks.ZERG_CREEP.getDefaultState();
		this.fillerBlock = Blocks.DIRT.getDefaultState();

		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
	}

	public int getSkyColorByTemp(float par1) {
		return 0;
	}

}