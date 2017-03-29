package scmc.armour;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.CreativeTab;
import scmc.lib.LogHelper;
import scmc.lib.Reference;

public class ModArmour {
	
	/*
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), 
	 * CHAIN(15, new int[]{2, 5, 4, 1}, 12), 
	 * IRON(15, new int[]{2, 6, 5, 2}, 9),
	 * GOLD(7, new int[]{2, 5, 3, 1}, 25), 
	 * DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	static final ItemArmor.ArmorMaterial COPPER_ARMOUR_MATERIAL = EnumHelper.addArmorMaterial("copperArmorMaterial", Reference.RL_BASE + "copper", 11,
			new int[] { 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC , 0f);
	static final ItemArmor.ArmorMaterial STEEL_ARMOUR_MATERIAL = EnumHelper.addArmorMaterial("steelArmorMaterial", Reference.RL_BASE + "steel", 29,
			new int[] { 3, 7, 5, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial TITANIUM_ARMOUR_MATERIAL = EnumHelper.addArmorMaterial("titaniumArmorMaterial", Reference.RL_BASE + "titanium",
			21, new int[] { 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
//	
//	//terran armours
	static final ItemArmor.ArmorMaterial GHOST_ARMOUR_MATERIAL = EnumHelper.addArmorMaterial("ghostArmourMaterial", Reference.RL_BASE + "ghost_invis", 20, 
			new int[] { 2, 6, 4, 2 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static Item titaniumHelmet;
	public static Item titaniumChestplate;
	public static Item titaniumLeggings;
	public static Item titaniumBoots;

	public static Item copperHelmet;
	public static Item copperChestplate;
	public static Item copperLeggings;
	public static Item copperBoots;

	public static Item steelHelmet;
	public static Item steelChestplate;
	public static Item steelLeggings;
	public static Item steelBoots;
	
	public static Item ghostHelmet;
	public static Item ghostChestplate;
	public static Item ghostLeggings;
	public static Item ghostBoots;
	
	public static final Item[] ARMOURS = {titaniumHelmet, titaniumChestplate, titaniumLeggings, titaniumBoots, copperHelmet, copperChestplate, copperLeggings, copperBoots, steelHelmet, steelChestplate, steelLeggings, steelBoots, ghostHelmet, ghostChestplate, ghostLeggings, ghostBoots};

	public static void init() {
		titaniumHelmet = new ArmourTitaniumHelmet(TITANIUM_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		titaniumChestplate = new ArmourTitaniumChestplate(TITANIUM_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		titaniumLeggings = new ArmourTitaniumLeggings(TITANIUM_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		titaniumBoots = new ArmourTitaniumBoots(TITANIUM_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		copperHelmet = new ArmourCopperHelmet(COPPER_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		copperChestplate = new ArmourCopperChestplate(COPPER_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		copperLeggings = new ArmourCopperLeggings(COPPER_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		copperBoots = new ArmourCopperBoots(COPPER_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		steelHelmet = new ArmourSteelHelmet(STEEL_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		steelChestplate = new ArmourSteelChestplate(STEEL_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		steelLeggings = new ArmourSteelLeggings(STEEL_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		steelBoots = new ArmourSteelBoots(STEEL_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.FEET);

		ghostHelmet = new ArmourGhostHelmet(GHOST_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.HEAD);
		ghostChestplate = new ArmourGhostChestplate(GHOST_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
		ghostLeggings = new ArmourGhostLeggings(GHOST_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.LEGS);
		ghostBoots = new ArmourGhostBoots(GHOST_ARMOUR_MATERIAL, 0, EntityEquipmentSlot.FEET);
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
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(CreativeTab.tabStarcraftCombat);
		GameRegistry.register(item);
		LogHelper.logger.info("Registered item: " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}
