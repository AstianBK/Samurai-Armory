package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.NodachiModel;
import com.TBK.samurai_armory.client.model.WakizashiModel;
import com.TBK.samurai_armory.common.items.NodachiItem;
import com.TBK.samurai_armory.common.items.WakizashiItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class WakizashiRenderer<T extends WakizashiItem> extends GeoItemRenderer<T> {
    public WakizashiRenderer() {
        super(new WakizashiModel<>());
    }
}
