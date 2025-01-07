package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.ChokutoModel;
import com.TBK.samurai_armory.common.items.ChokutoItem;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChokutoRenderer<T extends ChokutoItem> extends GeoItemRenderer<T> {
    public ChokutoRenderer() {
        super(new ChokutoModel<>());
    }

    @Override
    public RenderType getRenderType(T animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return RenderType.itemEntityTranslucentCull(texture);
    }
}
