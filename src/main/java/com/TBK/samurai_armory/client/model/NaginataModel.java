package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.KatakamaYariItem;
import com.TBK.samurai_armory.common.items.NaginataItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NaginataModel<T extends NaginataItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/naginata.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/item/naginata.png");

    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/naginata.animations.json");
    }
}
