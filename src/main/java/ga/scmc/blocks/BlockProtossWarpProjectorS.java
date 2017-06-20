package ga.scmc.blocks;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Protoss Shakuras Warp Projector block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockProtossWarpProjectorS extends ModBlocks {

	public BlockProtossWarpProjectorS() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_WARP_PROJECTOR_S.getRegistryRL());
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	/**
	 * Executes the following code when the block is right clicked by a player
	 * @param world the world
	 * @param pos the position of the block
	 * @param state the state of the block
	 * @param player the player activating the block
	 * @param hand the hand the player hit the block with
	 * @param stack the stack in the player's hand when they hit the block
	 * @param side the side the player hit
	 * @param hitX the X coordinate of the exact location from which the block
	 * was activated
	 * @param hitY the Y coordinate of the exact location from which the block
	 * was activated
	 * @param hitZ the Z coordinate of the exact location from which the block
	 * was activated
	 */
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack stack, EnumFacing side, float hitX, float hitY,
			float hitZ) {
		world.setBlockState(new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ()), ModBlocks.WARPGATE_WORMHOLE_SHAKURAS.getDefaultState(), 3);
		return true;
	}
}
