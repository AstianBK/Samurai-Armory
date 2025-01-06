package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.KatakamaModel;
import com.TBK.samurai_armory.common.items.KatakamaYariItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KatakamaRenderer<T extends KatakamaYariItem> extends GeoItemRenderer<T> {
    public KatakamaRenderer() {
        super(new KatakamaModel<>());
    }
}
