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

    public static final RegistryObject<CreativeModeTab> SA_MOBS_TAB = TABS.register(SamuraiArmory.MODID,()-> CreativeModeTab.builder()
            .icon(()->new ItemStack(SAItems.CHOKUTO.get()))
            .title(Component.translatable("itemGroup.samurai_armory"))
            .displayItems((s,a)-> {
                a.accept(new ItemStack(SAItems.CHOKUTO.get()));
                a.accept(new ItemStack(SAItems.TANTO.get()));
                a.accept(new ItemStack(SAItems.KATANA.get()));
                a.accept(new ItemStack(SAItems.BLACK_KATANA.get()));
                a.accept(new ItemStack(SAItems.NODACHI.get()));
                a.accept(new ItemStack(SAItems.WAKIZASHI.get()));

                a.accept(new ItemStack(SAItems.TATE_SHIELD.get()));
                a.accept(new ItemStack(SAItems.KATAKAMA.get()));
                a.accept(new ItemStack(SAItems.KONSAIBO.get()));
                a.accept(new ItemStack(SAItems.JUMONJI.get()));
                a.accept(new ItemStack(SAItems.FUKURO.get()));
                a.accept(new ItemStack(SAItems.TETSUBO.get()));
                a.accept(new ItemStack(SAItems.NAGINATA.get()));


                a.accept(new ItemStack(SAItems.ASHIGARU_HELMET.get()));
                a.accept(new ItemStack(SAItems.ASHIGARU_CHEST.get()));
                a.accept(new ItemStack(SAItems.ASHIGARU_LEGGINGS.get()));
                a.accept(new ItemStack(SAItems.ASHIGARU_BOOT.get()));


                a.accept(new ItemStack(SAItems.KUSARI_HELMET.get()));
                a.accept(new ItemStack(SAItems.KUSARI_CHEST.get()));
                a.accept(new ItemStack(SAItems.KUSARI_LEGGINGS.get()));
                a.accept(new ItemStack(SAItems.KUSARI_BOOT.get()));


                a.accept(new ItemStack(SAItems.GOSUKU_HELMET.get()));
                a.accept(new ItemStack(SAItems.GOSUKU_CHEST.get()));
                a.accept(new ItemStack(SAItems.GOSUKU_LEGGINGS.get()));
                a.accept(new ItemStack(SAItems.GOSUKU_BOOT.get()));

            })
            .build());
}
