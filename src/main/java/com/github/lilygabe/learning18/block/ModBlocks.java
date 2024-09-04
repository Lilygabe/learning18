package com.github.lilygabe.learning18.block;

import com.github.lilygabe.learning18.Learning18;
import com.github.lilygabe.learning18.item.ModCreativeModeTab;
import com.github.lilygabe.learning18.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Learning18.MOD_ID);


    public static final RegistryObject<Block> POMBITELITE_ORE =
            registerBlock("pombitelite_ore",() -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(3)
                            .requiresCorrectToolForDrops()
            ), ModCreativeModeTab.MAIN_TAB);

    public static final RegistryObject<Block> POMBITELITE_DUST_BLOCK =
            registerBlock("pombitelite_dust_block",() -> new FallingBlock(
                    BlockBehaviour.Properties.of(Material.SAND)
                            .strength(0.5f)
                            .sound(SoundType.SAND)
            ), ModCreativeModeTab.MAIN_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
