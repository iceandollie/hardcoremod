package net.mcreator.revive.procedures;

import net.minecraft.world.entity.Entity;

public class FirehitProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
