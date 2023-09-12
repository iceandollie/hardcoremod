package net.mcreator.revive.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.revive.init.ReviveModItems;

public class RandomSwordRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double number = 0;
		number = Mth.nextInt(RandomSource.create(), 1, 6);
		if (number == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReviveModItems.ICESWORD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (number == 2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReviveModItems.CHEESE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (number == 3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReviveModItems.FIRE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (number == 4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReviveModItems.MUSIC.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (number == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReviveModItems.PURPLE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (number == 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReviveModItems.GRAY.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ReviveModItems.RANDOM_SWORD.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
