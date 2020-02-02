package com.github.hakasapl.purplex.blocks;

import com.github.hakasapl.purplex.Purplex;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockPurpore extends Block {
    public static final Block.Properties PROPERTIES = Block.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(3.0F).harvestTool(ToolType.PICKAXE).lightValue(4);

    public static final String NAME = "purpore";

    public BlockPurpore() {
        super(PROPERTIES);
        this.setRegistryName(Purplex.MODID, NAME);
    }
}