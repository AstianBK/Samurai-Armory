package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.GildedKatanaModel;
import com.TBK.samurai_armory.common.items.GildedKatanaItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GildedKatanaRenderer<T extends GildedKatanaItem> extends GeoItemRenderer<T> {
    public GildedKatanaRenderer() {
        super(new GildedKatanaModel<>());
    }
}
