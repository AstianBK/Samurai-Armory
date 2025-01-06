package com.TBK.samurai_armory;

import com.TBK.samurai_armory.common.registry.SACreativeTabs;
import com.TBK.samurai_armory.common.registry.SAItemProperties;
import com.TBK.samurai_armory.common.registry.SAItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
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
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


}
