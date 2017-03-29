package scmc.worldgen.aiur;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.worldgen.DimensionRegistry;

public class WorldProviderAiur extends WorldProvider {

	public World worldIn;
	
	@Override
	public DimensionType getDimensionType() {
		return DimensionRegistry.AIUR_DT;
	}
	
	@Override
	public boolean canCoordinateBeSpawn(int par1, int par2) {
		return true;
	}
	
	@Override
	public boolean canRespawnHere() {
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean doesXZShowFog(int par1, int par2) {
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float par1, float par2) {
		return new Vec3d(0.6D, 0.5D, 0.7D);
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderAiur(worldObj);
	}
	
}
