package com.TBK.samurai_armory.client.renderer;

import com.TBK.samurai_armory.client.model.KusariArmorModel;
import com.TBK.samurai_armory.common.items.KusariArmorItem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemDisplayContext;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KusariItemRenderer<T extends KusariArmorItem> extends GeoItemRenderer<T> {
    public KusariItemRenderer() {
        super(new KusariArmorModel<T>());
    }

    @Override
    protected void renderInGui(ItemDisplayContext transformType, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        super.renderInGui(transformType, poseStack, bufferSource, packedLight, packedOverlay);
    }
}
