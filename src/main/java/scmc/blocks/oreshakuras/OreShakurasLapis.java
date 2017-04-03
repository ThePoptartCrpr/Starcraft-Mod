package scmc.blocks.oreshakuras;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreShakurasLapis extends ModBlocks {

	public OreShakurasLapis() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
		setUnlocalizedName(Reference.ModBlocks.ORE_LAPIS_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_LAPIS_S.getRegistryRL());
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return 4;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Items.DYE;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(4);
	}
}
