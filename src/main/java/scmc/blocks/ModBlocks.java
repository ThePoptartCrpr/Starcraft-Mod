package scmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.blocks.coreblocks.BlockCoreCyberneticsCoreDark;
import scmc.blocks.coreblocks.BlockCoreCyberneticsCoreKhalai;
import scmc.blocks.coreblocks.BlockCoreCyberneticsCoreVoid;
import scmc.blocks.coreblocks.BlockCoreNexusDark;
import scmc.blocks.coreblocks.BlockCoreNexusKhalai;
import scmc.blocks.coreblocks.BlockCoreNexusVoid;
import scmc.blocks.coreblocks.BlockCorePylonDark;
import scmc.blocks.coreblocks.BlockCorePylonKhalai;
import scmc.blocks.coreblocks.BlockCorePylonVoid;
import scmc.blocks.coreblocks.BlockCoreWarpGateDark;
import scmc.blocks.coreblocks.BlockCoreWarpGateKhalai;
import scmc.blocks.coreblocks.BlockCoreWarpGateVoid;
import scmc.blocks.debug.DimPortalAiur;
import scmc.blocks.debug.DimPortalChar;
import scmc.blocks.debug.DimPortalOverworld;
import scmc.blocks.debug.DimPortalShakuras;
import scmc.blocks.metablocks.ModMetaBlocks;
import scmc.blocks.ore.OreOWCopper;
import scmc.blocks.ore.OreOWTitanium;
import scmc.blocks.ore.OreOWUranium;
import scmc.blocks.orechar.OreCharCoal;
import scmc.blocks.orechar.OreCharCopper;
import scmc.blocks.orechar.OreCharDiamond;
import scmc.blocks.orechar.OreCharGold;
import scmc.blocks.orechar.OreCharIron;
import scmc.blocks.orechar.OreCharLapis;
import scmc.blocks.orechar.OreCharMineral;
import scmc.blocks.orechar.OreCharRedstone;
import scmc.blocks.orechar.OreCharRichMineral;
import scmc.blocks.orechar.OreCharTitanium;
import scmc.blocks.orechar.OreCharUranium;
import scmc.blocks.oreshakuras.OreShakurasCoal;
import scmc.blocks.oreshakuras.OreShakurasCopper;
import scmc.blocks.oreshakuras.OreShakurasDiamond;
import scmc.blocks.oreshakuras.OreShakurasGold;
import scmc.blocks.oreshakuras.OreShakurasIron;
import scmc.blocks.oreshakuras.OreShakurasLapis;
import scmc.blocks.oreshakuras.OreShakurasMineral;
import scmc.blocks.oreshakuras.OreShakurasRedstone;
import scmc.blocks.oreshakuras.OreShakurasRichMineral;
import scmc.blocks.oreshakuras.OreShakurasTitanium;
import scmc.blocks.oreshakuras.OreShakurasUranium;
import scmc.items.metaitems.ModItemLayered;
import scmc.lib.Reference;

/**
 * Copyright (c) 2017 the Starcraft Minecraft (SCMC) mod team
 */
public class ModBlocks extends Block {

	public static Block ASH_CHAR;

	public static Block BLOCK_MOVING_LIGHT_SOURCE;
	public static Block COBBLESTONE_CHAR;
	public static Block COBBLESTONE_SHAKURAS;
	public static Block CORE_CYBERNETICSCORE_DARK;
	public static Block CORE_CYBERNETICSCORE_KHALAI;
	public static Block CORE_CYBERNETICSCORE_VOID;
	public static Block CORE_NEXUS_DARK;
	public static Block CORE_NEXUS_KHALAI;
	public static Block CORE_NEXUS_VOID;
	public static Block CORE_PYLON_DARK;
	public static Block CORE_PYLON_KHALAI;
	public static Block CORE_PYLON_VOID;
	public static Block CORE_WARPGATE_DARK;
	public static Block CORE_WARPGATE_KHALAI;
	public static Block CORE_WARPGATE_VOID;
	public static Block DIM_PORTAL_AIUR;
	public static Block DIM_PORTAL_CHAR;
	public static Block DIM_PORTAL_OVERWORLD;
	public static Block DIM_PORTAL_SHAKURAS;
	public static Block DIRT_CHAR;
	public static Block DIRT_SHAKURAS;
	public static Block ENERGY;
	public static Block FLUID_ACID;
	public static Block FLUID_BLOOD;
	public static Block GRAVEL_CHAR;
	public static Block KERATIN_CHUNK;
	public static Block MAGMA_CHAR;
	public static Block ORE_ALIEN_CHAR;
	public static Block ORE_ALIEN_SHAKURAS;
	public static Block ORE_COAL_CHAR;
	public static Block ORE_COAL_SHAKURAS;
	public static Block ORE_COPPER_CHAR;
	public static Block ORE_COPPER_OW;
	public static Block ORE_COPPER_SHAKURAS;
	public static Block ORE_DIAMOND_CHAR;
	public static Block ORE_DIAMOND_SHAKURAS;
	public static Block ORE_GOLD_CHAR;
	public static Block ORE_GOLD_SHAKURAS;
	public static Block ORE_IRON_CHAR;
	public static Block ORE_IRON_SHAKURAS;
	public static Block ORE_LAPIS_CHAR;
	public static Block ORE_LAPIS_SHAKURAS;
	public static Block ORE_MINERAL_CHAR;
	public static Block ORE_MINERAL_SHAKURAS;
	public static Block ORE_REDSTONE_CHAR;
	public static Block ORE_REDSTONE_SHAKURAS;
	public static Block ORE_RICHMINERAL_CHAR;
	public static Block ORE_RICHMINERAL_SHAKURAS;
	public static Block ORE_TITANIUM_CHAR;
	public static Block ORE_TITANIUM_OW;
	public static Block ORE_TITANIUM_SHAKURAS;
	public static Block ORE_URANIUM_CHAR;
	public static Block ORE_URANIUM_OW;
	public static Block ORE_URANIUM_SHAKURAS;
	public static Block PROTOSS_DARK_ENERGY_CHANNEL;
	public static Block PROTOSS_DARK_ENERGY_STABILIZER;
	public static Block PROTOSS_ENERGY_CHANNEL;
	public static Block PROTOSS_ENERGY_STABILIZER;
	public static Block PROTOSS_SHIELD;
	public static Block PROTOSS_VOID_ENERGY_CHANNEL;
	public static Block PROTOSS_VOID_ENERGY_STABILIZER;
	public static Block PROTOSS_WARPPROJECTOR_CHAR;
	public static Block PROTOSS_WARPPROJECTOR_OVERWORLD;
	public static Block PROTOSS_WARPPROJECTOR_SHAKURAS;
	public static Block SAND_SHAKURAS;
	public static Block STONE_CHAR;
	public static Block STONE_SHAKURAS;
	public static Block VESPENE_GEYSER_BASE;
	public static Block VESPENE_GEYSER_BASE_CHAR;
	public static Block VESPENE_GEYSER_BASE_SHAKURAS;
	public static Block VOID_ENERGY;
	public static Block WARPGATE_WORMHOLE_CHAR;
	public static Block WARPGATE_WORMHOLE_OVERWORLD;
	public static Block WARPGATE_WORMHOLE_SHAKURAS;
	public static Block ZERG_CREEP;
	
	public static void init() {
		instantiate();
		register();

		ModMetaBlocks.init();
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
		ASH_CHAR = new BlockAsh();
		DIRT_CHAR = new BlockCharDirt();
		GRAVEL_CHAR = new BlockCharGravel();
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

		DIM_PORTAL_AIUR = new DimPortalAiur();

		// Protoss Blocks
		PROTOSS_WARPPROJECTOR_CHAR = new BlockProtossWarpProjectorC();
		PROTOSS_WARPPROJECTOR_OVERWORLD = new BlockProtossWarpProjectorO();
		PROTOSS_WARPPROJECTOR_SHAKURAS = new BlockProtossWarpProjectorS();

		PROTOSS_ENERGY_CHANNEL = new BlockProtossEnergyChannel();
		PROTOSS_ENERGY_STABILIZER = new BlockProtossEnergyStabilizer();
		PROTOSS_DARK_ENERGY_CHANNEL = new BlockProtossEnergyChannelDark();
		PROTOSS_DARK_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerDark();
		PROTOSS_SHIELD = new BlockProtossShield();
		PROTOSS_VOID_ENERGY_CHANNEL = new BlockProtossEnergyChannelVoid();
		PROTOSS_VOID_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerVoid();
		
		ENERGY = new BlockEnergy();
		VOID_ENERGY = new BlockVoidEnergy();

		// Zerg Blocks
		ZERG_CREEP = new BlockZergCreep();
		KERATIN_CHUNK = new BlockKeratinChunk();

		VESPENE_GEYSER_BASE = new BlockVespeneGeyserBase();
		VESPENE_GEYSER_BASE_CHAR = new BlockVespeneGeyserBaseChar();
		VESPENE_GEYSER_BASE_SHAKURAS = new BlockVespeneGeyserBaseShakuras();

		// Core Blocks
		CORE_CYBERNETICSCORE_VOID = new BlockCoreCyberneticsCoreVoid();
		CORE_CYBERNETICSCORE_DARK = new BlockCoreCyberneticsCoreDark();
		CORE_CYBERNETICSCORE_KHALAI = new BlockCoreCyberneticsCoreKhalai();
		
		CORE_PYLON_VOID = new BlockCorePylonVoid();
		CORE_PYLON_DARK = new BlockCorePylonDark();
		CORE_PYLON_KHALAI = new BlockCorePylonKhalai();

		CORE_WARPGATE_VOID = new BlockCoreWarpGateVoid();
		CORE_WARPGATE_DARK = new BlockCoreWarpGateDark();
		CORE_WARPGATE_KHALAI = new BlockCoreWarpGateKhalai();

		CORE_NEXUS_VOID = new BlockCoreNexusVoid();
		CORE_NEXUS_DARK = new BlockCoreNexusDark();
		CORE_NEXUS_KHALAI = new BlockCoreNexusKhalai();

		BLOCK_MOVING_LIGHT_SOURCE = new BlockMovingLightSource();

		FLUID_ACID = new BlockAcidFluid();
		FLUID_BLOOD = new BlockBloodFluid();
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
		GameRegistry.register(new ItemBlock(STONE_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_STONE_CHAR.getRegistryRL()));

		GameRegistry.register(COBBLESTONE_CHAR);
		GameRegistry.register(new ItemBlock(COBBLESTONE_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_CHAR.getRegistryRL()));

		GameRegistry.register(MAGMA_CHAR);
		GameRegistry.register(new ItemBlock(MAGMA_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_MAGMA_CHAR.getRegistryRL()));

		GameRegistry.register(ASH_CHAR);
		GameRegistry.register(new ModItemLayered(ASH_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_ASH_CHAR.getRegistryRL()));

		GameRegistry.register(DIRT_CHAR);
		GameRegistry.register(new ItemBlock(DIRT_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_DIRT_CHAR.getRegistryRL()));

		GameRegistry.register(GRAVEL_CHAR);
		GameRegistry.register(new ItemBlock(GRAVEL_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_GRAVEL_CHAR.getRegistryRL()));

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

		GameRegistry.register(DIM_PORTAL_AIUR);
		GameRegistry.register(new ItemBlock(DIM_PORTAL_AIUR).setRegistryName(Reference.ModBlocks.BLOCK_DIM_PORTAL_AI.getRegistryRL()));

		GameRegistry.register(PROTOSS_WARPPROJECTOR_CHAR);
		GameRegistry.register(new ItemBlock(PROTOSS_WARPPROJECTOR_CHAR).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_C.getRegistryRL()));

		GameRegistry.register(PROTOSS_WARPPROJECTOR_OVERWORLD);
		GameRegistry.register(new ItemBlock(PROTOSS_WARPPROJECTOR_OVERWORLD).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_OW.getRegistryRL()));

		GameRegistry.register(PROTOSS_WARPPROJECTOR_SHAKURAS);
		GameRegistry.register(new ItemBlock(PROTOSS_WARPPROJECTOR_SHAKURAS).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_S.getRegistryRL()));

		GameRegistry.register(PROTOSS_ENERGY_CHANNEL);
		GameRegistry.register(new ItemBlock(PROTOSS_ENERGY_CHANNEL).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_ENERGY_CHANNEL.getRegistryRL()));

		GameRegistry.register(PROTOSS_ENERGY_STABILIZER);
		GameRegistry.register(new ItemBlock(PROTOSS_ENERGY_STABILIZER).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_ENERGY_STABILIZER.getRegistryRL()));

		GameRegistry.register(PROTOSS_DARK_ENERGY_CHANNEL);
		GameRegistry.register(new ItemBlock(PROTOSS_DARK_ENERGY_CHANNEL).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_DARK_ENERGY_CHANNEL.getRegistryRL()));

		GameRegistry.register(PROTOSS_DARK_ENERGY_STABILIZER);
		GameRegistry.register(new ItemBlock(PROTOSS_DARK_ENERGY_STABILIZER).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_DARK_ENERGY_STABILIZER.getRegistryRL()));
		
		GameRegistry.register(PROTOSS_SHIELD);
		GameRegistry.register(new ItemBlock(PROTOSS_SHIELD).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_SHIELD.getRegistryRL()));
		
		GameRegistry.register(PROTOSS_VOID_ENERGY_CHANNEL);
		GameRegistry.register(new ItemBlock(PROTOSS_VOID_ENERGY_CHANNEL).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_VOID_ENERGY_CHANNEL.getRegistryRL()));

		GameRegistry.register(PROTOSS_VOID_ENERGY_STABILIZER);
		GameRegistry.register(new ItemBlock(PROTOSS_VOID_ENERGY_STABILIZER).setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_VOID_ENERGY_STABILIZER.getRegistryRL()));

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

		GameRegistry.register(CORE_CYBERNETICSCORE_VOID);
		GameRegistry.register(new ItemBlock(CORE_CYBERNETICSCORE_VOID).setRegistryName(Reference.ModBlocks.BLOCK_CORE_CYBERNETICSCORE_VOID.getRegistryRL()));

		GameRegistry.register(CORE_CYBERNETICSCORE_DARK);
		GameRegistry.register(new ItemBlock(CORE_CYBERNETICSCORE_DARK).setRegistryName(Reference.ModBlocks.BLOCK_CORE_CYBERNETICSCORE_DARK.getRegistryRL()));

		GameRegistry.register(CORE_CYBERNETICSCORE_KHALAI);
		GameRegistry.register(new ItemBlock(CORE_CYBERNETICSCORE_KHALAI).setRegistryName(Reference.ModBlocks.BLOCK_CORE_CYBERNETICSCORE_KHALAI.getRegistryRL()));
		
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

		GameRegistry.register(BLOCK_MOVING_LIGHT_SOURCE);
		GameRegistry.register(new ItemBlock(BLOCK_MOVING_LIGHT_SOURCE).setRegistryName(Reference.ModBlocks.BLOCK_MOVING_LIGHT_SOURCE.getRegistryRL()));

		GameRegistry.register(FLUID_ACID);
		GameRegistry.register(new ItemBlock(FLUID_ACID).setRegistryName(Reference.ModBlocks.FLUID_ACID.getRegistryRL()));

		GameRegistry.register(FLUID_BLOOD);
		GameRegistry.register(new ItemBlock(FLUID_BLOOD).setRegistryName(Reference.ModBlocks.FLUID_BLOOD.getRegistryRL()));
		
		GameRegistry.register(ENERGY);
		GameRegistry.register(new ItemBlock(ENERGY).setRegistryName(Reference.ModBlocks.BLOCK_ENERGY.getRegistryRL()));
		
		GameRegistry.register(VOID_ENERGY);
		GameRegistry.register(new ItemBlock(VOID_ENERGY).setRegistryName(Reference.ModBlocks.BLOCK_VOID_ENERGY.getRegistryRL()));
	}

	private static void registerFluid(final Block block) {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition() {

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
	}

	private static void registerLayered(final Block block) {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition() {

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation(block.getRegistryName(), "normal");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				char num = state.toString().charAt(state.toString().length() - 2);
				return new ModelResourceLocation(block.getRegistryName(), "layers=" + num);
			}
		});
	}

	private static void registerModel(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		// LogHelper.logger.log(Level.INFO, "Registered Block: " +
		// block.getUnlocalizedName().substring(5));
	}

	public static void registerModels() {

		// Overworld Ores
		registerModel(ORE_COPPER_OW);
		registerModel(ORE_TITANIUM_OW);
		registerModel(ORE_URANIUM_OW);

		// Char Ores
		registerModel(ORE_COAL_CHAR);
		registerModel(ORE_COPPER_CHAR);
		registerModel(ORE_DIAMOND_CHAR);
		registerModel(ORE_GOLD_CHAR);
		registerModel(ORE_IRON_CHAR);
		registerModel(ORE_LAPIS_CHAR);
		registerModel(ORE_MINERAL_CHAR);
		registerModel(ORE_REDSTONE_CHAR);
		registerModel(ORE_RICHMINERAL_CHAR);
		registerModel(ORE_TITANIUM_CHAR);
		registerModel(ORE_URANIUM_CHAR);

		// Char Blocks
		registerModel(STONE_CHAR);
		registerModel(COBBLESTONE_CHAR);
		registerModel(ASH_CHAR);
		registerModel(MAGMA_CHAR);
		registerModel(DIRT_CHAR);
		registerModel(GRAVEL_CHAR);

		// Shakuras Ores
		registerModel(ORE_COAL_SHAKURAS);
		registerModel(ORE_COPPER_SHAKURAS);
		registerModel(ORE_DIAMOND_SHAKURAS);
		registerModel(ORE_GOLD_SHAKURAS);
		registerModel(ORE_IRON_SHAKURAS);
		registerModel(ORE_LAPIS_SHAKURAS);
		registerModel(ORE_MINERAL_SHAKURAS);
		registerModel(ORE_RICHMINERAL_SHAKURAS);
		registerModel(ORE_REDSTONE_SHAKURAS);
		registerModel(ORE_TITANIUM_SHAKURAS);
		registerModel(ORE_URANIUM_SHAKURAS);

		// Shakuras Blocks
		registerModel(STONE_SHAKURAS);
		registerModel(COBBLESTONE_SHAKURAS);
		registerModel(SAND_SHAKURAS);

		// Debug Portals
		registerModel(DIM_PORTAL_OVERWORLD);
		registerModel(DIM_PORTAL_CHAR);
		registerModel(DIM_PORTAL_SHAKURAS);
		registerModel(DIM_PORTAL_AIUR);

		// Protoss Blocks
		registerModel(PROTOSS_WARPPROJECTOR_CHAR);
		registerModel(PROTOSS_WARPPROJECTOR_OVERWORLD);
		registerModel(PROTOSS_WARPPROJECTOR_SHAKURAS);

		registerModel(PROTOSS_ENERGY_CHANNEL);
		registerModel(PROTOSS_ENERGY_STABILIZER);
		registerModel(PROTOSS_DARK_ENERGY_CHANNEL);
		registerModel(PROTOSS_DARK_ENERGY_STABILIZER);
		registerModel(PROTOSS_SHIELD);
		registerModel(PROTOSS_VOID_ENERGY_CHANNEL);
		registerModel(PROTOSS_VOID_ENERGY_STABILIZER);

		registerFluid(ENERGY);
		registerFluid(VOID_ENERGY);
		
		// Protoss Cores
		registerModel(CORE_CYBERNETICSCORE_VOID);
		registerModel(CORE_CYBERNETICSCORE_DARK);
		registerModel(CORE_CYBERNETICSCORE_KHALAI);
		registerModel(CORE_PYLON_VOID);
		registerModel(CORE_PYLON_DARK);
		registerModel(CORE_PYLON_KHALAI);
		registerModel(CORE_NEXUS_VOID);
		registerModel(CORE_NEXUS_DARK);
		registerModel(CORE_NEXUS_KHALAI);
		registerModel(CORE_WARPGATE_VOID);
		registerModel(CORE_WARPGATE_DARK);
		registerModel(CORE_WARPGATE_KHALAI);

		// Zerg Blocks
		registerModel(ZERG_CREEP);
		registerModel(KERATIN_CHUNK);

		// Vespene Geyser
		registerModel(VESPENE_GEYSER_BASE);
		registerModel(VESPENE_GEYSER_BASE_CHAR);
		registerModel(VESPENE_GEYSER_BASE_SHAKURAS);

		// Misc Blocks
		registerModel(BLOCK_MOVING_LIGHT_SOURCE);

		// Layer Registration
		registerLayered(ASH_CHAR);

		// Fluid Registration
		registerFluid(FLUID_ACID);
		registerFluid(FLUID_BLOOD);

		ModMetaBlocks.registerRenders();
		// BlockRenderRegister.registerBlockRenderer();

	}

	public ModBlocks(Material material) {
		super(material);
	}

	/**
	 * @param bool boolean
	 * @return {@code bool}
	 */
	public boolean PoweredByPSI(boolean bool) {
		return bool;
	}
}