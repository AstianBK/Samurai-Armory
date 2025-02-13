package com.TBK.samurai_armory.client.model;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.JingasaArmorItem;
import com.TBK.samurai_armory.common.items.KusariArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import software.bernie.geckolib.model.GeoModel;

public class JingasaArmorModel<T extends JingasaArmorItem> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(T object) {
        if(object.getType()==ArmorItem.Type.HELMET){
            return new ResourceLocation(SamuraiArmory.MODID,"geo/jingasa_helmet.geo.json");
        }
        return new ResourceLocation(SamuraiArmory.MODID,"geo/jingasa.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        return new ResourceLocation(SamuraiArmory.MODID,"textures/armor/jingasa_"+(object.getMaterial() == ArmorMaterials.LEATHER ? "hay" : "metal")+".png");
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SamuraiArmory.MODID,"animations/jingasa.animation.json");
    }
}
