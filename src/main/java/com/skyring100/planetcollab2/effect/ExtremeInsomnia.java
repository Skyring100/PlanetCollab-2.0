package com.skyring100.planetcollab2.effect;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
public class ExtremeInsomnia extends MobEffect {
    protected ExtremeInsomnia(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }
    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.isSleeping()){
            pLivingEntity.hurt(DamageSource.MAGIC, 5f);
            int disorientTime = 200;
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, disorientTime));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, disorientTime));
        }
    }
    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
