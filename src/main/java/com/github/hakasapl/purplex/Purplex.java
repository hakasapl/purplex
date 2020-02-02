package com.github.hakasapl.purplex;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        LOGGER.debug("Mod Loaded");
    }

    public void setup(FMLCommonSetupEvent event){
        WorldGen.onCommonSetup();
    }
}