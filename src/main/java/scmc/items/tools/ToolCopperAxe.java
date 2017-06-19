package scmc.items.tools;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ToolCopperAxe extends ItemAxe {

	public ToolCopperAxe(ToolMaterial material) {
		super(material, 8, -3.1f);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_AXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_AXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : efficiencyOnProperMaterial;
	}
}