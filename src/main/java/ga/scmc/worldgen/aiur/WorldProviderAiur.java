package ga.scmc.worldgen.aiur;

import ga.scmc.worldgen.DimensionRegistry;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderAiur extends WorldProvider {

	public World worldIn;

	@Override
	public boolean canCoordinateBeSpawn(int par1, int par2) {
		return true;
	}

	@Override
	public boolean canRespawnHere() {
		return true;
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderAiur(worldObj);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean doesXZShowFog(int par1, int par2) {
		return false;
	}

//	@Override
//	public DimensionType getDimensionType() {
//		return DimensionRegistry.AIUR_DT;
//	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float par1, float par2) {
		return new Vec3d(0.6D, 0.5D, 0.7D);
	}

	@Override
	public DimensionType getDimensionType() {
		// TODO Auto-generated method stub
		return null;
	}

}
