package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.handlers.BucketHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {

	public static CreativeTabs TabStarcraftBuildingBlocks = new CreativeTabs("StarcraftBuildingBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.protossMetal);
		}
	};
	
	public static CreativeTabs TabStarcraftDecorativeBlocks = new CreativeTabs("StarcraftDecorativeBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.dyedIron);
		}
	};

	public static CreativeTabs TabStarcraftMaterials = new CreativeTabs("StarcraftMaterials") {
		@Override
		public Item getTabIconItem() {
			return ModItems.energy;
		}
	};

	public static CreativeTabs TabStarcraftTools = new CreativeTabs("StarcraftTools") {
		@Override
		public Item getTabIconItem() {
			return ModTools.titaniumPickaxe;
		}
	};

	public static CreativeTabs TabStarcraftCombat = new CreativeTabs("StarcraftCombat") {
		@Override
		public Item getTabIconItem() {
			return ModWeapons.masterPsiBlade;
		}
	};

	public static CreativeTabs TabStarcraftMisc = new CreativeTabs("StarcraftMisc") {
		@Override
		public Item getTabIconItem() {
			return BucketHandler.acidBucket;
		}
	};
}