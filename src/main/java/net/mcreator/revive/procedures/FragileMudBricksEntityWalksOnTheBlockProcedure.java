package net.mcreator.revive.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.revive.ReviveMod;

public class FragileMudBricksEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ReviveMod.queueServerWork(10, () -> {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		});
	}
}
