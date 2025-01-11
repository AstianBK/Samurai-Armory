package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.NodachiModel;
import com.TBK.samurai_armory.common.items.NodachiItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class NodachiRenderer<T extends NodachiItem> extends GeoItemRenderer<T> {
    public NodachiRenderer() {
        super(new NodachiModel<>());
    }
}
