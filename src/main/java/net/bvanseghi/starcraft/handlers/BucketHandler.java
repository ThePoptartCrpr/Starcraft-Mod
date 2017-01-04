//NOTE: Code borrowed from Buildcraft.

package net.bvanseghi.starcraft.handlers;

import java.util.HashMap;
import java.util.Map;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.items.ItemAcidBucket;
import net.bvanseghi.starcraft.items.ItemBloodBucket;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BucketHandler {

	public static Item acidBucket;
	public static Item bloodBucket;
	public static Map<Block, Item> bucketMap = new HashMap<Block, Item>();

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
		acidBucket = new ItemAcidBucket(ModBlocks.FLUID_ACID);
		acidBucket.setRegistryName(new ResourceLocation(Reference.MODID + ":acid_bucket"));
		acidBucket.setUnlocalizedName("acidBucket").setContainerItem(Items.BUCKET);
		FluidContainerRegistry.registerFluidContainer(ModFluids.acid, new ItemStack(acidBucket)); //TODO: use ItemFluidContainer for this class
		
		bucketMap.put(ModBlocks.FLUID_ACID, acidBucket);
		MinecraftForge.EVENT_BUS.register(bucketMap);

	}

	public static void initBBucket() {
		bloodBucket = new ItemBloodBucket(ModBlocks.FLUID_BLOOD);
		bloodBucket.setRegistryName(new ResourceLocation(Reference.MODID + ":blood_bucket"));
		bloodBucket.setUnlocalizedName("bloodBucket").setContainerItem(Items.BUCKET);
		FluidContainerRegistry.registerFluidContainer(ModFluids.blood, new ItemStack(bloodBucket)); //TODO: see above
		
		bucketMap.put(ModBlocks.FLUID_BLOOD, bloodBucket);
		MinecraftForge.EVENT_BUS.register(bucketMap);
	}
}
