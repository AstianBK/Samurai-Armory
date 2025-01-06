package com.TBK.samburai_armory.common.registry;

import com.TBK.samburai_armory.SamuraiArmory;
import com.TBK.samburai_armory.common.items.BlackKatanaItem;
import com.TBK.samburai_armory.common.items.GildedKatanaItem;
import com.TBK.samburai_armory.common.items.KatanaItem;
import com.TBK.samburai_armory.common.items.TachiItem;
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


}
