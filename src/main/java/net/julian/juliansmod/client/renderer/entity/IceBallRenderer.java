package net.julian.juliansmod.client.renderer.entity;

import net.julian.juliansmod.entity.custom.IceBall;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class IceBallRenderer extends EntityRenderer<IceBall> {
    public static final ResourceLocation ICE_BALL_MODEL_RESOURCE_LOCATION =
            new ResourceLocation("textures/entity/iceball.png");

    public IceBallRenderer(EntityRendererProvider.Context p_174008_) {
        super(p_174008_);
    }


    @Override
    public ResourceLocation getTextureLocation(IceBall p_114482_) {
        return ICE_BALL_MODEL_RESOURCE_LOCATION;
    }
}
