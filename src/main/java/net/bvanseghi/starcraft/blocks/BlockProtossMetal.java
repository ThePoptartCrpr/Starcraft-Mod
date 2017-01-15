package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.IMetaBlockName;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
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
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Copyright 2017 the Starcraft Minecraft mod team
public class BlockProtossMetal extends Block implements IMetaBlockName {
	private static final IProperty<Subblocks> SUBBLOCKS_PROPERTY = PropertyEnum.create("subblocks", Subblocks.class);
	
	public BlockProtossMetal() {
		super(Material.IRON);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_METAL.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_METAL.getRegistryRL());
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setDefaultState(blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.AIUR));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, SUBBLOCKS_PROPERTY);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		for(int i = 0; i < 4; i++) {
			if(state.equals(getStateFromMeta(i))) {
				return i;
			}
		}
		
		return 0;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		switch(meta) {
			default:
				return getDefaultState();
			case 1:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.DARK);
			case 2:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.BLUE);
			case 3:
				return blockState.getBaseState().withProperty(SUBBLOCKS_PROPERTY, Subblocks.GREEN);
		}
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		String[] subblocks = new String[] {"aiur", "dark", "blue", "green"};
		
		for (int i = 0; i < subblocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		switch(stack.getItemDamage()) {
			default:
				return "aiur";
			case 1:
				return "dark";
			case 2:
				return "blue";
			case 3:
				return "green";
		}
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
	    return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
	}
	
	private enum Subblocks implements IStringSerializable {
		AIUR("aiur"),
		DARK("dark"),
		BLUE("blue"),
		GREEN("green");
		
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
