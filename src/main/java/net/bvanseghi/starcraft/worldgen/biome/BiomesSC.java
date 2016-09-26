package net.bvanseghi.starcraft.worldgen.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

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
		biomeMoltenInferno = new BiomeGenMoltenInferno(53).setBiomeName("Molten Inferno");
		biomeShakurasDesert = new BiomeGenDesertShakuras(54).setBiomeName("Shakuras Desert");

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
