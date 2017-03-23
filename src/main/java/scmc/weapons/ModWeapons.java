package scmc.weapons;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.CreativeTab;
import scmc.lib.LogHelper;
import scmc.lib.Reference;

public class ModWeapons {
	
	public static final ToolMaterial PSIBLADE = EnumHelper.addToolMaterial("PSIBLADE", 0, 150, 9.5F, 4.0F, 0);
	public static final ToolMaterial WARPBLADE = EnumHelper.addToolMaterial("WARPBLADE", 0, 250, 9.5F, 18.5F, 0);
//	public static final ToolMaterial DUALWARPBLADE = EnumHelper.addToolMaterial("DUALWARPBLADE", 0, 500, 9.5F, 18.5F, 0);
	public static final ToolMaterial MASTERPSIBLADE = EnumHelper.addToolMaterial("MASTERPSIBLADE", 0, 750, 9.5F, 38.5F, 0);

	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);

	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);

	public static final ToolMaterial GUN = EnumHelper.addToolMaterial("GUN", 0, 0, 9.5F, -3.0F, 0);
	
	
	public static Item PSI_BLADE;
	public static Item DARK_PSI_BLADE;

	public static Item WARP_BLADE;
	public static Item DARK_WARP_BLADE;
//	public static Item darkDualWarpBlade;

	public static Item MASTER_PSI_BLADE;

	public static Item TITANIUM_SWORD;
	public static Item COPPER_SWORD;
	public static Item STEEL_SWORD;
	
	public static void init() {
		PSI_BLADE = new WeaponPsiBlade(PSIBLADE, "psi_blade");
		DARK_PSI_BLADE = new WeaponDarkPsiBlade(PSIBLADE, "dark_psi_blade");
		
		WARP_BLADE = new WeaponWarpBlade(WARPBLADE, "warp_blade");
		DARK_WARP_BLADE = new WeaponDarkWarpBlade(WARPBLADE, "dark_warp_blade");
		
		MASTER_PSI_BLADE = new WeaponMasterPsiBlade(MASTERPSIBLADE, "master_warp_blade");
		
		COPPER_SWORD = new WeaponCopperSword(COPPER, "copper_sword");
		TITANIUM_SWORD = new WeaponTitaniumSword(TITANIUM, "titanium_sword");
		STEEL_SWORD = new WeaponSteelSword(STEEL, "steel_sword");
	}

	public static void register() {
		registerItem(PSI_BLADE);
		registerItem(DARK_PSI_BLADE);
		
		registerItem(WARP_BLADE);
		registerItem(DARK_WARP_BLADE);
		
		registerItem(MASTER_PSI_BLADE);
		
		registerItem(COPPER_SWORD);
		registerItem(TITANIUM_SWORD);
		registerItem(STEEL_SWORD);
	}
	
	public static void registerRenders() {
		registerRender(PSI_BLADE);
		registerRender(DARK_PSI_BLADE);
		
		registerRender(WARP_BLADE);
		registerRender(DARK_WARP_BLADE);

		registerRender(MASTER_PSI_BLADE);
		
		registerRender(COPPER_SWORD);
		registerRender(TITANIUM_SWORD);
		registerRender(STEEL_SWORD);
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