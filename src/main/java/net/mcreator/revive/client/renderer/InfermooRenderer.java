
package net.mcreator.revive.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.revive.entity.InfermooEntity;
import net.mcreator.revive.client.model.Modelinfermoo;

public class InfermooRenderer extends MobRenderer<InfermooEntity, Modelinfermoo<InfermooEntity>> {
	public InfermooRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinfermoo(context.bakeLayer(Modelinfermoo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<InfermooEntity, Modelinfermoo<InfermooEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("revive:textures/entities/infermoo.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(InfermooEntity entity) {
		return new ResourceLocation("revive:textures/entities/infermoo.png");
	}
}
