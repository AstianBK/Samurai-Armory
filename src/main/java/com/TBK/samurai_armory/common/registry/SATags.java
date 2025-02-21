package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class SATags {
    public static final TagKey<Item> IS_TOOL_FOR_FURNACE = tag("is_tool_for_furnace");
    public static final TagKey<Item> IS_FUEL_FOR_SMITHING_FURNACE = tag("is_fuel_for_smithing_furnace");
    public static final TagKey<Item> IS_TONG = tag("sa_blacksmith_tongs");
    public static final TagKey<Item> IS_BELLOW = tag("sa_blacksmith_bellows");
    public static final TagKey<Item> IS_HAMMER = tag("sa_blacksmith_hammer");


    private static TagKey<Item> tag(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(SamuraiArmory.MODID, name));
    }
}
