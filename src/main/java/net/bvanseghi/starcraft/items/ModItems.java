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
		
		// Initialize items here.
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
				bloodBucket = new ItemBloodBucket(ModBlocks.FLUID_ACID);
				
				for(int i = 0; i < ItemIngot.names.length; i++){
					ingot = new ItemIngot().setUnlocalizedName("ingot");
				}
				
				for(int i = 0; i < ItemDust.metaNames.length; i++) {
					dust = new ItemDust().setUnlocalizedName("dust");
				}
				
				for(int i = 0; i < ItemProtossCoordinates.names.length; i++){
					coord = new ItemProtossCoordinates().setUnlocalizedName("coord");
				}
				
				for(int i = 0; i < ItemEssence.names.length; i++){
					essence = new ItemEssence().setUnlocalizedName("essence");
				}
				
				for(int i = 0; i < ItemC14GaussRifleParts.names.length; i++){
					c14Parts = new ItemC14GaussRifleParts().setUnlocalizedName("c14Parts");
				}
				
				for(int i = 0; i < ItemVespene.names.length; i++){
					vespene = new ItemVespene().setUnlocalizedName("vespene");
				}
				
				for(int i = 0; i < ItemZergCarapace.names.length; i++){
					zergCarapace = new ItemZergCarapace().setUnlocalizedName("zergCarapace");
				}
				
				for(int i = 0; i < ItemC14GaussRifleParts.names.length; i++){
					energy = new ItemEnergy().setUnlocalizedName("energy");
				}

	}

	public static void register() {
		GameRegistry.register(mineralShard);
		GameRegistry.register(richMineralShard);
		GameRegistry.register(psiBladeFocuserUncharged);
		GameRegistry.register(darkPsiBladeFocuserUncharged);
		GameRegistry.register(protossArtifact);
		GameRegistry.register(uraj);
		GameRegistry.register(protossModule);
		GameRegistry.register(C14GaussRifle);
		GameRegistry.register(C14GaussRifleBullet);
		GameRegistry.register(creepResin);
		GameRegistry.register(organicTissue);
		GameRegistry.register(keystone);
		GameRegistry.register(coord);
		GameRegistry.register(ingot);
		GameRegistry.register(dust);
		GameRegistry.register(essence);
		GameRegistry.register(c14Parts);
		GameRegistry.register(vespene);
		GameRegistry.register(zergCarapace);
		GameRegistry.register(energy);
	}

	public static void registerRenders() {
		
		registerRender(mineralShard);
		registerRender(richMineralShard);
		registerRender(psiBladeFocuserUncharged);
		registerRender(darkPsiBladeFocuserUncharged);
		registerRender(protossArtifact);
		registerRender(uraj);
		registerRender(protossModule);
		registerRender(C14GaussRifle);
		registerRender(C14GaussRifleBullet);
		registerRender(creepResin);
		registerRender(organicTissue);
		registerRender(keystone);
		registerRender(coord);
		
//		GameRegistry.registerRender(ingot);
//		GameRegistry.registerRender(dust, REFERENCE.MODID + (dust.getUnlocalizedName().substring(5)));
//		GameRegistry.registerRender(essence, REFERENCE.MODID + (essence.getUnlocalizedName().substring(5)));
//		GameRegistry.registerRender(c14Parts, REFERENCE.MODID + (c14Parts.getUnlocalizedName().substring(5)));
//		GameRegistry.registerRender(vespene, REFERENCE.MODID + (vespene.getUnlocalizedName().substring(5)));
//		GameRegistry.registerRender(zergCarapace, REFERENCE.MODID + (zergCarapace.getUnlocalizedName().substring(5)));
//		GameRegistry.registerRender(energy, REFERENCE.MODID + (energy.getUnlocalizedName().substring(5)));
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(
				Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}