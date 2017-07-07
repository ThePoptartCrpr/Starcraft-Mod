package ga.scmc.items;

import ga.scmc.fluids.ModFluids;
import ga.scmc.items.armor.ModArmor;
import ga.scmc.items.metaitems.ItemBullet;
import ga.scmc.items.metaitems.ItemC14GaussRifleParts;
import ga.scmc.items.metaitems.ItemCredit;
import ga.scmc.items.metaitems.ItemCrystal;
import ga.scmc.items.metaitems.ItemDust;
import ga.scmc.items.metaitems.ItemEnergy;
import ga.scmc.items.metaitems.ItemEnumHandler;
import ga.scmc.items.metaitems.ItemEssence;
import ga.scmc.items.metaitems.ItemIngot;
import ga.scmc.items.metaitems.ItemMineralShard;
import ga.scmc.items.metaitems.ItemProtossArmorPieces;
import ga.scmc.items.metaitems.ItemProtossCoordinates;
import ga.scmc.items.metaitems.ItemProtossIngot;
import ga.scmc.items.metaitems.ItemPsiBladeFocuserUncharged;
import ga.scmc.items.metaitems.ItemVespene;
import ga.scmc.items.metaitems.ItemZergCarapace;
import ga.scmc.items.structurespawns.ItemProtossCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossDarkWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemProtossPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidCyberneticsCoreSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidPylonSpawner;
import ga.scmc.items.structurespawns.ItemProtossVoidWarpGateSpawner;
import ga.scmc.items.structurespawns.ItemProtossWarpGateSpawner;
import ga.scmc.items.tools.ModTools;
import ga.scmc.items.weapons.ModWeapons;
import ga.scmc.lib.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Copyright 2017 the Starcraft Minecraft mod team
 */
public class ModItems extends Item {

	// public static Item acidBucket;
	// public static Item bloodBucket;
	public static Item BULLET;
	public static Item C14_GAUSS_RIFLE = new ItemC14GaussRifle();
	public static Item C14_PARTS;
	public static Item COORDINATES;
	public static Item CREDIT;
	public static Item CREEP_RESIN;
	public static Item PROTOSS_ARMOR_PIECES;
	public static Item PROTOSS_CRYSTAL;
	public static Item PROTOSS_INGOT;
	public static Item PROTOSS_SCRAP_METAL;
	public static Item DUST;
	public static Item ENERGY;
	public static Item ESSENCE;
	public static Item HYDRALISK_NEEDLE;
	public static Item INGOT;
	public static Item KEYSTONE;
	public static Item KHAYDARIN_SHARD;
	public static Item MINERAL_SHARD;
//	public static Item MUTALISK_TOOTH;
//	public static Item MUTALISK_WING;
	public static Item ORGANIC_TISSUE;
	public static Item PROTOSS_ARTIFACT;
	public static Item PROTOSS_MODULE;
	public static Item PSI_BLADE_FOCUSER_UNCHARGED;
	public static Item RICH_MINERAL_SHARD;
	public static Item VESPENE;
	public static Item ZERG_CARAPACE;
	
	public static Item SPAWNER_PROTOSS_DARK_CYBERNETICSCORE;
	public static Item SPAWNER_PROTOSS_VOID_CYBERNETICSCORE;
	public static Item SPAWNER_PROTOSS_CYBERNETICSCORE;
	public static Item SPAWNER_PROTOSS_DARK_PYLON;
	public static Item SPAWNER_PROTOSS_VOID_PYLON;
	public static Item SPAWNER_PROTOSS_PYLON;
	public static Item SPAWNER_PROTOSS_DARK_WARPGATE;
	public static Item SPAWNER_PROTOSS_VOID_WARPGATE;
	public static Item SPAWNER_PROTOSS_WARPGATE;
	
	public static Item ICON_PROTOSS;
	public static Item ICON_TERRAN;
	public static Item ICON_ZERG;

	public static void init() {
		KEYSTONE = new ItemKeystone();
		MINERAL_SHARD = new ItemMineralShard();
		KHAYDARIN_SHARD = new ItemKhaydarinShard();
		VESPENE = new ItemVespene();
		ENERGY = new ItemEnergy();
		DUST = new ItemDust();
		ESSENCE = new ItemEssence();
		INGOT = new ItemIngot();
		PROTOSS_ARMOR_PIECES = new ItemProtossArmorPieces();
		PROTOSS_CRYSTAL = new ItemCrystal();
		PROTOSS_INGOT = new ItemProtossIngot();
		PROTOSS_SCRAP_METAL = new ItemProtossScrapMetal();
		C14_PARTS = new ItemC14GaussRifleParts();
		BULLET = new ItemBullet();
		CREDIT = new ItemCredit();
		PSI_BLADE_FOCUSER_UNCHARGED = new ItemPsiBladeFocuserUncharged();
		ZERG_CARAPACE = new ItemZergCarapace();
		COORDINATES = new ItemProtossCoordinates();
		CREEP_RESIN = new ItemCreepResin();
		HYDRALISK_NEEDLE = new ItemHydraliskNeedle();
//		MUTALISK_WING = new ItemMutaliskWing();
//		MUTALISK_TOOTH = new ItemMutaliskTooth();
		
		SPAWNER_PROTOSS_DARK_CYBERNETICSCORE = new ItemProtossDarkCyberneticsCoreSpawner();
		SPAWNER_PROTOSS_VOID_CYBERNETICSCORE = new ItemProtossVoidCyberneticsCoreSpawner();
		SPAWNER_PROTOSS_CYBERNETICSCORE = new ItemProtossCyberneticsCoreSpawner();
		SPAWNER_PROTOSS_DARK_PYLON = new ItemProtossDarkPylonSpawner();
		SPAWNER_PROTOSS_VOID_PYLON = new ItemProtossVoidPylonSpawner();
		SPAWNER_PROTOSS_PYLON = new ItemProtossPylonSpawner();
		SPAWNER_PROTOSS_DARK_WARPGATE = new ItemProtossDarkWarpGateSpawner();
		SPAWNER_PROTOSS_VOID_WARPGATE = new ItemProtossVoidWarpGateSpawner();
		SPAWNER_PROTOSS_WARPGATE = new ItemProtossWarpGateSpawner();

		ICON_PROTOSS = new ItemIconProtoss();
		ICON_TERRAN = new ItemIconTerran();
		ICON_ZERG = new ItemIconZerg();
		
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

		registerItem(KEYSTONE);
		registerItem(MINERAL_SHARD);
		registerItem(KHAYDARIN_SHARD);
		registerItem(VESPENE);
		registerItem(ENERGY);
		registerItem(DUST);
		registerItem(ESSENCE);
		registerItem(INGOT);
		registerItem(PROTOSS_ARMOR_PIECES);
		registerItem(PROTOSS_CRYSTAL);
		registerItem(PROTOSS_INGOT);
		registerItem(PROTOSS_SCRAP_METAL);
		registerItem(C14_PARTS);
		registerItem(BULLET);
		registerItem(CREDIT);
		registerItem(PSI_BLADE_FOCUSER_UNCHARGED);
		registerItem(ZERG_CARAPACE);
		registerItem(CREEP_RESIN);
		registerItem(COORDINATES);
		registerItem(HYDRALISK_NEEDLE);
//		registerItem(MUTALISK_WING);
//		registerItem(MUTALISK_TOOTH);
		
		registerItem(SPAWNER_PROTOSS_DARK_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_VOID_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_CYBERNETICSCORE);
		registerItem(SPAWNER_PROTOSS_DARK_PYLON);
		registerItem(SPAWNER_PROTOSS_VOID_PYLON);
		registerItem(SPAWNER_PROTOSS_PYLON);
		registerItem(SPAWNER_PROTOSS_DARK_WARPGATE);
		registerItem(SPAWNER_PROTOSS_VOID_WARPGATE);
		registerItem(SPAWNER_PROTOSS_WARPGATE);
		
		registerItem(ICON_PROTOSS);
		registerItem(ICON_TERRAN);
		registerItem(ICON_ZERG);

		ModArmor.register();
		ModWeapons.register();
		ModTools.register();
	}

	/**
	 * Register an item
	 * @param item The item
	 */
	public static void registerItem(Item item) {
		GameRegistry.register(item);
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
		registerRender(C14_GAUSS_RIFLE);
		registerRender(KEYSTONE);
		registerRender(CREEP_RESIN);
		registerRender(HYDRALISK_NEEDLE);
//		registerRender(MUTALISK_TOOTH);
		registerRender(PROTOSS_SCRAP_METAL);
		registerRender(KHAYDARIN_SHARD);
		
		registerRender(SPAWNER_PROTOSS_DARK_CYBERNETICSCORE);
		registerRender(SPAWNER_PROTOSS_VOID_CYBERNETICSCORE);
		registerRender(SPAWNER_PROTOSS_CYBERNETICSCORE);
		registerRender(SPAWNER_PROTOSS_DARK_PYLON);
		registerRender(SPAWNER_PROTOSS_VOID_PYLON);
		registerRender(SPAWNER_PROTOSS_PYLON);
		registerRender(SPAWNER_PROTOSS_DARK_WARPGATE);
		registerRender(SPAWNER_PROTOSS_VOID_WARPGATE);
		registerRender(SPAWNER_PROTOSS_WARPGATE);
		registerRender(ICON_PROTOSS);
		registerRender(ICON_TERRAN);
		registerRender(ICON_ZERG);

		for(int i = 0; i < ItemEnumHandler.MineralType.values().length; i++) {
			registerRender(MINERAL_SHARD, i, "shard_" + ItemEnumHandler.MineralType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.VespeneType.values().length; i++) {
			registerRender(VESPENE, i, "vespene_" + ItemEnumHandler.VespeneType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.EnergyType.values().length; i++) {
			registerRender(ENERGY, i, "energy_" + ItemEnumHandler.EnergyType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.DustType.values().length; i++) {
			registerRender(DUST, i, "dust_" + ItemEnumHandler.DustType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.EssenceType.values().length; i++) {
			registerRender(ESSENCE, i, "essence_" + ItemEnumHandler.EssenceType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.IngotType.values().length; i++) {
			registerRender(INGOT, i, "ingot_" + ItemEnumHandler.IngotType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.ProtossIngotType.values().length; i++) {
			registerRender(PROTOSS_INGOT, i, "pingot_" + ItemEnumHandler.ProtossIngotType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.CrystalType.values().length; i++) {
			registerRender(PROTOSS_CRYSTAL, i, "crystal_" + ItemEnumHandler.CrystalType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.CreditType.values().length; i++) {
			registerRender(CREDIT, i, "credit_" + ItemEnumHandler.CreditType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.BulletType.values().length; i++) {
			registerRender(BULLET, i, "bullet_" + ItemEnumHandler.BulletType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.C14PartType.values().length; i++) {
			registerRender(C14_PARTS, i, "part_c14_gauss_" + ItemEnumHandler.C14PartType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.FocuserType.values().length; i++) {
			registerRender(PSI_BLADE_FOCUSER_UNCHARGED, i, "protoss_psiblade_focuser_uncharged_" + ItemEnumHandler.FocuserType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.CarapaceType.values().length; i++) {
			registerRender(ZERG_CARAPACE, i, "zerg_icarapace_" + ItemEnumHandler.CarapaceType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.ProtossArmorPiecesType.values().length; i++) {
			registerRender(PROTOSS_ARMOR_PIECES, i, "ppieces_" + ItemEnumHandler.ProtossArmorPiecesType.values()[i].getName());
		}
		for(int i = 0; i < ItemEnumHandler.CoordinateType.values().length; i++) {
			registerRender(COORDINATES, i, "coordinate_" + ItemEnumHandler.CoordinateType.values()[i].getName());
		}
//		for(int i = 0; i < ItemEnumHandler.MutaliskWingType.values().length; i++) {
//			registerRender(MUTALISK_WING, i, "mutalisk_wing_" + ItemEnumHandler.MutaliskWingType.values()[i].getName());
//		}
		
		ModArmor.registerRenders();
		ModWeapons.registerRenders();
		ModTools.registerRenders();
	}
}