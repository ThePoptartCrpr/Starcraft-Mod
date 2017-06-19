package scmc.items.armor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.lib.Reference;

public class ModArmor {

	/*
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), CHAIN(15, new int[]{2, 5, 4, 1},
	 * 12), IRON(15, new int[]{2, 6, 5, 2}, 9), GOLD(7, new int[]{2, 5, 3, 1},
	 * 25), DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	// TODO: adjust the protoss values later
	static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("adeptArmorMaterialT1", Reference.RL_BASE + "adept_t1", 33,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("adeptArmorMaterialT2", Reference.RL_BASE + "adept_t2", 35,
			new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("adeptArmorMaterialT3", Reference.RL_BASE + "adept_t3", 37,
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
	
	static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zealotArmorMaterialT1", Reference.RL_BASE + "zealot_t1", 33,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zealotArmorMaterialT2", Reference.RL_BASE + "zealot_t2", 35,
			new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zealotArmorMaterialT3", Reference.RL_BASE + "zealot_t3", 37,
			new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	
	//TODO: edit these too
	static final ItemArmor.ArmorMaterial ZERG_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zergArmorMaterialT1", Reference.RL_BASE + "zerg_t1", 33,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ZERG_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zergArmorMaterialT2", Reference.RL_BASE + "zerg_t2", 35,
			new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial ZERG_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zergArmorMaterialT3", Reference.RL_BASE + "zerg_t3", 37,
			new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static Item ADEPT_BOOTS_T1;
	public static Item ADEPT_BOOTS_T2;
	public static Item ADEPT_BOOTS_T3;
	public static Item ADEPT_CHESTPLATE_T1;
	public static Item ADEPT_CHESTPLATE_T2;
	public static Item ADEPT_CHESTPLATE_T3;
	public static Item ADEPT_HELMET_T1;
	public static Item ADEPT_HELMET_T2;
	public static Item ADEPT_HELMET_T3;
	public static Item ADEPT_LEGGINGS_T1;
	public static Item ADEPT_LEGGINGS_T2;
	public static Item ADEPT_LEGGINGS_T3;

	public static Item COPPER_BOOTS;
	public static Item COPPER_CHESTPLATE;
	public static Item COPPER_HELMET;
	public static Item COPPER_LEGGINGS;

	public static Item DARK_KHAYDARIN_AMULET;

	public static Item DARK_ZEALOT_BOOTS_T1;
	public static Item DARK_ZEALOT_BOOTS_T2;
	public static Item DARK_ZEALOT_BOOTS_T3;
	public static Item DARK_ZEALOT_CHESTPLATE_T1;
	public static Item DARK_ZEALOT_CHESTPLATE_T2;
	public static Item DARK_ZEALOT_CHESTPLATE_T3;
	public static Item DARK_ZEALOT_HELMET_T1;
	public static Item DARK_ZEALOT_HELMET_T2;
	public static Item DARK_ZEALOT_HELMET_T3;
	public static Item DARK_ZEALOT_LEGGINGS_T1;
	public static Item DARK_ZEALOT_LEGGINGS_T2;
	public static Item DARK_ZEALOT_LEGGINGS_T3;

	public static Item GHOST_BOOTS;
	public static Item GHOST_CHESTPLATE;
	public static Item GHOST_HELMET;
	public static Item GHOST_LEGGINGS;

	public static Item KHAYDARIN_AMULET;

	public static Item PURIFIER_ADEPT_BOOTS_T1;
	public static Item PURIFIER_ADEPT_BOOTS_T2;
	public static Item PURIFIER_ADEPT_BOOTS_T3;
	public static Item PURIFIER_ADEPT_CHESTPLATE_T1;
	public static Item PURIFIER_ADEPT_CHESTPLATE_T2;
	public static Item PURIFIER_ADEPT_CHESTPLATE_T3;
	public static Item PURIFIER_ADEPT_HELMET_T1;
	public static Item PURIFIER_ADEPT_HELMET_T2;
	public static Item PURIFIER_ADEPT_HELMET_T3;
	public static Item PURIFIER_ADEPT_LEGGINGS_T1;
	public static Item PURIFIER_ADEPT_LEGGINGS_T2;
	public static Item PURIFIER_ADEPT_LEGGINGS_T3;

	public static Item STEEL_BOOTS;
	public static Item STEEL_CHESTPLATE;
	public static Item STEEL_HELMET;
	public static Item STEEL_LEGGINGS;

	public static Item TITANIUM_BOOTS;
	public static Item TITANIUM_CHESTPLATE;
	public static Item TITANIUM_HELMET;
	public static Item TITANIUM_LEGGINGS;

	public static Item ZEALOT_BOOTS_T1;
	public static Item ZEALOT_BOOTS_T2;
	public static Item ZEALOT_BOOTS_T3;
	public static Item ZEALOT_CHESTPLATE_T1;
	public static Item ZEALOT_CHESTPLATE_T2;
	public static Item ZEALOT_CHESTPLATE_T3;
	public static Item ZEALOT_HELMET_T1;
	public static Item ZEALOT_HELMET_T2;
	public static Item ZEALOT_HELMET_T3;
	public static Item ZEALOT_LEGGINGS_T1;
	public static Item ZEALOT_LEGGINGS_T2;
	public static Item ZEALOT_LEGGINGS_T3;
	
	public static Item ZERG_BOOTS_T1;
	public static Item ZERG_BOOTS_T2;
	public static Item ZERG_BOOTS_T3;
	public static Item ZERG_CHESTPLATE_T1;
	public static Item ZERG_CHESTPLATE_T2;
	public static Item ZERG_CHESTPLATE_T3;
	public static Item ZERG_HELMET_T1;
	public static Item ZERG_HELMET_T2;
	public static Item ZERG_HELMET_T3;
	public static Item ZERG_LEGGINGS_T1;
	public static Item ZERG_LEGGINGS_T2;
	public static Item ZERG_LEGGINGS_T3;

	public static void init() {
		TITANIUM_HELMET = new ArmorTitaniumHelmet(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		TITANIUM_CHESTPLATE = new ArmorTitaniumChestplate(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		TITANIUM_LEGGINGS = new ArmorTitaniumLeggings(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		TITANIUM_BOOTS = new ArmorTitaniumBoots(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		COPPER_HELMET = new ArmorCopperHelmet(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		COPPER_CHESTPLATE = new ArmorCopperChestplate(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		COPPER_LEGGINGS = new ArmorCopperLeggings(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		COPPER_BOOTS = new ArmorCopperBoots(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		STEEL_HELMET = new ArmorSteelHelmet(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		STEEL_CHESTPLATE = new ArmorSteelChestplate(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		STEEL_LEGGINGS = new ArmorSteelLeggings(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		STEEL_BOOTS = new ArmorSteelBoots(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		GHOST_HELMET = new ArmorGhostHelmet(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		GHOST_CHESTPLATE = new ArmorGhostChestplate(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		GHOST_LEGGINGS = new ArmorGhostLeggings(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		GHOST_BOOTS = new ArmorGhostBoots(GHOST_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		ADEPT_HELMET_T1 = new ArmorAdeptHelmetT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		ADEPT_CHESTPLATE_T1 = new ArmorAdeptChestplateT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		ADEPT_LEGGINGS_T1 = new ArmorAdeptLeggingsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		ADEPT_BOOTS_T1 = new ArmorAdeptBootsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		ADEPT_HELMET_T2 = new ArmorAdeptHelmetT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		ADEPT_CHESTPLATE_T2 = new ArmorAdeptChestplateT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		ADEPT_LEGGINGS_T2 = new ArmorAdeptLeggingsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		ADEPT_BOOTS_T2 = new ArmorAdeptBootsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		ADEPT_HELMET_T3 = new ArmorAdeptHelmetT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		ADEPT_CHESTPLATE_T3 = new ArmorAdeptChestplateT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		ADEPT_LEGGINGS_T3 = new ArmorAdeptLeggingsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		ADEPT_BOOTS_T3 = new ArmorAdeptBootsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		ZEALOT_HELMET_T1 = new ArmorZealotHelmetT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		ZEALOT_CHESTPLATE_T1 = new ArmorZealotChestplateT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		ZEALOT_LEGGINGS_T1 = new ArmorZealotLeggingsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		ZEALOT_BOOTS_T1 = new ArmorZealotBootsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		ZEALOT_HELMET_T2 = new ArmorZealotHelmetT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		ZEALOT_CHESTPLATE_T2 = new ArmorZealotChestplateT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		ZEALOT_LEGGINGS_T2 = new ArmorZealotLeggingsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		ZEALOT_BOOTS_T2 = new ArmorZealotBootsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		ZEALOT_HELMET_T3 = new ArmorZealotHelmetT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		ZEALOT_CHESTPLATE_T3 = new ArmorZealotChestplateT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		ZEALOT_LEGGINGS_T3 = new ArmorZealotLeggingsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		ZEALOT_BOOTS_T3 = new ArmorZealotBootsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		PURIFIER_ADEPT_HELMET_T1 = new ArmorPurifierAdeptHelmetT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		PURIFIER_ADEPT_CHESTPLATE_T1 = new ArmorPurifierAdeptChestplateT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		PURIFIER_ADEPT_LEGGINGS_T1 = new ArmorPurifierAdeptLeggingsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		PURIFIER_ADEPT_BOOTS_T1 = new ArmorPurifierAdeptBootsT1(ADEPT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		PURIFIER_ADEPT_HELMET_T2 = new ArmorPurifierAdeptHelmetT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		PURIFIER_ADEPT_CHESTPLATE_T2 = new ArmorPurifierAdeptChestplateT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		PURIFIER_ADEPT_LEGGINGS_T2 = new ArmorPurifierAdeptLeggingsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		PURIFIER_ADEPT_BOOTS_T2 = new ArmorPurifierAdeptBootsT2(ADEPT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		PURIFIER_ADEPT_HELMET_T3 = new ArmorPurifierAdeptHelmetT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		PURIFIER_ADEPT_CHESTPLATE_T3 = new ArmorPurifierAdeptChestplateT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		PURIFIER_ADEPT_LEGGINGS_T3 = new ArmorPurifierAdeptLeggingsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		PURIFIER_ADEPT_BOOTS_T3 = new ArmorPurifierAdeptBootsT3(ADEPT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		DARK_ZEALOT_HELMET_T1 = new ArmorDarkZealotHelmetT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		DARK_ZEALOT_CHESTPLATE_T1 = new ArmorDarkZealotChestplateT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		DARK_ZEALOT_LEGGINGS_T1 = new ArmorDarkZealotLeggingsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		DARK_ZEALOT_BOOTS_T1 = new ArmorDarkZealotBootsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		DARK_ZEALOT_HELMET_T2 = new ArmorDarkZealotHelmetT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		DARK_ZEALOT_CHESTPLATE_T2 = new ArmorDarkZealotChestplateT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		DARK_ZEALOT_LEGGINGS_T2 = new ArmorDarkZealotLeggingsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		DARK_ZEALOT_BOOTS_T2 = new ArmorDarkZealotBootsT2(ZEALOT_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		DARK_ZEALOT_HELMET_T3 = new ArmorDarkZealotHelmetT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		DARK_ZEALOT_CHESTPLATE_T3 = new ArmorDarkZealotChestplateT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		DARK_ZEALOT_LEGGINGS_T3 = new ArmorDarkZealotLeggingsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		DARK_ZEALOT_BOOTS_T3 = new ArmorDarkZealotBootsT3(ZEALOT_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);

		KHAYDARIN_AMULET = new ArmorKhaydarinAmulet(KHAYDARIN_AMULET_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		DARK_KHAYDARIN_AMULET = new ArmorDarkKhaydarinAmulet(KHAYDARIN_AMULET_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		
		ZERG_HELMET_T1 = new ArmorZergHelmetT1(ZERG_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD);
		ZERG_CHESTPLATE_T1 = new ArmorZergChestplateT1(ZERG_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST);
		ZERG_LEGGINGS_T1 = new ArmorZergLeggingsT1(ZERG_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.LEGS);
		ZERG_BOOTS_T1 = new ArmorZergBootsT1(ZEALOT_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.FEET);

		ZERG_HELMET_T2 = new ArmorZergHelmetT2(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD);
		ZERG_CHESTPLATE_T2 = new ArmorZergChestplateT2(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST);
		ZERG_LEGGINGS_T2 = new ArmorZergLeggingsT2(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.LEGS);
		ZERG_BOOTS_T2 = new ArmorZergBootsT2(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.FEET);

		ZERG_HELMET_T3 = new ArmorZergHelmetT3(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD);
		ZERG_CHESTPLATE_T3 = new ArmorZergChestplateT3(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST);
		ZERG_LEGGINGS_T3 = new ArmorZergLeggingsT3(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.LEGS);
		ZERG_BOOTS_T3 = new ArmorZergBootsT3(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.FEET);
	}

	public static void register() {
		registerItem(TITANIUM_HELMET);
		registerItem(TITANIUM_CHESTPLATE);
		registerItem(TITANIUM_LEGGINGS);
		registerItem(TITANIUM_BOOTS);

		registerItem(COPPER_HELMET);
		registerItem(COPPER_CHESTPLATE);
		registerItem(COPPER_LEGGINGS);
		registerItem(COPPER_BOOTS);

		registerItem(STEEL_HELMET);
		registerItem(STEEL_CHESTPLATE);
		registerItem(STEEL_LEGGINGS);
		registerItem(STEEL_BOOTS);

		registerItem(GHOST_HELMET);
		registerItem(GHOST_CHESTPLATE);
		registerItem(GHOST_LEGGINGS);
		registerItem(GHOST_BOOTS);

		registerItem(ADEPT_HELMET_T1);
		registerItem(ADEPT_CHESTPLATE_T1);
		registerItem(ADEPT_LEGGINGS_T1);
		registerItem(ADEPT_BOOTS_T1);

		registerItem(ADEPT_HELMET_T2);
		registerItem(ADEPT_CHESTPLATE_T2);
		registerItem(ADEPT_LEGGINGS_T2);
		registerItem(ADEPT_BOOTS_T2);

		registerItem(ADEPT_HELMET_T3);
		registerItem(ADEPT_CHESTPLATE_T3);
		registerItem(ADEPT_LEGGINGS_T3);
		registerItem(ADEPT_BOOTS_T3);

		registerItem(ZEALOT_HELMET_T1);
		registerItem(ZEALOT_CHESTPLATE_T1);
		registerItem(ZEALOT_LEGGINGS_T1);
		registerItem(ZEALOT_BOOTS_T1);

		registerItem(ZEALOT_HELMET_T2);
		registerItem(ZEALOT_CHESTPLATE_T2);
		registerItem(ZEALOT_LEGGINGS_T2);
		registerItem(ZEALOT_BOOTS_T2);

		registerItem(ZEALOT_HELMET_T3);
		registerItem(ZEALOT_CHESTPLATE_T3);
		registerItem(ZEALOT_LEGGINGS_T3);
		registerItem(ZEALOT_BOOTS_T3);

		registerItem(PURIFIER_ADEPT_HELMET_T1);
		registerItem(PURIFIER_ADEPT_CHESTPLATE_T1);
		registerItem(PURIFIER_ADEPT_LEGGINGS_T1);
		registerItem(PURIFIER_ADEPT_BOOTS_T1);

		registerItem(PURIFIER_ADEPT_HELMET_T2);
		registerItem(PURIFIER_ADEPT_CHESTPLATE_T2);
		registerItem(PURIFIER_ADEPT_LEGGINGS_T2);
		registerItem(PURIFIER_ADEPT_BOOTS_T2);

		registerItem(PURIFIER_ADEPT_HELMET_T3);
		registerItem(PURIFIER_ADEPT_CHESTPLATE_T3);
		registerItem(PURIFIER_ADEPT_LEGGINGS_T3);
		registerItem(PURIFIER_ADEPT_BOOTS_T3);

		registerItem(DARK_ZEALOT_HELMET_T1);
		registerItem(DARK_ZEALOT_CHESTPLATE_T1);
		registerItem(DARK_ZEALOT_LEGGINGS_T1);
		registerItem(DARK_ZEALOT_BOOTS_T1);

		registerItem(DARK_ZEALOT_HELMET_T2);
		registerItem(DARK_ZEALOT_CHESTPLATE_T2);
		registerItem(DARK_ZEALOT_LEGGINGS_T2);
		registerItem(DARK_ZEALOT_BOOTS_T2);

		registerItem(DARK_ZEALOT_HELMET_T3);
		registerItem(DARK_ZEALOT_CHESTPLATE_T3);
		registerItem(DARK_ZEALOT_LEGGINGS_T3);
		registerItem(DARK_ZEALOT_BOOTS_T3);

		registerItem(KHAYDARIN_AMULET);
		registerItem(DARK_KHAYDARIN_AMULET);
		
		registerItem(ZERG_HELMET_T1);
		registerItem(ZERG_CHESTPLATE_T1);
		registerItem(ZERG_LEGGINGS_T1);
		registerItem(ZERG_BOOTS_T1);

		registerItem(ZERG_HELMET_T2);
		registerItem(ZERG_CHESTPLATE_T2);
		registerItem(ZERG_LEGGINGS_T2);
		registerItem(ZERG_BOOTS_T2);

		registerItem(ZERG_HELMET_T3);
		registerItem(ZERG_CHESTPLATE_T3);
		registerItem(ZERG_LEGGINGS_T3);
		registerItem(ZERG_BOOTS_T3);
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
		// LogHelper.logger.info("Registered item: " + item.getUnlocalizedName().substring(5));
	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		// LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(TITANIUM_HELMET);
		registerRender(TITANIUM_CHESTPLATE);
		registerRender(TITANIUM_LEGGINGS);
		registerRender(TITANIUM_BOOTS);

		registerRender(COPPER_HELMET);
		registerRender(COPPER_CHESTPLATE);
		registerRender(COPPER_LEGGINGS);
		registerRender(COPPER_BOOTS);

		registerRender(STEEL_HELMET);
		registerRender(STEEL_CHESTPLATE);
		registerRender(STEEL_LEGGINGS);
		registerRender(STEEL_BOOTS);

		registerRender(GHOST_HELMET);
		registerRender(GHOST_CHESTPLATE);
		registerRender(GHOST_LEGGINGS);
		registerRender(GHOST_BOOTS);

		registerRender(ADEPT_HELMET_T1);
		registerRender(ADEPT_CHESTPLATE_T1);
		registerRender(ADEPT_LEGGINGS_T1);
		registerRender(ADEPT_BOOTS_T1);

		registerRender(ADEPT_HELMET_T2);
		registerRender(ADEPT_CHESTPLATE_T2);
		registerRender(ADEPT_LEGGINGS_T2);
		registerRender(ADEPT_BOOTS_T2);

		registerRender(ADEPT_HELMET_T3);
		registerRender(ADEPT_CHESTPLATE_T3);
		registerRender(ADEPT_LEGGINGS_T3);
		registerRender(ADEPT_BOOTS_T3);

		registerRender(ZEALOT_HELMET_T1);
		registerRender(ZEALOT_CHESTPLATE_T1);
		registerRender(ZEALOT_LEGGINGS_T1);
		registerRender(ZEALOT_BOOTS_T1);

		registerRender(ZEALOT_HELMET_T2);
		registerRender(ZEALOT_CHESTPLATE_T2);
		registerRender(ZEALOT_LEGGINGS_T2);
		registerRender(ZEALOT_BOOTS_T2);

		registerRender(ZEALOT_HELMET_T3);
		registerRender(ZEALOT_CHESTPLATE_T3);
		registerRender(ZEALOT_LEGGINGS_T3);
		registerRender(ZEALOT_BOOTS_T3);

		registerRender(PURIFIER_ADEPT_HELMET_T1);
		registerRender(PURIFIER_ADEPT_CHESTPLATE_T1);
		registerRender(PURIFIER_ADEPT_LEGGINGS_T1);
		registerRender(PURIFIER_ADEPT_BOOTS_T1);

		registerRender(PURIFIER_ADEPT_HELMET_T2);
		registerRender(PURIFIER_ADEPT_CHESTPLATE_T2);
		registerRender(PURIFIER_ADEPT_LEGGINGS_T2);
		registerRender(PURIFIER_ADEPT_BOOTS_T2);

		registerRender(PURIFIER_ADEPT_HELMET_T3);
		registerRender(PURIFIER_ADEPT_CHESTPLATE_T3);
		registerRender(PURIFIER_ADEPT_LEGGINGS_T3);
		registerRender(PURIFIER_ADEPT_BOOTS_T3);

		registerRender(DARK_ZEALOT_HELMET_T1);
		registerRender(DARK_ZEALOT_CHESTPLATE_T1);
		registerRender(DARK_ZEALOT_LEGGINGS_T1);
		registerRender(DARK_ZEALOT_BOOTS_T1);

		registerRender(DARK_ZEALOT_HELMET_T2);
		registerRender(DARK_ZEALOT_CHESTPLATE_T2);
		registerRender(DARK_ZEALOT_LEGGINGS_T2);
		registerRender(DARK_ZEALOT_BOOTS_T2);

		registerRender(DARK_ZEALOT_HELMET_T3);
		registerRender(DARK_ZEALOT_CHESTPLATE_T3);
		registerRender(DARK_ZEALOT_LEGGINGS_T3);
		registerRender(DARK_ZEALOT_BOOTS_T3);

		registerRender(KHAYDARIN_AMULET);
		registerRender(DARK_KHAYDARIN_AMULET);
		
		registerRender(ZERG_HELMET_T1);
		registerRender(ZERG_CHESTPLATE_T1);
		registerRender(ZERG_LEGGINGS_T1);
		registerRender(ZERG_BOOTS_T1);

		registerRender(ZERG_HELMET_T2);
		registerRender(ZERG_CHESTPLATE_T2);
		registerRender(ZERG_LEGGINGS_T2);
		registerRender(ZERG_BOOTS_T2);

		registerRender(ZERG_HELMET_T3);
		registerRender(ZERG_CHESTPLATE_T3);
		registerRender(ZERG_LEGGINGS_T3);
		registerRender(ZERG_BOOTS_T3);
	}
}
