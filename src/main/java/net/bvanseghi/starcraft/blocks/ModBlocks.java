package net.bvanseghi.starcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.debug.DimPortalChar;
import net.bvanseghi.starcraft.debug.DimPortalOverworld;
import net.bvanseghi.starcraft.debug.DimPortalShakuras;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.items.ItemCompressedMetalBlocks;
import net.bvanseghi.starcraft.items.ItemCompressedMineralBlocks;
import net.bvanseghi.starcraft.items.ItemCrystalBlocks;
import net.bvanseghi.starcraft.items.ItemDyedIronBlocks;
import net.bvanseghi.starcraft.items.ItemProtossMetalBlocks;
import net.bvanseghi.starcraft.items.ItemZergStructureCarapaceBlocks;
import net.bvanseghi.starcraft.items.ItemZergStructureFleshBlocks;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.material.ModMaterials;
import net.bvanseghi.starcraft.ore.OreOWCopper;
import net.bvanseghi.starcraft.ore.OreOWTitanium;
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
import net.minecraft.world.IBlockAccess;

public class ModBlocks extends Block {
	 
	public static Block voidBlock;
	
	public static Block oreCopperOW;
	public static Block oreTitaniumOW;
	
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
	
	public static Block energyBlock;
	public static Block voidEnergyBlock;
	public static Block crystals;
	public static Block warpGateWormholeChar;
	public static Block warpGateWormholeOverworld;
	public static Block warpGateWormholeShakuras;
	
	public static Block protossWarpProjectorC;
	public static Block protossWarpProjectorO;
	public static Block protossWarpProjectorS;

	public static Block mineralField;
	public static Block richMineralField;

	public static Block vespeneGeyser;
	public static Block richVespeneGeyser;
	public static Block vespeneGeyserChar;
	public static Block richVespeneGeyserChar;
	public static Block vespeneGeyserBase;
	public static Block vespeneGeyserBaseChar;
	
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

	public static void preInit() {

		
		
		// Blocks are initialized here.
		
		voidBlock = new BlockVoidBlock();
		
		oreCopperOW = new OreOWCopper();
		oreTitaniumOW = new OreOWTitanium();
		
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
		
		compMineral = new BlockCompressedMinerals().setBlockName("compMineral");
		crystals = new BlockPylonCrystal().setBlockName("crystal");
		zergStrucCarapace = new BlockZergStructureCarapace().setBlockName("zergStrucCarapace");
		zergStrucFlesh = new BlockZergStructureFlesh().setBlockName("zergStrucFlesh");
		compMetal = new BlockCompressedMetals().setBlockName("compMetal");
		protossMetal = new BlockProtossMetal().setBlockName("protossMetal");
		dyedIron = new BlockDyedIronBlocks().setBlockName("dyedIron");
		
		
		protossEnergyStabilizer = new BlockProtossEnergyStabilizer("protossEnergyStabilizer");
		protossEnergyChannel = new BlockProtossEnergyChannel("protossEnergyChannel");
		energyBlock = new BlockEnergyBlock();
		voidEnergyBlock = new BlockVoidEnergyBlock();
		warpGateWormholeChar = new BlockWarpGateWormholeChar(Material.ground);
		warpGateWormholeOverworld = new BlockWarpGateWormholeOverworld(Material.ground);
		warpGateWormholeShakuras = new BlockWarpGateWormholeShakuras(Material.ground);
		
		protossWarpProjectorC = new BlockProtossWarpProjectorC("warpProjectorC");
		protossWarpProjectorO = new BlockProtossWarpProjectorO("warpProjectorO");
		protossWarpProjectorS = new BlockProtossWarpProjectorS("warpProjectorS");

		mineralField = new BlockMineralField(Material.ground);
		richMineralField = new BlockRichMineralField(Material.ground);
		

		vespeneGeyser = new BlockVespeneGeyser(Material.ground);
		richVespeneGeyser = new BlockRichVespeneGeyser(Material.ground);
		vespeneGeyserChar = new BlockVespeneGeyserChar(Material.ground);
		richVespeneGeyserChar = new BlockRichVespeneGeyserChar(Material.ground);
		vespeneGeyserBase = new BlockVespeneGeyserBase();
		vespeneGeyserBaseChar = new BlockVespeneGeyserBaseChar();

		zergCreep = new BlockZergCreep();
		keratinChunk = new BlockKeratinChunk();

		fluidAcid = new BlockAcidFluid(ModFluids.acid, ModMaterials.acid);
		fluidBlood = new BlockBloodFluid(ModFluids.blood, Material.water);
		fluidAcid = new BlockAcidFluid(ModFluids.acid, Material.lava);
		fluidBlood = new BlockBloodFluid(ModFluids.blood, Material.water);


		ashChar = new BlockAsh();
		dirtChar = new BlockCharDirt();
		stoneChar = new BlockCharStone();
		cobblestoneChar = new BlockCharCobblestone();
		
		sandShakuras = new BlockShakurasSand();
		stoneShakuras = new BlockShakurasStone();
		cobblestoneShakuras = new BlockShakurasCobblestone();
		
		dimPortalChar = new DimPortalChar(); 
		dimPortalOverworld = new DimPortalOverworld();
		dimPortalShakuras = new DimPortalShakuras();
		

		

		// Items are registered here.
		
		GameRegistry.registerBlock(voidBlock, BlockVoidBlock.name);
		
		GameRegistry.registerBlock(oreCopperOW, OreOWCopper.name);
		GameRegistry.registerBlock(oreTitaniumOW, OreOWTitanium.name);
		
		GameRegistry.registerBlock(oreAlienC, OreCharAlien.name);
		GameRegistry.registerBlock(oreCoalC, OreCharCoal.name);
		GameRegistry.registerBlock(oreCopperC, OreCharCopper.name);
		GameRegistry.registerBlock(oreDiamondC, OreCharDiamond.name);
		GameRegistry.registerBlock(oreGoldC, OreCharGold.name);
		GameRegistry.registerBlock(oreIronC, OreCharIron.name);
		GameRegistry.registerBlock(oreLapisC, OreCharLapis.name);
		GameRegistry.registerBlock(oreMineralC, OreCharMineral.name);
		GameRegistry.registerBlock(oreRedstoneC, OreCharRedstone.name);
		GameRegistry.registerBlock(oreRichMineralC, OreCharRichMineral.name);
		GameRegistry.registerBlock(oreTitaniumC, OreCharTitanium.name);
		
		GameRegistry.registerBlock(oreAlienS, OreShakurasAlien.name);
		GameRegistry.registerBlock(oreCoalS, OreShakurasCoal.name);
		GameRegistry.registerBlock(oreCopperS, OreShakurasCopper.name);
		GameRegistry.registerBlock(oreDiamondS, OreShakurasDiamond.name);
		GameRegistry.registerBlock(oreGoldS, OreShakurasGold.name);
		GameRegistry.registerBlock(oreIronS, OreShakurasIron.name);
		GameRegistry.registerBlock(oreLapisS, OreShakurasLapis.name);
		GameRegistry.registerBlock(oreMineralS, OreShakurasMineral.name);
		GameRegistry.registerBlock(oreRedstoneS, OreShakurasRedstone.name);
		GameRegistry.registerBlock(oreRichMineralS, OreShakurasRichMineral.name);
		GameRegistry.registerBlock(oreTitaniumS, OreShakurasTitanium.name);
		
		GameRegistry.registerBlock(compMineral, ItemCompressedMineralBlocks.class, "compMinerals");
		GameRegistry.registerBlock(crystals, ItemCrystalBlocks.class, "crystals");
		GameRegistry.registerBlock(zergStrucCarapace, ItemZergStructureCarapaceBlocks.class, "zergStrucCarapace");
		GameRegistry.registerBlock(zergStrucFlesh, ItemZergStructureFleshBlocks.class, "zergStrucFlesh");
		GameRegistry.registerBlock(compMetal, ItemCompressedMetalBlocks.class, "compMetals");
		GameRegistry.registerBlock(protossMetal, ItemProtossMetalBlocks.class, "protossMetal");
		GameRegistry.registerBlock(dyedIron, ItemDyedIronBlocks.class, "dyedIron");
		
		
		GameRegistry.registerBlock(protossEnergyStabilizer, "protossEnergyStabilizer");
		GameRegistry.registerBlock(protossEnergyChannel, BlockProtossEnergyChannel.name);
		GameRegistry.registerBlock(energyBlock, BlockEnergyBlock.name);
		GameRegistry.registerBlock(voidEnergyBlock, BlockVoidEnergyBlock.name);
		GameRegistry.registerBlock(warpGateWormholeChar, BlockWarpGateWormholeChar.name)
				.setBlockName("warpGateWormholeChar");
		GameRegistry.registerBlock(warpGateWormholeOverworld, BlockWarpGateWormholeOverworld.name)
			.setBlockName("warpGateWormholeOverworld");
		GameRegistry.registerBlock(warpGateWormholeShakuras, BlockWarpGateWormholeShakuras.name)
			.setBlockName("warpGateWormholeShakuras");
		
		GameRegistry.registerBlock(protossWarpProjectorC, "warpProjectorC");
		GameRegistry.registerBlock(protossWarpProjectorO, "warpProjectorO");
		GameRegistry.registerBlock(protossWarpProjectorS, "warpProjectorS");

		GameRegistry.registerBlock(mineralField, BlockMineralField.name).setBlockName("mineralField");
		GameRegistry.registerBlock(richMineralField, BlockRichMineralField.name).setBlockName("richMineralField");

		GameRegistry.registerBlock(vespeneGeyser, BlockVespeneGeyser.name).setBlockName("vespeneGeyser");
		GameRegistry.registerBlock(richVespeneGeyser, BlockRichVespeneGeyser.name).setBlockName("richVespeneGeyser");
		GameRegistry.registerBlock(vespeneGeyserChar, BlockVespeneGeyserChar.name).setBlockName("vespeneGeyserChar");
		GameRegistry.registerBlock(richVespeneGeyserChar, BlockRichVespeneGeyserChar.name).setBlockName("richVespeneGeyserChar");
		GameRegistry.registerBlock(vespeneGeyserBase, BlockVespeneGeyserBase.name);
		GameRegistry.registerBlock(vespeneGeyserBaseChar, BlockVespeneGeyserBaseChar.name);

		GameRegistry.registerBlock(zergCreep, BlockZergCreep.name);
		GameRegistry.registerBlock(keratinChunk, BlockKeratinChunk.name);

		GameRegistry.registerBlock(fluidAcid, "fluidAcid").setBlockName("fluidAcid");
		GameRegistry.registerBlock(fluidBlood, "fluidBlood").setBlockName("fluidBlood");

		GameRegistry.registerBlock(ashChar, BlockAsh.name);
		GameRegistry.registerBlock(dirtChar, BlockCharDirt.name);
		GameRegistry.registerBlock(stoneChar, BlockCharStone.name);
		GameRegistry.registerBlock(cobblestoneChar, BlockCharCobblestone.name);

		GameRegistry.registerBlock(sandShakuras, BlockShakurasSand.name);
		GameRegistry.registerBlock(cobblestoneShakuras, BlockShakurasCobblestone.name);
		GameRegistry.registerBlock(stoneShakuras, BlockShakurasStone.name);
		
		GameRegistry.registerBlock(dimPortalChar, DimPortalChar.name);
		GameRegistry.registerBlock(dimPortalOverworld, DimPortalOverworld.name); 
		GameRegistry.registerBlock(dimPortalShakuras, DimPortalShakuras.name); 

	}
	
	 
	public ModBlocks(String unlocalizedname, String texturename, Material material) {

		super(material);

		setBlockName(unlocalizedname);
		setBlockTextureName(REFERENCE.MODID + ":" + unlocalizedname);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	public ModBlocks(Material blockMaterial) {
		super(blockMaterial);
	}
}