package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockProtossWarpProjectorS extends ModBlocks {
	public BlockProtossWarpProjectorS() {
		super(Material.ROCK);
		setRegistryName(new ResourceLocation(Reference.RL_BASE + "protoss_warp_proj_s"));
		setUnlocalizedName(Reference.UN_BASE + "protossWarpProjS");
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack stack, EnumFacing side, float hitX, float hitY, float hitZ) {
		world.setBlockState(new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ()), ModBlocks.warpGateWormholeShakuras.getDefaultState(), 3);
        return true;
    }
}
