package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.blocks.metablocks.ModMetaBlocks;
import net.bvanseghi.starcraft.handlers.BucketHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {

	//TODO: fix
	public static CreativeTabs TabStarcraftBuildingBlocks = new CreativeTabs("StarcraftBuildingBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL);
		}
	};
	
	public static CreativeTabs TabStarcraftDecorativeBlocks = new CreativeTabs("StarcraftDecorativeBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModMetaBlocks.DYED_IRON);
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