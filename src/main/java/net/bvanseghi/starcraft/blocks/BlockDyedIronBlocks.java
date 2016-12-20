package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDyedIronBlocks extends Block {

	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon[] texture;

	public static final String[] subBlocks = new String[] {"Blue", "Black", "Brown", "Cyan", "Gray", "Green",
			"LightBlue", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "Silver", "Yellow"};

	public BlockDyedIronBlocks() {
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTab.TabStarcraftDecorativeBlocks);
	}

	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {

		texture = new IIcon[subBlocks.length];

		for (int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "dyedIron" + subBlocks[i]);
		}
	}*/

	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}

	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return texture[meta];
	}*/

	public int damageDropped(int meta) {
		return meta;
	}
}
