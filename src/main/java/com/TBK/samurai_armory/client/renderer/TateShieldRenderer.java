package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.TateShieldModel;
import com.TBK.samurai_armory.common.items.TateShieldItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class TateShieldRenderer<T extends TateShieldItem> extends GeoItemRenderer<T> {
    public TateShieldRenderer() {
        super(new TateShieldModel<>());
    }
}
