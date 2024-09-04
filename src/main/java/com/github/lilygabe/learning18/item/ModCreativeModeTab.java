package com.github.lilygabe.learning18.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab("learning18") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.POMBITE.get());
        }
    };
}
