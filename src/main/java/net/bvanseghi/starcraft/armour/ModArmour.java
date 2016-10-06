package net.bvanseghi.starcraft.armour;

import cpw.mods.fml.common.registry.GameRegistry;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmour {

	/*
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), CHAIN(15, new int[]{2, 5, 4, 1},
	 * 12), IRON(15, new int[]{2, 6, 5, 2}, 9), GOLD(7, new int[]{2, 5, 3, 1},
	 * 25), DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	static final ItemArmor.ArmorMaterial copperArmourMaterial = EnumHelper.addArmorMaterial("copperArmorMaterial", 11,
			new int[] { 2, 5, 4, 1 }, 12);
	static final ItemArmor.ArmorMaterial steelArmourMaterial = EnumHelper.addArmorMaterial("steelArmorMaterial", 21,
			new int[] { 3, 6, 5, 2 }, 30);
	static final ItemArmor.ArmorMaterial titaniumArmourMaterial = EnumHelper.addArmorMaterial("titaniumArmorMaterial",
			29, new int[] { 3, 7, 5, 3 }, 9);

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

	public static void preInit() {

		titaniumHelmet = new ArmourTitaniumHelmet(titaniumArmourMaterial, 0, 0);
		titaniumChestplate = new ArmourTitaniumChestplate(titaniumArmourMaterial, 0, 1);
		titaniumLeggings = new ArmourTitaniumLeggings(titaniumArmourMaterial, 0, 2);
		titaniumBoots = new ArmourTitaniumBoots(titaniumArmourMaterial, 0, 3);

		copperHelmet = new ArmourCopperHelmet(copperArmourMaterial, 0, 0);
		copperChestplate = new ArmourCopperChestplate(copperArmourMaterial, 0, 1);
		copperLeggings = new ArmourCopperLeggings(copperArmourMaterial, 0, 2);
		copperBoots = new ArmourCopperBoots(copperArmourMaterial, 0, 3);

		steelHelmet = new ArmourSteelHelmet(steelArmourMaterial, 0, 0);
		steelChestplate = new ArmourSteelChestplate(steelArmourMaterial, 0, 1);
		steelLeggings = new ArmourSteelLeggings(steelArmourMaterial, 0, 2);
		steelBoots = new ArmourSteelBoots(steelArmourMaterial, 0, 3);

		GameRegistry.registerItem(titaniumHelmet, REFERENCE.MODID + titaniumHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumChestplate,
				REFERENCE.MODID + titaniumChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumLeggings,
				REFERENCE.MODID + titaniumLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumBoots, REFERENCE.MODID + titaniumBoots.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(copperHelmet, REFERENCE.MODID + copperHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperChestplate,
				REFERENCE.MODID + copperChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperLeggings, REFERENCE.MODID + copperLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperBoots, REFERENCE.MODID + copperBoots.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(steelHelmet, REFERENCE.MODID + steelHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelChestplate, REFERENCE.MODID + steelChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelLeggings, REFERENCE.MODID + steelLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelBoots, REFERENCE.MODID + steelBoots.getUnlocalizedName().substring(5));

	}
}
