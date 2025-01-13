package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.KamaModel;
import com.TBK.samurai_armory.client.model.NagamakiModel;
import com.TBK.samurai_armory.common.items.KamaItem;
import com.TBK.samurai_armory.common.items.NagamakiItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class NagamakiRenderer<T extends NagamakiItem> extends GeoItemRenderer<T> {
    public NagamakiRenderer() {
        super(new NagamakiModel<>());
    }
}
