package com.TBK.samurai_armory.common.registry;

import com.TBK.samurai_armory.SamuraiArmory;
import com.TBK.samurai_armory.server.data.recipe.JapFurnaceRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SARecipeSerializer {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS,SamuraiArmory.MODID);

    public static final RegistryObject<RecipeSerializer<JapFurnaceRecipe>> NEW_FURNACE_RECIPE = RECIPE_SERIALIZERS.register("jap_furnace_recipe", JapFurnaceRecipe.Serializer::new);

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, SamuraiArmory.MODID);

    public static final RegistryObject<RecipeType<JapFurnaceRecipe>> FURNACE_RECIPE_TYPE = RECIPE_TYPES.register("furnace_recipe_type",()->new RecipeType<JapFurnaceRecipe>() {
        @Override
        public int hashCode() {
            return super.hashCode();
        }
    });
}
