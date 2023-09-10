package net.mcreator.revive.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class CheeseRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 2000);
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel((int) (5 + (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)));
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("You have been fed cheese, your hunger has been replenished. "), false);
	}
}
