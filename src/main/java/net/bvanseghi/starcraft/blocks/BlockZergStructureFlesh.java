package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockZergStructureFlesh extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon[] texture;

	public static final String[] subBlocks = new String[] { "Purple", "Brown", "Pink", "Blue", "Cyan", "Gray", "Green",
			"LightBlue", "Lime", "Magenta", "Orange", "Red", "Silver", "White", "Yellow" };

	public BlockZergStructureFlesh() {
		super(Material.clay);
		setStepSound(soundTypeGravel);
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

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {

		texture = new IIcon[subBlocks.length];

		for (int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "zergStrucFlesh" + subBlocks[i]);
		}
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {

		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}

	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return texture[meta];
	}

	public int damageDropped(int meta) {
		return meta;
	}
	
	public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_)
    {
        if (!p_149664_1_.isRemote)
        {
            EntityBroodling entitybroodling = new EntityBroodling(p_149664_1_);
            entitybroodling.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
            p_149664_1_.spawnEntityInWorld(entitybroodling);
            entitybroodling.spawnExplosionParticle();
        }

        super.onBlockDestroyedByPlayer(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
    }
}