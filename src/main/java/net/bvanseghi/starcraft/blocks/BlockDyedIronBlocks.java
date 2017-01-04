package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDyedIronBlocks extends Block {
	private static final IProperty<Subblocks> SUBBLOCKS_PROPERTY = PropertyEnum.create("subblocks", Subblocks.class);

	public BlockDyedIronBlocks() {
		super(Material.IRON);
		setRegistryName(new ResourceLocation(Reference.RL_BASE + "dyed_iron"));
		setUnlocalizedName(Reference.UN_BASE + "dyedIron");
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTab.TabStarcraftDecorativeBlocks);
		setDefaultState(blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.BLACK));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, SUBBLOCKS_PROPERTY);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		for(int i = 0; i < 14; i++) {
			if(state.equals(getStateFromMeta(i))) {
				return i;
			}
		}
		
		return 0;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		switch(meta) {
			case 0:
				return getDefaultState();
			case 1:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.BLACK);
			case 2:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.BROWN);
			case 3:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.GRAY);
			case 4:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.GREEN);
			case 5:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.LIGHT_BLUE);
			case 6:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.LIME);
			case 7:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.MAGENTA);
			case 8:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.ORANGE);
			case 9:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.PINK);
			case 10:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.PURPLE);
			case 11:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.RED);
			case 12:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.SILVER);
			case 13:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.YELLOW);
			default:
				return getDefaultState();
		}
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		String[] subblocks = new String[] {"Blue", "Black", "Brown", "Cyan", "Gray", "Green", "LightBlue", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "Silver", "Yellow"};
		
		for (int i = 0; i < subblocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	private enum Subblocks implements IStringSerializable {
		BLUE("Blue"),
		BLACK("Black"),
		BROWN("Cyan"),
		GRAY("Gray"),
		GREEN("Green"),
		LIGHT_BLUE("LightBlue"),
		LIME("Lime"),
		MAGENTA("Magenta"),
		ORANGE("Orange"),
		PINK("Pink"),
		PURPLE("Purple"),
		RED("Red"),
		SILVER("Silver"),
		YELLOW("Yellow");
		
		private String name;
		
		private Subblocks(String name) {
			this.name = name;
		}
		
		@Override
		public String getName() {
			return name;
		}
	}
}
