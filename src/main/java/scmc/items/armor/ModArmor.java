package scmc.items.armor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ModArmor {

	/*
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), CHAIN(15, new int[]{2, 5, 4, 1},
	 * 12), IRON(15, new int[]{2, 6, 5, 2}, 9), GOLD(7, new int[]{2, 5, 3, 1},
	 * 25), DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	// TODO: adjust the protoss values later
	static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("adeptArmorMaterialT1", Reference.RL_BASE + "adeptT1", 33,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("adeptArmorMaterialT2", Reference.RL_BASE + "adeptT2", 35,
			new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("adeptArmorMaterialT3", Reference.RL_BASE + "adeptT3", 37,
			new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial COPPER_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("copperArmorMaterial", Reference.RL_BASE + "copper", 11,
			new int[] { 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial GHOST_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("ghostArmourMaterial", Reference.RL_BASE + "ghost_invis", 20,
			new int[] { 2, 6, 4, 2 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial KHAYDARIN_AMULET_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("khaydarinAmuletArmorMaterial", Reference.RL_BASE + "khaydarin_amulet",
			37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial STEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("steelArmorMaterial", Reference.RL_BASE + "steel", 29, new int[] { 3, 7, 5, 3 },
			9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial TITANIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("titaniumArmorMaterial", Reference.RL_BASE + "titanium", 21,
			new int[] { 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zealotArmorMaterialT1", Reference.RL_BASE + "zealotT1", 33,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zealotArmorMaterialT2", Reference.RL_BASE + "zealotT2", 35,
			new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zealotArmorMaterialT3", Reference.RL_BASE + "zealotT3", 37,
			new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static Item adeptBootsT1;
	public static Item adeptBootsT2;
	public static Item adeptBootsT3;
	public static Item adeptChestplateT1;
	public static Item adeptChestplateT2;
	public static Item adeptChestplateT3;
	public static Item adeptHelmetT1;
	public static Item adeptHelmetT2;
	public static Item adeptHelmetT3;
	public static Item adeptLeggingsT1;
	public static Item adeptLeggingsT2;
	public static Item adeptLeggingsT3;

	public static Item copperBoots;
	public static Item copperChestplate;
	public static Item copperHelmet;
	public static Item copperLeggings;

	public static Item darkKhaydarinAmulet;

	public static Item darkZealotBootsT1;
	public static Item darkZealotBootsT2;
	public static Item darkZealotBootsT3;
	public static Item darkZealotChestplateT1;
	public static Item darkZealotChestplateT2;
	public static Item darkZealotChestplateT3;
	public static Item darkZealotHelmetT1;
	public static Item darkZealotHelmetT2;
	public static Item darkZealotHelmetT3;
	public static Item darkZealotLeggingsT1;
	public static Item darkZealotLeggingsT2;
	public static Item darkZealotLeggingsT3;

	public static Item ghostBoots;
	public static Item ghostChestplate;
	public static Item ghostHelmet;
	public static Item ghostLeggings;

	public static Item khaydarinAmulet;

	public static Item purifierAdeptBootsT1;
	public static Item purifierAdeptBootsT2;
	public static Item purifierAdeptBootsT3;
	public static Item purifierAdeptChestplateT1;
	public static Item purifierAdeptChestplateT2;
	public static Item purifierAdeptChestplateT3;
	public static Item purifierAdeptHelmetT1;
	public static Item purifierAdeptHelmetT2;
	public static Item purifierAdeptHelmetT3;
	public static Item purifierAdeptLeggingsT1;
	public static Item purifierAdeptLeggingsT2;
	public static Item purifierAdeptLeggingsT3;

	public static Item steelBoots;
	public static Item steelChestplate;
	public static Item steelHelmet;
	public static Item steelLeggings;

	public static Item titaniumBoots;
	public static Item titaniumChestplate;
	public static Item titaniumHelmet;
	public static Item titaniumLeggings;

	public static Item zealotBootsT1;
	public static Item zealotBootsT2;
	public static Item zealotBootsT3;
	public static Item zealotChestplateT1;
	public static Item zealotChestplateT2;
	public static Item zealotChestplateT3;
	public static Item zealotHelmetT1;
	public static Item zealotHelmetT2;
	public static Item zealotHelmetT3;
	public static Item zealotLeggingsT1;
	public static Item zealotLeggingsT2;
	public static Item zealotLeggingsT3;

	// TODO: what does this do?
	public static final Item[] ARMORS = { titaniumHelmet, titaniumChestplate, titaniumLeggings, titaniumBoots, copperHelmet, copperChestplate, copperLeggings, copperBoots,
			steelHelmet, steelChestplate, steelLeggings, steelBoots, ghostHelmet, ghostChestplate, ghostLeggings, ghostBoots };

	public static void init() {
		titaniumHelmet = new ArmorTitaniumHelmet(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		titaniumChestplate = new ArmorTitaniumChestplate(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		titaniumLeggings = new ArmorTitaniumLeggings(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		titaniumBoots = new ArmorTitaniumBoots(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		copperHelmet = new ArmorCopperHelmet(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		copperChestplate = new ArmorCopperChestplate(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		copperLeggings = new ArmorCopperLeggings(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		copperBoots = new ArmorCopperBoots(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		steelHelmet = new ArmorSteelHelmet(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		steelChestplate = new ArmorSteelChestplate(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		steelLeggings = new ArmorSteelLeggings(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		steelBoots = new ArmorSteelBoots(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		ghostHelmet = new ArmorGhostHelmet(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		ghostChestplate = new ArmorGhostChestplate(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		ghostLeggings = new ArmorGhostLeggings(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		ghostBoots = new ArmorGhostBoots(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		adeptHelmetT1 = new ArmorAdeptHelmetT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		adeptChestplateT1 = new ArmorAdeptChestplateT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		adeptLeggingsT1 = new ArmorAdeptLeggingsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		adeptBootsT1 = new ArmorAdeptBootsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		adeptHelmetT2 = new ArmorAdeptHelmetT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		adeptChestplateT2 = new ArmorAdeptChestplateT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		adeptLeggingsT2 = new ArmorAdeptLeggingsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		adeptBootsT2 = new ArmorAdeptBootsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		adeptHelmetT3 = new ArmorAdeptHelmetT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		adeptChestplateT3 = new ArmorAdeptChestplateT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		adeptLeggingsT3 = new ArmorAdeptLeggingsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		adeptBootsT3 = new ArmorAdeptBootsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		zealotHelmetT1 = new ArmorZealotHelmetT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		zealotChestplateT1 = new ArmorZealotChestplateT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		zealotLeggingsT1 = new ArmorZealotLeggingsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		zealotBootsT1 = new ArmorZealotBootsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		zealotHelmetT2 = new ArmorZealotHelmetT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		zealotChestplateT2 = new ArmorZealotChestplateT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		zealotLeggingsT2 = new ArmorZealotLeggingsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		zealotBootsT2 = new ArmorZealotBootsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		zealotHelmetT3 = new ArmorZealotHelmetT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		zealotChestplateT3 = new ArmorZealotChestplateT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		zealotLeggingsT3 = new ArmorZealotLeggingsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		zealotBootsT3 = new ArmorZealotBootsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		purifierAdeptHelmetT1 = new ArmorPurifierAdeptHelmetT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		purifierAdeptChestplateT1 = new ArmorPurifierAdeptChestplateT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		purifierAdeptLeggingsT1 = new ArmorPurifierAdeptLeggingsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		purifierAdeptBootsT1 = new ArmorPurifierAdeptBootsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		purifierAdeptHelmetT2 = new ArmorPurifierAdeptHelmetT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		purifierAdeptChestplateT2 = new ArmorPurifierAdeptChestplateT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		purifierAdeptLeggingsT2 = new ArmorPurifierAdeptLeggingsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		purifierAdeptBootsT2 = new ArmorPurifierAdeptBootsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		purifierAdeptHelmetT3 = new ArmorPurifierAdeptHelmetT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		purifierAdeptChestplateT3 = new ArmorPurifierAdeptChestplateT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		purifierAdeptLeggingsT3 = new ArmorPurifierAdeptLeggingsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		purifierAdeptBootsT3 = new ArmorPurifierAdeptBootsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		darkZealotHelmetT1 = new ArmorDarkZealotHelmetT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		darkZealotChestplateT1 = new ArmorDarkZealotChestplateT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		darkZealotLeggingsT1 = new ArmorDarkZealotLeggingsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		darkZealotBootsT1 = new ArmorDarkZealotBootsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		darkZealotHelmetT2 = new ArmorDarkZealotHelmetT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		darkZealotChestplateT2 = new ArmorDarkZealotChestplateT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		darkZealotLeggingsT2 = new ArmorDarkZealotLeggingsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		darkZealotBootsT2 = new ArmorDarkZealotBootsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		darkZealotHelmetT3 = new ArmorDarkZealotHelmetT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		darkZealotChestplateT3 = new ArmorDarkZealotChestplateT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		darkZealotLeggingsT3 = new ArmorDarkZealotLeggingsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		darkZealotBootsT3 = new ArmorDarkZealotBootsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		khaydarinAmulet = new ArmorKhaydarinAmulet(KHAYDARIN_AMULET_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		darkKhaydarinAmulet = new ArmorDarkKhaydarinAmulet(KHAYDARIN_AMULET_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
	}

	public static void register() {
		registerItem(titaniumHelmet);
		registerItem(titaniumChestplate);
		registerItem(titaniumLeggings);
		registerItem(titaniumBoots);

		registerItem(copperHelmet);
		registerItem(copperChestplate);
		registerItem(copperLeggings);
		registerItem(copperBoots);

		registerItem(steelHelmet);
		registerItem(steelChestplate);
		registerItem(steelLeggings);
		registerItem(steelBoots);

		registerItem(ghostHelmet);
		registerItem(ghostChestplate);
		registerItem(ghostLeggings);
		registerItem(ghostBoots);

		registerItem(adeptHelmetT1);
		registerItem(adeptChestplateT1);
		registerItem(adeptLeggingsT1);
		registerItem(adeptBootsT1);

		registerItem(adeptHelmetT2);
		registerItem(adeptChestplateT2);
		registerItem(adeptLeggingsT2);
		registerItem(adeptBootsT2);

		registerItem(adeptHelmetT3);
		registerItem(adeptChestplateT3);
		registerItem(adeptLeggingsT3);
		registerItem(adeptBootsT3);

		registerItem(zealotHelmetT1);
		registerItem(zealotChestplateT1);
		registerItem(zealotLeggingsT1);
		registerItem(zealotBootsT1);

		registerItem(zealotHelmetT2);
		registerItem(zealotChestplateT2);
		registerItem(zealotLeggingsT2);
		registerItem(zealotBootsT2);

		registerItem(zealotHelmetT3);
		registerItem(zealotChestplateT3);
		registerItem(zealotLeggingsT3);
		registerItem(zealotBootsT3);

		registerItem(purifierAdeptHelmetT1);
		registerItem(purifierAdeptChestplateT1);
		registerItem(purifierAdeptLeggingsT1);
		registerItem(purifierAdeptBootsT1);

		registerItem(purifierAdeptHelmetT2);
		registerItem(purifierAdeptChestplateT2);
		registerItem(purifierAdeptLeggingsT2);
		registerItem(purifierAdeptBootsT2);

		registerItem(purifierAdeptHelmetT3);
		registerItem(purifierAdeptChestplateT3);
		registerItem(purifierAdeptLeggingsT3);
		registerItem(purifierAdeptBootsT3);

		registerItem(darkZealotHelmetT1);
		registerItem(darkZealotChestplateT1);
		registerItem(darkZealotLeggingsT1);
		registerItem(darkZealotBootsT1);

		registerItem(darkZealotHelmetT2);
		registerItem(darkZealotChestplateT2);
		registerItem(darkZealotLeggingsT2);
		registerItem(darkZealotBootsT2);

		registerItem(darkZealotHelmetT3);
		registerItem(darkZealotChestplateT3);
		registerItem(darkZealotLeggingsT3);
		registerItem(darkZealotBootsT3);

		registerItem(khaydarinAmulet);
		registerItem(darkKhaydarinAmulet);
	}

	public static void registerItem(Item item) {
		item.setCreativeTab(StarcraftCreativeTabs.COMBAT);
		GameRegistry.register(item);
		// LogHelper.logger.info("Registered item: " + item.getUnlocalizedName().substring(5));
	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		// LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(titaniumHelmet);
		registerRender(titaniumChestplate);
		registerRender(titaniumLeggings);
		registerRender(titaniumBoots);

		registerRender(copperHelmet);
		registerRender(copperChestplate);
		registerRender(copperLeggings);
		registerRender(copperBoots);

		registerRender(steelHelmet);
		registerRender(steelChestplate);
		registerRender(steelLeggings);
		registerRender(steelBoots);

		registerRender(ghostHelmet);
		registerRender(ghostChestplate);
		registerRender(ghostLeggings);
		registerRender(ghostBoots);

		registerRender(adeptHelmetT1);
		registerRender(adeptChestplateT1);
		registerRender(adeptLeggingsT1);
		registerRender(adeptBootsT1);

		registerRender(adeptHelmetT2);
		registerRender(adeptChestplateT2);
		registerRender(adeptLeggingsT2);
		registerRender(adeptBootsT2);

		registerRender(adeptHelmetT3);
		registerRender(adeptChestplateT3);
		registerRender(adeptLeggingsT3);
		registerRender(adeptBootsT3);

		registerRender(zealotHelmetT1);
		registerRender(zealotChestplateT1);
		registerRender(zealotLeggingsT1);
		registerRender(zealotBootsT1);

		registerRender(zealotHelmetT2);
		registerRender(zealotChestplateT2);
		registerRender(zealotLeggingsT2);
		registerRender(zealotBootsT2);

		registerRender(zealotHelmetT3);
		registerRender(zealotChestplateT3);
		registerRender(zealotLeggingsT3);
		registerRender(zealotBootsT3);

		registerRender(purifierAdeptHelmetT1);
		registerRender(purifierAdeptChestplateT1);
		registerRender(purifierAdeptLeggingsT1);
		registerRender(purifierAdeptBootsT1);

		registerRender(purifierAdeptHelmetT2);
		registerRender(purifierAdeptChestplateT2);
		registerRender(purifierAdeptLeggingsT2);
		registerRender(purifierAdeptBootsT2);

		registerRender(purifierAdeptHelmetT3);
		registerRender(purifierAdeptChestplateT3);
		registerRender(purifierAdeptLeggingsT3);
		registerRender(purifierAdeptBootsT3);

		registerRender(darkZealotHelmetT1);
		registerRender(darkZealotChestplateT1);
		registerRender(darkZealotLeggingsT1);
		registerRender(darkZealotBootsT1);

		registerRender(darkZealotHelmetT2);
		registerRender(darkZealotChestplateT2);
		registerRender(darkZealotLeggingsT2);
		registerRender(darkZealotBootsT2);

		registerRender(darkZealotHelmetT3);
		registerRender(darkZealotChestplateT3);
		registerRender(darkZealotLeggingsT3);
		registerRender(darkZealotBootsT3);

		registerRender(khaydarinAmulet);
		registerRender(darkKhaydarinAmulet);
	}
}
