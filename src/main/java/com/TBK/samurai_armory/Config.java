package com.TBK.samurai_armory;

import com.TBK.samurai_armory.common.registry.SAItemProperties;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = SamuraiArmory.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.DoubleValue KATANA_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("katana_damage", 10.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue BLACK_KATANA_DAMAGE = BUILDER
            .comment("Black Katana damage value")
            .defineInRange("black_katana_damage", 4.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue GILDED_KATANA_DAMAGE = BUILDER
            .comment("Gilded Katana damage value")
            .defineInRange("gilded_katana_damage", 8.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue TACHI_DAMAGE = BUILDER
            .comment("Tachi damage value")
            .defineInRange("tachi_damage", 4.0D, 0, Double.MAX_VALUE);


    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static double katanaDamage;
    public static double blackKatanaDamage;
    public static double gildedKatanaDamage;

    public static double tachiDamage;


    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        katanaDamage= KATANA_DAMAGE.get();
        blackKatanaDamage= BLACK_KATANA_DAMAGE.get();
        gildedKatanaDamage= GILDED_KATANA_DAMAGE.get();
        tachiDamage= TACHI_DAMAGE.get();
        SAItemProperties.register();
    }
}
