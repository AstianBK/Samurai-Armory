package com.TBK.samburai_armory.common.items;

import com.TBK.samburai_armory.Config;
import com.TBK.samburai_armory.client.renderer.BlackKatanaRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

public class TachiItem extends KatanaItem{
    public TachiItem(Properties p_43272_) {
        super(p_43272_);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new BlackKatanaRenderer<>();

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }
    @Override
    public double getAttackDamage() {
        return Config.tachiDamage;
    }
}
