package com.skyring100.planetcollab2.event;

import com.skyring100.planetcollab2.item.ModItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public class ModEvents {
    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event){
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((trader, random) -> new MerchantOffer(
                //input, output, max uses, xp gained, price multiplier
                new ItemStack(Items.EMERALD, 2),
                new ItemStack(ModItems.EDIBLE_INSOMNIA.get(), 12),
                3, 18, 0.2f));

    }
}
