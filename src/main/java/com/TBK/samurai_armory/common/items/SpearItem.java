package com.TBK.samurai_armory.common.items;

import com.TBK.samurai_armory.Config;
import com.TBK.samurai_armory.client.renderer.KatanaRenderer;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.ForgeMod;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.UUID;
import java.util.function.Consumer;

public class SpearItem extends SwordItem implements GeoItem {
    private static final UUID TOOL_MODIFIER_UUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // Genera un UUID único

    private final float attackSpeed;
    private final AnimatableInstanceCache cache= GeckoLibUtil.createInstanceCache(this);
    public SpearItem(Properties p_43272_) {
        super(Tiers.WOOD, 0, 0.0F, p_43272_);
        this.attackSpeed =-2.8F;
    }
    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new KatanaRenderer<>();

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

    public double getAttackDamage(){
        return Config.katanaDamage;
    }

    public double getAttackRange(){
        return 1.0D;
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot p_43383_) {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(TOOL_MODIFIER_UUID,"Tool modifier", this.getAttackRange(), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", this.getAttackDamage()-1, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", (double)this.attackSpeed, AttributeModifier.Operation.ADDITION));
        return p_43383_ == EquipmentSlot.MAINHAND ? builder.build() : super.getDefaultAttributeModifiers(p_43383_);
    }


}
