package com.TBK.samburai_armory.client.renderer;

import com.TBK.samburai_armory.client.model.KatanaModel;
import com.TBK.samburai_armory.common.items.KatanaItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KatanaRenderer<T extends KatanaItem> extends GeoItemRenderer<T> {
    public KatanaRenderer() {
        super(new KatanaModel<T>());
    }
}
