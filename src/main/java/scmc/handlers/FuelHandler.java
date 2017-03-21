package scmc.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.items.ModItems;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {

		if (fuel.getItem() == ModItems.vespene)
			return 3200;

		return 0;
	}

	public static void preInit() {
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

}
