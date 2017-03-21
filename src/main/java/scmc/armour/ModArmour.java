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

	static final ItemArmor.ArmorMaterial copperArmourMaterial = EnumHelper.addArmorMaterial("copper", Reference.MODID + ":copper", 11,
			new int[] { 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC , 0f);
	static final ItemArmor.ArmorMaterial steelArmourMaterial = EnumHelper.addArmorMaterial("steel", Reference.MODID + ":steel", 29,
			new int[] { 3, 7, 5, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial titaniumArmourMaterial = EnumHelper.addArmorMaterial("titanium", Reference.MODID + ":titanium",
			21, new int[] { 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	//terran armours
	static final ItemArmor.ArmorMaterial ghostArmourMaterial = EnumHelper.addArmorMaterial("ghost", Reference.MODID + ":ghost", 20, 
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
	
	public static void init() {
		titaniumHelmet = new ItemModArmour(titaniumArmourMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_titanium");
		titaniumChestplate = new ItemModArmour(titaniumArmourMaterial, 1, EntityEquipmentSlot.CHEST, "chestplate_titanium");
		titaniumLeggings = new ItemModArmour(titaniumArmourMaterial, 2, EntityEquipmentSlot.LEGS, "leggings_titanium");
		titaniumBoots = new ItemModArmour(titaniumArmourMaterial, 1, EntityEquipmentSlot.FEET, "boots_titanium");

		copperHelmet = new ItemModArmour(copperArmourMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_copper");
		copperChestplate = new ItemModArmour(copperArmourMaterial, 1, EntityEquipmentSlot.CHEST, "chestplate_copper");
		copperLeggings = new ItemModArmour(copperArmourMaterial, 2, EntityEquipmentSlot.LEGS, "leggings_copper");
		copperBoots = new ItemModArmour(copperArmourMaterial, 1, EntityEquipmentSlot.FEET, "boots_copper");

		steelHelmet = new ItemModArmour(steelArmourMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_steel");
		steelChestplate = new ItemModArmour(steelArmourMaterial, 1, EntityEquipmentSlot.CHEST, "chestplate_steel");
		steelLeggings = new ItemModArmour(steelArmourMaterial, 2, EntityEquipmentSlot.LEGS, "leggings_steel");
		steelBoots = new ItemModArmour(steelArmourMaterial, 1, EntityEquipmentSlot.FEET, "boots_steel");

		ghostHelmet = new ItemModArmour(ghostArmourMaterial, 1, EntityEquipmentSlot.HEAD, "helmet_ghost");
		ghostChestplate = new ItemModArmour(ghostArmourMaterial, 1, EntityEquipmentSlot.CHEST, "chestplate_ghost");
		ghostLeggings = new ItemModArmour(ghostArmourMaterial, 2, EntityEquipmentSlot.LEGS, "leggings_ghost");
		ghostBoots = new ItemModArmour(ghostArmourMaterial, 1, EntityEquipmentSlot.FEET, "boots_ghost");
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
	
	/**
	 * Register an item
	 * @param item The item
	 */
	public static void registerItem(Item item) {
		item.setCreativeTab(CreativeTab.tabStarcraftMaterials); //Sets the creative tab
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
