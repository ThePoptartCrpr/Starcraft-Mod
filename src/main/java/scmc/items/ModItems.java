package scmc.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.StarcraftCreativeTabs;
import scmc.fluids.ModFluids;
import scmc.items.armor.ModArmor;
import scmc.items.metaitems.ItemBullet;
import scmc.items.metaitems.ItemC14GaussRifleParts;
import scmc.items.metaitems.ItemCredit;
import scmc.items.metaitems.ItemCrystal;
import scmc.items.metaitems.ItemDust;
import scmc.items.metaitems.ItemEnergy;
import scmc.items.metaitems.ItemEnumHandler;
import scmc.items.metaitems.ItemEssence;
import scmc.items.metaitems.ItemIngotT1;
import scmc.items.metaitems.ItemIngotT2;
import scmc.items.metaitems.ItemIngotT3;
import scmc.items.metaitems.ItemMineralShard;
import scmc.items.metaitems.ItemMutaliskWing;
import scmc.items.metaitems.ItemProtossCoordinates;
import scmc.items.metaitems.ItemPsiBladeFocuserUncharged;
import scmc.items.metaitems.ItemSpawner;
import scmc.items.metaitems.ItemVespene;
import scmc.items.metaitems.ItemZergCarapace;
import scmc.items.tools.ModTools;
import scmc.items.weapons.ModWeapons;
import scmc.lib.Reference;

/**
 * Copyright 2017 the Starcraft Minecraft mod team
 */
public class ModItems extends Item {

	// public static Item acidBucket;
	// public static Item bloodBucket;
	public static Item bullet;
	public static Item C14GaussRifle;
	public static Item c14Parts;
	public static Item coord;
	public static Item CREDIT;
	public static Item creepResin;
	public static Item crystal;
	public static Item darkPsiBladeFocuserUncharged;
	public static Item dust;
	public static Item energy;
	public static Item essence;
	public static Item HYDRALISK_NEEDLE;
	public static Item ingot1;
	public static Item ingot2;
	public static Item ingot3;
	public static Item keystone;
	public static Item mineralShard;
	public static Item MUTALISK_TOOTH;
	public static Item MUTALISK_WING;
	public static Item organicTissue;
	public static Item protossArtifact;
	public static Item protossModule;
	public static Item psiBladeFocuserUncharged;
	public static Item richMineralShard;
	public static Item SPAWNER;
	public static Item vespene;
	public static Item zergCarapace;

	public static void init() {
		keystone = new ItemKeystone();
		mineralShard = new ItemMineralShard();
		vespene = new ItemVespene();
		energy = new ItemEnergy();
		dust = new ItemDust();
		essence = new ItemEssence();
		ingot1 = new ItemIngotT1();
		ingot2 = new ItemIngotT2();
		ingot3 = new ItemIngotT3();
		crystal = new ItemCrystal();
		c14Parts = new ItemC14GaussRifleParts();
		bullet = new ItemBullet();
		CREDIT = new ItemCredit();
		psiBladeFocuserUncharged = new ItemPsiBladeFocuserUncharged();
		zergCarapace = new ItemZergCarapace();
		coord = new ItemProtossCoordinates();
		creepResin = new ItemCreepResin();
		HYDRALISK_NEEDLE = new ItemHydraliskNeedle();
		MUTALISK_WING = new ItemMutaliskWing();
		MUTALISK_TOOTH = new ItemMutaliskTooth();

		SPAWNER = new ItemSpawner();

		ModArmor.init();
		ModWeapons.init();
		ModTools.init();
	}

	/**
	 * Registers all mod items. Calls registration of sub-packages.
	 */
	public static void register() {

		// Register acid fluid and add it to the universal bucket
		FluidRegistry.addBucketForFluid(ModFluids.acid);

		// Register blood fluid and add it to the universal bucket
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
		registerItem(CREDIT);
		registerItem(psiBladeFocuserUncharged);
		registerItem(zergCarapace);
		registerItem(creepResin);
		registerItem(coord);
		registerItem(HYDRALISK_NEEDLE);
		registerItem(MUTALISK_WING);
		registerItem(MUTALISK_TOOTH);

		registerItem(SPAWNER);

		ModArmor.register();
		ModWeapons.register();
		ModTools.register();
	}

	/**
	 * Register an item
	 * @param item The item
	 */
	public static void registerItem(Item item) {
		item.setCreativeTab(StarcraftCreativeTabs.MATERIALS); // Sets the
																// creative tab
		GameRegistry.register(item);
		// LogHelper.logger.info("Registered item: " +
		// item.getUnlocalizedName().substring(5));
	}

	/**
	 * Registers the item render MUST BE CALLED IN THE PRE INIT METHOD IN YOUR
	 * MAIN CLASS
	 * @param item The item
	 */
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory")); // This shit's like 30% cheating
		// LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}

	/**
	 * Registers the item render for an item which has meta data
	 * @param item The item
	 * @param meta The meta data
	 * @param fileName The file name
	 */
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		// LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(keystone);
		registerRender(creepResin);
		registerRender(HYDRALISK_NEEDLE);
		registerRender(MUTALISK_TOOTH);

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
		for(int i = 0; i < ItemEnumHandler.CreditType.values().length; i++) {
			registerRender(CREDIT, i, "credit_" + ItemEnumHandler.CreditType.values()[i].getName());
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
		for(int i = 0; i < ItemEnumHandler.MutaliskWingType.values().length; i++) {
			registerRender(MUTALISK_WING, i, "mutalisk_wing_" + ItemEnumHandler.MutaliskWingType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.SpawnerType.values().length; i++) {
			registerRender(SPAWNER, i, "spawner_" + ItemEnumHandler.SpawnerType.values()[i].getName());
		}

		ModArmor.registerRenders();
		ModWeapons.registerRenders();
		ModTools.registerRenders();
	}
}