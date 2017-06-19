package scmc.items.tools;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ToolSteelAxe extends ItemAxe {

	public ToolSteelAxe(ToolMaterial material) {
		super(material, 8, -3.1f);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_AXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_AXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : efficiencyOnProperMaterial;
	}
}