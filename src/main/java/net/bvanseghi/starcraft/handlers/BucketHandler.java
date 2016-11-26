//NOTE: Code borrowed from Buildcraft.

package net.bvanseghi.starcraft.handlers;

import java.util.HashMap;
import java.util.Map;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.items.ItemAcidBucket;
import net.bvanseghi.starcraft.items.ItemBloodBucket;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BucketHandler {

	public static final BucketHandler INSTANCE = new BucketHandler();
	public static Item acidBucket;
	public static Item bloodBucket;
	public Map<Block, Item> bucketMap = new HashMap<Block, Item>();

	@SubscribeEvent
	public void onBucketFill(FillBucketEvent event) {
		Result result = fillCustomBucket(event.getWorld(), event.getTarget());

		if(result == null) {
			return;
		}

		event.setResult(Result.ALLOW);
	}

	//TODO: check to see if this'll work
	private Result fillCustomBucket(World world, RayTraceResult tracePos) {
		Block block = world.getBlockState(tracePos.getBlockPos()).getBlock();

		Item bucket = bucketMap.get(block);
		
		if(bucket != null && block.getMetaFromState(block.getDefaultState()) == 0) {
			world.setBlockToAir(tracePos.getBlockPos());
			return Result.ALLOW;
		} else {
			return null;
		}
	}

	public static void initABucket() {
		acidBucket = new ItemAcidBucket(ModBlocks.fluidAcid);
		acidBucket.setUnlocalizedName("acidBucket").setContainerItem(Items.BUCKET);
//		GameRegistry.registerItem(acidBucket, "acidBucket"); TODO: register this in Registry
//		FluidContainerRegistry.registerFluidContainer(ModFluids.acid, new ItemStack(acidBucket), new ItemStack(Items.bucket));
		
		BucketHandler.INSTANCE.bucketMap.put(ModBlocks.fluidAcid, acidBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

	}

	public static void initBBucket() {
		bloodBucket = new ItemBloodBucket(ModBlocks.fluidBlood);
		bloodBucket.setUnlocalizedName("bloodBucket").setContainerItem(Items.BUCKET);
//		GameRegistry.registerItem(bloodBucket, "bloodBucket"); TODO: register this in registry
//		FluidContainerRegistry.registerFluidContainer(ModFluids.blood, new ItemStack(bloodBucket), new ItemStack(Items.bucket));
		
		BucketHandler.INSTANCE.bucketMap.put(ModBlocks.fluidBlood, bloodBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
	}
}
