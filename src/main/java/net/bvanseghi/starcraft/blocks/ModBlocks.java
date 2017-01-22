package net.bvanseghi.starcraft.blocks;

import org.apache.logging.log4j.Level;

import net.bvanseghi.starcraft.blocks.coreblocks.BlockCoreNexusDark;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCoreNexusKhalai;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCoreNexusVoid;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCorePylonDark;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCorePylonKhalai;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCorePylonVoid;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCoreWarpGateDark;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCoreWarpGateKhalai;
import net.bvanseghi.starcraft.blocks.coreblocks.BlockCoreWarpGateVoid;
import net.bvanseghi.starcraft.blocks.metablocks.BlockCompressedMetals;
import net.bvanseghi.starcraft.blocks.metablocks.BlockProtossMetal;
import net.bvanseghi.starcraft.blocks.metablocks.BlockPylonCrystal;
import net.bvanseghi.starcraft.blocks.metablocks.BlockZergStructureFlesh;
import net.bvanseghi.starcraft.debug.DimPortalChar;
import net.bvanseghi.starcraft.debug.DimPortalOverworld;
import net.bvanseghi.starcraft.debug.DimPortalShakuras;
import net.bvanseghi.starcraft.lib.LogHelper;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.ore.OreOWCopper;
import net.bvanseghi.starcraft.ore.OreOWTitanium;
import net.bvanseghi.starcraft.ore.OreOWUranium;
import net.bvanseghi.starcraft.orechar.OreCharCoal;
import net.bvanseghi.starcraft.orechar.OreCharCopper;
import net.bvanseghi.starcraft.orechar.OreCharDiamond;
import net.bvanseghi.starcraft.orechar.OreCharGold;
import net.bvanseghi.starcraft.orechar.OreCharIron;
import net.bvanseghi.starcraft.orechar.OreCharLapis;
import net.bvanseghi.starcraft.orechar.OreCharMineral;
import net.bvanseghi.starcraft.orechar.OreCharRedstone;
import net.bvanseghi.starcraft.orechar.OreCharRichMineral;
import net.bvanseghi.starcraft.orechar.OreCharTitanium;
import net.bvanseghi.starcraft.orechar.OreCharUranium;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasCoal;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasCopper;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasDiamond;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasGold;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasIron;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasLapis;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasMineral;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasRedstone;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasRichMineral;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasTitanium;
import net.bvanseghi.starcraft.oreshakuras.OreShakurasUranium;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
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

	public static Block PROTOSS_ENERGY_STABILIZER;
	public static Block PROTOSS_ENERGY_CHANNEL;

	public static Block PROTOSS_DARK_ENERGY_STABILIZER;
	public static Block PROTOSS_DARK_ENERGY_CHANNEL;

	public static Block ENERGY_BLOCK;
	public static Block VOID_ENERGY_BLOCK;
	public static BlockPylonCrystal CRYSTAL;
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

	public static BlockCompressedMetals COMP_METAL;

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
	
	
	//Core Blocks
	public static Block CORE_PYLON_VOID;
	public static Block CORE_PYLON_DARK;
	public static Block CORE_PYLON_KHALAI;
	
	public static Block CORE_WARPGATE_VOID;
	public static Block CORE_WARPGATE_DARK;
	public static Block CORE_WARPGATE_KHALAI;
	
	public static Block CORE_NEXUS_VOID;
	public static Block CORE_NEXUS_DARK;
	public static Block CORE_NEXUS_KHALAI;
	

	public static void init() {
		instantiate();
		register();
	}

	public static void instantiate() {
		ORE_COPPER_OW = new OreOWCopper();
		ORE_TITANIUM_OW = new OreOWTitanium();
		ORE_URANIUM_OW = new OreOWUranium();

		DIM_PORTAL_OVERWORLD = new DimPortalOverworld();
		
		ORE_COAL_CHAR = new OreCharCoal();
		ORE_COPPER_CHAR = new OreCharCopper();
		ORE_DIAMOND_CHAR = new OreCharDiamond();
		ORE_GOLD_CHAR = new OreCharGold();
		ORE_IRON_CHAR = new OreCharIron();
		ORE_LAPIS_CHAR = new OreCharLapis();
		ORE_MINERAL_CHAR = new OreCharMineral();
		ORE_REDSTONE_CHAR = new OreCharRedstone();
		ORE_RICHMINERAL_CHAR = new OreCharRichMineral();
		ORE_TITANIUM_CHAR = new OreCharTitanium();
		ORE_URANIUM_CHAR = new OreCharUranium();
		
		STONE_CHAR = new BlockCharStone();
		COBBLESTONE_CHAR = new BlockCharCobblestone();
		MAGMA_CHAR = new BlockCharMagma();
		DIRT_CHAR = new BlockCharDirt();
		DIM_PORTAL_CHAR = new DimPortalChar();
		
		ORE_COAL_SHAKURAS = new OreShakurasCoal();
		ORE_COPPER_SHAKURAS = new OreShakurasCopper();
		ORE_DIAMOND_SHAKURAS = new OreShakurasDiamond();
		ORE_GOLD_SHAKURAS = new OreShakurasGold();
		ORE_IRON_SHAKURAS = new OreShakurasIron();
		ORE_LAPIS_SHAKURAS = new OreShakurasLapis();
		ORE_MINERAL_SHAKURAS = new OreShakurasMineral();
		ORE_REDSTONE_SHAKURAS = new OreShakurasRedstone();
		ORE_RICHMINERAL_SHAKURAS = new OreShakurasRichMineral();
		ORE_TITANIUM_SHAKURAS = new OreShakurasTitanium();
		ORE_URANIUM_SHAKURAS = new OreShakurasUranium();
		
		STONE_SHAKURAS = new BlockShakurasStone();
		COBBLESTONE_SHAKURAS = new BlockShakurasCobblestone();
		SAND_SHAKURAS = new BlockShakurasSand();
		DIM_PORTAL_SHAKURAS = new DimPortalShakuras();
		
		
		PROTOSS_WARPPROJECTOR_CHAR = new BlockProtossWarpProjectorC();
		PROTOSS_WARPPROJECTOR_OVERWORLD = new BlockProtossWarpProjectorO();
		PROTOSS_WARPPROJECTOR_SHAKURAS = new BlockProtossWarpProjectorS();
		
		
		ZERG_CREEP = new BlockZergCreep();
		KERATIN_CHUNK = new BlockKeratinChunk();
		
		
		VESPENE_GEYSER_BASE = new BlockVespeneGeyserBase();
		VESPENE_GEYSER_BASE_CHAR = new BlockVespeneGeyserBaseChar();
		VESPENE_GEYSER_BASE_SHAKURAS = new BlockVespeneGeyserBaseShakuras();
		
		//Core Blocks
		CORE_PYLON_VOID = new BlockCorePylonVoid();
		CORE_PYLON_DARK = new BlockCorePylonDark();
		CORE_PYLON_KHALAI = new BlockCorePylonKhalai();
		
		CORE_WARPGATE_VOID = new BlockCoreWarpGateVoid();
		CORE_WARPGATE_DARK = new BlockCoreWarpGateDark();
		CORE_WARPGATE_KHALAI = new BlockCoreWarpGateKhalai();
		
		CORE_NEXUS_VOID = new BlockCoreNexusVoid();
		CORE_NEXUS_DARK = new BlockCoreNexusDark();
		CORE_NEXUS_KHALAI = new BlockCoreNexusKhalai();
		
	}

	public static void register() {
		
		GameRegistry.register(ORE_COPPER_OW);
		GameRegistry.register(new ItemBlock(ORE_COPPER_OW).setRegistryName(Reference.ModBlocks.ORE_COPPER_OW.getRegistryRL()));
		
		GameRegistry.register(ORE_TITANIUM_OW);
		GameRegistry.register(new ItemBlock(ORE_TITANIUM_OW).setRegistryName(Reference.ModBlocks.ORE_TITANIUM_OW.getRegistryRL()));
		
		GameRegistry.register(ORE_URANIUM_OW);
		GameRegistry.register(new ItemBlock(ORE_URANIUM_OW).setRegistryName(Reference.ModBlocks.ORE_URANIUM_OW.getRegistryRL()));
		
		GameRegistry.register(DIM_PORTAL_OVERWORLD);
		GameRegistry.register(new ItemBlock(DIM_PORTAL_OVERWORLD).setRegistryName(Reference.ModBlocks.BLOCK_DIM_PORTAL_OW.getRegistryRL()));
		
		
		GameRegistry.register(ORE_COAL_CHAR);
		GameRegistry.register(new ItemBlock(ORE_COAL_CHAR).setRegistryName(Reference.ModBlocks.ORE_COAL_C.getRegistryRL()));
		
		GameRegistry.register(ORE_COPPER_CHAR);
		GameRegistry.register(new ItemBlock(ORE_COPPER_CHAR).setRegistryName(Reference.ModBlocks.ORE_COPPER_C.getRegistryRL()));
		
		GameRegistry.register(ORE_DIAMOND_CHAR);
		GameRegistry.register(new ItemBlock(ORE_DIAMOND_CHAR).setRegistryName(Reference.ModBlocks.ORE_DIAMOND_C.getRegistryRL()));
		
		GameRegistry.register(ORE_GOLD_CHAR);
		GameRegistry.register(new ItemBlock(ORE_GOLD_CHAR).setRegistryName(Reference.ModBlocks.ORE_GOLD_C.getRegistryRL()));
		
		GameRegistry.register(ORE_IRON_CHAR);
		GameRegistry.register(new ItemBlock(ORE_IRON_CHAR).setRegistryName(Reference.ModBlocks.ORE_IRON_C.getRegistryRL()));
		
		GameRegistry.register(ORE_LAPIS_CHAR);
		GameRegistry.register(new ItemBlock(ORE_LAPIS_CHAR).setRegistryName(Reference.ModBlocks.ORE_LAPIS_C.getRegistryRL()));
		
		GameRegistry.register(ORE_MINERAL_CHAR);
		GameRegistry.register(new ItemBlock(ORE_MINERAL_CHAR).setRegistryName(Reference.ModBlocks.ORE_MINERAL_C.getRegistryRL()));
		
		GameRegistry.register(ORE_REDSTONE_CHAR);
		GameRegistry.register(new ItemBlock(ORE_REDSTONE_CHAR).setRegistryName(Reference.ModBlocks.ORE_REDSTONE_C.getRegistryRL()));
		
		GameRegistry.register(ORE_RICHMINERAL_CHAR);
		GameRegistry.register(new ItemBlock(ORE_RICHMINERAL_CHAR).setRegistryName(Reference.ModBlocks.ORE_RICHMINERAL_C.getRegistryRL()));
		
		GameRegistry.register(ORE_TITANIUM_CHAR);
		GameRegistry.register(new ItemBlock(ORE_TITANIUM_CHAR).setRegistryName(Reference.ModBlocks.ORE_TITANIUM_C.getRegistryRL()));
		
		GameRegistry.register(ORE_URANIUM_CHAR);
		GameRegistry.register(new ItemBlock(ORE_URANIUM_CHAR).setRegistryName(Reference.ModBlocks.ORE_URANIUM_C.getRegistryRL()));
		
		
		GameRegistry.register(STONE_CHAR);
		GameRegistry.register(new ItemBlock(STONE_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_STONE_C.getRegistryRL()));
		
		GameRegistry.register(COBBLESTONE_CHAR);
		GameRegistry.register(new ItemBlock(COBBLESTONE_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_C.getRegistryRL()));
		
		GameRegistry.register(MAGMA_CHAR);
		GameRegistry.register(new ItemBlock(MAGMA_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_MAGMA_C.getRegistryRL()));
		
		GameRegistry.register(DIRT_CHAR);
		GameRegistry.register(new ItemBlock(DIRT_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_DIRT_C.getRegistryRL()));
		
		GameRegistry.register(DIM_PORTAL_CHAR);
		GameRegistry.register(new ItemBlock(DIM_PORTAL_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_DIM_PORTAL_C.getRegistryRL()));
		
		
		GameRegistry.register(ORE_COAL_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_COAL_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_COAL_S.getRegistryRL()));
		
		GameRegistry.register(ORE_COPPER_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_COPPER_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_COPPER_S.getRegistryRL()));
		
		GameRegistry.register(ORE_DIAMOND_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_DIAMOND_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_DIAMOND_S.getRegistryRL()));
		
		GameRegistry.register(ORE_GOLD_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_GOLD_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_GOLD_S.getRegistryRL()));
		
		GameRegistry.register(ORE_IRON_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_IRON_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_IRON_S.getRegistryRL()));
		
		GameRegistry.register(ORE_LAPIS_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_LAPIS_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_LAPIS_S.getRegistryRL()));
		
		GameRegistry.register(ORE_MINERAL_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_MINERAL_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_MINERAL_S.getRegistryRL()));
		
		GameRegistry.register(ORE_REDSTONE_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_REDSTONE_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_REDSTONE_S.getRegistryRL()));
		
		GameRegistry.register(ORE_RICHMINERAL_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_RICHMINERAL_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_RICHMINERAL_S.getRegistryRL()));
		
		GameRegistry.register(ORE_TITANIUM_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_TITANIUM_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_TITANIUM_S.getRegistryRL()));
		
		GameRegistry.register(ORE_URANIUM_SHAKURAS);
		GameRegistry.register(new ItemBlock(ORE_URANIUM_SHAKURAS).setRegistryName(Reference.ModBlocks.ORE_URANIUM_S.getRegistryRL()));
		
		GameRegistry.register(STONE_SHAKURAS);
		GameRegistry.register(new ItemBlock(STONE_SHAKURAS).setRegistryName(Reference.ModBlocks.BLOCK_STONE_S.getRegistryRL()));
		
		GameRegistry.register(COBBLESTONE_SHAKURAS);
		GameRegistry.register(new ItemBlock(COBBLESTONE_SHAKURAS).setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_S.getRegistryRL()));
		
		GameRegistry.register(SAND_SHAKURAS);
		GameRegistry.register(new ItemBlock(SAND_SHAKURAS).setRegistryName(Reference.ModBlocks.BLOCK_SAND_S.getRegistryRL()));
		
		GameRegistry.register(DIM_PORTAL_SHAKURAS);
		GameRegistry.register(new ItemBlock(DIM_PORTAL_SHAKURAS).setRegistryName(Reference.ModBlocks.BLOCK_DIM_PORTAL_S.getRegistryRL()));
		
		
		GameRegistry.register(PROTOSS_WARPPROJECTOR_CHAR);
		GameRegistry.register(new ItemBlock(PROTOSS_WARPPROJECTOR_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_C.getRegistryRL()));
		
		GameRegistry.register(PROTOSS_WARPPROJECTOR_OVERWORLD);
		GameRegistry.register(new ItemBlock(PROTOSS_WARPPROJECTOR_OVERWORLD).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_OW.getRegistryRL()));
		
		GameRegistry.register(PROTOSS_WARPPROJECTOR_SHAKURAS);
		GameRegistry.register(new ItemBlock(PROTOSS_WARPPROJECTOR_SHAKURAS).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_S.getRegistryRL()));
		
		
		GameRegistry.register(ZERG_CREEP);
		GameRegistry.register(new ItemBlock(ZERG_CREEP).setRegistryName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getRegistryRL()));
		
		GameRegistry.register(KERATIN_CHUNK);
		GameRegistry.register(new ItemBlock(KERATIN_CHUNK).setRegistryName(Reference.ModBlocks.BLOCK_KERATIN_CHUNK.getRegistryRL()));
		
		
		GameRegistry.register(VESPENE_GEYSER_BASE);
		GameRegistry.register(new ItemBlock(VESPENE_GEYSER_BASE).setRegistryName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE.getRegistryRL()));
		
		GameRegistry.register(VESPENE_GEYSER_BASE_CHAR);
		GameRegistry.register(new ItemBlock(VESPENE_GEYSER_BASE_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_C.getRegistryRL()));
		
		GameRegistry.register(VESPENE_GEYSER_BASE_SHAKURAS);
		GameRegistry.register(new ItemBlock(VESPENE_GEYSER_BASE_SHAKURAS).setRegistryName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_S.getRegistryRL()));
		
		GameRegistry.register(CORE_PYLON_VOID);
		GameRegistry.register(new ItemBlock(CORE_PYLON_VOID).setRegistryName(Reference.ModBlocks.BLOCK_CORE_PYLON_VOID.getRegistryRL()));
		
		GameRegistry.register(CORE_PYLON_DARK);
		GameRegistry.register(new ItemBlock(CORE_PYLON_DARK).setRegistryName(Reference.ModBlocks.BLOCK_CORE_PYLON_DARK.getRegistryRL()));
		
		GameRegistry.register(CORE_PYLON_KHALAI);
		GameRegistry.register(new ItemBlock(CORE_PYLON_KHALAI).setRegistryName(Reference.ModBlocks.BLOCK_CORE_PYLON_KHALAI.getRegistryRL()));
		
		GameRegistry.register(CORE_NEXUS_VOID);
		GameRegistry.register(new ItemBlock(CORE_NEXUS_VOID).setRegistryName(Reference.ModBlocks.BLOCK_CORE_NEXUS_VOID.getRegistryRL()));
		
		GameRegistry.register(CORE_NEXUS_DARK);
		GameRegistry.register(new ItemBlock(CORE_NEXUS_DARK).setRegistryName(Reference.ModBlocks.BLOCK_CORE_NEXUS_DARK.getRegistryRL()));
		
		GameRegistry.register(CORE_NEXUS_KHALAI);
		GameRegistry.register(new ItemBlock(CORE_NEXUS_KHALAI).setRegistryName(Reference.ModBlocks.BLOCK_CORE_NEXUS_KHALAI.getRegistryRL()));
		
		GameRegistry.register(CORE_WARPGATE_VOID);
		GameRegistry.register(new ItemBlock(CORE_WARPGATE_VOID).setRegistryName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_VOID.getRegistryRL()));
		
		GameRegistry.register(CORE_WARPGATE_DARK);
		GameRegistry.register(new ItemBlock(CORE_WARPGATE_DARK).setRegistryName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_DARK.getRegistryRL()));
		
		GameRegistry.register(CORE_WARPGATE_KHALAI);
		GameRegistry.register(new ItemBlock(CORE_WARPGATE_KHALAI).setRegistryName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_KHALAI.getRegistryRL()));
		
		
		//GameRegistry.registerBlock(PROTOSS_METAL, ItemBlockMeta.class, "protoss_metal");
	}

	public static void registerModels() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_COPPER_OW), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_COPPER_OW.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_COPPER_OW.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_TITANIUM_OW), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_TITANIUM_OW.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_TITANIUM_OW.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_URANIUM_OW), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_URANIUM_OW.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_URANIUM_OW.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DIM_PORTAL_OVERWORLD), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_DIM_PORTAL_OW.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + DIM_PORTAL_OVERWORLD.getUnlocalizedName().substring(5));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_COAL_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_COAL_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_COAL_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_COPPER_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_COPPER_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_COPPER_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_DIAMOND_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_DIAMOND_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_DIAMOND_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_GOLD_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_GOLD_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_GOLD_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_IRON_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_IRON_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_IRON_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_LAPIS_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_LAPIS_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_LAPIS_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_MINERAL_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_MINERAL_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_MINERAL_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_REDSTONE_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_REDSTONE_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_REDSTONE_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_RICHMINERAL_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_RICHMINERAL_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_RICHMINERAL_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_TITANIUM_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_TITANIUM_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_TITANIUM_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_URANIUM_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_URANIUM_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_URANIUM_CHAR.getUnlocalizedName().substring(5));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STONE_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_STONE_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + STONE_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(COBBLESTONE_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_COBBLESTONE_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + COBBLESTONE_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MAGMA_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_MAGMA_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + MAGMA_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DIRT_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_DIRT_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + DIRT_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DIM_PORTAL_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_DIM_PORTAL_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + DIM_PORTAL_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_COAL_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_COAL_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_COAL_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_COPPER_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_COPPER_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_COPPER_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_DIAMOND_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_DIAMOND_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_DIAMOND_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_GOLD_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_GOLD_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_GOLD_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_IRON_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_IRON_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_IRON_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_LAPIS_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_LAPIS_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_LAPIS_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_MINERAL_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_MINERAL_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_MINERAL_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_REDSTONE_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_REDSTONE_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_REDSTONE_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_RICHMINERAL_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_RICHMINERAL_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_RICHMINERAL_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_TITANIUM_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_TITANIUM_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_TITANIUM_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ORE_URANIUM_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.ORE_URANIUM_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ORE_URANIUM_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STONE_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_STONE_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + STONE_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(COBBLESTONE_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_COBBLESTONE_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + COBBLESTONE_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SAND_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_SAND_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + SAND_SHAKURAS.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DIM_PORTAL_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_DIM_PORTAL_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + DIM_PORTAL_SHAKURAS.getUnlocalizedName().substring(5));
		
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROTOSS_WARPPROJECTOR_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + PROTOSS_WARPPROJECTOR_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROTOSS_WARPPROJECTOR_OVERWORLD), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_OW.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + PROTOSS_WARPPROJECTOR_OVERWORLD.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROTOSS_WARPPROJECTOR_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + PROTOSS_WARPPROJECTOR_SHAKURAS.getUnlocalizedName().substring(5));
		
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ZERG_CREEP), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_ZERG_CREEP.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + ZERG_CREEP.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(KERATIN_CHUNK), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_KERATIN_CHUNK.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + KERATIN_CHUNK.getUnlocalizedName().substring(5));
		
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(VESPENE_GEYSER_BASE), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + VESPENE_GEYSER_BASE.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(VESPENE_GEYSER_BASE_CHAR), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_C.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + VESPENE_GEYSER_BASE_CHAR.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(VESPENE_GEYSER_BASE_SHAKURAS), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_BASE_S.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + VESPENE_GEYSER_BASE_SHAKURAS.getUnlocalizedName().substring(5));
		
		//Core Blocks
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_PYLON_VOID), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_PYLON_VOID.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_PYLON_VOID.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_PYLON_DARK), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_PYLON_DARK.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_PYLON_DARK.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_PYLON_KHALAI), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_PYLON_KHALAI.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_PYLON_KHALAI.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_NEXUS_VOID), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_NEXUS_VOID.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_NEXUS_VOID.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_NEXUS_DARK), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_NEXUS_DARK.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_NEXUS_DARK.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_NEXUS_KHALAI), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_NEXUS_KHALAI.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_NEXUS_KHALAI.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_WARPGATE_VOID), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_WARPGATE_VOID.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_WARPGATE_VOID.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_WARPGATE_DARK), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_WARPGATE_DARK.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_WARPGATE_DARK.getUnlocalizedName().substring(5));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CORE_WARPGATE_KHALAI), 0,
				new ModelResourceLocation(Reference.ModBlocks.BLOCK_CORE_WARPGATE_KHALAI.getRegistryRL(), "inventory"));
		LogHelper.logger.log(Level.INFO, "Registered Block: " + CORE_WARPGATE_KHALAI.getUnlocalizedName().substring(5));
		
		//BlockRenderRegister.registerBlockRenderer();
	
	}
	
	public boolean PoweredByPSI(boolean bool) {
		return bool;
	}

}