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
	public static CreativeTabs tabStarcraftBuildingBlocks = new CreativeTabs("StarcraftBuildingBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T1);
		}
	};
	
	public static CreativeTabs tabStarcraftDecorativeBlocks = new CreativeTabs("StarcraftDecorativeBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModMetaBlocks.DYED_IRON);
		}
	};

	public static CreativeTabs tabStarcraftMaterials = new CreativeTabs("StarcraftMaterials") {
		@Override
		public Item getTabIconItem() {
			return ModItems.energy;
		}
	};

	public static CreativeTabs tabStarcraftTools = new CreativeTabs("StarcraftTools") {
		@Override
		public Item getTabIconItem() {
			return ModTools.TITANIUM_PICKAXE;
		}
	};

	public static CreativeTabs tabStarcraftCombat = new CreativeTabs("StarcraftCombat") {
		@Override
		public Item getTabIconItem() {
			return ModWeapons.MASTER_PSI_BLADE;
		}
	};

	public static CreativeTabs tabStarcraftMisc;
	
	/**
	 * Used to set the miscellaneous menu <em>after</em>
	 * we do all the bucket stuff
	 */
	public static void setMisc() {
		tabStarcraftMisc = new CreativeTabs("StarcraftMisc") {
			
			@Override
			public Item getTabIconItem() {
				return UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, ModFluids.acid).getItem();
			}
		};
	}
}
