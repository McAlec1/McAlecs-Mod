
package net.mcalec.mcalecs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcalec.mcalecs.entity.BoykisserEntity;
import net.mcalec.mcalecs.client.model.Modelcustom_model;

import com.mojang.blaze3d.vertex.PoseStack;

public class BoykisserRenderer extends MobRenderer<BoykisserEntity, Modelcustom_model<BoykisserEntity>> {
	public BoykisserRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(BoykisserEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.94f, 0.94f, 0.94f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoykisserEntity entity) {
		return new ResourceLocation("mcalecs:textures/entities/boykisser-event.png");
	}
}
