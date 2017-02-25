package net.bvanseghi.starcraft.blocks.metablocks;

import java.util.List;

import net.bvanseghi.starcraft.blocks.metablocks.EnumHandler.CompressedMetalTier1Type;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * This block has three variants. Refer to {@link CompressedMetalTier1Type}
 * 
 */
public class BlockCompressedMetals extends Block implements IMetaBlockName {

	/** The type property */
	public static final PropertyEnum<CompressedMetalTier1Type> TYPE = PropertyEnum.create("type", CompressedMetalTier1Type.class);
	
	/**
	 * Default constructor
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized name
	 */
	public BlockCompressedMetals(String unlocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		this.setHardness(20); //Sets how hard the block is to break
		this.setResistance(20); //Sets the blocks blast resitance to explosions
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, CompressedMetalTier1Type.COPPER)); //Default state
	}
	
	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < CompressedMetalTier1Type.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	/**
	 * Makes sure the block drops the correct version of itself
	 */
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	/**
	 * Makes sure when you pick block it will work correctly
	 */
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
	}
	
	/**
	 * Adds the properties to the block
	 */
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {TYPE});
	}
	
	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state) {
		CompressedMetalTier1Type type = (CompressedMetalTier1Type) state.getValue(TYPE);
		return type.getID();
	}
	
	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TYPE, CompressedMetalTier1Type.values()[meta]);
	}

	/**
	 * Inherited from the {@link IMetaBlockName}
	 */
	@Override
	public String getSpecialName(ItemStack stack) {
		return CompressedMetalTier1Type.values()[stack.getItemDamage()].getName();
	}

}