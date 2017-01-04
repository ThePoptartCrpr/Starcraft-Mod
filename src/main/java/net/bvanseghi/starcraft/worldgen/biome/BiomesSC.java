package net.bvanseghi.starcraft.worldgen.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomesSC extends Biome {

	public BiomesSC(BiomeProperties par1) {
		super(par1);
	}

	public static Biome biomeCreepInfestationChar;
	public static Biome biomeAshPlains;
	public static Biome biomeMoltenInferno;
	
	public static Biome biomeShakurasDesert;

	public static void init() {
		registerBiomes();
	}

	public static void registerBiomes() {

		//TODO: Edit these later, as these values are all the same
		biomeCreepInfestationChar = new CharBiomeGenCreepInfestation((new Biome.BiomeProperties("Infestation Biome")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.05F).setRainfall(0.3F).setSnowEnabled());
		biomeAshPlains = new BiomeGenAshPlains((new Biome.BiomeProperties("Ash Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.05F).setRainfall(0.3F).setSnowEnabled());
		biomeMoltenInferno = new BiomeGenMoltenInferno((new Biome.BiomeProperties("Molten Inferno")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.05F).setRainfall(0.3F).setSnowEnabled());
		biomeShakurasDesert = new BiomeGenDesertShakuras((new Biome.BiomeProperties("Shakuras Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.05F).setRainfall(0.3F).setSnowEnabled());

		BiomeDictionary.registerBiomeType(biomeCreepInfestationChar, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeAshPlains, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeMoltenInferno, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeShakurasDesert, Type.COLD, Type.SNOWY);

		// add spawn biomes here
		
		BiomeManager.addSpawnBiome(BiomesSC.biomeCreepInfestationChar);
		BiomeManager.addSpawnBiome(BiomesSC.biomeAshPlains);
		BiomeManager.removeSpawnBiome(BiomesSC.biomeMoltenInferno);
		

	}

}
