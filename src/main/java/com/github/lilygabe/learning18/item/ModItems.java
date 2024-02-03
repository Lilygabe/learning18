package com.github.lilygabe.learning18.item;

import com.github.lilygabe.learning18.Learning18;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Learning18.MOD_ID);

    public static final RegistryObject<Item> POMBITE = ITEMS.register("pombite",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MATERIALS)
            )
    );
    public static final RegistryObject<Item> RAW_POMBITELITE = ITEMS.register("raw_pombitelite",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MATERIALS)
            )
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
