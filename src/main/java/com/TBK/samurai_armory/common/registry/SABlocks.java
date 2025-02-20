package com.TBK.samurai_armory.common.registry;
import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.blocks.JapFurnace;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SABlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SamuraiArmory.MODID);

    public static final RegistryObject<Block> JAP_FURNACE = registerBlock("jap_furnace",
            () -> new JapFurnace(BlockBehaviour.Properties.copy(Blocks.BLAST_FURNACE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends  Block> void registerBlockItem(String name, RegistryObject<T> block) {
        SAItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
