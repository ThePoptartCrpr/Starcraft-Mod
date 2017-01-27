package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.blocks.metablocks.ModMetaBlocks;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.UniversalBucket;

public class CreativeTab {

	//TODO: fix (do we still have to fix this, or is it already?)
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
			return UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, ModFluids.acid).getItem();
		}
	};
}