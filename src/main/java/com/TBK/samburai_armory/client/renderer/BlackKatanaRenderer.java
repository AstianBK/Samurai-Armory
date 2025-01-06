package com.TBK.samburai_armory.client.renderer;

import com.TBK.samburai_armory.client.model.BlackKatanaModel;
import com.TBK.samburai_armory.client.model.KatanaModel;
import com.TBK.samburai_armory.common.items.BlackKatanaItem;
import com.TBK.samburai_armory.common.items.KatanaItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BlackKatanaRenderer<T extends BlackKatanaItem> extends GeoItemRenderer<T> {
    public BlackKatanaRenderer() {
        super(new BlackKatanaModel<>());
    }
}
