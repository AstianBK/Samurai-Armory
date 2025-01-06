package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.AshigaruArmorModel;
import com.TBK.samurai_armory.client.model.KusariArmorModel;
import com.TBK.samurai_armory.common.items.AshigaruArmorItem;
import com.TBK.samurai_armory.common.items.KusariArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public class KusariArmorRenderer<T extends KusariArmorItem> extends GeoArmorRenderer<T> {


    public KusariArmorRenderer() {
        super(new KusariArmorModel<>());
    }

}
