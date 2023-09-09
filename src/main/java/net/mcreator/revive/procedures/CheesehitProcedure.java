package net.mcreator.revive.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class CheesehitProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setCustomName(Component.literal("wda=ijniw"));
	}
}
