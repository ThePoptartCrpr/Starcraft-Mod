package net.bvanseghi.starcraft.worldgen.biome;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeGenCreepInfestation extends Biome {

	public static final Height biomeHeight = new Height(0.05F, 0.05F);

	public BiomeGenCreepInfestation(int id) {
		super(id);

		this.setHeight(biomeHeight);
		this.waterColorMultiplier = 9175295;

		this.topBlock = ModBlocks.zergCreep;
		this.fillerBlock = Blocks.DIRT.getDefaultState();

		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
	}

	public int getSkyColorByTemp(float par1) {
		return 0;
	}

}