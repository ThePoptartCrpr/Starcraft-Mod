package ga.scmc.handlers;

import ga.scmc.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FuelHandler implements IFuelHandler {

	public static void preInit() {
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	@Override
	public int getBurnTime(ItemStack fuel) {

		if(fuel.getItem() == ModItems.VESPENE)
			return 3200;

		return 0;
	}

}