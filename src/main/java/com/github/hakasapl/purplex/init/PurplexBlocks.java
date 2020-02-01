package com.github.hakasapl.purplex.init;

import com.github.hakasapl.purplex.*;
import com.github.hakasapl.purplex.blocks.BlockPurpore;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Purplex.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Purplex.MODID)
public class PurplexBlocks {

    public static final BlockPurpore purpore = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //In here you pass in all block instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(

            new BlockPurpore()

        );
    }
}