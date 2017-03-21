package scmc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.UniversalBucket;
import scmc.blocks.metablocks.ModMetaBlocks;
import scmc.fluids.ModFluids;
import scmc.items.ModItems;
import scmc.tools.ModTools;
import scmc.weapons.ModWeapons;

public class CreativeTab {

	//TODO: fix (do we still have to fix this, or is it already?)
	public static CreativeTabs tabStarcraftBuildingBlocks = new CreativeTabs("StarcraftBuildingBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL);
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
