package scmc.tools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.StarcraftCreativeTabs;
import scmc.lib.LogHelper;
import scmc.lib.Reference;

/**
 * Handles the tool registration and render
 * @author CJMinecraft
 *
 */
public class ModTools {
	
	public static final ToolMaterial BLUEMINERAL = EnumHelper.addToolMaterial("BLUEMINERAL", 2, 288, 4.7F, 1.5F, 10);
	public static final ToolMaterial ORANGEMINERAL = EnumHelper.addToolMaterial("ORANGEMINERAL", 2, 362, 5.0F, 1.8F, 10);
	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);
	public static final ToolMaterial NEOSTEEL = EnumHelper.addToolMaterial("NEOSTEEL", 2, 867, 6.5F, 3.5F, 10);
	public static final ToolMaterial VANADIUM = EnumHelper.addToolMaterial("VANADIUM", 3, 966, 7.3F, 4.0F, 10);
	public static final ToolMaterial KERATIN = EnumHelper.addToolMaterial("KERATIN", 2, 564, 5.8F, 2.5F, 10);

	public static Item TITANIUM_AXE;
	public static Item TITANIUM_PICKAXE;
	public static Item TITANIUM_SHOVEL;
	public static Item TITANIUM_HOE;

	public static Item COPPER_AXE;
	public static Item COPPER_PICKAXE;
	public static Item COPPER_SHOVEL;
	public static Item COPPER_HOE;

	public static Item STEEL_AXE;
	public static Item STEEL_PICKAXE;
	public static Item STEEL_SHOVEL;
	public static Item STEEL_HOE;
	
	public static void init() {
		COPPER_PICKAXE = new ToolCopperPickaxe(COPPER, "copper_pickaxe");
		COPPER_AXE = new ToolCopperAxe(COPPER, "copper_axe");
		COPPER_SHOVEL = new ToolCopperShovel(COPPER, "copper_shovel");
		COPPER_HOE = new ToolCopperHoe(COPPER, "copper_hoe");
		
		TITANIUM_PICKAXE = new ToolTitaniumPickaxe(TITANIUM, "titanium_pickaxe");
		TITANIUM_AXE = new ToolTitaniumAxe(TITANIUM, "titanium_axe");
		TITANIUM_SHOVEL = new ToolTitaniumShovel(TITANIUM, "titanium_shovel");
		TITANIUM_HOE = new ToolTitaniumHoe(TITANIUM, "titanium_hoe");
		
		STEEL_PICKAXE = new ToolSteelPickaxe(STEEL, "steel_pickaxe");
		STEEL_AXE = new ToolSteelAxe(STEEL, "steel_axe");
		STEEL_SHOVEL = new ToolSteelShovel(STEEL, "steel_shovel");
		STEEL_HOE = new ToolSteelHoe(STEEL, "steel_hoe");
	}
	
	public static void register() {
		registerItem(COPPER_PICKAXE);
		registerItem(COPPER_AXE);
		registerItem(COPPER_SHOVEL);
		registerItem(COPPER_HOE);
		
		registerItem(TITANIUM_PICKAXE);
		registerItem(TITANIUM_AXE);
		registerItem(TITANIUM_SHOVEL);
		registerItem(TITANIUM_HOE);
		
		registerItem(STEEL_PICKAXE);
		registerItem(STEEL_AXE);
		registerItem(STEEL_SHOVEL);
		registerItem(STEEL_HOE);
	}
	
	public static void registerRenders() {
		registerRender(COPPER_PICKAXE);
		registerRender(COPPER_AXE);
		registerRender(COPPER_SHOVEL);
		registerRender(COPPER_HOE);
		
		registerRender(TITANIUM_PICKAXE);
		registerRender(TITANIUM_AXE);
		registerRender(TITANIUM_SHOVEL);
		registerRender(TITANIUM_HOE);
		
		registerRender(STEEL_PICKAXE);
		registerRender(STEEL_AXE);
		registerRender(STEEL_SHOVEL);
		registerRender(STEEL_HOE);
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(StarcraftCreativeTabs.TOOLS);
		GameRegistry.register(item);
		LogHelper.logger.info("Registered item: " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}

=======
package scmc.items.tools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.CreativeTab;

/**
 * Handles the tool registration and render
 * @author CJMinecraft
 */
public class ModTools {
	
	public static final ToolMaterial BLUEMINERAL = EnumHelper.addToolMaterial("BLUEMINERAL", 2, 288, 4.7F, 1.5F, 10);
	public static final ToolMaterial ORANGEMINERAL = EnumHelper.addToolMaterial("ORANGEMINERAL", 2, 362, 5.0F, 1.8F, 10);
	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);
	public static final ToolMaterial NEOSTEEL = EnumHelper.addToolMaterial("NEOSTEEL", 2, 867, 6.5F, 3.5F, 10);
	public static final ToolMaterial VANADIUM = EnumHelper.addToolMaterial("VANADIUM", 3, 966, 7.3F, 4.0F, 10);
	public static final ToolMaterial KERATIN = EnumHelper.addToolMaterial("KERATIN", 2, 564, 5.8F, 2.5F, 10);

	public static Item TITANIUM_AXE;
	public static Item TITANIUM_PICKAXE;
	public static Item TITANIUM_SHOVEL;
	public static Item TITANIUM_HOE;

	public static Item COPPER_AXE;
	public static Item COPPER_PICKAXE;
	public static Item COPPER_SHOVEL;
	public static Item COPPER_HOE;

	public static Item STEEL_AXE;
	public static Item STEEL_PICKAXE;
	public static Item STEEL_SHOVEL;
	public static Item STEEL_HOE;
	
	public static void init() {
		COPPER_PICKAXE = new ToolCopperPickaxe(COPPER);
		COPPER_AXE = new ToolCopperAxe(COPPER);
		COPPER_SHOVEL = new ToolCopperShovel(COPPER);
		COPPER_HOE = new ToolCopperHoe(COPPER);
		
		TITANIUM_PICKAXE = new ToolTitaniumPickaxe(TITANIUM);
		TITANIUM_AXE = new ToolTitaniumAxe(TITANIUM);
		TITANIUM_SHOVEL = new ToolTitaniumShovel(TITANIUM);
		TITANIUM_HOE = new ToolTitaniumHoe(TITANIUM);
		
		STEEL_PICKAXE = new ToolSteelPickaxe(STEEL);
		STEEL_AXE = new ToolSteelAxe(STEEL);
		STEEL_SHOVEL = new ToolSteelShovel(STEEL);
		STEEL_HOE = new ToolSteelHoe(STEEL);
	}
	
	public static void register() {
		registerItem(COPPER_PICKAXE);
		registerItem(COPPER_AXE);
		registerItem(COPPER_SHOVEL);
		registerItem(COPPER_HOE);
		
		registerItem(TITANIUM_PICKAXE);
		registerItem(TITANIUM_AXE);
		registerItem(TITANIUM_SHOVEL);
		registerItem(TITANIUM_HOE);
		
		registerItem(STEEL_PICKAXE);
		registerItem(STEEL_AXE);
		registerItem(STEEL_SHOVEL);
		registerItem(STEEL_HOE);
	}
	
	public static void registerRenders() {
		registerRender(COPPER_PICKAXE);
		registerRender(COPPER_AXE);
		registerRender(COPPER_SHOVEL);
		registerRender(COPPER_HOE);
		
		registerRender(TITANIUM_PICKAXE);
		registerRender(TITANIUM_AXE);
		registerRender(TITANIUM_SHOVEL);
		registerRender(TITANIUM_HOE);
		
		registerRender(STEEL_PICKAXE);
		registerRender(STEEL_AXE);
		registerRender(STEEL_SHOVEL);
		registerRender(STEEL_HOE);
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(CreativeTab.tabStarcraftTools);
		GameRegistry.register(item);
//		LogHelper.logger.info("Registered item: " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//		LogHelper.logger.info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}