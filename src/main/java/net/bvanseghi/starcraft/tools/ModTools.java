package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTools {

	// Tool Materials, has name, harvest level, maxUses, efficiency, damage
	// (added), enchantability
	
	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);

	// Tools

	public static Item titaniumAxe;
	public static Item titaniumPickaxe;
	public static Item titaniumShovel;
	public static Item titaniumHoe;

	public static Item copperAxe;
	public static Item copperPickaxe;
	public static Item copperShovel;
	public static Item copperHoe;

	public static Item steelAxe;
	public static Item steelPickaxe;
	public static Item steelShovel;
	public static Item steelHoe;

	public static void preInit() {

		titaniumAxe = new ToolTitaniumAxe(TITANIUM);
		titaniumPickaxe = new ToolTitaniumPickaxe(TITANIUM);
		titaniumShovel = new ToolTitaniumShovel(TITANIUM);
		titaniumHoe = new ToolTitaniumHoe(TITANIUM);

		copperAxe = new ToolCopperAxe(COPPER);
		copperPickaxe = new ToolTCopperPickaxe(COPPER);
		copperShovel = new ToolCopperShovel(COPPER);
		copperHoe = new ToolCopperHoe(COPPER);

		steelAxe = new ToolSteelAxe(STEEL);
		steelPickaxe = new ToolSteelPickaxe(STEEL);
		steelShovel = new ToolSteelShovel(STEEL);
		steelHoe = new ToolSteelHoe(STEEL);

		GameRegistry.registerItem(titaniumAxe, REFERENCE.MODID + titaniumAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumPickaxe, REFERENCE.MODID + titaniumPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumShovel, REFERENCE.MODID + titaniumShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumHoe, REFERENCE.MODID + titaniumHoe.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(copperAxe, REFERENCE.MODID + copperAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperPickaxe, REFERENCE.MODID + copperPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperShovel, REFERENCE.MODID + copperShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperHoe, REFERENCE.MODID + copperHoe.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(steelAxe, REFERENCE.MODID + steelAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelPickaxe, REFERENCE.MODID + steelPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelShovel, REFERENCE.MODID + steelShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelHoe, REFERENCE.MODID + steelHoe.getUnlocalizedName().substring(5));
	}

	public static void init() {

	}
}