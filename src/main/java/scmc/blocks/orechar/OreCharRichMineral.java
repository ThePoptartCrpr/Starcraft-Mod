package scmc.blocks.orechar;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.ModBlocks;
import scmc.items.ModItems;
import scmc.lib.Reference;

public class OreCharRichMineral extends ModBlocks {

	public OreCharRichMineral() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
		setUnlocalizedName(Reference.ModBlocks.ORE_RICHMINERAL_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_RICHMINERAL_C.getRegistryRL());
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return ModItems.richMineralShard;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(4);
	}
}
