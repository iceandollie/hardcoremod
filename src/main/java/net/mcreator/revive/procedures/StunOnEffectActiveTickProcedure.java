package net.mcreator.revive.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StunOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
	}
}
