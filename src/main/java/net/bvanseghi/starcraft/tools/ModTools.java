package net.bvanseghi.starcraft.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools {

	// Tool Materials, has name, harvest level, maxUses, efficiency, damage
	// (added), enchantability
	
	public static final ToolMaterial BLUEMINERAL = EnumHelper.addToolMaterial("BLUEMINERAL", 2, 288, 4.7F, 1.5F, 10);
	public static final ToolMaterial ORANGEMINERAL = EnumHelper.addToolMaterial("ORANGEMINERAL", 2, 362, 5.0F, 1.8F, 10);
	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);
	public static final ToolMaterial NEOSTEEL = EnumHelper.addToolMaterial("NEOSTEEL", 2, 867, 6.5F, 3.5F, 10);
	public static final ToolMaterial VANADIUM = EnumHelper.addToolMaterial("VANADIUM", 3, 966, 7.3F, 4.0F, 10);
	public static final ToolMaterial KERATIN = EnumHelper.addToolMaterial("KERATIN", 2, 564, 5.8F, 2.5F, 10);
	

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
	}
}
