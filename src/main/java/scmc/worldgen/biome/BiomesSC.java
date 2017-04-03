package scmc.worldgen.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomesSC extends Biome {

	public BiomesSC(BiomeProperties par1) {
		super(par1);
	}

	public static Biome biomeCharCreepInfestation;
	public static Biome biomeAshPlains;
	public static Biome biomeMoltenInferno;
	public static Biome biomeShakurasDesert;

	public static void init() {
		registerBiomes();
		GameRegistry.register(biomeAshPlains);
		GameRegistry.register(biomeMoltenInferno);
		GameRegistry.register(biomeCharCreepInfestation);
		GameRegistry.register(biomeShakurasDesert);
	}

	public static void registerBiomes() {

		//TODO: Edit these later, as these values are all the same
		biomeCharCreepInfestation = new BiomeGenCharCreepInfestation((new Biome.BiomeProperties("Infestation Biome")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.0F).setRainfall(0.3F));
		biomeAshPlains = new BiomeGenAshPlains((new Biome.BiomeProperties("Ash Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.5F).setRainfall(0.3F));
		biomeMoltenInferno = new BiomeGenMoltenInferno((new Biome.BiomeProperties("Molten Inferno")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeShakurasDesert = new BiomeGenDesertShakuras((new Biome.BiomeProperties("Shakuras Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.5F).setRainfall(0.3F));

		// FIXME Testing Code
		/*for (BiomeType type : BiomeType.values()) {
			for (BiomeEntry biomeEntry : BiomeManager.getBiomes(type)) {
				BiomeManager.removeBiome(type, biomeEntry);
				BiomeManager.removeSpawnBiome(biomeEntry.biome);
			}
		}
		
		BiomeDictionary.registerBiomeType(biomeCreepInfestationChar, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeAshPlains, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeMoltenInferno, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeShakurasDesert, Type.COLD, Type.SNOWY);
		
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(biomeMoltenInferno, 100));
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(biomeMoltenInferno, 100));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biomeMoltenInferno, 100));
		BiomeManager.addBiome(BiomeType.ICY, new BiomeEntry(biomeMoltenInferno, 100));
		*/
		
		// add spawn biomes here

		BiomeManager.addSpawnBiome(BiomesSC.biomeCharCreepInfestation);
		BiomeManager.addSpawnBiome(BiomesSC.biomeAshPlains);
		BiomeManager.addSpawnBiome(BiomesSC.biomeShakurasDesert);
		BiomeManager.removeSpawnBiome(BiomesSC.biomeMoltenInferno);

	}
}
