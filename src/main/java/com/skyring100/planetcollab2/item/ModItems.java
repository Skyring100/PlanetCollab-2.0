package com.skyring100.planetcollab2.item;

import com.skyring100.planetcollab2.PlanetCollab2;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PlanetCollab2.MOD_ID);

    public static final RegistryObject<Item> MARS = ITEMS.register("mars", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DUMB_TAB)));

    public static final RegistryObject<Item> EDIBLE_INSOMNIA = ITEMS.register("edible_insomnia", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAIN_TAB).food(ModFoods.EDIBLE_INSOMNIA)));

    public static final RegistryObject<Item> MONSTER_MASH = ITEMS.register("monster_mash", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAIN_TAB).food(ModFoods.MONSTER_MASH)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
