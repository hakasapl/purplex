package com.github.hakasapl.purplex;

<<<<<<< HEAD
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
=======
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
>>>>>>> ac082baa1cf74783b084f68880c8ee4d3506931e
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
<<<<<<< HEAD
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
=======
        ResourceLocation myTag = new ResourceLocation("forge", "ores");
        Tag<Block> blocks = BlockTags.getCollection().get(myTag);
        if (blocks == null) {
            LOGGER.debug("Null Ores");
        } else {
            for(Block b:blocks.getAllElements()) {
                LOGGER.debug(b);
            }
        }
>>>>>>> ac082baa1cf74783b084f68880c8ee4d3506931e

        LOGGER.debug("Mod Loaded");
    }

    public void setup(FMLCommonSetupEvent event){
        WorldGen.onCommonSetup();
    }
}