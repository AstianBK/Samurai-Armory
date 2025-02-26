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

    private static final ForgeConfigSpec.IntValue KATANA_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("katana_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue KAMA_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("kama_damage", 10.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue KAMA_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("kama_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue NAGAMAKI_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("nagamaki_damage", 10.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue NAGAMAKI_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("nagamaki_durability", 100, 1, Integer.MAX_VALUE);


    private static final ForgeConfigSpec.DoubleValue BLACK_KATANA_DAMAGE = BUILDER
            .comment("Black Katana damage value")
            .defineInRange("black_katana_damage", 4.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue BLACK_KATANA_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("black_katana_durability", 100, 1, Integer.MAX_VALUE);


    private static final ForgeConfigSpec.DoubleValue NODACHI_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("nodachi_damage", 10.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue NODACHI_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("nodachi_durability", 100, 1, Integer.MAX_VALUE);


    private static final ForgeConfigSpec.DoubleValue WAKIZASHI_DAMAGE = BUILDER
            .comment("Black Katana damage value")
            .defineInRange("wakizashi_damage", 4.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue WAKIASHI_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("wakizashi_durability", 100, 1, Integer.MAX_VALUE);



    private static final ForgeConfigSpec.DoubleValue GILDED_KATANA_DAMAGE = BUILDER
            .comment("Gilded Katana damage value")
            .defineInRange("gilded_katana_damage", 8.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue GILDED_KATANA_DURABILITY = BUILDER
            .comment("Gilded Katana damage value")
            .defineInRange("gilded_katana_durability", 8, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue TACHI_DAMAGE = BUILDER
            .comment("Tachi damage value")
            .defineInRange("tachi_damage", 4.0D, 0, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue TACHI_DURABILITY = BUILDER
            .comment("Gilded Katana damage value")
            .defineInRange("tachi_durability", 8, 0, Integer.MAX_VALUE);


    private static final ForgeConfigSpec.DoubleValue CHOKUTO_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("chokuto_damage", 6.0D, 1, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue CHOKUTO_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("chokuto_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue TETSUBO_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("tetsubo_damage", 6.0D, 1, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue TETSUBO_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("tetsubo_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue JUMONJI_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("jumonji_damage", 6.0D, 1, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue JUMONJI_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("jumonji_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue FUKURO_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("fukuro_damage", 6.0D, 1, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue FUKURO_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("fukuro_durability", 100, 1, Integer.MAX_VALUE);


    private static final ForgeConfigSpec.DoubleValue NAGINATA_DAMAGE = BUILDER
            .comment("Katana damage value")
            .defineInRange("naginata_damage", 6.0D, 1, Double.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue NAGINATA_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("naginata_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue TANTO_DAMAGE = BUILDER
            .comment("Black Katana damage value")
            .defineInRange("tanto_damage", 6.0D, 1, Double.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue TANTO_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("tanto_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue KATAKAMA_DAMAGE = BUILDER
            .comment("Gilded Katana damage value")
            .defineInRange("katakama_damage", 6.0D, 1, Double.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue KATAKAMA_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("katakama_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.DoubleValue KONSAIBO_DAMAGE = BUILDER
            .comment("Gilded Katana damage value")
            .defineInRange("konsaibo_damage", 6.0D, 0, Double.MAX_VALUE);
    private static final ForgeConfigSpec.IntValue KONSAIBO_DURABILITY = BUILDER
            .comment("Katana damage value")
            .defineInRange("konsaibo_durability", 100, 1, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue TATE_SHIELD_DURABILITY = BUILDER
            .comment("Tachi damage value")
            .defineInRange("tate_shield_durability", 300, 1, Integer.MAX_VALUE);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static double katanaDamage;
    public static int katanaDurability;
    public static double blackKatanaDamage;
    public static int blackKatanaDurability;
    public static double kamaDamage;
    public static int kamaDurability;
    public static double nagamakiDamage;
    public static int nagamakiDurability;

    public static double nodachiDamage;
    public static int nodachiDurability;
    public static double wakizashiDamage;
    public static int wakizashiDurability;


    public static double gildedKatanaDamage;
    public static int gildedKatanaDurability;
    public static double tachiDamage;
    public static int tachiDurability;

    public static double tetsuboDamage;
    public static int tetsuboDurability;
    public static double fukuroDamage;
    public static int fukuroDurability;
    public static double jumonjiDamage;
    public static int jumonjiDurability;
    public static double naginataDamage;
    public static int naginataDurability;


    public static double chokutoDamage;
    public static int chokutoDurability;
    public static double tantoDamage;
    public static int tantoDurability;
    public static double katakamaDamage;
    public static int katakamaDurability;
    public static double konsaiboDamage;
    public static int konsaiboDurability;

    public static int tateShieldDurability;


    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        katanaDamage= KATANA_DAMAGE.get();
        katanaDurability = KATANA_DURABILITY.get();

        blackKatanaDamage= BLACK_KATANA_DAMAGE.get();
        blackKatanaDurability = BLACK_KATANA_DURABILITY.get();

        kamaDamage = KAMA_DAMAGE.get();
        kamaDurability = KAMA_DURABILITY.get();

        nagamakiDamage = NAGAMAKI_DAMAGE.get();
        nagamakiDurability = NAGAMAKI_DURABILITY.get();

        gildedKatanaDamage= GILDED_KATANA_DAMAGE.get();
        gildedKatanaDurability = GILDED_KATANA_DURABILITY.get();

        tachiDamage= TACHI_DAMAGE.get();
        tachiDurability = TACHI_DURABILITY.get();

        nodachiDamage = NODACHI_DAMAGE.get();
        nodachiDurability = NODACHI_DURABILITY.get();

        wakizashiDamage = WAKIZASHI_DAMAGE.get();
        wakizashiDurability = WAKIASHI_DURABILITY.get();

        tetsuboDamage=TETSUBO_DAMAGE.get();
        tetsuboDurability=TETSUBO_DURABILITY.get();

        fukuroDamage=FUKURO_DAMAGE.get();
        fukuroDurability=FUKURO_DURABILITY.get();

        jumonjiDamage=JUMONJI_DAMAGE.get();
        jumonjiDurability=JUMONJI_DURABILITY.get();

        naginataDamage=NAGINATA_DAMAGE.get();
        naginataDurability=NAGINATA_DURABILITY.get();


        chokutoDamage=CHOKUTO_DAMAGE.get();
        chokutoDurability=CHOKUTO_DURABILITY.get();

        tantoDamage=TANTO_DAMAGE.get();
        tantoDurability=TANTO_DURABILITY.get();

        katakamaDamage=KATAKAMA_DAMAGE.get();
        katakamaDurability=KATAKAMA_DURABILITY.get();

        konsaiboDamage=KONSAIBO_DAMAGE.get();
        konsaiboDurability=KONSAIBO_DURABILITY.get();

        tateShieldDurability=TATE_SHIELD_DURABILITY.get();

        SAItemProperties.register();
    }
}
