package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStarcraftOres extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon[] texture;

	/**
	 * 0, 1, 2, 3, 4, 5C, 6C, 7C, 8C, 9C, 10C, 11C, 12C, 13C, 14C, 15C, 16S,
	 * 17S, 18S, 19S, 20S, 21S, 22S, 23S, 24S, 25S 26S
	 */
	public static final String[] subBlocks = new String[] { "Mineral", "RichMineral", "Alien", "Titanium", "Copper",

			// 5-15
			"CoalC", "IronC", "GoldC", "RedstoneC", "LapisC", "DiamondC", "MineralC", "RichMineralC", "AlienC",
			"TitaniumC", "CopperC" };

	public BlockStarcraftOres() {
		super(Material.rock);
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {

		texture = new IIcon[subBlocks.length];

		for (int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "ore" + subBlocks[i]);
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
	
	public Item getItemDropped(int meta, Random p_149650_2_, int p_149650_3_)
    {
		if(meta == 0){
			return ModItems.mineralShard;
		}else if(meta == 1){
			return ModItems.richMineralShard;
		}else if(meta == 5){
			return Items.coal;
		}else if(meta == 8){
			return Items.redstone;
		}else if(meta == 9){
			return Items.dye;
		}else if(meta == 10){
			return Items.diamond;
		}else if(meta == 11){
			return ModItems.mineralShard;
		}else if(meta == 12){
			return ModItems.richMineralShard;
		}
		return Item.getItemFromBlock(this);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
	public int quantityDropped(int meta, int fortune, Random random)
    {
		if(meta == 0 || meta == 1 || meta == 9 || meta == 11 || meta == 12) {
			return 4 + random.nextInt(4);
		}else if(meta == 8) {
			return 4 + random.nextInt(1);
		}
		return 1;
    }
    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(p_149679_2_) * (j + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
    }

    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == Blocks.coal_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }
            else if (this == Blocks.diamond_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            else if (this == Blocks.emerald_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            else if (this == Blocks.lapis_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            }
            else if (this == Blocks.quartz_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            }

            return j1;
        }
        return 0;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int meta)
    {
 
    	if(meta == 2){
    		return this == ModBlocks.ores ? 2 : 1;
    	}else if(meta == 3){
    		return this == ModBlocks.ores ? 3 : 1;
    	}else if(meta == 4){
    		return this == ModBlocks.ores ? 4 : 1;
    	}else if(meta == 6){
    		return this == ModBlocks.ores ? 6 : 1;
    	}else if(meta == 7){
    		return this == ModBlocks.ores ? 7 : 1;
    	}else if(meta == 9){
    		return this == Blocks.lapis_ore ? 4 : 4;
    	}else if(meta == 13){
    		return this == ModBlocks.ores ? 13 : 1;
    	}else if(meta == 14){
    		return this == ModBlocks.ores ? 14 : 1;
    	}else if(meta == 15){
    		return this == ModBlocks.ores ? 15 : 1;
    	}
    	return 0;
    }
}