package ga.scmc.worldgen.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomesSC extends Biome {

	public static Biome biomeAshPlains;
	public static Biome biomeAshPlateau;
	public static Biome biomeCharCreepInfestation;
	public static Biome biomeCharScars;
	public static Biome biomeLavaOcean;
	public static Biome biomeMoltenInferno;
	public static Biome biomeAshHills;
	
	public static Biome biomeCharHills;
	public static Biome biomeDauntlessPlateau;
	public static Biome biomeAcidMarsh;
	public static Biome biomeBoneTrench;
	public static Biome biomeCharOutskirts;
	
	public static Biome biomeShakurasDesert;
	public static Biome biomeShakurasCity;

	public static void init() {
		registerBiomes();
		GameRegistry.register(biomeAshPlains);
		GameRegistry.register(biomeAshPlateau);
		GameRegistry.register(biomeMoltenInferno);
		GameRegistry.register(biomeCharCreepInfestation);
		GameRegistry.register(biomeCharScars);
		GameRegistry.register(biomeLavaOcean);
		
		GameRegistry.register(biomeCharHills);
		GameRegistry.register(biomeDauntlessPlateau);
		GameRegistry.register(biomeAcidMarsh);
		GameRegistry.register(biomeBoneTrench);
		GameRegistry.register(biomeCharOutskirts);
		
		GameRegistry.register(biomeShakurasDesert);
		GameRegistry.register(biomeShakurasCity);
	}

	public static void registerBiomes() {

		// TODO: Edit these later, as these values are all the same
		biomeCharCreepInfestation = new BiomeGenCharCreepInfestation(
				(new Biome.BiomeProperties("Infestation")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.0F).setRainfall(0.3F));
		biomeAshPlains = new BiomeGenCharAshPlains(
				(new Biome.BiomeProperties("Ash Plains")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.5F).setRainfall(0.3F));
		biomeAshHills = new BiomeGenCharAshHills(
				(new Biome.BiomeProperties("Ash Hills")).setBaseHeight(0.25F).setHeightVariation(0.15F).setTemperature(1.5F).setRainfall(0.3F));
		biomeAshPlateau = new BiomeGenCharAshPlateau(
				(new Biome.BiomeProperties("Ash Plateau")).setBaseHeight(0.75F).setHeightVariation(0.05F).setTemperature(1.5F).setRainfall(0.3F));
		biomeMoltenInferno = new BiomeGenCharMoltenInferno(
				(new Biome.BiomeProperties("Molten Inferno")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeCharScars = new BiomeGenCharScar((new Biome.BiomeProperties("Char Scars")).setBaseHeight(-0.5F).setHeightVariation(0.0F));
		biomeLavaOcean = new BiomeGenCharLavaOcean((new Biome.BiomeProperties("Lava Ocean")).setBaseHeight(-1.5F).setHeightVariation(0.35F));
		biomeCharHills = new BiomeGenCharHills(
				(new Biome.BiomeProperties("Char Hills")).setBaseHeight(0.25F).setHeightVariation(0.15F).setTemperature(1.5F).setRainfall(0.3F));
		biomeDauntlessPlateau = new BiomeGenCharDauntlessPlateau(
				(new Biome.BiomeProperties("Dauntless Plateau")).setBaseHeight(0.75F).setHeightVariation(0.0F).setTemperature(1.5F).setRainfall(0.3F));
		biomeAcidMarsh = new BiomeGenCharAcidMarsh(
				(new Biome.BiomeProperties("Acid Marsh")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(2.0F).setRainfall(0.3F));
		biomeBoneTrench = new BiomeGenCharBoneTrench((new Biome.BiomeProperties("Bone Trench")).setBaseHeight(-1.0F).setHeightVariation(0.0F));
		biomeCharOutskirts = new BiomeGenCharOutskirts(
				(new Biome.BiomeProperties("Char Outskirts")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.5F).setRainfall(0.3F));
		
		
		biomeShakurasDesert = new BiomeGenShakurasDesert(
				(new Biome.BiomeProperties("Shakuras Desert")).setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(1.5F).setRainfall(0.3F));
		biomeShakurasCity = new BiomeGenShakurasCity(
				(new Biome.BiomeProperties("Shakuras City")).setBaseHeight(0.0F).setHeightVariation(0.0F).setTemperature(1.5F).setRainfall(0.3F));

		// add spawn biomes here

		BiomeManager.addSpawnBiome(BiomesSC.biomeAshPlains);
		BiomeManager.addSpawnBiome(BiomesSC.biomeAshHills);
		BiomeManager.addSpawnBiome(BiomesSC.biomeAshPlateau);
		
		BiomeManager.addSpawnBiome(BiomesSC.biomeShakurasDesert);

		BiomeManager.removeSpawnBiome(BiomesSC.biomeLavaOcean);
		BiomeManager.removeSpawnBiome(BiomesSC.biomeMoltenInferno);
		BiomeManager.removeSpawnBiome(BiomesSC.biomeCharScars);
		BiomeManager.removeSpawnBiome(BiomesSC.biomeShakurasCity);

	}

	public BiomesSC(BiomeProperties par1) {
		super(par1);
	}

	@Override
	public String toString() {
		return String.valueOf(getIdForBiome(this));
	}
}
