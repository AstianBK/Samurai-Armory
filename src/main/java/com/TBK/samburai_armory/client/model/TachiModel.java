package com.TBK.samburai_armory.client.model;

import com.TBK.samburai_armory.SamuraiArmory;
import com.TBK.samburai_armory.common.items.BlackKatanaItem;
import com.TBK.samburai_armory.common.items.TachiItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TachiModel<T extends TachiItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/tachi.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/models/tachi.png");

    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/tachi.animations.json");
    }
}
