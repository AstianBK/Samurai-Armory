package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.client.gui.JapFurnaceContainerMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SAMenuType {
    public static final DeferredRegister<MenuType<?>> MENU_TYPE = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SamuraiArmory.MODID);

    public static final RegistryObject<MenuType<JapFurnaceContainerMenu>> FURNACE_MENU = registerMenuType(JapFurnaceContainerMenu::new,"furnace_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENU_TYPE.register(name, () -> IForgeMenuType.create(factory));
    }
}
