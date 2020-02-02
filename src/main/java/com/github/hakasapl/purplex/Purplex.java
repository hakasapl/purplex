package com.github.hakasapl.purplex;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Purplex.MODID)
public final class Purplex {
    public static final String MODID = "purplex";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Purplex() {
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
}