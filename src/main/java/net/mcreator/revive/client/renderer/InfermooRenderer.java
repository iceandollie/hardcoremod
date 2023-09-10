
package net.mcreator.revive.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.revive.entity.InfermooEntity;
import net.mcreator.revive.client.model.Modelinfermoo;

public class InfermooRenderer extends MobRenderer<InfermooEntity, Modelinfermoo<InfermooEntity>> {
	public InfermooRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinfermoo(context.bakeLayer(Modelinfermoo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InfermooEntity entity) {
		return new ResourceLocation("revive:textures/entities/infermoo.png");
	}
}
