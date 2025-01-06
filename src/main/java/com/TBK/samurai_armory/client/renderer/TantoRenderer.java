package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.TantoModel;
import com.TBK.samurai_armory.common.items.TantoItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class TantoRenderer<T extends TantoItem> extends GeoItemRenderer<T> {
    public TantoRenderer() {
        super(new TantoModel<>());
    }
}
