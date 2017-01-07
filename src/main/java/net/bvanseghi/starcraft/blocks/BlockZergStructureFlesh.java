package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.items.ModItems;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockZergStructureFlesh extends Block {
	private static final IProperty<Subblocks> SUBBLOCKS_PROPERTY = PropertyEnum.create("subblocks", Subblocks.class);
	
	public BlockZergStructureFlesh() {
		super(Material.CLAY);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_FLESH.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_FLESH.getRegistryRL());
		setSoundType(SoundType.GROUND);
		setResistance(10.0F);
		setHardness(5.0F);
		setHarvestLevel("axe", 2);
		setCreativeTab(CreativeTab.TabStarcraftDecorativeBlocks);
		setDefaultState(blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.PURPLE));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, SUBBLOCKS_PROPERTY);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		for(int i = 0; i < 15; i++) {
			if(state.equals(getStateFromMeta(i))) {
				return i;
			}
		}
		
		return 0; //Failsafe; shouldn't run
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		switch(meta) {
			case 0:
				return getDefaultState();
			case 1:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.BROWN);
			case 2:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.PINK);
			case 3:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.BLUE);
			case 4:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.CYAN);
			case 5:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.GRAY);
			case 6:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.GREEN);
			case 7:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.LIGHT_BLUE);
			case 8:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.LIME);
			case 9:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.MAGENTA);
			case 10:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.ORANGE);
			case 11:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.RED);
			case 12:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.SILVER);
			case 13:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.WHITE);
			case 14:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.YELLOW);
			default:
				return getDefaultState();
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.organicTissue;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 3 + rand.nextInt(3);
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		String[] subblocks = new String[] {"Purple", "Brown", "Pink", "Blue", "Cyan", "Gray", "Green", "LightBlue", "Lime", "Magenta", "Orange", "Red", "Silver", "White", "Yellow"};
		
		for (int i = 0; i < subblocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
		if(!world.isRemote) {
			EntityBroodling entitybroodling = new EntityBroodling(world);
			entitybroodling.setLocationAndAngles(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, 0.0F, 0.0F);
			world.spawnEntityInWorld(entitybroodling);
			entitybroodling.spawnExplosionParticle();
		}
		
		super.onBlockDestroyedByPlayer(world, pos, state);
    }
	
	private enum Subblocks implements IStringSerializable {
		PURPLE("Purple"),
		BROWN("Brown"),
		PINK("Pink"),
		BLUE("Blue"),
		CYAN("Cyan"),
		GRAY("Gray"),
		GREEN("Green"),
		LIGHT_BLUE("LightBlue"),
		LIME("Lime"),
		MAGENTA("Magenta"),
		ORANGE("Orange"),
		RED("Red"),
		SILVER("Silver"),
		WHITE("White"),
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
