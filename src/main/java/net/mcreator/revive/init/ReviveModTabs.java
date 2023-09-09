
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.revive.ReviveMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReviveModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReviveMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(ReviveModBlocks.FRAGILE_MUD_BRICKS.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ReviveModItems.TOTEM.get());
			tabData.accept(ReviveModItems.REGULAR_SWORD.get());
			tabData.accept(ReviveModItems.GRAY.get());
			tabData.accept(ReviveModItems.ICESWORD.get());
			tabData.accept(ReviveModItems.CHEESE.get());
			tabData.accept(ReviveModItems.FIRE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ReviveModItems.ENFIRIUM_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ReviveModItems.LIFE.get());
			tabData.accept(ReviveModItems.GOO.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
			tabData.accept(ReviveModBlocks.JEB_WOOL.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ReviveModBlocks.FROZEN_SNIFFER_EGG.get().asItem());
		}
	}
}
