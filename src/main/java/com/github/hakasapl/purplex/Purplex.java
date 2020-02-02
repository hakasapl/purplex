package com.github.hakasapl.purplex;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.github.hakasapl.purplex.init.WorldGen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Purplex.MODID)
public final class Purplex {
    public static final String MODID = "purplex";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Purplex() {
        LOGGER.debug("Mod Loaded");
    }

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        LOGGER.debug(event.getName());
        if (event.getName().equals(new ResourceLocation("purplex", "purpore"))) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation("minecraft", "string"))).build());
        }

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ResourceLocation myTag = new ResourceLocation("forge", "ores");
        Tag<Block> blocks = BlockTags.getCollection().get(myTag);
        if (blocks == null) {
            LOGGER.debug("Null Ores");
        } else {
            for(Block b:blocks.getAllElements()) {
                LOGGER.debug(b);
            }
        }
        LOGGER.debug("Mod Loaded");
    }

    public void setup(FMLCommonSetupEvent event){
        WorldGen.onCommonSetup();
    }
}