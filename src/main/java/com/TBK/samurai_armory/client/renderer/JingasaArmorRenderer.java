package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.JingasaArmorModel;
import com.TBK.samurai_armory.client.model.KusariArmorModel;
import com.TBK.samurai_armory.common.items.JingasaArmorItem;
import com.TBK.samurai_armory.common.items.KusariArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public class JingasaArmorRenderer<T extends JingasaArmorItem> extends GeoArmorRenderer<T> {


    public JingasaArmorRenderer() {
        super(new JingasaArmorModel<>());
    }

}
