package net.bvanseghi.starcraft.armour;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmour {
	
	/*
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), 
	 * CHAIN(15, new int[]{2, 5, 4, 1}, 12), 
	 * IRON(15, new int[]{2, 6, 5, 2}, 9),
	 * GOLD(7, new int[]{2, 5, 3, 1}, 25), 
	 * DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	static final ItemArmor.ArmorMaterial copperArmourMaterial = EnumHelper.addArmorMaterial("copperArmorMaterial", "Starcraft:textures/model/armor/copper_layer_1.png", 11,
			new int[] { 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC , 0f);
	static final ItemArmor.ArmorMaterial steelArmourMaterial = EnumHelper.addArmorMaterial("steelArmorMaterial", "Starcraft:textures/model/armor/steel_layer_1.png", 29,
			new int[] { 3, 7, 5, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	static final ItemArmor.ArmorMaterial titaniumArmourMaterial = EnumHelper.addArmorMaterial("titaniumArmorMaterial", "Starcraft:textures/model/armor/titanium_layer_1.png",
			21, new int[] { 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
//	
//	//terran armours
	static final ItemArmor.ArmorMaterial ghostArmourMaterial = EnumHelper.addArmorMaterial("ghostArmourMaterial", "Starcraft:textures/model/armor/ghost_invis_layer_1.png", 20, 
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

	public static void preInit() {
		titaniumHelmet = new ArmourTitaniumHelmet(titaniumArmourMaterial, 0, EntityEquipmentSlot.HEAD);
		titaniumChestplate = new ArmourTitaniumChestplate(titaniumArmourMaterial, 0, EntityEquipmentSlot.CHEST);
		titaniumLeggings = new ArmourTitaniumLeggings(titaniumArmourMaterial, 0, EntityEquipmentSlot.LEGS);
		titaniumBoots = new ArmourTitaniumBoots(titaniumArmourMaterial, 0, EntityEquipmentSlot.FEET);

		copperHelmet = new ArmourCopperHelmet(copperArmourMaterial, 0, EntityEquipmentSlot.HEAD);
		copperChestplate = new ArmourCopperChestplate(copperArmourMaterial, 0, EntityEquipmentSlot.CHEST);
		copperLeggings = new ArmourCopperLeggings(copperArmourMaterial, 0, EntityEquipmentSlot.LEGS);
		copperBoots = new ArmourCopperBoots(copperArmourMaterial, 0, EntityEquipmentSlot.FEET);

		steelHelmet = new ArmourSteelHelmet(steelArmourMaterial, 0, EntityEquipmentSlot.HEAD);
		steelChestplate = new ArmourSteelChestplate(steelArmourMaterial, 0, EntityEquipmentSlot.CHEST);
		steelLeggings = new ArmourSteelLeggings(steelArmourMaterial, 0, EntityEquipmentSlot.LEGS);
		steelBoots = new ArmourSteelBoots(steelArmourMaterial, 0, EntityEquipmentSlot.FEET);

		ghostHelmet = new ArmourGhostHelmet(ghostArmourMaterial, 0, EntityEquipmentSlot.HEAD);
		ghostChestplate = new ArmourGhostChestplate(ghostArmourMaterial, 0, EntityEquipmentSlot.CHEST);
		ghostLeggings = new ArmourGhostLeggings(ghostArmourMaterial, 0, EntityEquipmentSlot.LEGS);
		ghostBoots = new ArmourGhostBoots(ghostArmourMaterial, 0, EntityEquipmentSlot.FEET);
		
		
		GameRegistry.register(titaniumHelmet);
		GameRegistry.register(titaniumChestplate);
		GameRegistry.register(titaniumLeggings);
		GameRegistry.register(titaniumBoots);

		GameRegistry.register(copperHelmet);
		GameRegistry.register(copperChestplate);
		GameRegistry.register(copperLeggings);
		GameRegistry.register(copperBoots);

		GameRegistry.register(steelHelmet);
		GameRegistry.register(steelChestplate);
		GameRegistry.register(steelLeggings);
		GameRegistry.register(steelBoots);
		
		GameRegistry.register(ghostHelmet);
		GameRegistry.register(ghostChestplate);
		GameRegistry.register(ghostLeggings);
		GameRegistry.register(ghostBoots);

	}
}
