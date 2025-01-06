package com.TBK.samburai_armory.client.model;

import com.TBK.samburai_armory.SamuraiArmory;
import com.TBK.samburai_armory.common.items.BlackKatanaItem;
import com.TBK.samburai_armory.common.items.GildedKatanaItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GildedKatanaModel<T extends GildedKatanaItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/gilded_katana.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/models/gilded_katana.png");

    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/gilded_katana.animations.json");
    }
}
