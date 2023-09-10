
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revive.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.revive.client.renderer.JunglezombieRenderer;
import net.mcreator.revive.client.renderer.InfermooRenderer;
import net.mcreator.revive.client.renderer.EnfiriumRenderer;
import net.mcreator.revive.client.renderer.BanditRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ReviveModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ReviveModEntities.ENFIRIUM.get(), EnfiriumRenderer::new);
		event.registerEntityRenderer(ReviveModEntities.BANDIT.get(), BanditRenderer::new);
		event.registerEntityRenderer(ReviveModEntities.INFERMOO.get(), InfermooRenderer::new);
		event.registerEntityRenderer(ReviveModEntities.JUNGLEZOMBIE.get(), JunglezombieRenderer::new);
	}
}
