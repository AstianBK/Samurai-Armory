package com.TBK.samurai_armory.common.items;

import com.TBK.samurai_armory.Config;
import com.TBK.samurai_armory.client.renderer.BlackKatanaRenderer;
import com.TBK.samurai_armory.client.renderer.NodachiRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

public class NodachiItem extends KatanaItem{
    public NodachiItem(Properties p_43272_) {
        super(p_43272_);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new NodachiRenderer<>();

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }
    @Override
    public double getAttackDamage() {
        return Config.nodachiDamage;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return Config.nodachiDurability;
    }
}
