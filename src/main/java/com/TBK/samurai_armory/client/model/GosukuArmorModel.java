package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.AshigaruArmorItem;
import com.TBK.samurai_armory.common.items.GosukuArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GosukuArmorModel<T extends GosukuArmorItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T object) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/gosuku_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/armor/gosuku.png");
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/gosuku_armor.animation.json");
    }
}
