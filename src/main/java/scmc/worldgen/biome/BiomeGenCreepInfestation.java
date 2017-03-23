package scmc.worldgen.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import scmc.blocks.ModBlocks;

public class BiomeGenCreepInfestation extends Biome {
	public BiomeGenCreepInfestation(BiomeProperties id) {
		super(id);
		
		topBlock = ModBlocks.ZERG_CREEP.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
	}

	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}
}
