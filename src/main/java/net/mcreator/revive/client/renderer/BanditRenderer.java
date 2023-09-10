
package net.mcreator.revive.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.revive.entity.BanditEntity;
import net.mcreator.revive.client.model.Modelbandit;

public class BanditRenderer extends MobRenderer<BanditEntity, Modelbandit<BanditEntity>> {
	public BanditRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbandit(context.bakeLayer(Modelbandit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BanditEntity entity) {
		return new ResourceLocation("revive:textures/entities/bandit.png");
	}
}
