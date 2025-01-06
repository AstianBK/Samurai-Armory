package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class SAItemProperties {
    public static void register() {

        ItemProperties.register(SAItems.TATE_SHIELD.get(), new ResourceLocation(SamuraiArmory.MODID, "blocking"), (p_239426_0_, p_239426_1_, p_239426_2_, intIn) -> {
            return p_239426_2_ != null && p_239426_2_.isUsingItem() && p_239426_2_.getUseItem() == p_239426_0_ ? 1.0F : 0.0F;
        });

    }
}
