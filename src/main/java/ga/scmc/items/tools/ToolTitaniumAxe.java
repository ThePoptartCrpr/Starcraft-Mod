package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolTitaniumAxe extends ItemAxe {

	public ToolTitaniumAxe(ToolMaterial material) {
		super(material, 8, -3.1f);
		setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_AXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_TITANIUM_AXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : efficiencyOnProperMaterial;
	}
}