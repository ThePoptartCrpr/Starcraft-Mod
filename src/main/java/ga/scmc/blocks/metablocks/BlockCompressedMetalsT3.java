package ga.scmc.blocks.metablocks;

import java.util.List;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.blocks.metablocks.EnumHandler.CompressedMetalType;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/metablocks/BlockCompressedMetalsT3.java
=======
import scmc.blocks.ModBlocks;
import scmc.blocks.metablocks.EnumHandler.CompressedMetalType;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/metablocks/BlockCompressedMetalsT3.java

/**
 * This block has three variants. Refer to {@link CompressedMetalType}
 */
public class BlockCompressedMetalsT3 extends ModBlocks implements IMetaBlockName {

	/** The type property */
	public static final PropertyEnum<CompressedMetalType> TYPE = PropertyEnum.create("type", CompressedMetalType.class);

	/**
	 * Default constructor
	 * @param unlocalizedName The block's unlocalized name
	 * @param registryName The block's registry name - defaultly the unlocalized
	 * name
	 */
	public BlockCompressedMetalsT3(String unlocalizedName, String registryName) {
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		setHardness(20); // Sets how hard the block is to break
		setResistance(20); // Sets the blocks blast resistance to explosions
		setDefaultState(blockState.getBaseState().withProperty(TYPE, CompressedMetalType.COPPER));
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
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
		CompressedMetalType type = state.getValue(TYPE);
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
		return CompressedMetalType.values()[stack.getItemDamage()].getName();
	}

	/**
	 * Gets the correct {@link IBlockState} from the meta data
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, CompressedMetalType.values()[meta]);
	}

	/**
	 * All the different item variants for the block
	 */
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < CompressedMetalType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

}