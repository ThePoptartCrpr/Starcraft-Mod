package net.bvanseghi.starcraft.worldgen.biome;

import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenCreepInfestation extends BiomeGenBase {

	public static final Height biomeHeight = new Height(0.05F, 0.05F);

	public BiomeGenCreepInfestation(int id) {
		super(id);

		this.setHeight(biomeHeight);
		this.waterColorMultiplier = 9175295;

		this.topBlock = ModBlocks.zergCreep;
		this.fillerBlock = Blocks.dirt;

		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityLarva.class, 8, 2, 3));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityLarvaCocoon.class, 5, 2, 3));
	}

	public int getSkyColorByTemp(float par1) {
		return 0;
	}

}