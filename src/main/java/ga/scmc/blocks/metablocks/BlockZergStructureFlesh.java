package ga.scmc.blocks.metablocks;

import java.util.List;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.blocks.metablocks.EnumHandler.ZergFleshType;
import ga.scmc.lib.Reference;
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
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/metablocks/BlockZergStructureFlesh.java
=======
import scmc.blocks.ModBlocks;
import scmc.blocks.metablocks.EnumHandler.ZergFleshType;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/metablocks/BlockZergStructureFlesh.java

/**
 * This block has three variants. Refer to {@link ZergFleshType}
 */
public class BlockZergStructureFlesh extends ModBlocks implements IMetaBlockName {

	/** The type property */
	public static final PropertyEnum<ZergFleshType> TYPE = PropertyEnum.create("type", ZergFleshType.class);

	/**
	 * Default constructor
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 * name
	 */
	public BlockZergStructureFlesh() {
		super(Material.CLAY);
		setSoundType(SoundType.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_FLESH.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_FLESH.getRegistryRL());
		setResistance(10.0F);
		setHardness(5.0F);
		setHarvestLevel("axe", 2);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, ZergFleshType.PURPLE)); // Default state
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
		ZergFleshType type = state.getValue(TYPE);
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
		return ZergFleshType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, ZergFleshType.values()[meta]);
	}

	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < ZergFleshType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

}