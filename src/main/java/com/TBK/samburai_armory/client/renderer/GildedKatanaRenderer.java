package com.TBK.samburai_armory.client.renderer;

import com.TBK.samburai_armory.client.model.BlackKatanaModel;
import com.TBK.samburai_armory.client.model.GildedKatanaModel;
import com.TBK.samburai_armory.common.items.GildedKatanaItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GildedKatanaRenderer<T extends GildedKatanaItem> extends GeoItemRenderer<T> {
    public GildedKatanaRenderer() {
        super(new GildedKatanaModel<>());
    }
}
