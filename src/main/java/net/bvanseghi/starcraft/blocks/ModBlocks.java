package net.bvanseghi.starcraft.blocks;

import java.util.HashMap;
import java.util.Map;

import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.ore.OreOWCopper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * When wundr marks {@link Blockz} as done, then scrap this class!!!<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 */
public class ModBlocks extends Block {

	public ModBlocks(Material material) {
		super(material);
	}

	public static Block ORE_COPPER_OW;
	public static Block ORE_TITANIUM_OW;
	public static Block ORE_URANIUM_OW;

	public static Block ORE_ALIEN_CHAR;
	public static Block ORE_COAL_CHAR;
	public static Block ORE_COPPER_CHAR;
	public static Block ORE_DIAMOND_CHAR;
	public static Block ORE_GOLD_CHAR;
	public static Block ORE_IRON_CHAR;
	public static Block ORE_LAPIS_CHAR;
	public static Block ORE_MINERAL_CHAR;
	public static Block ORE_REDSTONE_CHAR;
	public static Block ORE_RICHMINERAL_CHAR;
	public static Block ORE_TITANIUM_CHAR;
	public static Block ORE_URANIUM_CHAR;

	public static Block ORE_ALIEN_SHAKURAS;
	public static Block ORE_COAL_SHAKURAS;
	public static Block ORE_COPPER_SHAKURAS;
	public static Block ORE_DIAMOND_SHAKURAS;
	public static Block ORE_GOLD_SHAKURAS;
	public static Block ORE_IRON_SHAKURAS;
	public static Block ORE_LAPIS_SHAKURAS;
	public static Block ORE_MINERAL_SHAKURAS;
	public static Block ORE_REDSTONE_SHAKURAS;
	public static Block ORE_RICHMINERAL_SHAKURAS;
	public static Block ORE_TITANIUM_SHAKURAS;
	public static Block ORE_URANIUM_SHAKURAS;

	public static Block ZERG_STRUCTURE_CARAPACE;
	public static Block ZERG_STRUCTURE_FLESH;
	public static Block PROTOSS_METAL;
	public static Block COMP_MINERAL;
	public static Block DYED_IRON;

	public static Block PROTOSS_ENERGY_STABILIZER;
	public static Block PROTOSS_ENERGY_CHANNEL;

	public static Block PROTOSS_DARK_ENERGY_STABILIZER;
	public static Block PROTOSS_DARK_ENERGY_CHANNEL;

	public static Block ENERGY_BLOCK;
	public static Block VOID_ENERGY_BLOCK;
	public static Block CRYSTAL;
	public static Block WARPGATE_WORMHOLE_CHAR;
	public static Block WARPGATE_WORMHOLE_OVERWORLD;
	public static Block WARPGATE_WORMHOLE_SHAKURAS;

	public static Block PROTOSS_WARPPROJECTOR_CHAR;
	public static Block PROTOSS_WARPPROJECTOR_OVERWORLD;
	public static Block PROTOSS_WARPPROJECTOR_SHAKURAS;

	public static Block MINERAL_FIELD;
	public static Block RICH_MINERAL_FIELD;

	public static Block VESPENE_GEYSER;
	public static Block RICH_VESPENE_GEYSER;
	public static Block VESPENE_GEYSER_CHAR;
	public static Block RICH_VESPENE_GEYSER_CHAR;
	public static Block VESPENE_GEYSER_SHAKURAS;
	public static Block RICH_VESPENE_GEYSER_SHAKURAS;

	public static Block VESPENE_GEYSER_BASE;
	public static Block VESPENE_GEYSER_BASE_CHAR;
	public static Block VESPENE_GEYSER_BASE_SHAKURAS;

	public static Block ZERG_CREEP;
	public static Block KERATIN_CHUNK;

	public static Block FLUID_ACID;
	public static Block FLUID_BLOOD;

	// Future general blocks.

	public static Block terranMetal;
	public static Block terranMetalDec1;

	public static Block COMP_METAL;

	// Will be used in Xel'Naga temples and shrines.
	public static Block xelnagaMetal;

	// Future blocks for dimensions

	public static Block dirtAuir;
	public static Block stoneAuir;
	public static Block grassAuir;

	public static Block dirtShakuras;
	public static Block STONE_SHAKURAS;
	public static Block COBBLESTONE_SHAKURAS;
	public static Block SAND_SHAKURAS;
	public static Block grassShakuras;

	public static Block dirtKorhal;
	public static Block stoneKorhal;
	public static Block grassKorhal;

	public static Block DIRT_CHAR;
	public static Block STONE_CHAR;
	public static Block COBBLESTONE_CHAR;
	public static Block ASH_CHAR;
	public static Block MAGMA_CHAR;

	public static Block dirtTarsonis;
	public static Block stoneTarsonis;
	public static Block grassTarsonis;

	public static Block dirtZerus;
	public static Block stoneZerus;
	public static Block grassZerus;

	// debug blocks
	public static Block DIM_PORTAL_CHAR;
	public static Block DIM_PORTAL_OVERWORLD;
	public static Block DIM_PORTAL_SHAKURAS;

	public static Map<String, Block> BLOCKS = new HashMap<String, Block>();
	
 	public static void init() {
 		instantiate();
 		register();
	}
 	
 	public static void instantiate() {
 		new OreOWCopper("copper","copper", Material.ROCK);
 	}

	public static void register() {
		for (Block block : BLOCKS.values()) {
			GameRegistry.register(block);
			GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}
	}

	public static void registerModels() {
		for (Block block : BLOCKS.values()) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
					new ModelResourceLocation(block.getRegistryName(), "inventory"));
		}
	}
	
}