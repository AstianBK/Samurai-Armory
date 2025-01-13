package com.TBK.samurai_armory.common.items;

import com.TBK.samurai_armory.Config;
import com.TBK.samurai_armory.client.renderer.BlackKatanaRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

public class BlackKatanaItem extends KatanaItem{
    public BlackKatanaItem(Properties p_43272_) {
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
        return Config.blackKatanaDamage;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return Config.blackKatanaDurability;
    }
}
