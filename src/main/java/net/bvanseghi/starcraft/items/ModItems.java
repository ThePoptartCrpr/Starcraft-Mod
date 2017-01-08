package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.blocks.ModBlocks;
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
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * When wundr marks {@link Blockz} as done, then scrap this class!!!<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 */
public class ModItems extends Item {

	public ModItems() {
		super();
	}

	public static Item mineralShard;
	public static Item richMineralShard;

	public static Item vespene;

	public static Item psiBladeFocuserUncharged;
	public static Item darkPsiBladeFocuserUncharged;
	public static Item energy;
	public static Item protossArtifact;
	public static Item uraj;
	
	public static Item essence;
	public static Item c14Parts;

	public static Item ingot;
	public static Item dust;
	public static Item coord;

	public static Item C14GaussRifle;
	public static Item C14GaussRifleBullet;
	
	public static Item zergCarapace;
	public static Item creepResin;
	public static Item organicTissue;

	public static Item acidBucket;
	public static Item bloodBucket;
	
	public static Item protossModule;
	
	public static Item keystone;
	
	public static void init() {
		instantiate();
		register();
	}
	
	public static void instantiate() {
		mineralShard = new ItemMineralShard();
		richMineralShard = new ItemRichMineralShard();

		psiBladeFocuserUncharged = new ItemPsiBladeFocuserUncharged();
		darkPsiBladeFocuserUncharged = new ItemDarkPsiBladeFocuserUncharged();
		protossArtifact = new ItemProtossArtifact();
		uraj = new ItemUraj();
		protossModule = new ItemProtossModule();

		C14GaussRifle = new ItemC14GaussRifle().setFull3D();
		C14GaussRifleBullet = new ItemC14GaussRifleBullet();

		creepResin = new ItemCreepResin();
		organicTissue = new ItemOrganicTissue();
		
		keystone = new ItemKeystone();

		acidBucket = new ItemAcidBucket(ModBlocks.FLUID_ACID);
		bloodBucket = new ItemBloodBucket(ModBlocks.FLUID_BLOOD);
		ingot = new ItemIngot();
		dust = new ItemDust();
		coord = new ItemProtossCoordinates();
		essence = new ItemEssence();
		c14Parts = new ItemC14GaussRifleParts();
		vespene = new ItemVespene();
		zergCarapace = new ItemZergCarapace();
		energy = new ItemEnergy();
	}


	public static void register() {
		GameRegistry.register(psiBladeFocuserUncharged);
	}
	
	public static void registerModels() {
		ModelLoader.setCustomModelResourceLocation(psiBladeFocuserUncharged, 0,
				new ModelResourceLocation(Reference.ModItems.ITEM_PSIBLADEFOCUSER_UNCHARGED.getRegistryRL(), "inventory"));
	}
}