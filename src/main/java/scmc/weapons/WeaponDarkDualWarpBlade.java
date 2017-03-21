package net.bvanseghi.starcraft.weapons;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WeaponDarkDualWarpBlade extends ItemSword {

	public static final String name = "darkDualWarpBlade";

	public WeaponDarkDualWarpBlade(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.tabStarcraftCombat);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
	
}
