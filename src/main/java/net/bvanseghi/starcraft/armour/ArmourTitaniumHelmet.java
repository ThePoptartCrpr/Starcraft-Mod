package net.bvanseghi.starcraft.armour;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmourTitaniumHelmet extends ItemArmor {

	public static final String name = "titaniumHelmet";

	public ArmourTitaniumHelmet(ArmorMaterial armourMaterial, int renderIndex, int armourType) {
		super(armourMaterial, renderIndex, armourType);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + name);
		this.setTextureName(REFERENCE.Texture_Path + name);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

		return "Starcraft:textures/model/armor/titanium_layer_1.png";
	}

}
