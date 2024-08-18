package com.skyring100.planetcollab2.potion;

import com.skyring100.planetcollab2.PlanetCollab2;
import com.skyring100.planetcollab2.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, PlanetCollab2.MOD_ID);

    public static final RegistryObject<Potion> EXTREME_INSOMNIA_POTION = POTIONS.register("extreme_insomnia_potion", () -> new Potion(new MobEffectInstance(ModEffects.EXTREME_INSOMNIA.get(), 150000, 0)));
    public static final RegistryObject<Potion> SPITEFUL_RUSH_POTION = POTIONS.register("spiteful_rush_potion", () -> new Potion(new MobEffectInstance(ModEffects.SPITEFUL_RUSH.get(), 900, 0)));

    public static void register(IEventBus event){
        POTIONS.register(event);
    }
}
