package com.TBK.samburai_armory.client.model;

import com.TBK.samburai_armory.SamuraiArmory;
import com.TBK.samburai_armory.common.items.KatanaItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KatanaModel<T extends KatanaItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/katana.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/models/katana.png");

    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/katana.animations.json");
    }
}
