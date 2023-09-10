
package net.mcreator.revive.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.revive.procedures.StunOnEffectActiveTickProcedure;

public class StunMobEffect extends MobEffect {
	public StunMobEffect() {
		super(MobEffectCategory.HARMFUL, -154);
	}

	@Override
	public String getDescriptionId() {
		return "effect.revive.stun";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StunOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
