package com.skyring100.planetcollab2.effect;

import com.skyring100.planetcollab2.PlanetCollab2;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect>  MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PlanetCollab2.MOD_ID);

    public static final RegistryObject<MobEffect> EXTREME_INSOMNIA = MOB_EFFECTS.register("extreme_insomnia", () -> new ExtremeInsomnia(MobEffectCategory.HARMFUL, 200));
    //to add attribute modifiers, look through Minecraft's "MobEffects.java" class fot stuff on "pUuid"
    public static final RegistryObject<MobEffect> SPITEFUL_RUSH = MOB_EFFECTS.register("spiteful_rush", () -> new SpitefulRush(MobEffectCategory.NEUTRAL, 16262179).
            addAttributeModifier(Attributes.ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3.0D, AttributeModifier.Operation.ADDITION).
            addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", (double)0.2F, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static void register(IEventBus event){
        MOB_EFFECTS.register(event);
    }
}
