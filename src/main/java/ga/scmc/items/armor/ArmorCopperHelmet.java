package ga.scmc.items.armor;

import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/armor/ArmorCopperHelmet.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/armor/ArmorCopperHelmet.java

public class ArmorCopperHelmet extends ItemArmor {

	public ArmorCopperHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_HELMET.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
