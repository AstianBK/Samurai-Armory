package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.FukuroModel;
import com.TBK.samurai_armory.common.items.FukuroYariItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FukuroYariRenderer<T extends FukuroYariItem> extends GeoItemRenderer<T> {
    public FukuroYariRenderer() {
        super(new FukuroModel<>());
    }
}
