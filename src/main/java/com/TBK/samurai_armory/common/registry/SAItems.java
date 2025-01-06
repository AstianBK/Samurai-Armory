package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.items.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SAItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SamuraiArmory.MODID);

    public static final RegistryObject<Item> KATANA= ITEMS.register("katana",()->new KatanaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_KATANA= ITEMS.register("black_katana",()->new BlackKatanaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GILDED_KATANA= ITEMS.register("gilded_katana",()->new GildedKatanaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TACHI= ITEMS.register("tachi",()->new TachiItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TANTO = ITEMS.register("tanto",()->new TantoItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> CHOKUTO = ITEMS.register("chokuto",()->new ChokutoItem(new Item.Properties().stacksTo(1).defaultDurability(100)));
    public static final RegistryObject<Item> KATAKAMA = ITEMS.register("katakama_yari",()->new KatakamaYariItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> KONSAIBO = ITEMS.register("konsaibo",()->new KonsaiboItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

    public static final RegistryObject<Item> TATE_SHIELD = ITEMS.register("tate_shield",()->new TateShieldItem(new Item.Properties().stacksTo(1).defaultDurability(100)));

}
