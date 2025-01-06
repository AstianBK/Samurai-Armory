package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.AshigaruArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AshigaruArmorModel<T extends AshigaruArmorItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T object) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/ashigaru_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/armor/ashigaru.png");
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/ashigaru_armor.animation.json");
    }
}
