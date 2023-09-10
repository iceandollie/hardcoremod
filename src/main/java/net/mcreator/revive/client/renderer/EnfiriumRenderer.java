
package net.mcreator.revive.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.revive.entity.EnfiriumEntity;
import net.mcreator.revive.client.model.Modelenfirium2;

public class EnfiriumRenderer extends MobRenderer<EnfiriumEntity, Modelenfirium2<EnfiriumEntity>> {
	public EnfiriumRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenfirium2(context.bakeLayer(Modelenfirium2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnfiriumEntity entity) {
		return new ResourceLocation("revive:textures/entities/enfirium.png");
	}
}
