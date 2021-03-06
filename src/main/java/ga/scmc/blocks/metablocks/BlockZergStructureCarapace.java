package ga.scmc.blocks.metablocks;

import java.util.List;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.BlockEnumHandler.ZergStructureCarapaceType;
import ga.scmc.lib.Reference;
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

/**
 * This block has three variants. Refer to {@link ZergStructureCarapaceType}
 */
public class BlockZergStructureCarapace extends ModBlocks implements IMetaBlockName {

	/**
	 * The type property
	 */
	public static final PropertyEnum<ZergStructureCarapaceType> TYPE = PropertyEnum.create("type", ZergStructureCarapaceType.class);

	/**
	 * Default constructor
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 * name
	 */
	public BlockZergStructureCarapace() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_CARAPACE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_CARAPACE.getRegistryRL());
		setHardness(20); // Sets how hard the block is to break
		setResistance(20); // Sets the blocks blast resistance to
								// explosions
		setDefaultState(blockState.getBaseState().withProperty(TYPE, ZergStructureCarapaceType.T1)); // Default state
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	/**
	 * Adds the properties to the block
	 */
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { TYPE });
	}

	/**
	 * Makes sure the block drops the correct version of itself
	 */
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	/**
	 * Gets the right meta data from the {@link IBlockState}
	 */
	@Override
	public int getMetaFromState(IBlockState state) {
		ZergStructureCarapaceType type = state.getValue(TYPE);
		return type.getID();
	}

	/**
	 * Makes sure when you pick block it will work correctly
	 */
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
	}

	/**
	 * Inherited from the {@link IMetaBlockName}
	 */
	@Override
	public String getSpecialName(ItemStack stack) {
		return ZergStructureCarapaceType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, ZergStructureCarapaceType.values()[meta]);
	}

	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < ZergStructureCarapaceType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}
}