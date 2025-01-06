package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.TachiModel;
import com.TBK.samurai_armory.common.items.TachiItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class TachiRenderer<T extends TachiItem> extends GeoItemRenderer<T> {
    public TachiRenderer() {
        super(new TachiModel<T>());
    }
}
