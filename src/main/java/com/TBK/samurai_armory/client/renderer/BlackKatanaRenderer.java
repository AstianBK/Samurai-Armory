package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.BlackKatanaModel;
import com.TBK.samurai_armory.common.items.BlackKatanaItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BlackKatanaRenderer<T extends BlackKatanaItem> extends GeoItemRenderer<T> {
    public BlackKatanaRenderer() {
        super(new BlackKatanaModel<>());
    }
}
