package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.KamaItem;
import com.TBK.samurai_armory.common.items.KatanaItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KamaModel<T extends KamaItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/kama.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/item/kama.png");

    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/kama.animations.json");
    }
}
