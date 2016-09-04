package net.bvanseghi.starcraft.worldgen.biome;

import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;

public class BiomesSC extends BiomeGenBase {

	public BiomesSC(int par1) {
		super(par1);

	}

	public static BiomeGenBase biomeCreepInfestationChar;
	public static BiomeGenBase biomeAshPlains;
	public static BiomeGenBase biomeMoltenInferno;
	
	public static BiomeGenBase biomeShakurasDesert;

	public static void init() {
		registerBiomes();
	}

	private static void registerBiomes() {

		biomeCreepInfestationChar = new CharBiomeGenCreepInfestation(51, true).setBiomeName("Infestation Biome");
		biomeAshPlains = new BiomeGenAshPlains(52).setBiomeName("Ash Plains");
		biomeMoltenInferno = new BiomeGenMoltenInferno(54).setBiomeName("Molten Inferno");
		
		biomeShakurasDesert = new BiomeGenDesertShakuras(55).setBiomeName("Shakuras Desert");

		BiomeDictionary.registerBiomeType(biomeCreepInfestationChar, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeAshPlains, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeMoltenInferno, Type.FOREST);
		
		BiomeDictionary.registerBiomeType(biomeShakurasDesert, Type.DESERT);

		// add biomes here
		
		BiomeManager.addSpawnBiome(BiomesSC.biomeCreepInfestationChar);
		BiomeManager.addSpawnBiome(BiomesSC.biomeAshPlains);
		BiomeManager.addSpawnBiome(BiomesSC.biomeMoltenInferno);
		
		BiomeManager.addSpawnBiome(BiomesSC.biomeShakurasDesert);

	}

}
