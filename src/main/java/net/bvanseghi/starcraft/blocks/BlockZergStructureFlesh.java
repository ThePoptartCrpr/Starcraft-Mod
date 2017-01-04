package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockZergStructureFlesh extends Block {

	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon[] texture;

	public static final String[] subBlocks = new String[] { "Purple", "Brown", "Pink", "Blue", "Cyan", "Gray", "Green",
			"LightBlue", "Lime", "Magenta", "Orange", "Red", "Silver", "White", "Yellow" };

	public BlockZergStructureFlesh() {
		super(Material.CLAY);
		setSoundType(SoundType.GROUND);
		setResistance(10.0F);
		setHardness(5.0F);
		setHarvestLevel("axe", 2);
		this.setCreativeTab(CreativeTab.TabStarcraftDecorativeBlocks);
	}

	public Item getItemDropped(int par1, Random par2, int par3) {
		return ModItems.organicTissue;
	}

	public int quantityDropped(Random par1) {
		return 3 + par1.nextInt(3);
	}
	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {

		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}

	}

	public int damageDropped(int meta) {
		return meta;
	}
	
	
	public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state)
    {
		//double x, double y, double z, float yaw, float pitch
		
		 if (!world.isRemote)
	        {
	            EntityBroodling entitybroodling = new EntityBroodling(world);
	            entitybroodling.setLocationAndAngles(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, 0.0F, 0.0F);
	            world.spawnEntityInWorld(entitybroodling);
	            entitybroodling.spawnExplosionParticle();
	        }

	        super.onBlockDestroyedByPlayer(world, pos, state);
    }
}