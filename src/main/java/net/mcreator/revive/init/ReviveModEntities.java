
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.revive.entity.InfermooEntity;
import net.mcreator.revive.entity.EnfiriumEntity;
import net.mcreator.revive.entity.BanditEntity;
import net.mcreator.revive.ReviveMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReviveModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ReviveMod.MODID);
	public static final RegistryObject<EntityType<EnfiriumEntity>> ENFIRIUM = register("enfirium",
			EntityType.Builder.<EnfiriumEntity>of(EnfiriumEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnfiriumEntity::new)

					.sized(0.6f, 8f));
	public static final RegistryObject<EntityType<BanditEntity>> BANDIT = register("bandit",
			EntityType.Builder.<BanditEntity>of(BanditEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanditEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InfermooEntity>> INFERMOO = register("infermoo",
			EntityType.Builder.<InfermooEntity>of(InfermooEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InfermooEntity::new).fireImmune().sized(1f, 1.45f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EnfiriumEntity.init();
			BanditEntity.init();
			InfermooEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENFIRIUM.get(), EnfiriumEntity.createAttributes().build());
		event.put(BANDIT.get(), BanditEntity.createAttributes().build());
		event.put(INFERMOO.get(), InfermooEntity.createAttributes().build());
	}
}
