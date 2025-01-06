package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.ChokutoModel;
import com.TBK.samurai_armory.common.items.ChokutoItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChokutoRenderer<T extends ChokutoItem> extends GeoItemRenderer<T> {
    public ChokutoRenderer() {
        super(new ChokutoModel<>());
    }
}
