package net.bvanseghi.starcraft.weapons;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSword;

public class WeaponPsiBlade extends ItemSword {

	EntityPlayer player;
	public static final String name = "psiBlade";

	public WeaponPsiBlade(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + name);
		this.setTextureName(REFERENCE.Texture_Path + name);

	}
	
	

}
