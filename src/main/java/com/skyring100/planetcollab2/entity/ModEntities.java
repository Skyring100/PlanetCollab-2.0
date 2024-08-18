package com.skyring100.planetcollab2.entity;

import com.skyring100.planetcollab2.PlanetCollab2;
import com.skyring100.planetcollab2.item.ModCreativeModeTab;
import com.skyring100.planetcollab2.item.ModFoods;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PlanetCollab2.MOD_ID);
    public static final RegistryObject<EntityType<WanderingEnderTrader>> ENDER_TRADER = ENTITY_TYPES.register("ender_trader", () -> EntityType.Builder.of(WanderingEnderTrader::new, MobCategory.CREATURE).build("ender_trader"));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
