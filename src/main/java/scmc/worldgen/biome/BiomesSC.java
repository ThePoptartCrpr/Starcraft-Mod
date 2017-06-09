package scmc.worldgen.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomesSC extends Biome {

	public static Biome biomeAshPlains;

	public static Biome biomeCharCreepInfestation;
	public static Biome biomeCharScars;
	public static Biome biomeMoltenInferno;
	public static Biome biomeShakurasDesert;

	public static void init() {
		registerBiomes();
		GameRegistry.register(biomeAshPlains);
		GameRegistry.register(biomeMoltenInferno);
		GameRegistry.register(biomeCharCreepInfestation);
		GameRegistry.register(biomeShakurasDesert);
		GameRegistry.register(biomeCharScars);
	}

	public static void registerBiomes() {

		// TODO: Edit these later, as these values are all the same
		biomeCharCreepInfestation = new BiomeGenCharCreepInfestation(
				(new Biome.BiomeProperties("Infestation Biome")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.0F).setRainfall(0.3F));
		biomeAshPlains = new BiomeGenAshPlains(
				(new Biome.BiomeProperties("Ash Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.5F).setRainfall(0.3F));
		biomeMoltenInferno = new BiomeGenMoltenInferno(
				(new Biome.BiomeProperties("Molten Inferno")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeShakurasDesert = new BiomeGenDesertShakuras(
				(new Biome.BiomeProperties("Shakuras Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.5F).setRainfall(0.3F));
		biomeCharScars = new BiomeGenCharScar((new Biome.BiomeProperties("Char Scars")).setBaseHeight(-0.5F).setHeightVariation(0.0F));

		// add spawn biomes here

		BiomeManager.addSpawnBiome(BiomesSC.biomeCharCreepInfestation);
		BiomeManager.addSpawnBiome(BiomesSC.biomeAshPlains);
		BiomeManager.addSpawnBiome(BiomesSC.biomeShakurasDesert);
		BiomeManager.removeSpawnBiome(BiomesSC.biomeMoltenInferno);
		BiomeManager.removeSpawnBiome(BiomesSC.biomeCharScars);

	}

	public BiomesSC(BiomeProperties par1) {
		super(par1);
	}

	@Override
	public String toString() {
		return String.valueOf(getIdForBiome(this));
	}
}
