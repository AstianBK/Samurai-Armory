package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SACreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SamuraiArmory.MODID);

    public static final RegistryObject<CreativeModeTab> BK_MOBS_TAB = TABS.register(SamuraiArmory.MODID,()-> CreativeModeTab.builder()
            .icon(()->new ItemStack(SAItems.CHOKUTO.get()))
            .title(Component.translatable("itemGroup.samurai_armory"))
            .displayItems((s,a)-> {
                a.accept(new ItemStack(SAItems.CHOKUTO.get()));
                a.accept(new ItemStack(SAItems.TANTO.get()));
                a.accept(new ItemStack(SAItems.TATE_SHIELD.get()));
                a.accept(new ItemStack(SAItems.KATAKAMA.get()));
                a.accept(new ItemStack(SAItems.KONSAIBO.get()));
            })
            .build());
}
