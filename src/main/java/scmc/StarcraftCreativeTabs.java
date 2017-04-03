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

public class StarcraftCreativeTabs {

	//TODO: fix (do we still have to fix this, or is it already?)
	public static final CreativeTabs BUILDING = new CreativeTabs("StarcraftBuildingBlocks") {
		
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T1);
		}
	};
	
	public static final CreativeTabs DECORATION = new CreativeTabs("StarcraftDecorativeBlocks") {
		
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModMetaBlocks.DYED_IRON);
		}
	};

	public static final CreativeTabs MATERIALS = new CreativeTabs("StarcraftMaterials") {
		
		@Override
		public Item getTabIconItem() {
			return ModItems.energy;
		}
	};

	public static final CreativeTabs TOOLS = new CreativeTabs("StarcraftTools") {
		
		@Override
		public Item getTabIconItem() {
			return ModTools.TITANIUM_PICKAXE;
		}
	};

	public static final CreativeTabs COMBAT = new CreativeTabs("StarcraftCombat") {
		
		@Override
		public Item getTabIconItem() {
			return ModWeapons.MASTER_PSI_BLADE;
		}
	};

	public static CreativeTabs MISCELLANEOUS; //Not final due to the specified set time
	
	/**
	 * Used to set the miscellaneous menu <em>after</em>
	 * we do all the bucket stuff
	 */
	public static void setMisc() {
		MISCELLANEOUS = new CreativeTabs("StarcraftMisc") {
			
			@Override
			public Item getTabIconItem() {
				return UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, ModFluids.acid).getItem();
			}
		};
	}
}
