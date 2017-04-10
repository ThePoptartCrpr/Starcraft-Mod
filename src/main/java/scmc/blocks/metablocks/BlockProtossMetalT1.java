package scmc.blocks.metablocks;

import java.util.List;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import scmc.blocks.ModBlocks;
import scmc.blocks.metablocks.EnumHandler.ProtossMetalType;
import scmc.lib.Reference;

/**
 * This block has four variants. Refer to {@link ProtossMetalType}
 */
public class BlockProtossMetalT1 extends ModBlocks implements IMetaBlockName {

	/** The type property */
	public static final PropertyEnum<ProtossMetalType> TYPE = PropertyEnum.create("type", ProtossMetalType.class);
	
	/**
	 * Default constructor
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized name
	 */
	public BlockProtossMetalT1() {
		super(Material.IRON);
		this.setSoundType(SoundType.METAL);
		this.setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_METALT1.getUnlocalizedName());
		this.setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_METALT1.getRegistryRL());
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, ProtossMetalType.AIUR)); //Default state
	}
	
	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < ProtossMetalType.values().length; i++) {
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
		ProtossMetalType type = (ProtossMetalType) state.getValue(TYPE);
		return type.getID();
	}
	
	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TYPE, ProtossMetalType.values()[meta]);
	}

	/**
	 * Inherited from the {@link IMetaBlockName}
	 */
	@Override
	public String getSpecialName(ItemStack stack) {
		return ProtossMetalType.values()[stack.getItemDamage()].getName();
	}
}