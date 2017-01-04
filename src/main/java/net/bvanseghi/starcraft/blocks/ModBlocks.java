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
		// TODO Auto-generated constructor stub
	}

	public static Block voidBlock;

	public static Block oreCopperOW;
	public static Block oreTitaniumOW;
	public static Block oreUraniumOW;

	public static Block oreAlienC;
	public static Block oreCoalC;
	public static Block oreCopperC;
	public static Block oreDiamondC;
	public static Block oreGoldC;
	public static Block oreIronC;
	public static Block oreLapisC;
	public static Block oreMineralC;
	public static Block oreRedstoneC;
	public static Block oreRichMineralC;
	public static Block oreTitaniumC;

	public static Block oreAlienS;
	public static Block oreCoalS;
	public static Block oreCopperS;
	public static Block oreDiamondS;
	public static Block oreGoldS;
	public static Block oreIronS;
	public static Block oreLapisS;
	public static Block oreMineralS;
	public static Block oreRedstoneS;
	public static Block oreRichMineralS;
	public static Block oreTitaniumS;

	public static Block zergStrucCarapace;
	public static Block zergStrucFlesh;
	public static Block protossMetal;
	public static Block compMineral;
	public static Block dyedIron;

	public static Block protossEnergyStabilizer;
	public static Block protossEnergyChannel;

	public static Block protossEnergyStabilizerDark;
	public static Block protossEnergyChannelDark;

	public static Block energyBlock;
	public static Block voidEnergyBlock;
	public static Block crystals;
	public static Block warpGateWormholeChar;
	public static Block warpGateWormholeOverworld;
	public static Block warpGateWormholeShakuras;

	public static Block protossWarpProjectorC;
	public static Block protossWarpProjectorO;
	public static Block protossWarpProjectorS;

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

	public static Block zergCreep;
	public static Block keratinChunk;

	public static Block fluidAcid;
	public static Block fluidBlood;

	// Future general blocks.

	public static Block terranMetal;
	public static Block terranMetalDec1;

	public static Block compMetal;

	// Will be used in Xel'Naga temples and shrines.
	public static Block xelnagaMetal;

	// Future blocks for dimensions

	public static Block dirtAuir;
	public static Block stoneAuir;
	public static Block grassAuir;

	public static Block dirtShakuras;
	public static Block stoneShakuras;
	public static Block cobblestoneShakuras;
	public static Block sandShakuras;
	public static Block grassShakuras;

	public static Block dirtKorhal;
	public static Block stoneKorhal;
	public static Block grassKorhal;

	public static Block dirtChar;
	public static Block stoneChar;
	public static Block cobblestoneChar;
	public static Block ashChar;
	public static Block magmaChar;

	public static Block dirtTarsonis;
	public static Block stoneTarsonis;
	public static Block grassTarsonis;

	public static Block dirtZerus;
	public static Block stoneZerus;
	public static Block grassZerus;

	// debug blocks
	public static Block dimPortalChar;
	public static Block dimPortalOverworld;
	public static Block dimPortalShakuras;

	public static void init() {
		voidBlock = new BlockVoidBlock();
		
		oreCopperOW = new OreOWCopper();
		oreTitaniumOW = new OreOWTitanium();
		oreUraniumOW = new OreOWUranium();
		
		oreAlienC = new OreCharAlien();
		oreCoalC = new OreCharCoal();
		oreCopperC = new OreCharCopper();
		oreDiamondC = new OreCharDiamond();
		oreGoldC = new OreCharGold();
		oreIronC = new OreCharIron();
		oreLapisC = new OreCharLapis();
		oreMineralC = new OreCharMineral();
		oreRedstoneC = new OreCharRedstone();
		oreRichMineralC = new OreCharRichMineral();
		oreTitaniumC = new OreCharTitanium();
		
		oreAlienS = new OreShakurasAlien();
		oreCoalS = new OreShakurasCoal();
		oreCopperS = new OreShakurasCopper();
		oreDiamondS = new OreShakurasDiamond();
		oreGoldS = new OreShakurasGold();
		oreIronS = new OreShakurasIron();
		oreLapisS = new OreShakurasLapis();
		oreMineralS = new OreShakurasMineral();
		oreRedstoneS = new OreShakurasRedstone();
		oreRichMineralS = new OreShakurasRichMineral();
		oreTitaniumS = new OreShakurasTitanium();
		/*
		compMineral = new BlockCompressedMinerals().setBlockName("compMineral");
		crystals = new BlockPylonCrystal().setBlockName("crystal");
		zergStrucCarapace = new BlockZergStructureCarapace().setBlockName("zergStrucCarapace");
		zergStrucFlesh = new BlockZergStructureFlesh().setBlockName("zergStrucFlesh");
		compMetal = new BlockCompressedMetals().setBlockName("compMetal");
		protossMetal = new BlockProtossMetal().setBlockName("protossMetal");
		dyedIron = new BlockDyedIronBlocks().setBlockName("dyedIron");
		
		
		protossEnergyStabilizer = new BlockProtossEnergyStabilizer("protossEnergyStabilizer");
		protossEnergyChannel = new BlockProtossEnergyChannel("protossEnergyChannel");
		protossEnergyStabilizerDark = new BlockProtossEnergyStabilizerDark("protossEnergyStabilizerDark");
		protossEnergyChannelDark = new BlockProtossEnergyChannelDark("protossEnergyChannelDark");
		*/
		energyBlock = new BlockEnergyBlock();
		voidEnergyBlock = new BlockVoidEnergyBlock();
		warpGateWormholeChar = new BlockWarpGateWormholeChar(Material.GROUND);
		warpGateWormholeOverworld = new BlockWarpGateWormholeOverworld(Material.GROUND);
		warpGateWormholeShakuras = new BlockWarpGateWormholeShakuras(Material.GROUND);
		
		protossWarpProjectorC = new BlockProtossWarpProjectorC();
		protossWarpProjectorO = new BlockProtossWarpProjectorO();
		protossWarpProjectorS = new BlockProtossWarpProjectorS();

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

		zergCreep = new BlockZergCreep();
		keratinChunk = new BlockKeratinChunk();

		fluidAcid = new BlockAcidFluid(ModFluids.acid, ModMaterials.acid);
		fluidBlood = new BlockBloodFluid(ModFluids.blood, Material.WATER);
		fluidAcid = new BlockAcidFluid(ModFluids.acid, Material.LAVA);
		fluidBlood = new BlockBloodFluid(ModFluids.blood, Material.WATER);


		ashChar = new BlockAsh();
		dirtChar = new BlockCharDirt();
		stoneChar = new BlockCharStone();
		cobblestoneChar = new BlockCharCobblestone();
		magmaChar = new BlockCharMagma();
		
		sandShakuras = new BlockShakurasSand();
		stoneShakuras = new BlockShakurasStone();
		cobblestoneShakuras = new BlockShakurasCobblestone();
		
		dimPortalChar = new DimPortalChar(); 
		dimPortalOverworld = new DimPortalOverworld();
		dimPortalShakuras = new DimPortalShakuras();
	}

	public static void register() {
		GameRegistry.register(oreCopperOW);
		GameRegistry.register(oreTitaniumOW);
		GameRegistry.register(oreUraniumOW);
		GameRegistry.register(MINERAL_FIELD);
		GameRegistry.register(RICH_MINERAL_FIELD);
		GameRegistry.register(VESPENE_GEYSER);
		GameRegistry.register(RICH_VESPENE_GEYSER);
		GameRegistry.register(VESPENE_GEYSER_BASE);
		GameRegistry.register(dimPortalOverworld);
		
		GameRegistry.register(oreAlienC);
		GameRegistry.register(oreCoalC);
		GameRegistry.register(oreCopperC);
		GameRegistry.register(oreDiamondC);
		GameRegistry.register(oreGoldC);
		GameRegistry.register(oreIronC);
		GameRegistry.register(oreLapisC);
		GameRegistry.register(oreMineralC);
		GameRegistry.register(oreRedstoneC);
		GameRegistry.register(oreRichMineralC);
		GameRegistry.register(oreTitaniumC);
		GameRegistry.register(ashChar);
		GameRegistry.register(dirtChar);
		GameRegistry.register(stoneChar);
		GameRegistry.register(cobblestoneChar);
		GameRegistry.register(VESPENE_GEYSER_CHAR);
		GameRegistry.register(RICH_VESPENE_GEYSER_CHAR);
		GameRegistry.register(VESPENE_GEYSER_BASE_CHAR);
		GameRegistry.register(magmaChar);
		GameRegistry.register(dimPortalChar);
		
		GameRegistry.register(oreAlienS);
		GameRegistry.register(oreCoalS);
		GameRegistry.register(oreCopperS);
		GameRegistry.register(oreDiamondS);
		GameRegistry.register(oreGoldS);
		GameRegistry.register(oreIronS);
		GameRegistry.register(oreLapisS);
		GameRegistry.register(oreMineralS);
		GameRegistry.register(oreRedstoneS);
		GameRegistry.register(oreRichMineralS);
		GameRegistry.register(oreTitaniumS);
		GameRegistry.register(sandShakuras);
		GameRegistry.register(stoneShakuras);
		GameRegistry.register(cobblestoneShakuras);
		GameRegistry.register(VESPENE_GEYSER_SHAKURAS);
		GameRegistry.register(VESPENE_GEYSER_BASE_SHAKURAS);
		GameRegistry.register(RICH_VESPENE_GEYSER_SHAKURAS);
		GameRegistry.register(dimPortalShakuras);
		
		GameRegistry.register(energyBlock);
		GameRegistry.register(voidEnergyBlock);
		GameRegistry.register(warpGateWormholeChar);
		GameRegistry.register(warpGateWormholeOverworld);
		GameRegistry.register(warpGateWormholeShakuras);
		GameRegistry.register(protossWarpProjectorC);
		GameRegistry.register(protossWarpProjectorO);
		GameRegistry.register(protossWarpProjectorS);
		
		GameRegistry.register(zergCreep);
		GameRegistry.register(keratinChunk);
		GameRegistry.register(fluidAcid);
		GameRegistry.register(fluidBlood);
		
	}

	public static void registerRenders() {
		
		registerRender(oreCopperOW);
		registerRender(oreTitaniumOW);
		registerRender(oreUraniumOW);
		registerRender(MINERAL_FIELD);
		registerRender(RICH_MINERAL_FIELD);
		registerRender(VESPENE_GEYSER);
		registerRender(RICH_VESPENE_GEYSER);
		registerRender(VESPENE_GEYSER_BASE);
		registerRender(dimPortalOverworld);
		
		registerRender(oreAlienC);
		registerRender(oreCoalC);
		registerRender(oreCopperC);
		registerRender(oreDiamondC);
		registerRender(oreGoldC);
		registerRender(oreIronC);
		registerRender(oreLapisC);
		registerRender(oreMineralC);
		registerRender(oreRedstoneC);
		registerRender(oreRichMineralC);
		registerRender(oreTitaniumC);
		registerRender(ashChar);
		registerRender(dirtChar);
		registerRender(stoneChar);
		registerRender(cobblestoneChar);
		registerRender(VESPENE_GEYSER_CHAR);
		registerRender(RICH_VESPENE_GEYSER_CHAR);
		registerRender(VESPENE_GEYSER_BASE_CHAR);
		registerRender(magmaChar);
		registerRender(dimPortalChar);
		
		registerRender(oreAlienS);
		registerRender(oreCoalS);
		registerRender(oreCopperS);
		registerRender(oreDiamondS);
		registerRender(oreGoldS);
		registerRender(oreIronS);
		registerRender(oreLapisS);
		registerRender(oreMineralS);
		registerRender(oreRedstoneS);
		registerRender(oreRichMineralS);
		registerRender(oreTitaniumS);
		registerRender(sandShakuras);
		registerRender(stoneShakuras);
		registerRender(cobblestoneShakuras);
		registerRender(VESPENE_GEYSER_SHAKURAS);
		registerRender(VESPENE_GEYSER_BASE_SHAKURAS);
		registerRender(RICH_VESPENE_GEYSER_SHAKURAS);
		registerRender(dimPortalShakuras);
		
		registerRender(energyBlock);
		registerRender(voidEnergyBlock);
		registerRender(warpGateWormholeChar);
		registerRender(warpGateWormholeOverworld);
		registerRender(warpGateWormholeShakuras);
		registerRender(protossWarpProjectorC);
		registerRender(protossWarpProjectorO);
		registerRender(protossWarpProjectorS);
		
		registerRender(zergCreep);
		registerRender(keratinChunk);
		registerRender(fluidAcid);
		registerRender(fluidBlood);
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