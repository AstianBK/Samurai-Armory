package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.AshigaruArmorItem;
import com.TBK.samurai_armory.common.items.HammerItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SmithingHammerModel<T extends HammerItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T object) {
        return new ResourceLocation(SamuraiArmory.MODID,"geo/japsmithinghammer.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/armor/japsmithinghammer.png");
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/ashigaru_armor.animation.json");
    }
}
