
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.revive.potion.StunMobEffect;
import net.mcreator.revive.ReviveMod;

public class ReviveModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ReviveMod.MODID);
	public static final RegistryObject<MobEffect> STUN = REGISTRY.register("stun", () -> new StunMobEffect());
}
