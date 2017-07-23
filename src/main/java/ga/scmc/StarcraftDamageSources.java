package ga.scmc;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class StarcraftDamageSources extends DamageSource {

	public static DamageSource bullet = (new DamageSource("bullet")).setProjectile();
	public static DamageSource hydraNeedle = (new DamageSource("hydraneedle")).setProjectile();
	public static DamageSource acid = (new DamageSource("acid"));
	
	public StarcraftDamageSources(String damageTypeIn) {
		super(damageTypeIn);
	}
	
	public static DamageSource causeBulletDamage(Entity sourceEntity)
    {
        return (new EntityDamageSource(bullet.getDamageType(), sourceEntity)).setProjectile();
    }

	public static DamageSource causeHydraliskNeedleDamage(Entity source, @Nullable Entity indirectEntityIn)
    {
        return (new EntityDamageSource(hydraNeedle.getDamageType(), source));
    }
}