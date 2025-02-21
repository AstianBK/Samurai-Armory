package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SAItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SamuraiArmory.MODID);

    public static final RegistryObject<Item> SMITHING_HAMMER = ITEMS.register("japsmithing_hammer",()->new HammerItem(new Item.Properties().stacksTo(1).durability(64)));
    public static final RegistryObject<Item> SMITHING_CHOPSTICKS = ITEMS.register("smithing_chopsticks",()->new Item(new Item.Properties().stacksTo(1).durability(32)));
    public static final RegistryObject<Item> SMITHING_CLAYTUBE = ITEMS.register("smithing_claytube",()->new Item(new Item.Properties().stacksTo(1).defaultDurability(128)));


    public static final RegistryObject<Item> KATANA= ITEMS.register("katana",()->new KatanaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_KATANA= ITEMS.register("black_katana",()->new BlackKatanaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WAKIZASHI= ITEMS.register("wakizashi",()->new WakizashiItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NODACHI= ITEMS.register("nodachi",()->new NodachiItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NAGAMAKI= ITEMS.register("nagamaki",()->new NagamakiItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GILDED_KATANA= ITEMS.register("gilded_katana",()->new GildedKatanaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TACHI= ITEMS.register("tachi",()->new TachiItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TANTO = ITEMS.register("tanto",()->new TantoItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> CHOKUTO = ITEMS.register("chokuto",()->new ChokutoItem(new Item.Properties().stacksTo(1).defaultDurability(100)));
    public static final RegistryObject<Item> NAGINATA = ITEMS.register("naginata",()->new NaginataItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> KATAKAMA = ITEMS.register("katakama_yari",()->new KatakamaYariItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> FUKURO = ITEMS.register("fukuro_yari",()->new FukuroYariItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> JUMONJI = ITEMS.register("jumonji_yari",()->new JumonjiYariItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> KONSAIBO = ITEMS.register("konsaibo",()->new KonsaiboItem(new Item.Properties().stacksTo(1).defaultDurability(100)));
    public static final RegistryObject<Item> TETSUBO = ITEMS.register("tetsubo",()->new TetsuboItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> TATE_SHIELD = ITEMS.register("tate_shield",()->new TateShieldItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> KAMA = ITEMS.register("kama",()->new KamaItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> ASHIGARU_HELMET = ITEMS.register("ashigaru_helmet",
            ()-> new AshigaruArmorItem(ArmorItem.Type.HELMET,
                    props()));
    public static final RegistryObject<Item> ASHIGARU_CHEST = ITEMS.register("ashigaru_chest",
            ()-> new AshigaruArmorItem(ArmorItem.Type.CHESTPLATE,
                    props()));
    public static final RegistryObject<Item> ASHIGARU_LEGGINGS= ITEMS.register("ashigaru_leggings",
            ()-> new AshigaruArmorItem(ArmorItem.Type.LEGGINGS,
                    props()));
    public static final RegistryObject<Item> ASHIGARU_BOOT = ITEMS.register("ashigaru_boot",
            ()-> new AshigaruArmorItem(ArmorItem.Type.BOOTS,
                    props()));

    public static final RegistryObject<Item> ALTERNATE_KUSARI_HELMET = ITEMS.register("alternate_kusari_helmet",
            ()-> new KusariArmorItem(ArmorItem.Type.HELMET,
                    props(), KusariArmorItem.Variant.HELMET));

    public static final RegistryObject<Item> DARK_KUSARI_HELMET = ITEMS.register("dark_kusari_helmet",
            ()-> new KusariArmorItem(ArmorItem.Type.HELMET,
                    props(), KusariArmorItem.Variant.BLACK));
    public static final RegistryObject<Item> DARK_KUSARI_CHEST = ITEMS.register("dark_kusari_chest",
            ()-> new KusariArmorItem(ArmorItem.Type.CHESTPLATE,
                    props(),KusariArmorItem.Variant.BLACK));
    public static final RegistryObject<Item> DARK_KUSARI_LEGGINGS= ITEMS.register("dark_kusari_leggings",
            ()-> new KusariArmorItem(ArmorItem.Type.LEGGINGS,
                    props(),KusariArmorItem.Variant.BLACK));
    public static final RegistryObject<Item> DARK_KUSARI_BOOT = ITEMS.register("dark_kusari_boot",
            ()-> new KusariArmorItem(ArmorItem.Type.BOOTS,
                    props(),KusariArmorItem.Variant.BLACK));

    public static final RegistryObject<Item> KUSARI_HELMET = ITEMS.register("kusari_helmet",
            ()-> new KusariArmorItem(ArmorItem.Type.HELMET,
                    props(), KusariArmorItem.Variant.GRAY));
    public static final RegistryObject<Item> KUSARI_CHEST = ITEMS.register("kusari_chest",
            ()-> new KusariArmorItem(ArmorItem.Type.CHESTPLATE,
                    props(),KusariArmorItem.Variant.GRAY));
    public static final RegistryObject<Item> KUSARI_LEGGINGS= ITEMS.register("kusari_leggings",
            ()-> new KusariArmorItem(ArmorItem.Type.LEGGINGS,
                    props(),KusariArmorItem.Variant.GRAY));
    public static final RegistryObject<Item> KUSARI_BOOT = ITEMS.register("kusari_boot",
            ()-> new KusariArmorItem(ArmorItem.Type.BOOTS,
                    props(),KusariArmorItem.Variant.GRAY));


    public static final RegistryObject<Item> GOSUKU_HELMET = ITEMS.register("gosuku_helmet",
            ()-> new GosukuArmorItem(ArmorItem.Type.HELMET,
                    props()));
    public static final RegistryObject<Item> GOSUKU_CHEST = ITEMS.register("gosuku_chest",
            ()-> new GosukuArmorItem(ArmorItem.Type.CHESTPLATE,
                    props()));
    public static final RegistryObject<Item> GOSUKU_LEGGINGS= ITEMS.register("gosuku_leggings",
            ()-> new GosukuArmorItem(ArmorItem.Type.LEGGINGS,
                    props()));
    public static final RegistryObject<Item> GOSUKU_BOOT = ITEMS.register("gosuku_boot",
            ()-> new GosukuArmorItem(ArmorItem.Type.BOOTS,
                    props()));

    public static final RegistryObject<Item> NINJA_HELMET = ITEMS.register("ninja_helmet",
            ()-> new NinjaArmorItem(ArmorItem.Type.HELMET,
                    props()));
    public static final RegistryObject<Item> NINJA_CHEST = ITEMS.register("ninja_chest",
            ()-> new NinjaArmorItem(ArmorItem.Type.CHESTPLATE,
                    props()));
    public static final RegistryObject<Item> NINJA_LEGGINGS= ITEMS.register("ninja_leggings",
            ()-> new NinjaArmorItem(ArmorItem.Type.LEGGINGS,
                    props()));
    public static final RegistryObject<Item> NINJA_BOOT = ITEMS.register("ninja_boot",
            ()-> new NinjaArmorItem(ArmorItem.Type.BOOTS,
                    props()));

    public static final RegistryObject<Item> JINGASA_METAL_HELMET = ITEMS.register("jingasa_metal_helmet",
            ()-> new JingasaArmorItem(ArmorMaterials.IRON,ArmorItem.Type.HELMET,
                    props()));

    public static final RegistryObject<Item> JINGASA_HAY_HELMET = ITEMS.register("jingasa_hay_helmet",
            ()-> new JingasaArmorItem(ArmorMaterials.LEATHER,ArmorItem.Type.HELMET,
                    props()));

    public static Item.Properties props(){
        return new Item.Properties();
    }
}
