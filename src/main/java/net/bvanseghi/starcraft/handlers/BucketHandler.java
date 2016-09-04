//NOTE: Code borrowed from Buildcraft.

package net.bvanseghi.starcraft.handlers;

import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.items.ItemAcidBucket;
import net.bvanseghi.starcraft.items.ItemBloodBucket;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class BucketHandler {

	public static BucketHandler INSTANCE = new BucketHandler();
	public Map<Block, Item> buckets = new HashMap<Block, Item>();

	private BucketHandler() {
	}

	@SubscribeEvent
	public void onBucketFill(FillBucketEvent event) {

		ItemStack result = fillCustomBucket(event.world, event.target);

		if (result == null)
			return;

		event.result = result;
		event.setResult(Result.ALLOW);
	}

	private ItemStack fillCustomBucket(World world, MovingObjectPosition pos) {

		Block block = world.getBlock(pos.blockX, pos.blockY, pos.blockZ);

		Item bucket = buckets.get(block);
		if (bucket != null && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0) {
			world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
			return new ItemStack(bucket);
		} else
			return null;

	}

	public static Item acidBucket;
	public static Item bloodBucket;

	public static void initABucket() {
		acidBucket = new ItemAcidBucket(ModBlocks.fluidAcid);
		acidBucket.setUnlocalizedName("acidBucket").setContainerItem(Items.bucket);
		GameRegistry.registerItem(acidBucket, "acidBucket");
		FluidContainerRegistry.registerFluidContainer(ModFluids.acid, new ItemStack(acidBucket),
				new ItemStack(Items.bucket));

		BucketHandler.INSTANCE.buckets.put(ModBlocks.fluidAcid, acidBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

	}

	public static void initBBucket() {
		bloodBucket = new ItemBloodBucket(ModBlocks.fluidBlood);
		bloodBucket.setUnlocalizedName("bloodBucket").setContainerItem(Items.bucket);
		GameRegistry.registerItem(bloodBucket, "bloodBucket");
		FluidContainerRegistry.registerFluidContainer(ModFluids.blood, new ItemStack(bloodBucket),
				new ItemStack(Items.bucket));

		BucketHandler.INSTANCE.buckets.put(ModBlocks.fluidBlood, bloodBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
	}
}