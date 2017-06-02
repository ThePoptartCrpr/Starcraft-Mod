package scmc.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import scmc.items.ModItems;
import scmc.tileentity.TileEntityMovingLightSource;

public class BlockMovingLightSource extends ModBlocks implements ITileEntityProvider {
	public BlockMovingLightSource(Material material) {
		super(material);
	}

	public static final AxisAlignedBB FULL_BLOCK_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
	
	//This method hurts my brain oof -Spider
	//Why does this not-method need TWO GOD DAMNED CURLY BRACKETS?! -wundr
    @SuppressWarnings("serial")
	public static List<Item> lightSourceList = new ArrayList<Item>() {{
        add(Item.getItemFromBlock(Blocks.TORCH));
        add(Item.getItemFromBlock(Blocks.REDSTONE_TORCH));
        add(Item.getItemFromBlock(Blocks.REDSTONE_LAMP));
        add(Item.getItemFromBlock(Blocks.REDSTONE_BLOCK));
        add(Item.getItemFromBlock(Blocks.REDSTONE_ORE));
        add(Items.REDSTONE);
        add(Item.getItemFromBlock(Blocks.REDSTONE_WIRE));
        add(Item.getItemFromBlock(Blocks.GLOWSTONE));
        add(Items.GLOWSTONE_DUST);
        add(Item.getItemFromBlock(Blocks.LAVA));
        add(Items.LAVA_BUCKET);
        add(Item.getItemFromBlock(Blocks.LIT_REDSTONE_LAMP));
        add(Item.getItemFromBlock(Blocks.BEACON));
        add(Item.getItemFromBlock(Blocks.SEA_LANTERN));
        add(Item.getItemFromBlock(Blocks.END_PORTAL));
        add(Item.getItemFromBlock(Blocks.END_PORTAL_FRAME));
        add(ModItems.crystal);
	}};

    public BlockMovingLightSource() {
        super(Material.AIR);
        setUnlocalizedName("moving_light_source");
        setRegistryName("moving_light_source");
        setDefaultState(blockState.getBaseState());
        setTickRandomly(false);
        setLightLevel(1.0F);
    }
    
    public static boolean isLightEmittingItem(Item parItem) {
        return lightSourceList.contains(parItem);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FULL_BLOCK_AABB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return true;
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return getDefaultState();
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        return;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    @Override
    public void onNeighborChange(IBlockAccess world, BlockPos pos, BlockPos neighbor) {
    	return;
    }


    @Override
    public void onLanded(World worldIn, Entity entityIn) {
        return;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityMovingLightSource();
    }
}
