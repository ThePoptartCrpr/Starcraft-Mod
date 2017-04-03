package scmc.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.StarcraftCreativeTabs;
import scmc.fluids.ModFluids;
import scmc.items.metaitems.ItemBullet;
import scmc.items.metaitems.ItemC14GaussRifleParts;
import scmc.items.metaitems.ItemCrystal;
import scmc.items.metaitems.ItemDust;
import scmc.items.metaitems.ItemEnergy;
import scmc.items.metaitems.ItemEnumHandler;
import scmc.items.metaitems.ItemEssence;
import scmc.items.metaitems.ItemIngotT1;
import scmc.items.metaitems.ItemIngotT2;
import scmc.items.metaitems.ItemIngotT3;
import scmc.items.metaitems.ItemMineralShard;
import scmc.items.metaitems.ItemProtossCoordinates;
import scmc.items.metaitems.ItemPsiBladeFocuserUncharged;
import scmc.items.metaitems.ItemVespene;
import scmc.items.metaitems.ItemZergCarapace;
import scmc.lib.LogHelper;
import scmc.lib.Reference;

/**
 * Copyright 2017 the Starcraft Minecraft mod team
 */
public class ModItems extends Item {
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

	public static Item ingot1;
	public static Item ingot2;
	public static Item ingot3;
	public static Item dust;
	public static Item coord;

	public static Item C14GaussRifle;
	public static Item bullet;
	
	public static Item zergCarapace;
	public static Item creepResin;
	public static Item organicTissue;

//	public static Item acidBucket;
//	public static Item bloodBucket;
	
	public static Item protossModule;
	
	public static Item keystone;
	
	
	public static void init() {
		keystone = new ItemKeystone("keystone");
		mineralShard = new ItemMineralShard("shard");
		vespene = new ItemVespene("vespene");
		energy = new ItemEnergy("energy");
		dust = new ItemDust("dust");
		essence = new ItemEssence("essence");
		ingot1 = new ItemIngotT1("ingot1");
		ingot2 = new ItemIngotT2("ingot2");
		ingot3 = new ItemIngotT3("ingot3");
		crystal = new ItemCrystal("crystal");
		c14Parts = new ItemC14GaussRifleParts("part_c14_gauss");
		bullet = new ItemBullet("bullet");
		psiBladeFocuserUncharged = new ItemPsiBladeFocuserUncharged("protoss_psiblade_focuser_uncharged");
		zergCarapace = new ItemZergCarapace("zerg_icarapace");
		coord = new ItemProtossCoordinates("coordinate");
	}
	
	public static void register() {
		
		//Register acid fluid and add it to the universal bucket
		FluidRegistry.addBucketForFluid(ModFluids.acid);
		
		//Register blood fluid and add it to the universal bucket
		FluidRegistry.addBucketForFluid(ModFluids.blood);
		
		registerItem(keystone);
		registerItem(mineralShard);
		registerItem(vespene);
		registerItem(energy);
		registerItem(dust);
		registerItem(essence);
		registerItem(ingot1);
		registerItem(ingot2);
		registerItem(ingot3);
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
			registerRender(ingot1, i, "ingot1_" + ItemEnumHandler.IngotType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.IngotType.values().length; i++) {
			registerRender(ingot2, i, "ingot2_" + ItemEnumHandler.IngotType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.IngotType.values().length; i++) {
			registerRender(ingot3, i, "ingot3_" + ItemEnumHandler.IngotType.values()[i].getName());
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
		item.setCreativeTab(StarcraftCreativeTabs.MATERIALS); //Sets the creative tab
		GameRegistry.register(item);
		LogHelper.logger.info("Registered item: " + item.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Registers the item render MUST BE CALLED IN THE PRE INIT METHOD IN YOUR MAIN CLASS
	 * @param item The item
	 */
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.RL_BASE + item.getUnlocalizedName().substring(5)), "inventory")); //This shit's like 30% cheating
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