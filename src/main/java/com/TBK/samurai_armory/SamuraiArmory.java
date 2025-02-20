package com.TBK.samurai_armory;

import com.TBK.samurai_armory.client.gui.JapFurnaceContainerMenu;
import com.TBK.samurai_armory.client.gui.JapFurnaceScreenMenu;
import com.TBK.samurai_armory.common.registry.*;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SamuraiArmory.MODID)
public class SamuraiArmory
{
    public static final String MODID = "samurai_armory";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SamuraiArmory()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SAItems.ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        SACreativeTabs.TABS.register(modEventBus);
        SABlockEntity.BLOCKS_ENTITY.register(modEventBus);
        SABlocks.BLOCKS.register(modEventBus);
        SAMenuType.MENU_TYPE.register(modEventBus);
        SARecipeSerializer.RECIPE_SERIALIZERS.register(modEventBus);
        SARecipeSerializer.RECIPE_TYPES.register(modEventBus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT,()->()->{
            modEventBus.addListener(this::registerRenderers);
        });
    }

    @OnlyIn(Dist.CLIENT)
    private void registerRenderers(FMLCommonSetupEvent event){
        MenuScreens.register(SAMenuType.FURNACE_MENU.get(), JapFurnaceScreenMenu::new);

    }

}
