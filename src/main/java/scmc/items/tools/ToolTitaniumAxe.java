package scmc.items.tools;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import scmc.lib.Reference;

public class ToolTitaniumAxe extends ItemAxe {

	public ToolTitaniumAxe(ToolMaterial material) {
		super(material, 8, -3.1f);
		this.setUnlocalizedName(Reference.ModItems.TOOL_TITANIUM_AXE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_TITANIUM_AXE.getRegistryRL());
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	}
}