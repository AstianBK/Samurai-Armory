package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.JumonjiModel;
import com.TBK.samurai_armory.client.model.SmithingHammerModel;
import com.TBK.samurai_armory.common.items.HammerItem;
import com.TBK.samurai_armory.common.items.JumonjiYariItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SmithingHammerRenderer<T extends HammerItem> extends GeoItemRenderer<T> {
    public SmithingHammerRenderer() {
        super(new SmithingHammerModel<>());
    }
}
