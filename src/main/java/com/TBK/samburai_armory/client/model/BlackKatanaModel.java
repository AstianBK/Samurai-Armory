package com.TBK.samburai_armory.client.model;

import com.TBK.samburai_armory.SamuraiArmory;
import com.TBK.samburai_armory.common.items.BlackKatanaItem;
import com.TBK.samburai_armory.common.items.KatanaItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlackKatanaModel<T extends BlackKatanaItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/black_katana.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/models/black_katana.png");

    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/black_katana.animations.json");
    }
}
