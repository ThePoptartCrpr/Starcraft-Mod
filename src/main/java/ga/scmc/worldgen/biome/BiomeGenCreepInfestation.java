package ga.scmc.worldgen.biome;

import ga.scmc.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeGenCreepInfestation extends Biome {

	public BiomeGenCreepInfestation(BiomeProperties id) {
		super(id);

		topBlock = ModBlocks.ZERG_CREEP.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();

		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
	}

	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}
}