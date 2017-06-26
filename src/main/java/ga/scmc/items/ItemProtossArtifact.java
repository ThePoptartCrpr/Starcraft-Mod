package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemProtossArtifact extends ModItems {
	public ItemProtossArtifact() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_PROTOSS_ARTIFACT.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PROTOSS_ARTIFACT.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
