package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.common.block_entity.JapFurnaceEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SABlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCKS_ENTITY =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SamuraiArmory.MODID);

    public static final RegistryObject<BlockEntityType<JapFurnaceEntity>> RK_FURNACE_ENTITY =
            BLOCKS_ENTITY.register("jap_furnace_entity", () ->
                    BlockEntityType.Builder.of(JapFurnaceEntity::new,
                            SABlocks.JAP_FURNACE.get()).build(null));
}
