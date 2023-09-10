
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.revive.ReviveMod;

public class ReviveModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ReviveMod.MODID);
	public static final RegistryObject<SoundEvent> VOICECRACK = REGISTRY.register("voicecrack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("revive", "voicecrack")));
	public static final RegistryObject<SoundEvent> ORIGINALSPEC = REGISTRY.register("originalspec", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("revive", "originalspec")));
	public static final RegistryObject<SoundEvent> SPEC2 = REGISTRY.register("spec2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("revive", "spec2")));
	public static final RegistryObject<SoundEvent> ANTIHERO = REGISTRY.register("antihero", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("revive", "antihero")));
}
