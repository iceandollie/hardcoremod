
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.revive.ReviveMod;

public class ReviveModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ReviveMod.MODID);
	public static final RegistryObject<Potion> VAMPIREEXLIR = REGISTRY.register("vampireexlir",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 20, false, false), new MobEffectInstance(MobEffects.JUMP, 3600, 20, false, false)));
	public static final RegistryObject<Potion> STUNPOTION = REGISTRY.register("stunpotion", () -> new Potion(new MobEffectInstance(ReviveModMobEffects.STUN.get(), 100, 0, false, true)));
}
