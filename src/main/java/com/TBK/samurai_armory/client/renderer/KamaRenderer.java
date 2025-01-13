package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.KamaModel;
import com.TBK.samurai_armory.client.model.KatanaModel;
import com.TBK.samurai_armory.common.items.KamaItem;
import com.TBK.samurai_armory.common.items.KatanaItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KamaRenderer<T extends KamaItem> extends GeoItemRenderer<T> {
    public KamaRenderer() {
        super(new KamaModel<T>());
    }
}
