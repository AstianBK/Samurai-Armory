package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.AshigaruArmorModel;
import com.TBK.samurai_armory.common.items.AshigaruArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public class AshigaruArmorRenderer<T extends AshigaruArmorItem> extends GeoArmorRenderer<T> {


    public AshigaruArmorRenderer() {
        super(new AshigaruArmorModel<>());
    }

}
