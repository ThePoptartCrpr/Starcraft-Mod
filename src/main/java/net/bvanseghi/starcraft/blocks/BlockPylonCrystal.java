package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.bvanseghi.starcraft.CreativeTab;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPylonCrystal extends Block {
	private static final IProperty<Subblocks> SUBBLOCKS_PROPERTY = PropertyEnum.create("subblocks", Subblocks.class);
	
	public BlockPylonCrystal() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CRYSTAL.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CRYSTAL.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(20.0F);
		setLightLevel(4.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setDefaultState(blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.PURE));
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
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.DARK);
			case 2:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.VOID);
			default:
				return getDefaultState();
		}
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		String[] subblocks = new String[] {"Pure", "Dark", "Void"};
		
		for (int i = 0; i < subblocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if(rand.nextInt(9) == 0){
			return ModItems.energy;
		} else {
			return null;
		}
    }
	
	@Override
	public int damageDropped(IBlockState state) {
		if(getMetaFromState(state) == 0) {
			return this == ModBlocks.CRYSTAL ? 0 : 0;
		}else if(getMetaFromState(state) == 1) {
			return this == ModBlocks.CRYSTAL ? 1 : 0;
		}else if(getMetaFromState(state) == 2) {
			return this == ModBlocks.CRYSTAL ? 2 : 0;
		} else {
			return 0;
		}
    }
	
	private enum Subblocks implements IStringSerializable {
		PURE("Pure"),
		DARK("Dark"),
		VOID("Void");
		
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
