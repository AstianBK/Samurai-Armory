package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.AshigaruArmorModel;
import com.TBK.samurai_armory.client.model.GosukuArmorModel;
import com.TBK.samurai_armory.common.items.AshigaruArmorItem;
import com.TBK.samurai_armory.common.items.GosukuArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public class GosukuArmorRenderer<T extends GosukuArmorItem> extends GeoArmorRenderer<T> {


    public GosukuArmorRenderer() {
        super(new GosukuArmorModel<>());
    }

}
