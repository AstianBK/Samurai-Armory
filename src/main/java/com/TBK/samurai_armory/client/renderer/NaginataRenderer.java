package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.NaginataModel;
import com.TBK.samurai_armory.common.items.NaginataItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class NaginataRenderer<T extends NaginataItem> extends GeoItemRenderer<T> {
    public NaginataRenderer() {
        super(new NaginataModel<>());
    }
}
