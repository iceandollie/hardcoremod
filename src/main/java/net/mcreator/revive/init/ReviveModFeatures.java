
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.revive.world.features.plants.ObamaFeature;
import net.mcreator.revive.world.features.OutpostFeature;
import net.mcreator.revive.ReviveMod;

@Mod.EventBusSubscriber
public class ReviveModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ReviveMod.MODID);
	public static final RegistryObject<Feature<?>> OUTPOST = REGISTRY.register("outpost", OutpostFeature::new);
	public static final RegistryObject<Feature<?>> OBAMA = REGISTRY.register("obama", ObamaFeature::new);
}
