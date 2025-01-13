package com.TBK.samurai_armory.common.items;

import com.TBK.samurai_armory.Config;
import com.TBK.samurai_armory.client.renderer.BlackKatanaRenderer;
import com.TBK.samurai_armory.client.renderer.KatanaRenderer;
import com.TBK.samurai_armory.client.renderer.NagamakiRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;

public class NagamakiItem extends KatanaItem{
    public NagamakiItem(Properties p_43272_) {
        super(p_43272_);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new NagamakiRenderer<>();

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }


    @Override
    public double getAttackDamage() {
        return Config.nagamakiDamage;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return Config.nagamakiDurability;
    }
}
