package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.TetsuboModel;
import com.TBK.samurai_armory.common.items.TetsuboItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class TetsuboRenderer<T extends TetsuboItem> extends GeoItemRenderer<T> {
    public TetsuboRenderer() {
        super(new TetsuboModel<>());
    }
}
