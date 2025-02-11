package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.JingasaArmorModel;
import com.TBK.samurai_armory.client.model.NinjaArmorModel;
import com.TBK.samurai_armory.common.items.JingasaArmorItem;
import com.TBK.samurai_armory.common.items.NinjaArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public class NinjaArmorRenderer<T extends NinjaArmorItem> extends GeoArmorRenderer<T> {


    public NinjaArmorRenderer() {
        super(new NinjaArmorModel<>());
    }

}
