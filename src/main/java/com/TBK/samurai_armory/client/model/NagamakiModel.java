package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.KatanaItem;
import com.TBK.samurai_armory.common.items.NagamakiItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NagamakiModel<T extends NagamakiItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/nagamaki.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/item/nagamaki.png");

    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/nagamaki.animations.json");
    }
}
