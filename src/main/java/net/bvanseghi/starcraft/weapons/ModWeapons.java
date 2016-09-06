package net.bvanseghi.starcraft.weapons;

import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWeapons {

	// Tool Materials, harvest level, maxUses, efficiency, damage
	// (added), enchantability

	public static final ToolMaterial PSIBLADE = EnumHelper.addToolMaterial("PSIBLADE", 0, 150, 9.5F, 4.0F, 0);
	public static final ToolMaterial WARPBLADE = EnumHelper.addToolMaterial("WARPBLADE", 0, 250, 9.5F, 18.5F, 0);
	public static final ToolMaterial MASTERPSIBLADE = EnumHelper.addToolMaterial("MASTERPSIBLADE", 0, 500, 9.5F, 38.5F,
			0);

	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);

	public static final ToolMaterial GUN = EnumHelper.addToolMaterial("GUN", 0, 0, 9.5F, -3.0F, 0);

	// Weapons

	public static Item psiBlade;
	public static Item darkPsiBlade;

	public static Item warpBlade;
	public static Item darkWarpBlade;

	public static Item masterPsiBlade;

	public static Item titaniumSword;
	public static Item copperSword;
	public static Item steelSword;

	public static void preInit() {

		psiBlade = new WeaponPsiBlade(PSIBLADE);
		darkPsiBlade = new WeaponDarkPsiBlade(PSIBLADE);

		warpBlade = new WeaponWarpBlade(WARPBLADE);
		darkWarpBlade = new WeaponDarkWarpBlade(WARPBLADE);

		masterPsiBlade = new WeaponMasterPsiBlade(MASTERPSIBLADE);

		titaniumSword = new WeaponTitaniumSword(TITANIUM);
		copperSword = new WeaponCopperSword(COPPER);
		steelSword = new WeaponSteelSword(STEEL);

		GameRegistry.registerItem(psiBlade, REFERENCE.MODID + psiBlade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(darkPsiBlade, REFERENCE.MODID + darkPsiBlade.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(warpBlade, REFERENCE.MODID + warpBlade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(darkWarpBlade, REFERENCE.MODID + darkWarpBlade.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(masterPsiBlade, REFERENCE.MODID + masterPsiBlade.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(titaniumSword, REFERENCE.MODID + titaniumSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperSword, REFERENCE.MODID + copperSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelSword, REFERENCE.MODID + steelSword.getUnlocalizedName().substring(5));

	}

	public static void init() {

	}
}