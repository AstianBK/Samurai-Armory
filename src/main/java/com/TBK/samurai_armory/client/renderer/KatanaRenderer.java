package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.KatanaModel;
import com.TBK.samurai_armory.common.items.KatanaItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KatanaRenderer<T extends KatanaItem> extends GeoItemRenderer<T> {
    public KatanaRenderer() {
        super(new KatanaModel<T>());
    }
}
