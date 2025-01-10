package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.FukuroModel;
import com.TBK.samurai_armory.client.model.JumonjiModel;
import com.TBK.samurai_armory.common.items.FukuroYariItem;
import com.TBK.samurai_armory.common.items.JumonjiYariItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class JumonjiYariRenderer<T extends JumonjiYariItem> extends GeoItemRenderer<T> {
    public JumonjiYariRenderer() {
        super(new JumonjiModel<>());
    }
}
