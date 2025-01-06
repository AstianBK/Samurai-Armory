package com.TBK.samburai_armory.client.renderer;

import com.TBK.samburai_armory.client.model.KatanaModel;
import com.TBK.samburai_armory.client.model.TachiModel;
import com.TBK.samburai_armory.common.items.TachiItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class TachiRenderer<T extends TachiItem> extends GeoItemRenderer<T> {
    public TachiRenderer() {
        super(new TachiModel<T>());
    }
}
