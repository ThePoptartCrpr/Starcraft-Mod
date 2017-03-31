package scmc.blocks.metablocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMeta extends ItemBlock {
	
	/**
	 * Default {@link ItemBlock} constructor
	 * @param block The original block
	 */
	public ItemBlockMeta(Block block) {
		super(block);
		
		if(!(block instanceof IMetaBlockName)) { //Makes sure that the block implements IMetaBlockName
			throw new IllegalArgumentException(String.format("The given Block %s is not an instance of IMetaBlockName!", block.getUnlocalizedName()));
		}
		
		setHasSubtypes(true); //Says the block has meta data
		setMaxDamage(0);
	}
	
	/**
	 * Gets and modifies the unlocalized name
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + ((IMetaBlockName) block).getSpecialName(stack);
	}

	/**
	 * Fixes a bug with not placing the correct variant of the block
	 * THIS IS NEEDED
	 */
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
}