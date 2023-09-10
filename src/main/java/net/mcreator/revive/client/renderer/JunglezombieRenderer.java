
package net.mcreator.revive.client.renderer;

public class JunglezombieRenderer extends HumanoidMobRenderer<JunglezombieEntity, HumanoidModel<JunglezombieEntity>> {

	public JunglezombieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(JunglezombieEntity entity) {
		return new ResourceLocation("revive:textures/entities/husk.png");
	}

}
