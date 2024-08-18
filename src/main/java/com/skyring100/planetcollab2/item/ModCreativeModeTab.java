package com.skyring100.planetcollab2.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab("maintab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EDIBLE_INSOMNIA.get());
        }
    };
}
