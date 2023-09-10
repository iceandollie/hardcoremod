
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.revive.client.model.Modelenfirium;
import net.mcreator.revive.client.model.Modelbandit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ReviveModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelenfirium.LAYER_LOCATION, Modelenfirium::createBodyLayer);
		event.registerLayerDefinition(Modelbandit.LAYER_LOCATION, Modelbandit::createBodyLayer);
	}
}
