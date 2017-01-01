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

		biomeCreepInfestationChar = new CharBiomeGenCreepInfestation(51, true).setRegistryName("Infestation Biome");
		biomeAshPlains = new BiomeGenAshPlains(52).setRegistryName("Ash Plains");
		biomeMoltenInferno = new BiomeGenMoltenInferno(53).setRegistryName("Molten Inferno");
		biomeShakurasDesert = new BiomeGenDesertShakuras(54).setRegistryName("Shakuras Desert");

		BiomeDictionary.registerBiomeType(biomeCreepInfestationChar, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeAshPlains, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeMoltenInferno, Type.FOREST);
		
		BiomeDictionary.registerBiomeType(biomeShakurasDesert, Type.COLD, Type.SNOWY);

		// add biomes here
		
		BiomeManager.addSpawnBiome(BiomesSC.biomeCreepInfestationChar);
		BiomeManager.addSpawnBiome(BiomesSC.biomeAshPlains);
		
		BiomeManager.removeSpawnBiome(BiomesSC.biomeMoltenInferno);
		

	}

}
