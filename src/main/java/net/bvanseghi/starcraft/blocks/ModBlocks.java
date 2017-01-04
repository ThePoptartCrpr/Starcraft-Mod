package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.debug.DimPortalChar;
import net.bvanseghi.starcraft.debug.DimPortalOverworld;
import net.bvanseghi.starcraft.debug.DimPortalShakuras;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.material.ModMaterials;
import net.bvanseghi.starcraft.ore.OreOWCopper;
import net.bvanseghi.starcraft.ore.OreOWTitanium;
import net.bvanseghi.starcraft.ore.OreOWUranium;
import net.bvanseghi.starcraft.orechar.OreCharAlien;
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
import net.bvanseghi.starcraft.oreshakuras.OreShakurasAlien;
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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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

	public static void init() {
		
		ORE_COPPER_OW = new OreOWCopper();
		ORE_TITANIUM_OW = new OreOWTitanium();
		ORE_URANIUM_OW = new OreOWUranium();
		
		ORE_ALIEN_CHAR = new OreCharAlien();
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
		
		ORE_ALIEN_SHAKURAS = new OreShakurasAlien();
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
		
		COMP_MINERAL = new BlockCompressedMinerals();
		CRYSTAL = new BlockPylonCrystal();
		ZERG_STRUCTURE_CARAPACE = new BlockZergStructureCarapace();
		ZERG_STRUCTURE_FLESH = new BlockZergStructureFlesh();
		COMP_METAL = new BlockCompressedMetals();
		PROTOSS_METAL = new BlockProtossMetal();
		DYED_IRON = new BlockDyedIronBlocks();
		
		
		PROTOSS_ENERGY_STABILIZER = new BlockProtossEnergyStabilizer();
		PROTOSS_ENERGY_CHANNEL = new BlockProtossEnergyChannel();
		PROTOSS_DARK_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerDark();
		PROTOSS_DARK_ENERGY_CHANNEL = new BlockProtossEnergyChannelDark();
		
		ENERGY_BLOCK = new BlockEnergyBlock();
		VOID_ENERGY_BLOCK = new BlockVoidEnergyBlock();
		WARPGATE_WORMHOLE_CHAR = new BlockWarpGateWormholeChar(Material.GROUND);
		WARPGATE_WORMHOLE_OVERWORLD = new BlockWarpGateWormholeOverworld(Material.GROUND);
		WARPGATE_WORMHOLE_SHAKURAS = new BlockWarpGateWormholeShakuras(Material.GROUND);
		
		PROTOSS_WARPPROJECTOR_CHAR = new BlockProtossWarpProjectorC();
		PROTOSS_WARPPROJECTOR_OVERWORLD = new BlockProtossWarpProjectorO();
		PROTOSS_WARPPROJECTOR_SHAKURAS = new BlockProtossWarpProjectorS();
		
		

		MINERAL_FIELD = new BlockMineralField(Material.GROUND);
		RICH_MINERAL_FIELD = new BlockRichMineralField(Material.GROUND);
		

		VESPENE_GEYSER = new BlockVespeneGeyser(Material.GROUND);
		RICH_VESPENE_GEYSER = new BlockRichVespeneGeyser(Material.GROUND);
		VESPENE_GEYSER_CHAR = new BlockVespeneGeyserChar(Material.GROUND);
		RICH_VESPENE_GEYSER_CHAR = new BlockRichVespeneGeyserChar(Material.GROUND);
		VESPENE_GEYSER_SHAKURAS = new BlockVespeneGeyserShakuras(Material.GROUND);
		RICH_VESPENE_GEYSER_SHAKURAS = new BlockRichVespeneGeyserShakuras(Material.GROUND);
		
		VESPENE_GEYSER_BASE = new BlockVespeneGeyserBase();
		VESPENE_GEYSER_BASE_CHAR = new BlockVespeneGeyserBaseChar();
		VESPENE_GEYSER_BASE_SHAKURAS = new BlockVespeneGeyserBaseShakuras();

		ZERG_CREEP = new BlockZergCreep();
		KERATIN_CHUNK = new BlockKeratinChunk();

		FLUID_ACID = new BlockAcidFluid(ModFluids.acid, ModMaterials.acid);
		FLUID_BLOOD = new BlockBloodFluid(ModFluids.blood, Material.WATER);
		FLUID_ACID = new BlockAcidFluid(ModFluids.acid, Material.LAVA);
		FLUID_BLOOD = new BlockBloodFluid(ModFluids.blood, Material.WATER);


		ASH_CHAR = new BlockAsh();
		DIRT_CHAR = new BlockCharDirt();
		STONE_CHAR = new BlockCharStone();
		COBBLESTONE_CHAR = new BlockCharCobblestone();
		MAGMA_CHAR = new BlockCharMagma();
		
		SAND_SHAKURAS = new BlockShakurasSand();
		STONE_SHAKURAS = new BlockShakurasStone();
		COBBLESTONE_SHAKURAS = new BlockShakurasCobblestone();
		
		DIM_PORTAL_CHAR = new DimPortalChar(); 
		DIM_PORTAL_OVERWORLD = new DimPortalOverworld();
		DIM_PORTAL_SHAKURAS = new DimPortalShakuras();
	}

	public static void register() {
		GameRegistry.register(ORE_COPPER_OW);
		GameRegistry.register(ORE_TITANIUM_OW);
		GameRegistry.register(ORE_URANIUM_OW);
		GameRegistry.register(MINERAL_FIELD);
		GameRegistry.register(RICH_MINERAL_FIELD);
		GameRegistry.register(VESPENE_GEYSER);
		GameRegistry.register(RICH_VESPENE_GEYSER);
		GameRegistry.register(VESPENE_GEYSER_BASE);
		GameRegistry.register(DIM_PORTAL_OVERWORLD);
		GameRegistry.register(COMP_MINERAL);
		GameRegistry.register(CRYSTAL);
		
		GameRegistry.register(ORE_ALIEN_CHAR);
		GameRegistry.register(ORE_COAL_CHAR);
		GameRegistry.register(ORE_COPPER_CHAR);
		GameRegistry.register(ORE_DIAMOND_CHAR);
		GameRegistry.register(ORE_GOLD_CHAR);
		GameRegistry.register(ORE_IRON_CHAR);
		GameRegistry.register(ORE_LAPIS_CHAR);
		GameRegistry.register(ORE_MINERAL_CHAR);
		GameRegistry.register(ORE_REDSTONE_CHAR);
		GameRegistry.register(ORE_RICHMINERAL_CHAR);
		GameRegistry.register(ORE_TITANIUM_CHAR);
		GameRegistry.register(ASH_CHAR);
		GameRegistry.register(DIRT_CHAR);
		GameRegistry.register(STONE_CHAR);
		GameRegistry.register(COBBLESTONE_CHAR);
		GameRegistry.register(VESPENE_GEYSER_CHAR);
		GameRegistry.register(RICH_VESPENE_GEYSER_CHAR);
		GameRegistry.register(VESPENE_GEYSER_BASE_CHAR);
		GameRegistry.register(MAGMA_CHAR);
		GameRegistry.register(DIM_PORTAL_CHAR);
		
		GameRegistry.register(ORE_ALIEN_SHAKURAS);
		GameRegistry.register(ORE_COAL_SHAKURAS);
		GameRegistry.register(ORE_COPPER_SHAKURAS);
		GameRegistry.register(ORE_DIAMOND_SHAKURAS);
		GameRegistry.register(ORE_GOLD_SHAKURAS);
		GameRegistry.register(ORE_IRON_SHAKURAS);
		GameRegistry.register(ORE_LAPIS_SHAKURAS);
		GameRegistry.register(ORE_MINERAL_SHAKURAS);
		GameRegistry.register(ORE_REDSTONE_SHAKURAS);
		GameRegistry.register(ORE_RICHMINERAL_SHAKURAS);
		GameRegistry.register(ORE_TITANIUM_SHAKURAS);
		GameRegistry.register(SAND_SHAKURAS);
		GameRegistry.register(STONE_SHAKURAS);
		GameRegistry.register(COBBLESTONE_SHAKURAS);
		GameRegistry.register(VESPENE_GEYSER_SHAKURAS);
		GameRegistry.register(VESPENE_GEYSER_BASE_SHAKURAS);
		GameRegistry.register(RICH_VESPENE_GEYSER_SHAKURAS);
		GameRegistry.register(DIM_PORTAL_SHAKURAS);
		
		GameRegistry.register(ENERGY_BLOCK);
		GameRegistry.register(VOID_ENERGY_BLOCK);
		GameRegistry.register(WARPGATE_WORMHOLE_CHAR);
		GameRegistry.register(WARPGATE_WORMHOLE_OVERWORLD);
		GameRegistry.register(WARPGATE_WORMHOLE_SHAKURAS);
		GameRegistry.register(PROTOSS_WARPPROJECTOR_CHAR);
		GameRegistry.register(PROTOSS_WARPPROJECTOR_OVERWORLD);
		GameRegistry.register(PROTOSS_WARPPROJECTOR_SHAKURAS);
		GameRegistry.register(PROTOSS_ENERGY_STABILIZER);
		GameRegistry.register(PROTOSS_ENERGY_CHANNEL);
		GameRegistry.register(PROTOSS_DARK_ENERGY_STABILIZER);
		GameRegistry.register(PROTOSS_DARK_ENERGY_CHANNEL);
		GameRegistry.register(PROTOSS_METAL);
		
		GameRegistry.register(ZERG_CREEP);
		GameRegistry.register(KERATIN_CHUNK);
		GameRegistry.register(FLUID_ACID);
		GameRegistry.register(FLUID_BLOOD);
		
		GameRegistry.register(COMP_METAL);
		GameRegistry.register(DYED_IRON);
	}

	public static void registerRenders() {
		
		registerRender(ORE_COPPER_OW);
		registerRender(ORE_TITANIUM_OW);
		registerRender(ORE_URANIUM_OW);
		registerRender(MINERAL_FIELD);
		registerRender(RICH_MINERAL_FIELD);
		registerRender(VESPENE_GEYSER);
		registerRender(RICH_VESPENE_GEYSER);
		registerRender(VESPENE_GEYSER_BASE);
		registerRender(DIM_PORTAL_OVERWORLD);
		registerRender(COMP_MINERAL);
		registerRender(CRYSTAL);
		
		registerRender(ORE_ALIEN_CHAR);
		registerRender(ORE_COAL_CHAR);
		registerRender(ORE_COPPER_CHAR);
		registerRender(ORE_DIAMOND_CHAR);
		registerRender(ORE_GOLD_CHAR);
		registerRender(ORE_IRON_CHAR);
		registerRender(ORE_LAPIS_CHAR);
		registerRender(ORE_MINERAL_CHAR);
		registerRender(ORE_REDSTONE_CHAR);
		registerRender(ORE_RICHMINERAL_CHAR);
		registerRender(ORE_TITANIUM_CHAR);
		registerRender(ASH_CHAR);
		registerRender(DIRT_CHAR);
		registerRender(STONE_CHAR);
		registerRender(COBBLESTONE_CHAR);
		registerRender(VESPENE_GEYSER_CHAR);
		registerRender(RICH_VESPENE_GEYSER_CHAR);
		registerRender(VESPENE_GEYSER_BASE_CHAR);
		registerRender(MAGMA_CHAR);
		registerRender(DIM_PORTAL_CHAR);
		
		registerRender(ORE_ALIEN_SHAKURAS);
		registerRender(ORE_COAL_SHAKURAS);
		registerRender(ORE_COPPER_SHAKURAS);
		registerRender(ORE_DIAMOND_SHAKURAS);
		registerRender(ORE_GOLD_SHAKURAS);
		registerRender(ORE_IRON_SHAKURAS);
		registerRender(ORE_LAPIS_SHAKURAS);
		registerRender(ORE_MINERAL_SHAKURAS);
		registerRender(ORE_REDSTONE_SHAKURAS);
		registerRender(ORE_RICHMINERAL_SHAKURAS);
		registerRender(ORE_TITANIUM_SHAKURAS);
		registerRender(SAND_SHAKURAS);
		registerRender(STONE_SHAKURAS);
		registerRender(COBBLESTONE_SHAKURAS);
		registerRender(VESPENE_GEYSER_SHAKURAS);
		registerRender(VESPENE_GEYSER_BASE_SHAKURAS);
		registerRender(RICH_VESPENE_GEYSER_SHAKURAS);
		registerRender(DIM_PORTAL_SHAKURAS);
		
		registerRender(ENERGY_BLOCK);
		registerRender(VOID_ENERGY_BLOCK);
		registerRender(WARPGATE_WORMHOLE_CHAR);
		registerRender(WARPGATE_WORMHOLE_OVERWORLD);
		registerRender(WARPGATE_WORMHOLE_SHAKURAS);
		registerRender(PROTOSS_WARPPROJECTOR_CHAR);
		registerRender(PROTOSS_WARPPROJECTOR_OVERWORLD);
		registerRender(PROTOSS_WARPPROJECTOR_SHAKURAS);
		registerRender(PROTOSS_ENERGY_STABILIZER);
		registerRender(PROTOSS_ENERGY_CHANNEL);
		registerRender(PROTOSS_DARK_ENERGY_STABILIZER);
		registerRender(PROTOSS_DARK_ENERGY_CHANNEL);
		registerRender(PROTOSS_METAL);
		
		registerRender(ZERG_CREEP);
		registerRender(KERATIN_CHUNK);
		registerRender(FLUID_ACID);
		registerRender(FLUID_BLOOD);
		
		registerRender(COMP_METAL);
		registerRender(DYED_IRON);
	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(
				Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}