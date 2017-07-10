package ga.scmc.handlers;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

/**
 * A class for neat egg morphing functions
 * @author Hypeirochus
 *
 */
public class ZergEggMorphingHandler {
	
	/**
	 * allows us to call an instance of this class
	 */
	public ZergEggMorphingHandler instance;
	/**
	 * Random object to use
	 */
	Random rand = new Random();
	/**
	 * used in determining what a Zerg egg will morph into
	 */
	public int morphKey;
	
	/**
	 * This generates a morph key, which predetermines what Zerg our egg will morph into
	 * Typically, poolSize should be the # of existing Zerg mobs - 1 for generic zerg eggs
	 * @param poolSize size of the pool used in rand.nextInt();
	 * @return
	 */
	public int generateRandomMorphKey(int poolSize){
		morphKey = rand.nextInt(poolSize);
		return morphKey;
	}
	
	/**
	 * gets the current morph key of an instance
	 * @return
	 */
	public int getMorphKey() {
		return morphKey;
	}
	
	/**
	 * sets the current morph key of an instance
	 * @param morphKey
	 */
	public void setMorphKey(int morphKey) {
		this.morphKey = morphKey;
	}
	
	/**
	 * checks to see if the cocoon can morph here, to avoid suffocation
	 * @param entity 
	 * @return
	 */
	public boolean canMorphHere(Entity entity) {
		BlockPos pos = new BlockPos(entity);
		
		return true;
	}
	
}
