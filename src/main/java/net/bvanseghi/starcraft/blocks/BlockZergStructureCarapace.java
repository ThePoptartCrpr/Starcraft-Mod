package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockZergStructureCarapace extends Block {
	private static final IProperty<Subblocks> SUBBLOCKS_PROPERTY = PropertyEnum.create("subblocks", Subblocks.class);
	
	public BlockZergStructureCarapace() {
		super(Material.GROUND);
		setSoundType(SoundType.STONE);
		setResistance(20.0F);
		setHardness(5.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setDefaultState(blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.T1));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, SUBBLOCKS_PROPERTY);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		for(int i = 0; i < 3; i++) {
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
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.T2);
			case 2:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.T3);
			default:
				return getDefaultState();
		}
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		String[] subblocks = new String[] {"T1", "T2", "T3"};
		
		for(int i = 0; i < subblocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	private enum Subblocks implements IStringSerializable {
		T1,
		T2,
		T3;
		
		@Override
		public String getName() {
			return name();
		}
	}
}
