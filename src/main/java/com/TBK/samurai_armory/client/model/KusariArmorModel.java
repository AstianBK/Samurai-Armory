package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.KusariArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import software.bernie.geckolib.model.GeoModel;

public class KusariArmorModel<T extends KusariArmorItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T object) {
         if(object.variant == KusariArmorItem.Variant.HELMET && object.getType()==ArmorItem.Type.HELMET){
            return new ResourceLocation(SamuraiArmory.MODID,"geo/kusari_armor_helmet.geo.json");
        }
        return new ResourceLocation(SamuraiArmory.MODID,"geo/kusari_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        if(object.variant == KusariArmorItem.Variant.BLACK){
            return new ResourceLocation(SamuraiArmory.MODID,"textures/armor/kusari_1.png");
        }else if(object.variant == KusariArmorItem.Variant.HELMET && object.getType()==ArmorItem.Type.HELMET){
            return new ResourceLocation(SamuraiArmory.MODID,"textures/armor/kusari_helmet.png");
        }
        return new ResourceLocation(SamuraiArmory.MODID,"textures/armor/kusari_2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/kusari_armor.animation.json");
    }
}
