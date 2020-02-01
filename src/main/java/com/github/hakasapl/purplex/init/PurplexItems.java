package com.github.hakasapl.purplex.init;

import com.github.hakasapl.purplex.Purplex;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Purplex.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Purplex.MODID)
public class PurplexItems {

    public static final Item tutorial_dust = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(

                new Item(new Item.Properties()).setRegistryName(Purplex.MODID, "tutorial_dust"),
                new BlockItem(PurplexBlocks.purpore, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(PurplexBlocks.purpore.getRegistryName())

        );
    }

}