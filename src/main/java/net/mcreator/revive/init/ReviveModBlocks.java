
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.revive.block.JebWoolBlock;
import net.mcreator.revive.block.FrozenSnifferEggBlock;
import net.mcreator.revive.block.FragileMudBricksBlock;
import net.mcreator.revive.block.CauldronBlock;
import net.mcreator.revive.ReviveMod;

public class ReviveModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ReviveMod.MODID);
	public static final RegistryObject<Block> CAULDRON = REGISTRY.register("cauldron", () -> new CauldronBlock());
	public static final RegistryObject<Block> JEB_WOOL = REGISTRY.register("jeb_wool", () -> new JebWoolBlock());
	public static final RegistryObject<Block> FROZEN_SNIFFER_EGG = REGISTRY.register("frozen_sniffer_egg", () -> new FrozenSnifferEggBlock());
	public static final RegistryObject<Block> FRAGILE_MUD_BRICKS = REGISTRY.register("fragile_mud_bricks", () -> new FragileMudBricksBlock());
}
