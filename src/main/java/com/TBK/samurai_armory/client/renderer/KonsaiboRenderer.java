package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.KonsaiboModel;
import com.TBK.samurai_armory.common.items.KonsaiboItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KonsaiboRenderer<T extends KonsaiboItem> extends GeoItemRenderer<T> {
    public KonsaiboRenderer() {
        super(new KonsaiboModel<>());
    }
}
