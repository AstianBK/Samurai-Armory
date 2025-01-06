package com.TBK.samurai_armory.common.items;

import com.TBK.samurai_armory.client.renderer.KatanaRenderer;
import com.TBK.samurai_armory.client.renderer.TateShieldRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class TateShieldItem extends ShieldItem implements GeoItem {
    private final float attackSpeed;
    private final AnimatableInstanceCache cache= GeckoLibUtil.createInstanceCache(this);
    public TateShieldItem(Properties p_43272_) {
        super(p_43272_);
        this.attackSpeed =1.0F;
    }
    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new TateShieldRenderer<>();

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
