package ga.scmc.items.armor;

import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/armor/ArmorZergBootsT2.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/armor/ArmorZergBootsT2.java

public class ArmorZergBootsT2 extends ItemArmor {

	public ArmorZergBootsT2(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_BOOTS_T2.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_BOOTS_T2.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
