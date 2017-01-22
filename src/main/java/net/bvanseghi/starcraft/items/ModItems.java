package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.metaitems.ItemBullet;
import net.bvanseghi.starcraft.items.metaitems.ItemC14GaussRifleParts;
import net.bvanseghi.starcraft.items.metaitems.ItemCrystal;
import net.bvanseghi.starcraft.items.metaitems.ItemDust;
import net.bvanseghi.starcraft.items.metaitems.ItemEnergy;
import net.bvanseghi.starcraft.items.metaitems.ItemEnumHandler;
import net.bvanseghi.starcraft.items.metaitems.ItemEssence;
import net.bvanseghi.starcraft.items.metaitems.ItemIngot;
import net.bvanseghi.starcraft.items.metaitems.ItemMineralShard;
import net.bvanseghi.starcraft.items.metaitems.ItemProtossCoordinates;
import net.bvanseghi.starcraft.items.metaitems.ItemPsiBladeFocuserUncharged;
import net.bvanseghi.starcraft.items.metaitems.ItemVespene;
import net.bvanseghi.starcraft.items.metaitems.ItemZergCarapace;
import net.bvanseghi.starcraft.lib.LogHelper;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
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
	public static Item crystal;
	
	public static Item essence;
	public static Item c14Parts;

	public static Item ingot;
	public static Item dust;
	public static Item coord;

	public static Item C14GaussRifle;
	public static Item bullet;
	
	public static Item zergCarapace;
	public static Item creepResin;
	public static Item organicTissue;

	public static Item acidBucket;
	public static Item bloodBucket;
	
	public static Item protossModule;
	
	public static Item keystone;
	
	
	public static void init() {
		
		keystone = new ItemKeystone("keystone", "keystone");
		mineralShard = new ItemMineralShard("shard");
		vespene = new ItemVespene("vespene");
		energy = new ItemEnergy("energy");
		dust = new ItemDust("dust");
		essence = new ItemEssence("essence");
		ingot = new ItemIngot("ingot");
		crystal = new ItemCrystal("crystal");
		c14Parts = new ItemC14GaussRifleParts("part_c14_gauss");
		bullet = new ItemBullet("bullet");
		psiBladeFocuserUncharged = new ItemPsiBladeFocuserUncharged("protoss_psiblade_focuser_uncharged");
		zergCarapace = new ItemZergCarapace("zerg_icarapace");
		coord = new ItemProtossCoordinates("coordinate");
	}
	
	public static void register() {
		registerItem(keystone);
		registerItem(mineralShard);
		registerItem(vespene);
		registerItem(energy);
		registerItem(dust);
		registerItem(essence);
		registerItem(ingot);
		registerItem(crystal);
		registerItem(c14Parts);
		registerItem(bullet);
		registerItem(psiBladeFocuserUncharged);
		registerItem(zergCarapace);
		registerItem(coord);
	}
	
	public static void registerRenders() {
		registerRender(keystone);
		for(int i = 0; i < ItemEnumHandler.MineralType.values().length; i++) {
			registerRender(mineralShard, i, "shard_" + ItemEnumHandler.MineralType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.VespeneType.values().length; i++) {
			registerRender(vespene, i, "vespene_" + ItemEnumHandler.VespeneType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.EnergyType.values().length; i++) {
			registerRender(energy, i, "energy_" + ItemEnumHandler.EnergyType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.DustType.values().length; i++) {
			registerRender(dust, i, "dust_" + ItemEnumHandler.DustType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.EssenceType.values().length; i++) {
			registerRender(essence, i, "essence_" + ItemEnumHandler.EssenceType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.IngotType.values().length; i++) {
			registerRender(ingot, i, "ingot_" + ItemEnumHandler.IngotType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.CrystalType.values().length; i++) {
			registerRender(crystal, i, "crystal_" + ItemEnumHandler.CrystalType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.BulletType.values().length; i++) {
			registerRender(bullet, i, "bullet_" + ItemEnumHandler.BulletType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.C14PartType.values().length; i++) {
			registerRender(c14Parts, i, "part_c14_gauss_" + ItemEnumHandler.C14PartType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.FocuserType.values().length; i++) {
			registerRender(psiBladeFocuserUncharged, i, "protoss_psiblade_focuser_uncharged_" + ItemEnumHandler.FocuserType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.CarapaceType.values().length; i++) {
			registerRender(zergCarapace, i, "zerg_icarapace_" + ItemEnumHandler.CarapaceType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.CoordinateType.values().length; i++) {
			registerRender(coord, i, "coordinate_" + ItemEnumHandler.CoordinateType.values()[i].getName());
		}
	}
	
	/**
	 * Register an item
	 * @param item The item
	 */
	public static void registerItem(Item item) {
		item.setCreativeTab(CreativeTab.TabStarcraftMaterials); //Sets the creative tab
		GameRegistry.register(item);
		LogHelper.logger.info("Registered item: " + item.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Registers the item render MUST BE CALLED IN THE PRE INIT METHOD IN YOUR MAIN CLASS
	 * @param item The item
	 */
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Registers the item render for an item which has meta data
	 * @param item The item
	 * @param meta The meta data
	 * @param fileName The file name
	 */
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}