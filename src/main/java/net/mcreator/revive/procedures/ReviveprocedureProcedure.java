package net.mcreator.revive.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.revive.init.ReviveModItems;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class ReviveprocedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ReviveModItems.TOTEM.get()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						(("execute if score " + StringArgumentType.getString(arguments, "name")) + "" + (" deaths matches 5 run " + "tellraw @a {\"text\":\"Someone has been revived.\",\"color\":\"aqua\"}")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						(("execute if score " + StringArgumentType.getString(arguments, "name")) + "" + ((" dearths matches 5 run " + "item replace entity ") + "" + (entity.getDisplayName().getString() + " weapon.mainhand with air"))));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						(("execute unless score " + StringArgumentType.getString(arguments, "name")) + "" + (" deaths matches 5 run " + ("tellraw " + (entity.getDisplayName().getString() + "" + " \"This player is not dead.\"")))));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						(("execute if score " + StringArgumentType.getString(arguments, "name")) + "" + (" deaths matches 5 run " + ("playsound minecraft:item.totem.use player " + entity.getDisplayName().getString()))));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						(("execute if score " + StringArgumentType.getString(arguments, "name")) + "" + (" deaths matches 5 run " + ("scoreboard players set " + (StringArgumentType.getString(arguments, "name") + " deaths 4")))));
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You need to hold a Totem of Revival for that..."), false);
		}
	}
}
